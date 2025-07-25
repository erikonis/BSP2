import os
import json

def find_java_file_sizes(json_file_path):
    try:
        with open(json_file_path, 'r') as f:
            data = json.load(f)
    except FileNotFoundError:
        print(f"Error: File {json_file_path} not found.")
        return
    except json.JSONDecodeError:
        print("Error: Invalid JSON file format.")
        return

    good_file_sizes = []

    bad, good, over = 0, 0, 0

    for image_name, file_info in data.items():
        if file_info['quality'].lower() == 'bad':
            bad+=1
        if file_info['quality'].lower() == 'good':
            good+=1
        if file_info['quality'].lower() == 'over':
            over+=1
        if file_info['quality'].lower() in ['good', 'over']:
            file_path = file_info['directory']
            try:
                with open(file_path, 'rb') as f:
                    file_size_bytes = len(f.read())
                    good_file_sizes.append(file_size_bytes)
            except Exception as e:
                print(f"Failed to read {file_path}: {e}")

    if not good_file_sizes:
        print("No files with 'good' or 'over' quality found.")
        return

    min_size_kb = min(good_file_sizes) / 1024
    max_size_kb = max(good_file_sizes) / 1024
    average_kb = sum(good_file_sizes) / len(good_file_sizes) / 1024

    print(f"Smallest file with good/over quality: {min_size_kb:.2f} KB")
    print(f"Largest file with good/over quality: {max_size_kb:.2f} KB")
    print(f"Average file size with good/over quality: {average_kb:.2f} KB")
    print(f"Total number of files with good/over quality: {len(good_file_sizes)}")
    print(f"Total number of files with 'bad' quality: {bad}")
    print(f"Total number of files with 'good' quality: {good}")
    print(f"Total number of files with 'over' quality: {over}")


if __name__ == "__main__":
    json_file = "info.json"  # Update this path if your JSON file is located elsewhere
    find_java_file_sizes(json_file)