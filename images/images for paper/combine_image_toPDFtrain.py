import matplotlib.pyplot as plt
import matplotlib.image as mpimg

# Load confusion matrix images
img1 = mpimg.imread("Confusion_Matrix_dn169_preprocessed.png")
img2 = mpimg.imread("Confusion_Matrix_rn101_preprocessed.png")
img3 = mpimg.imread("Confusion_Matrix_vgg19_preprocessed.png")

# Create horizontal layout (1 row, 3 columns)
fig, axs = plt.subplots(1, 3, figsize=(18, 6))  # Adjust `figsize` for appropriate width and height

# Add images to the subplots
axs[0].imshow(img1)
axs[0].axis('off')  # Hide axes
axs[1].imshow(img2)
axs[1].axis('off')
axs[2].imshow(img3)
axs[2].axis('off')

# Save as a high-quality PDF
plt.tight_layout()
plt.savefig("Confusion_matrices_dn169_rn101_vgg19_preprocessed.pdf", dpi=300)  # Save the figure as a high-resolution PDF
plt.close()