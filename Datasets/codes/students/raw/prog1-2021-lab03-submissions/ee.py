import os
import shutil


def clean_student_folders(root_dir):
    """
    Deletes .git directories, assets directories, .gitignore files, and README.md files
    in each student folder under the given root directory.
    """
    for student_folder in os.listdir(root_dir):
        student_path = os.path.join(root_dir, student_folder)

        # Ensure we're dealing with a folder
        if os.path.isdir(student_path):
            for root, dirs, files in os.walk(student_path):
                # Delete .git and assets directories
                for name in dirs:
                    if name == '.vscode' or name == 'src':
                        dir_path = os.path.join(root, name)
                        print(f"Deleting directory: {dir_path}")
                        shutil.rmtree(dir_path)

                # Delete .gitignore and README.md files
                for name in files:
                    if name == '.gitignore' or name == 'README.md':
                        file_path = os.path.join(root, name)
                        print(f"Deleting file: {file_path}")
                        os.remove(file_path)


if __name__ == "__main__":
    # Get the current working directory (assumes the script is inside the 'Students' directory)
    root_dir = os.getcwd()  # You can replace this with the full path to the 'Students' directory if needed
    clean_student_folders(root_dir)
    print("Cleanup complete!")