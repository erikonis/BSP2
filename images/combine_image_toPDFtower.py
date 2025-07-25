import matplotlib.pyplot as plt
import matplotlib.image as mpimg

# Load images
img1 = mpimg.imread("Loss_Accuracy_vs_epochs_mnv3s_preprocessed.png")
img2 = mpimg.imread("Loss_Accuracy_vs_epochs_rmlp_preprocessed.png")
img3 = mpimg.imread("Loss_Accuracy_vs_epochs_vitl_preprocessed.png")

# Create vertical layout (3 rows, 1 column)
fig, axs = plt.subplots(3, 1, figsize=(8, 10))  # Adjust `figsize` as needed based on image size
axs[0].imshow(img1)
axs[0].axis('off')
axs[1].imshow(img2)
axs[1].axis('off')
axs[2].imshow(img3)
axs[2].axis('off')

plt.tight_layout()
plt.savefig("Loss_accuracy_preprocessed_mnv3s_rmlp_vitl.pdf", dpi=300)  # Save the figure as a PDF
plt.close()