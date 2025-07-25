import os
import shutil
import stat

def handle_permission_error(func, path, exc_info):
    """
    Callback function to handle permission errors during file deletion.
    Tries to change the file's permission before retrying.
    """
    if not os.access(path, os.W_OK):
        # Change the file's permission to writeable
        os.chmod(path, stat.S_IWRITE)
        # Retry the removal
        func(path)
    else:
        print(f"Failed to delete: {path}, Error: {exc_info}")

def delete_git_folder_in_students(root_dir):
    """
    Visits each student folder under the given root directory and deletes the hidden '.git' folder if it exists.
    """
    for student_folder in os.listdir(root_dir):
        student_path = os.path.join(root_dir, student_folder)

        # Ensure we're dealing with a folder
        if os.path.isdir(student_path):
            # Delete .git hidden folder if it exists
            git_dir_path = os.path.join(student_path, '.git')
            if os.path.isdir(git_dir_path):
                print(f"Deleting directory: {git_dir_path}")
                # Use onerror callback to handle permission issues
                shutil.rmtree(git_dir_path, onerror=handle_permission_error)
            else:
                print(f"Directory not found: {git_dir_path}")

if __name__ == "__main__":
    # Get the current working directory (assumes the script is inside the 'Students' directory)
    root_dir = os.getcwd()  # You can replace this with the full path to the 'Students' directory if needed
    delete_git_folder_in_students(root_dir)
    print("Cleanup complete!")
