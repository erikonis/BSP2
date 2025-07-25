import os
from pathlib import Path
import sys


def clean_non_java_files(base_dir):
    """
    Recursively removes all non-Java files from the directory structure,
    excluding the cleaner script itself.
    """
    # Get the absolute path of this script
    this_script = os.path.abspath(__file__)
    files_removed = []
    bytes_freed = 0

    print("\nScanning for non-Java files...")

    # Walk through all directories
    for root, _, files in os.walk(base_dir):
        for file in files:
            file_path = os.path.join(root, file)

            # Skip this script
            if os.path.abspath(file_path) == this_script:
                continue

            # Check if file is not a Java file
            if not file_path.endswith('.java'):
                try:
                    # Get file size before removal
                    file_size = os.path.getsize(file_path)

                    # Store file info for reporting
                    files_removed.append({
                        'path': os.path.relpath(file_path, base_dir),
                        'size': file_size
                    })

                    bytes_freed += file_size

                except OSError:
                    print(f"Error getting size of file: {file_path}")

    # Ask for confirmation before deletion
    if files_removed:
        print("\nFiles to be removed:")
        print("===================")

        for file in sorted(files_removed, key=lambda x: x['path']):
            print(f"- {file['path']} ({format_size(file['size'])})")

        print(f"\nTotal space to be freed: {format_size(bytes_freed)}")
        print(f"Total files to be removed: {len(files_removed)}")

        confirmation = input("\nDo you want to proceed with deletion? (yes/no): ").lower()

        if confirmation == 'yes':
            print("\nDeleting files...")
            errors = []

            for file in files_removed:
                try:
                    os.remove(os.path.join(base_dir, file['path']))
                except OSError as e:
                    errors.append(f"Error deleting {file['path']}: {e}")

            if errors:
                print("\nErrors encountered:")
                for error in errors:
                    print(f"- {error}")

            print(f"\nDeletion completed. Removed {len(files_removed) - len(errors)} files.")
        else:
            print("\nOperation cancelled.")
    else:
        print("No non-Java files found (excluding this script).")


def format_size(size):
    """Formats file size in bytes to human-readable format"""
    for unit in ['B', 'KB', 'MB', 'GB']:
        if size < 1024:
            return f"{size:.2f} {unit}"
        size /= 1024
    return f"{size:.2f} TB"


def main():
    # Get the directory where the script is located
    base_dir = os.path.dirname(os.path.abspath(__file__))

    print("Non-Java Files Cleaner")
    print("=====================")
    print(f"Target directory: {base_dir}")

    try:
        clean_non_java_files(base_dir)
    except KeyboardInterrupt:
        print("\nOperation cancelled by user.")
        sys.exit(1)
    except Exception as e:
        print(f"\nAn error occurred: {e}")
        sys.exit(1)


if __name__ == "__main__":
    main()