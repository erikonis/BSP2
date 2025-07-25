import os

def find_java_file_sizes(start_dir):
    java_file_sizes = []

    for root, dirs, files in os.walk(start_dir):
        for file in files:
            if file.endswith('.java'):
                file_path = os.path.join(root, file)
                try:
                    with open(file_path, 'rb') as f:
                        file_size_bytes = len(f.read())
                        java_file_sizes.append(file_size_bytes)
                except Exception as e:
                    print(f"Failed to read {file_path}: {e}")

    if not java_file_sizes:
        print("No Java files found.")
        return

    min_size_kb = min(java_file_sizes) / 1024
    max_size_kb = max(java_file_sizes) / 1024

    print(f"Smallest .java file: {min_size_kb:.2f} KB")
    print(f"Largest .java file: {max_size_kb:.2f} KB")


if __name__ == "__main__":
    current_directory = os.path.dirname(os.path.abspath(__file__))
    print(f"Scanning directory: {current_directory}")
    find_java_file_sizes(current_directory)
