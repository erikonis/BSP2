import json
import os
import code_to_image
from pathlib import Path


def find_java(input_dir):
    '''Finds all .java files inside input_dir, searching recursively.'''
    return [str(file) for file in Path(input_dir).rglob("*.java")]


def process_codes(input_dir, output_dir, entity, border_height):
    #codes tracking info
    codes_info = {}

    #Reads info file (for existing files)
    try:
        with open(f'{output_dir}/info.json', 'r') as f:
            codes_info = json.load(f)
            i = len(codes_info)  #index for image
    except FileNotFoundError:
        i = 0  #index for image

    #-----------MAKING DIRS-------------------
    os.makedirs(f"{output_dir}/over", exist_ok=True)
    os.makedirs(f"{output_dir}/bad", exist_ok=True)
    os.makedirs(f"{output_dir}/good", exist_ok=True)

    #Go through each found directory
    dirs = find_java(input_dir)
    print(f"Files found: {len(dirs)}")

    for filename in dirs:
        filename = filename.replace('\\', '/')

        img = code_to_image.ImageObject(filename)
        img.name = f"{entity}_image{i}.png"  #The file name to be saved.

        #Logic to avoid transforming the same codes into images
        Exit = False
        try:
            for value in codes_info.values():
                if value['directory'] == filename:
                    Exit = True
        except:
            pass

        if Exit:
            continue

        if img.height > 32:
            img.quality = "over"
            img.save(f"{output_dir}/over/{img.name}")

        elif border_height <= img.height < 33:
            img.quality = "good"
            img.save(f"{output_dir}/good/{img.name}")

        elif img.height < 1:
            print(f"Warning! a file has a height of 0 or less. Path: {filename}")
            img.quality = "bad"
            img.save(f"{output_dir}/bad/{img.name}")

        else:
            img.quality = "bad"
            img.save(f"{output_dir}/bad/{img.name}")

        codes_info[f"{entity}_image{i}.png"] = {
            'directory': img.filename,  #directory of the code
            'height': img.height,
            'quality': img.quality,
            'origin': img.origin
        }

        i += 1

    #Save the info file about the codes
    with open(f"{output_dir}/info.json", 'w') as f:
        f.write(json.dumps(codes_info, indent=4))

# ------------------------------- MAIN -------------------------------
#directories
codes_dir = "codes"  #directory with codes
images_dir = "images"  #directory with images

entity = "std"  #ai or std (students)

input_dir = f"{codes_dir}/{entity}/workspace"  #input directory
output_dir = f"{images_dir}/{entity}"  #output directory

#if the height of photo is less than this number, it will be separated and classified as "small code"
#To remove the border, set it to 0
border_height = 3
#---------------------------------------------------------------------
process_codes(input_dir, output_dir, entity, border_height)