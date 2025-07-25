import matplotlib.pyplot as plt
import matplotlib.image as mpimg

# Load images
img1 = mpimg.imread("ai raw distribution.png")
img2 = mpimg.imread("ai preprocessed distribution.png")

# Create side-by-side layout
fig, axs = plt.subplots(1, 2, figsize=(12, 4))  # use (2, 1) for vertical
axs[0].imshow(img1)
axs[0].axis('off')
axs[1].imshow(img2)
axs[1].axis('off')

plt.tight_layout()
plt.savefig("ai data visual.pdf", dpi=300)
plt.close()