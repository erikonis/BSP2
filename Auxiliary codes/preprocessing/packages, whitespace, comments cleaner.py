import os
import re


def process_java_files(directory):
    """
    Recursively process Java files in the given directory.
    - Remove 'package' statements at the start of files.
    - Remove leading blank lines or whitespace at the start.
    - Remove comments (both single-line // and multi-line /* */) at the start of the file
      if they reference the file name (e.g., .java) or reference exercises (e.g., "Exercise", "Ex").
    - Ensure the file ends perfectly with code (no empty lines or trailing whitespace).
    - Starts meaningful content directly at the top of the file.
    """
    for root, dirs, files in os.walk(directory, topdown=False):  # Traverse directories bottom-up
        for file in files:
            if file.endswith(".java"):  # Process Java files only
                file_path = os.path.join(root, file)

                # Read the file contents
                with open(file_path, "r", encoding="utf-8") as f:
                    lines = f.readlines()

                # Determine the file name without directory
                file_name = os.path.basename(file)

                # Modify the file lines
                new_lines = []
                content_started = False
                multiline_comment = False

                for line in lines:
                    stripped = line.strip()

                    # Remove 'package' statements at the start of the file
                    if not content_started and stripped.startswith("package "):
                        continue  # Skip the package line entirely

                    # Handle multi-line comments at the start of the file
                    if not content_started:
                        if multiline_comment:  # Inside a multi-line comment
                            if '*/' in stripped:  # End of a multi-line comment
                                multiline_comment = False
                                # Check if the multi-line comment contains .java or "exercise"
                                if re.search(r'\b' + re.escape(file_name) + r'\b', stripped, re.IGNORECASE) or \
                                        re.search(r'\b(exercise|ex)\b', stripped, re.IGNORECASE):
                                    continue  # Skip this line
                            continue  # Skip all lines inside the comment

                        elif stripped.startswith('/*'):  # Start of a multi-line comment
                            multiline_comment = True
                            if '*/' in stripped:  # Full multi-line comment on one line
                                multiline_comment = False
                                # Check if the comment contains .java or "exercise"
                                if re.search(r'\b' + re.escape(file_name) + r'\b', stripped, re.IGNORECASE) or \
                                        re.search(r'\b(exercise|ex)\b', stripped, re.IGNORECASE):
                                    continue  # Skip this line
                            continue  # Skip the first line of a multi-line comment

                        # Handle single-line comments at the start with reference checks
                        if stripped.startswith('//'):
                            # Check if the single-line comment contains .java or "exercise"
                            if re.search(r'\b' + re.escape(file_name) + r'\b', stripped, re.IGNORECASE) or \
                                    re.search(r'\b(exercise|ex)\b', stripped, re.IGNORECASE):
                                continue  # Skip this line
                            else:
                                continue  # Skip the comment since it's at the start of the file

                        # Remove leading empty lines
                        if stripped == "":
                            continue

                        # Stop when we reach meaningful content
                        content_started = True

                    # If we've reached meaningful content, add the line to the new file
                    new_lines.append(line.rstrip())  # Strip trailing whitespace from each line

                # Remove any empty lines at the end of the file
                while new_lines and (new_lines[-1].strip() == ""):
                    new_lines.pop()  # Remove empty lines at the end of the list

                # Join the cleaned lines back into a single string
                if new_lines:
                    cleaned_file_content = '\n'.join(new_lines)  # No trailing newline here to ensure a perfect ending
                else:
                    cleaned_file_content = ''  # Empty file

                # Write the cleaned-up file
                with open(file_path, "w", encoding="utf-8") as f:
                    f.write(cleaned_file_content)

        # Delete empty directories if they no longer have content
        if not os.listdir(root):
            os.rmdir(root)
            print(f"Deleted empty folder: {root}")


if __name__ == "__main__":
    # Process from the root directory where the script is located
    root_dir = os.path.dirname(os.path.abspath(__file__))
    process_java_files(root_dir)
    print("Processing completed.")
