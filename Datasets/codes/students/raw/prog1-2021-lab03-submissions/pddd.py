import os


def delete_lab02_pdf_in_students(root_dir):
    """
    Visits each student folder under the given root directory and deletes the 'Lab02.pdf' file if it exists.
    """
    for student_folder in os.listdir(root_dir):
        student_path = os.path.join(root_dir, student_folder)

        # Ensure we're dealing with a folder
        if os.path.isdir(student_path):
            lab_pdf_path = os.path.join(student_path, 'Lab03.pdf')

            # Check if Lab02.pdf exists and delete it
            if os.path.exists(lab_pdf_path):
                print(f"Deleting file: {lab_pdf_path}")
                os.remove(lab_pdf_path)
            else:
                print(f"File not found: {lab_pdf_path}")


if __name__ == "__main__":
    # Get the current working directory (assumes the script is inside the 'Students' directory)
    root_dir = os.getcwd()  # You can replace this with the full path to the 'Students' directory if needed
    delete_lab02_pdf_in_students(root_dir)
    print("Cleanup complete!")