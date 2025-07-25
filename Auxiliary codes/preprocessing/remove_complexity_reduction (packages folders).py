import os
import shutil


def move_java_files(directory):
    """
    This function recursively iterates through the specified directory,
    finds folders named 'package', moves all .java files to the parent directory,
    and deletes the folder afterward.
    """
    for root, dirs, files in os.walk(directory, topdown=False):  # `topdown=False` processes subdirectories first
        for dir_name in dirs:
            if dir_name == "package":
                package_path = os.path.join(root, dir_name)  # Absolute path to the 'package' folder
                parent_directory = root  # Parent directory of the 'package' folder

                # Move all .java files from the 'package' folder to its parent directory
                for file_name in os.listdir(package_path):
                    if file_name.endswith(".java"):
                        source_path = os.path.join(package_path, file_name)
                        destination_path = os.path.join(parent_directory, file_name)
                        shutil.move(source_path, destination_path)
                        print(f"Moved: {source_path} -> {destination_path}")

                # Delete the empty 'package' folder
                shutil.rmtree(package_path)
                print(f"Removed folder: {package_path}")


if __name__ == "__main__":
    # Get the directory where this script is located
    current_directory = os.path.dirname(os.path.abspath(__file__))

    print(f"Starting to process directory: {current_directory}")
    move_java_files(current_directory)
    print("Processing complete!")
