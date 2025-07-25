import os


def process_java_files_in_place(directory):
    """
    Recursively processes all Java files in a directory, removing lines starting with 'public //file:'.
    The files are updated in place.

    Args:
        directory (str): Path to the directory containing Java files to process.
    """
    for root, _, files in os.walk(directory):
        for file in files:
            if file.endswith('.java'):
                file_path = os.path.join(root, file)

                try:
                    # Read file content
                    with open(file_path, 'r') as infile:
                        lines = infile.readlines()

                    # Remove lines starting with 'public //file:'
                    cleaned_lines = [line for line in lines if not line.strip().startswith('public //')]

                    # Write back the cleaned lines to the same file
                    with open(file_path, 'w') as outfile:
                        outfile.writelines(cleaned_lines)

                    print(f"Cleaned file: {file_path}")

                except Exception as e:
                    print(f"Error processing file {file_path}: {e}")


# Example usage:
# Replace 'path/to/input' and 'path/to/output' with actual directories
if __name__ == "__main__":
    # Process from the root directory where the script is located
    root_dir = os.path.dirname(os.path.abspath(__file__))
    process_java_files_in_place(root_dir)
    print("Processing completed.")