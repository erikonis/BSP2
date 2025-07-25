
import numpy as np
from PIL import Image

class ImageObject:
    def __init__(self, filename, border = 3, width = 32):
        with open(filename, "rb") as file:
            binary_data = file.read()
        data = np.frombuffer(binary_data, dtype=np.uint8)
        # Calculate the height required to fit the data
        # Each pixel requires 3 values (R, G, B), so width * 3 values per row
        row_size = width * 3
        self.filename = filename
        self.height = int(np.ceil(len(data) / row_size))

        if "std" in filename:
            self.origin = "std"
        elif "chatgpt" in filename:
            self.origin = "chatgpt"
        elif "copilot" in filename:
            self.origin = "copilot"
        elif "gemini" in filename:
            self.origin = "gemini"
        elif "deepseek" in filename:
            self.origin = "deepseek"
        else:
            self.origin = None
            print(f"Origin NOT FOUND!----------> {filename}")
        if self.height < border:
            self.good = False
        else:
            self.good = True

        # Pad the data to fill the last row completely with black (0)

        # We'll use method that is used for malware detection. Proved to be useful. Implementation of CNNs
        # Datasets preparation, creation | CNN training, working with parameter.
        # split AI images into different groups (chatGPT, deepseek, etc.)
        height = self.height

        # Ensure data is padded to fit at least 32 rows
        min_height = 32
        if self.height < min_height:
            padding = row_size * min_height - len(data)
        else:
            remainder = len(data) % row_size
            padding = row_size - remainder if remainder else 0

        data = np.pad(data, (0, padding), mode="constant", constant_values=0)


        height = max(min_height, self.height)

        # Reshape the data into an image format (height x width x 3)
        image_data = data.reshape((height, width, 3))

        # Create an RGB image from the array
        self.image = Image.fromarray(image_data.astype(np.uint8), "RGB")

    def save(self, location):
        self.image.save(location)