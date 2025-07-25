import os

def Main(path):
    folder_path = path
    total_size = 0
    count = 0
    max_size_bytes = 0
    max_file_path = ""
    min_size_bytes = float('inf')
    min_file_path = ""

    for root, dirs, files in os.walk(folder_path):
        if "bad" not in root:
            for file in files:
                if file.lower().endswith('.png'):
                    full_path = os.path.join(root, file)
                    file_size_bytes = os.path.getsize(full_path)
                    total_size += file_size_bytes
                    count += 1
                    
                    if file_size_bytes > max_size_bytes:
                        max_size_bytes = file_size_bytes
                        max_file_path = full_path
                    if file_size_bytes < min_size_bytes:
                        min_size_bytes = file_size_bytes
                        min_file_path = full_path

    if count > 0:
        avg_size_kb = total_size / count / 1024
        print(f"Average PNG size: {avg_size_kb:.2f} KB ({count} images)")
        print(f"Maximum PNG size: {max_size_bytes / 1024:.2f} KB ({max_size_bytes} bytes)")
        print(f"Minimum PNG size: {min_size_bytes / 1024:.2f} KB ({min_size_bytes} bytes)")
    else:
        print("No PNG images found.")

if __name__ == "__main__":
    Main(os.path.dirname(os.path.abspath(__file__)))