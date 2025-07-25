import json
from collections import defaultdict
import re
from tabulate import tabulate
import pandas as pd
from datetime import datetime
import os


def extract_exercise_number(path):
    """
    Extracts exercise number from path, handling various formats:
    Returns None if no exercise reference is found.
    """
    pattern = (r'.*?(?:ex|Ex|exercise|Exercise|excercise|excercice|erercise|exercice|Exercice|Erercise|exercis|execise|'
               r'Exersice|Exercises)(?:\s*|_*)(\d+).*')
    match = re.search(pattern, path)
    return int(match.group(1)) if match else None

def extract_lab_number(path):
    """Extracts lab number from path, including from submission folder names."""
    # First try to find direct lab folder
    pattern = r'(?:prog\d+-\d+-)?lab(\d+)(?:-submissions)?'
    match = re.search(pattern, path.lower())
    return f"lab{match.group(1)}" if match else None

def count_solutions(json_file):
    """Counts files in exercise folders using data from JSON file."""
    stats = defaultdict(lambda: defaultdict(lambda: {
        'files': 0,
        'students': set(),
        'folders': set()
    }))
    unusual_paths = []

    try:
        with open(json_file, 'r') as f:
            data = json.load(f)
    except FileNotFoundError:
        print(f"Error: File {json_file} not found.")
        return stats, unusual_paths

    # Only process files with "good" or "over" quality
    for image_name, file_info in data.items():
        if file_info['quality'] not in ['good', 'over', 'bad']:
            continue

        path = file_info['directory']

        # Extract lab number
        sheet = extract_lab_number(path)
        if not sheet:
            continue

        # Use the extract_exercise_number function to find exercise number
        ex_num = extract_exercise_number(path)

        if ex_num:
            # Extract student ID
            student = next((part for part in path.split('/') if part.startswith('student')), 'unknown')

            stats[sheet][ex_num]['files'] += 1
            stats[sheet][ex_num]['students'].add(student)
            stats[sheet][ex_num]['folders'].add(os.path.basename(os.path.dirname(path)))
        else:
            unusual_paths.append({
                'sheet': sheet,
                'path': path,
                'files': 1
            })

    return stats, unusual_paths


def print_statistics(stats, unusual_paths, export_excel=True):
    """
    Prints formatted statistics about the solutions and unusual paths.
    Optionally exports the data to Excel files.
    """
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

    headers = ["Sheet", "Exercise", "Total Files", "Students Count", "Avg Files/Student",
              "Folder Names", "Student List"]

    print("\nExercise Statistics:")
    print(tabulate(table_data, headers=headers[:6], tablefmt="grid"))

    if unusual_paths:
        unusual_data = [[p['sheet'], p['path'], p['files']] for p in unusual_paths]
        print("\nUnusual Paths Containing Files:")
        print(tabulate(unusual_data,
                      headers=["Sheet", "Path", "Files"],
                      tablefmt="grid"))

    if export_excel:
        try:
            timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
            output_dir = os.path.dirname(os.path.abspath(__file__))
            excel_file = os.path.join(output_dir, f"exercise_statistics_{timestamp}.xlsx")

            with pd.ExcelWriter(excel_file, engine='openpyxl') as writer:
                df_stats = pd.DataFrame(table_data, columns=headers)
                df_stats.to_excel(writer, sheet_name='Exercise Statistics', index=False)

                if unusual_paths:
                    df_unusual = pd.DataFrame(unusual_data,
                                           columns=["Sheet", "Path", "Files"])
                    df_unusual.to_excel(writer, sheet_name='Unusual Paths', index=False)

            print(f"\nStatistics exported to: {excel_file}")
        except Exception as e:
            print(f"\nError saving Excel file: {str(e)}")


def main():
    json_file = "info.json"  # Path to your JSON file
    print("Analyzing exercise solutions...")
    stats, unusual_paths = count_solutions(json_file)
    print_statistics(stats, unusual_paths, export_excel=True)


if __name__ == "__main__":
    main()