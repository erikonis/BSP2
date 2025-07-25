import os
import shutil

def move_exercise_folders():
    base_directory = os.getcwd()
    student_folders = [f for f in os.listdir(base_directory) if os.path.isdir(os.path.join(base_directory, f))]
    
    print(f"Processing student folders: {student_folders}")
    
    for student in student_folders:
        print(f"Processing {student}...")
        source_path = os.path.join(base_directory, student, "src", "lu", "uni", "programming1", "lab4")
        
        if not os.path.exists(source_path):
            print(f"Source path does not exist for {student}.")
            continue
        
        # Get a list of all folders inside the lab2 directory
        folders = [f for f in os.listdir(source_path) if os.path.isdir(os.path.join(source_path, f))]
        
        print(f"Found folders to move in {student}: {folders}")
        
        # Move each folder to the student directory
        for folder in folders:
            old_path = os.path.join(source_path, folder)
            new_path = os.path.join(base_directory, student, folder)
            shutil.move(old_path, new_path)
            print(f'Moved "{folder}" to "{new_path}"')
    
move_exercise_folders()