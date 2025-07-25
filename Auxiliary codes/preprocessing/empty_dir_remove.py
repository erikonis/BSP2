import os

def clean_empty_folders(directory):
    """
    Recursively searches for and removes empty folders starting from the given directory.

    Args:
        directory (str): The starting directory path
    """
    # Walk bottom-up through the directory tree
    for root, dirs, files in os.walk(directory, topdown=False):
        for dir_name in dirs:
            dir_path = os.path.join(root, dir_name)
            try:
                if not os.listdir(dir_path):  # Check if directory is empty
                    os.rmdir(dir_path)
                    print(f"Deleted empty folder: {dir_path}")
            except OSError as e:
                print(f"Error removing directory {dir_path}: {e}")


# Example usage
if __name__ == "__main__":
    current_dir = os.path.dirname(os.path.abspath(__file__))
    clean_empty_folders(current_dir)