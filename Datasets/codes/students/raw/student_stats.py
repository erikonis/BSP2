import os
import re
from collections import defaultdict
from tabulate import tabulate


def extract_exercise_number(folder_name):
    """
    Extracts exercise number from folder name, handling various formats:
    - ex1, Ex1, exercise1, Exercise1
    - excercise4, excercice7
    - erercise6, etc.
    - Also handles additional text before/after the exercise reference
    Returns None if no exercise reference is found.
    """
    pattern = (r'.*?(?:ex|Ex|exercise|Exercise|excercise|excercice|erercise|exercice|Exercice|Erercise|exercis|execise|'
               r'Exersice|Exercises)(?:\s*|_*)(\d+).*')
    match = re.search(pattern, folder_name)
    return int(match.group(1)) if match else None


def is_exercise_folder(folder_name):
    """
    Checks if the folder name contains an exercise pattern anywhere in the name
    Now matches exercise references even with additional text before or after
    """
    return bool(re.search(r'.*?(?:ex|Ex|exercise|Exercise|excercise|excercice|erercise|exercice|Exercice|Erercise|'
                         r'exercis|execise|Exersice|Exercises)(?:\s*|_*)\d+.*', folder_name))


def check_parent_folders_for_exercise(path, student_path, max_levels=3):
    """
    Recursively checks parent folders for exercise patterns.
    Returns (exercise_number, folder_name) if found, otherwise (None, None).
    """
    current_path = path
    levels_checked = 0

    while levels_checked < max_levels:
        # Don't go beyond student directory
        if os.path.samefile(current_path, student_path):
            break

        folder_name = os.path.basename(current_path)
        if is_exercise_folder(folder_name):
            ex_num = extract_exercise_number(folder_name)
            if ex_num:
                return ex_num, folder_name

        # Move up one directory
        current_path = os.path.dirname(current_path)
        levels_checked += 1

    return None, None


def check_duplicate_exercises(exercise_folders, student_path):
    """Helper function to check for duplicate exercise references"""
    # Group folders by their parent directory
    folders_by_parent = defaultdict(list)
    for folder_path in exercise_folders:
        folder_name = os.path.basename(folder_path)
        if is_exercise_folder(folder_name):  # Using updated pattern
            parent_dir = os.path.dirname(folder_path)
            folders_by_parent[parent_dir].append(folder_name)

    # Check for duplicates within each directory
    for parent_dir, folders in folders_by_parent.items():
        exercise_nums = defaultdict(list)
        
        for folder in folders:
            ex_num = extract_exercise_number(folder)
            if ex_num:
                exercise_nums[ex_num].append(folder)

        # Check for duplicates and print warnings
        for ex_num, duplicate_folders in exercise_nums.items():
            if len(duplicate_folders) > 1:
                rel_path = os.path.relpath(os.path.join(student_path, parent_dir))
                print(f"\n⚠️ WARNING: Multiple folders for exercise {ex_num} found in {rel_path}:")
                for folder in duplicate_folders:
                    print(f"  - {folder}")

def count_solutions(base_dir):
    """
    Counts Java files in exercise folders for each sheet and exercise.
    Also tracks non-standard folders containing Java files.
    Checks for duplicate exercise folders within the same student directory.
    """
    stats = defaultdict(lambda: defaultdict(lambda: {
        'files': 0,
        'students': set(),
        'folders': set()
    }))

    unusual_paths = []

    for sheet in os.listdir(base_dir):
        sheet_path = os.path.join(base_dir, sheet)
        if not os.path.isdir(sheet_path):
            continue

        for student in os.listdir(sheet_path):
            student_path = os.path.join(sheet_path, student)
            if not os.path.isdir(student_path) or not student.startswith('student'):
                continue

            # Process files and collect statistics
            for root, _, files in os.walk(student_path):
                java_files = [f for f in files if f.endswith('.java')]
                if not java_files:
                    continue

                folder = os.path.basename(root)
                relative_path = os.path.relpath(root, student_path)

                # Check for Java files with exercise pattern first
                exercise_files = [f for f in java_files if is_exercise_folder(os.path.splitext(f)[0])]
                if exercise_files:
                    for file in exercise_files:
                        ex_num = extract_exercise_number(os.path.splitext(file)[0])
                        if ex_num:
                            stats[sheet][ex_num]['files'] += 1
                            stats[sheet][ex_num]['students'].add(student)
                            stats[sheet][ex_num]['folders'].add(file)
                    # Remove processed exercise files
                    java_files = [f for f in java_files if f not in exercise_files]

                # Then check current folder and parent folders if there are remaining files
                if java_files:
                    if is_exercise_folder(folder):
                        ex_num = extract_exercise_number(folder)
                        stats[sheet][ex_num]['files'] += len(java_files)
                        stats[sheet][ex_num]['students'].add(student)
                        stats[sheet][ex_num]['folders'].add(folder)
                    else:
                        # Check parent folders recursively
                        ex_num, folder_name = check_parent_folders_for_exercise(root, student_path)
                        if ex_num:
                            stats[sheet][ex_num]['files'] += len(java_files)
                            stats[sheet][ex_num]['students'].add(student)
                            stats[sheet][ex_num]['folders'].add(folder_name)
                        else:
                            # If no exercise pattern found in any parent folder, mark as unusual
                            unusual_paths.append({
                                'sheet': sheet,
                                'student': student,
                                'path': relative_path,
                                'files': len(java_files)
                            })

    return stats, unusual_paths



#-----------------------SATS TO EXCEL-------------
import pandas as pd
from datetime import datetime


def print_statistics(stats, unusual_paths, export_excel=True):
    """
    Prints formatted statistics about the solutions and unusual paths.
    Optionally exports the data to Excel files.
    """
    # Regular exercise statistics
    table_data = []
    for sheet in sorted(stats.keys()):
        for ex_num in sorted(stats[sheet].keys()):
            files = stats[sheet][ex_num]['files']
            num_students = len(stats[sheet][ex_num]['students'])
            avg_per_student = files / num_students if num_students > 0 else 0
            folder_names = ', '.join(sorted(stats[sheet][ex_num]['folders']))
            student_list = ', '.join(sorted(stats[sheet][ex_num]['students']))

            table_data.append([
                sheet,
                f"Exercise {ex_num}",
                files,
                num_students,
                f"{avg_per_student:.2f}",
                folder_names,
                student_list
            ])

    headers = ["Sheet", "Exercise", "Total Files", "Students Count", "Avg Files/Student", "Folder Names",
               "Student List"]

    # Print tables to console
    print("\nExercise Statistics:")
    print(tabulate(table_data, headers=headers[:6], tablefmt="grid"))  # Don't show student list in console

    if unusual_paths:
        unusual_data = [[p['sheet'], p['student'], p['path'], p['files']]
                        for p in unusual_paths]
        print("\nUnusual Paths Containing Java Files:")
        print(tabulate(unusual_data,
                       headers=["Sheet", "Student", "Relative Path", "Files"],
                       tablefmt="grid"))

    if export_excel:
        try:
            timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
            output_dir = os.path.dirname(os.path.abspath(__file__))
            excel_file = os.path.join(output_dir, f"exercise_statistics_{timestamp}.xlsx")

            with pd.ExcelWriter(excel_file, engine='openpyxl') as writer:
                # Exercise statistics sheet
                df_stats = pd.DataFrame(table_data, columns=headers)
                df_stats.to_excel(writer, sheet_name='Exercise Statistics', index=False)

                # Unusual paths sheet
                if unusual_paths:
                    df_unusual = pd.DataFrame(unusual_data,
                                              columns=["Sheet", "Student", "Relative Path", "Files"])
                    df_unusual.to_excel(writer, sheet_name='Unusual Paths', index=False)

                # Format the Excel file
                for sheet_name in writer.sheets:
                    worksheet = writer.sheets[sheet_name]
                    df = df_stats if sheet_name == 'Exercise Statistics' else df_unusual

                    # Auto-adjust columns width
                    for idx, col in enumerate(df.columns):
                        series = df[col]
                        max_len = max(
                            series.astype(str).apply(len).max(),  # len of largest item
                            len(str(series.name))  # len of column name/header
                        ) + 2  # adding a little extra space
                        # Set column width using column letter
                        col_letter = chr(65 + idx) if idx < 26 else chr(64 + idx // 26) + chr(65 + (idx % 26))
                        worksheet.column_dimensions[col_letter].width = max_len

            print(f"\nStatistics exported to: {excel_file}")
        except Exception as e:
            print(f"\nError saving Excel file: {str(e)}")
#-------------------------------------------------------------------------------------

def main():
    base_dir = os.path.dirname(os.path.abspath(__file__))
    print("Analyzing exercise solutions...")
    stats, unusual_paths = count_solutions(base_dir)
    print_statistics(stats, unusual_paths, export_excel=True)  # Explicitly set export_excel to True

if __name__ == "__main__":
    main()