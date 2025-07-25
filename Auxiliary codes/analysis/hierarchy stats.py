import os
from collections import Counter, defaultdict
from pathlib import Path
from tabulate import tabulate


def analyze_file_hierarchy(base_dir):
    """
    Recursively analyzes all files in the directory structure and collects statistics.

    Returns:
        tuple: (java_hierarchy, extension_stats, file_locations)
    """
    # For Java hierarchy
    parent_folders = []
    grandparent_folders = []
    great_grandparent_folders = []
    great_great_grandparent_folders = []

    # For file extension statistics
    extension_counts = Counter()
    file_locations = defaultdict(list)  # Store locations of non-Java files

    base_path = Path(base_dir)

    # Walk through all directories
    for root, _, files in os.walk(base_dir):
        if 'package' in Path(root).parts:
            print("Warning: package found in: "+root)

        path = Path(root)

        for file in files:
            file_path = path / file
            extension = file_path.suffix.lower()  # Get lowercase extension with dot

            if extension:  # Only process files with extensions
                extension_counts[extension] += 1

                # Store location for non-Java files
                if extension != '.java':
                    rel_path = os.path.relpath(file_path, base_dir)
                    file_locations[extension].append(rel_path)

                # Process Java hierarchy
                if extension == '.java':
                    # Immediate parent
                    if path.name != base_path.name:
                        parent_folders.append(path.name)

                    try:
                        # Grandparent
                        if path.parent.name != base_path.name:
                            grandparent_folders.append(path.parent.name)

                        # Great-grandparent
                        if path.parent.parent.name != base_path.name:
                            great_grandparent_folders.append(path.parent.parent.name)

                        # Great-great-grandparent
                        if path.parent.parent.parent.name != base_path.name:
                            great_great_grandparent_folders.append(path.parent.parent.parent.name)
                    except Exception:
                        pass

    # Create hierarchy dictionaries
    java_hierarchy = {
        'parents': dict(Counter(parent_folders)),
        'grandparents': dict(Counter(grandparent_folders)),
        'great_grandparents': dict(Counter(great_grandparent_folders)),
        'great_great_grandparents': dict(Counter(great_great_grandparent_folders))
    }

    return java_hierarchy, dict(extension_counts), dict(file_locations)


def print_extension_stats(extension_counts, file_locations):
    """Prints statistics about file extensions and their locations"""
    print("\nFile Extension Statistics")
    print("=======================")

    # Prepare data for tabulate
    table_data = []
    for ext, count in sorted(extension_counts.items()):
        table_data.append([ext, count])

    print(tabulate(table_data, headers=['Extension', 'Count'], tablefmt='grid'))

    # Print locations for non-Java files
    print("\nNon-Java File Locations:")
    print("=====================")
    for ext, locations in sorted(file_locations.items()):
        if ext != '.java':
            print(f"\n{ext} files ({len(locations)} total):")
            print("-" * (len(ext) + 14))
            for loc in sorted(locations):
                print(f"  {loc}")


def print_hierarchy_stats(hierarchy_dict, level_name, indent=""):
    """Helper function to print hierarchy statistics"""
    if hierarchy_dict:
        print(f"\n{indent}{level_name} containing Java files:")
        print(f"{indent}{'=' * (len(level_name) + 19)}")
        for folder, count in sorted(hierarchy_dict.items()):
            print(f"{indent}Folder: '{folder}' - Has {count} Java file(s)")

        print(f"\n{indent}Total unique {level_name.lower()} found: {len(hierarchy_dict)}")
        print(f"{indent}Total Java files in {level_name.lower()}: {sum(hierarchy_dict.values())}")
    else:
        print(f"\n{indent}No {level_name.lower()} found")


def main():
    base_dir = os.path.dirname(os.path.abspath(__file__))

    # Get all statistics
    java_hierarchy, extension_counts, file_locations = analyze_file_hierarchy(base_dir)

    # Print Java hierarchy statistics
    print("\nJava File Hierarchy Analysis")
    print("==========================")

    hierarchy_names = {
        'parents': "Immediate parent folders",
        'grandparents': "Grandparent folders",
        'great_grandparents': "Great-grandparent folders",
        'great_great_grandparents': "Great-great-grandparent folders"
    }

    indents = {
        'parents': "",
        'grandparents': "  ",
        'great_grandparents': "    ",
        'great_great_grandparents': "      "
    }

    for level, name in hierarchy_names.items():
        print_hierarchy_stats(java_hierarchy[level], name, indent=indents[level])

    # Print extension statistics
    print_extension_stats(extension_counts, file_locations)

    # Print overall summary
    print("\nOverall Summary:")
    print("===============")
    total_files = sum(extension_counts.values())
    print(f"Total files found: {total_files}")
    print(f"Total unique extensions: {len(extension_counts)}")

    unique_folders = sum(len(folders) for folders in java_hierarchy.values())
    print(f"Total unique folders across all levels: {unique_folders}")


if __name__ == "__main__":
    main()