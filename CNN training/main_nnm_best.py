import tensorflow as tf
from tensorflow.keras.callbacks import ModelCheckpoint
from tensorflow.keras import layers, models, optimizers, applications
from tensorflow.keras.preprocessing.image import ImageDataGenerator
from sklearn.model_selection import train_test_split
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.metrics import (
    confusion_matrix,
    roc_auc_score,
    f1_score,
    precision_score,
    recall_score,
    roc_curve
)
import seaborn as sns
import os
import time

from tensorflow.python.keras.callbacks import EarlyStopping

# GLOBAL VARIABLES
model_name = "nnm"
model_name_full = "NASNet-A MobileNet"
prefix = "raw"  # Define as "raw" or "preprocessed"
output = f"best_{model_name}_{prefix}/"


# 1. LOAD DATA
def get_data_generators(data_dir, batch_size=32):
    # Define a basic ImageDataGenerator for data preprocessing
    datagen = ImageDataGenerator(rescale=1.0 / 255)  # Normalize pixel values to [0, 1]

    # Load all image paths and corresponding class labels for training data
    train_dir = os.path.join(data_dir, "train")
    class_labels = os.listdir(train_dir)  # List of class names (e.g., "0", "1")
    all_filepaths, all_labels = [], []

    for class_label in class_labels:
        class_dir = os.path.join(train_dir, class_label)
        class_files = os.listdir(class_dir)
        all_filepaths.extend([os.path.join(class_dir, file) for file in class_files])
        all_labels.extend([class_label] * len(class_files))

    # Convert to NumPy arrays
    all_filepaths = np.array(all_filepaths)
    all_labels = np.array(all_labels, dtype=str)

    # Split into training and validation datasets (80% train, 20% validation)
    train_files, val_files, train_labels, val_labels = train_test_split(
        all_filepaths,
        all_labels,
        test_size=0.2,  # 20% for validation
        stratify=all_labels,  # Maintain class balance in splits
        random_state=42
    )

    # Create Pandas DataFrames for training and validation
    train_df = pd.DataFrame({"filename": train_files, "class": train_labels})
    val_df = pd.DataFrame({"filename": val_files, "class": val_labels})

    # Create generators from DataFrames
    train_gen = datagen.flow_from_dataframe(
        train_df,
        x_col="filename",
        y_col="class",
        target_size=(224, 224),
        batch_size=batch_size,
        class_mode="binary",
        shuffle=True
    )

    val_gen = datagen.flow_from_dataframe(
        val_df,
        x_col="filename",
        y_col="class",
        target_size=(224, 224),
        batch_size=batch_size,
        class_mode="binary",
        shuffle=False  # Validation data should not be shuffled
    )

    # Test generator for test dataset (loaded separately)
    test_gen = datagen.flow_from_directory(
        os.path.join(data_dir, "test"),
        target_size=(224, 224),
        batch_size=batch_size,
        class_mode="binary",
        shuffle=False
    )

    return train_gen, val_gen, test_gen


# 2. BUILD MODEL
def create_model():
    base_model = applications.NASNetMobile(
        input_shape=(224, 224, 3), include_top=False, weights="imagenet"
    )
    base_model.trainable = False  # Freeze all layers

    model = models.Sequential([
        base_model,
        layers.GlobalAveragePooling2D(),
        layers.Dense(512, activation="relu"),
        layers.Dropout(0.5),
        layers.Dense(1, activation="sigmoid")
    ])

    model.compile(
        optimizer=optimizers.Adam(learning_rate=0.0001),
        loss="binary_crossentropy",
        metrics=["accuracy"]
    )

    return model


# 3. PLOT LEARNING CURVES
def plot_learning_curve(history, best_epoch):
    acc = history.history.get('accuracy')
    val_acc = history.history.get('val_accuracy')
    loss = history.history.get('loss')
    val_loss = history.history.get('val_loss')

    plt.figure(figsize=(12, 5))
    plt.suptitle(model_name_full, fontsize=18)

    # Accuracy subplot
    plt.subplot(1, 2, 1)
    plt.plot(acc, label='Training Accuracy')
    plt.plot(val_acc, label='Validation Accuracy')
    plt.axvline(best_epoch, color='red', linestyle='--', label='Best Epoch')
    plt.xlabel('Epoch')
    plt.ylabel('Accuracy')
    plt.legend()

    # Loss subplot
    plt.subplot(1, 2, 2)
    plt.plot(loss, label='Training Loss')
    plt.plot(val_loss, label='Validation Loss')
    plt.axvline(best_epoch, color='red', linestyle='--', label='Best Epoch')
    plt.xlabel('Epoch')
    plt.ylabel('Loss')
    plt.legend()

    plt.tight_layout()
    plt.savefig(f"{output}Loss_Accuracy_vs_epochs_{model_name}_{prefix}.png")
    plt.close()
    print(f"Learning curve saved to: {output}Learning_Curve_{model_name}_{prefix}.png")


# 4. SAVE MODEL
def save_model(model):
    model_path = f"{output}{model_name}_binary_classifier_{prefix}.h5"
    model.save(model_path)
    print(f"Model saved to: {model_path}")


# 5. PLOT ROC CURVE
def plot_roc(test_labels, test_probs, roc_auc):
    fpr, tpr, _ = roc_curve(test_labels, test_probs)
    plt.figure(figsize=(6, 6))
    plt.plot(fpr, tpr, label=f'AUC = {roc_auc:.4f}')
    plt.plot([0, 1], [0, 1], 'k--')
    plt.xlabel('False Positive Rate')
    plt.ylabel('True Positive Rate')
    plt.title(f'ROC Curve - {model_name_full}')
    plt.legend()
    plt.savefig(f"{output}ROC_Curve_{model_name}_{prefix}.png")
    plt.close()
    print(f"ROC curve saved to: {output}ROC_Curve_{model_name}_{prefix}.png")


# 6. CALCULATE CONFIDENCE STATISTICS
def get_class_confidence_stats(probs, labels, pred_labels, class_label):
    correct_mask = (labels == class_label) & (pred_labels == labels)

    class_probs = probs[correct_mask] if class_label == 1 else 1 - probs[correct_mask]

    if len(class_probs) == 0:
        return {
            'samples': 0,
            'avg_confidence': float('nan'),
            'max_confidence': float('nan'),
            'min_confidence': float('nan')
        }

    return {
        'samples': len(class_probs),
        'avg_confidence': np.mean(class_probs),
        'max_confidence': np.max(class_probs),
        'min_confidence': np.min(class_probs)
    }


def save_confidence_statistics(test_probs, test_labels, pred_labels):
    student_stats = get_class_confidence_stats(test_probs, test_labels, pred_labels, class_label=0)
    ai_stats = get_class_confidence_stats(test_probs, test_labels, pred_labels, class_label=1)

    header = f"{'Model':<10} {'Dataset':<12} {'Label':<8} {'Samples':<8} {'Average Confidence':<18} {'Max Confidence':<14} {'Min Confidence':<14}"
    separator = "-" * len(header)

    student_line = f"{model_name:<10} {prefix:<12} {'Class 0':<8} {student_stats['samples']:<8} {student_stats['avg_confidence']:<18.3f} {student_stats['max_confidence']:<14.3f} {student_stats['min_confidence']:<14.3f}"
    ai_line = f"{model_name:<10} {prefix:<12} {'Class 1':<8} {ai_stats['samples']:<8} {ai_stats['avg_confidence']:<18.3f} {ai_stats['max_confidence']:<14.3f} {ai_stats['min_confidence']:<14.3f}"

    conf_stats_path = f"{output}confidence_statistics_{model_name}_{prefix}.txt"
    with open(conf_stats_path, "w") as f:
        f.write(header + "\n")
        f.write(separator + "\n")
        f.write(student_line + "\n")
        f.write(ai_line + "\n\n")

    print(f"Confidence statistics saved to: {conf_stats_path}")


# 7. EVALUATE MODEL
def evaluate_model(model, test_gen):
    predictions = model.predict(test_gen, verbose=1)
    pred_labels = (predictions > 0.5).astype(int).squeeze()
    test_labels = test_gen.classes
    test_probs = predictions.squeeze()

    f1 = f1_score(test_labels, pred_labels)
    recall = recall_score(test_labels, pred_labels)
    precision = precision_score(test_labels, pred_labels)
    roc_auc = roc_auc_score(test_labels, test_probs)
    test_accuracy = np.mean(pred_labels == test_labels) * 100

    metrics_path = f"{output}metrics_{model_name}_{prefix}.txt"
    with open(metrics_path, "w") as f:
        f.write(f"Model: {model_name}\n")
        f.write(f"Dataset: {prefix}\n")
        f.write(f"{'-' * 30}\n")
        f.write(f"F1 Score: {f1:.4f}\n")
        f.write(f"Recall: {recall:.4f}\n")
        f.write(f"Precision: {precision:.4f}\n")
        f.write(f"Accuracy: {test_accuracy:.2f}%\n")
        f.write(f"ROC AUC: {roc_auc:.4f}\n")

    print(f"Metrics saved to: {metrics_path}")

    # CONFUSION MATRIX
    formatted_accuracy = f"{test_accuracy:.1f}" if test_accuracy % 1 != 0 else f"{int(test_accuracy)}"
    label_color = '#1f77b4'
    cm = confusion_matrix(test_labels, pred_labels)
    plt.figure(figsize=(6, 6))
    sns.heatmap(cm, annot=True, fmt="d", cmap="Blues", xticklabels=["Human", "AI"], yticklabels=["Human", "AI"],
                annot_kws={"size": 36})
    plt.xlabel('Predicted', color=label_color, labelpad=-45, fontsize=18)
    plt.ylabel('True', color=label_color, labelpad=-45, fontsize=18)
    plt.tick_params(axis='both', which='major', pad=25, labelsize=24)
    plt.title(f"{model_name_full}\nAccuracy {formatted_accuracy}%", pad=20, fontsize=24)
    plt.tight_layout()
    plt.savefig(f"{output}Confusion_Matrix_{model_name}_{prefix}.png")
    plt.close()

    plot_roc(test_labels, test_probs, roc_auc)
    save_confidence_statistics(test_probs, test_labels, pred_labels)


# 8. MAIN FUNCTION WITH TRAINING TIME
def main():
    data_dir = f"data{prefix}"  # Update with actual data path
    os.makedirs(output, exist_ok=True)

    train_gen, val_gen, test_gen = get_data_generators(data_dir, batch_size=32)
    model = create_model()

    epochs = 40
    start_time = time.time()

    # Define the path to save the best model
    best_model_path = f"{output}best_model_{model_name}_{prefix}.h5"

    # Callback setup
    early_stopping = EarlyStopping(
        monitor='val_loss',
        patience=5,
        min_delta=0.0001,
        verbose=1,
        restore_best_weights=False
    )

    model_checkpoint = ModelCheckpoint(
        filepath=best_model_path,
        monitor='val_loss',
        save_best_only=True,
        save_weights_only=False,
        verbose=1
    )

    # Training the model and storing history for learning curve
    history = model.fit(
        train_gen,
        validation_data=val_gen,
        epochs=epochs,
        callbacks=[early_stopping, model_checkpoint],
        verbose=1
    )

    stopped_epoch = early_stopping.stopped_epoch
    patience = early_stopping.patience
    best_epoch = stopped_epoch - patience + 1

    # If early stopping didn't trigger, best_epoch = argmin(val_loss)
    if best_epoch < 1:
        best_epoch = int(np.argmin(history.history['val_loss'])) + 1

    print(f"Best Epoch: {best_epoch}")

    end_time = time.time()

    # Save learning curve
    plot_learning_curve(history, best_epoch)

    # Save training time
    train_time_path = f"{output}training_time_{model_name}_{prefix}.txt"
    total_training_time = end_time - start_time
    with open(train_time_path, "w") as f:
        f.write(f"Total training time: {total_training_time:.2f} seconds")
    print(f"Training time saved to: {train_time_path}")

    # Load the best model for evaluation
    print("Loading the best model saved during training...")
    best_model = tf.keras.models.load_model(best_model_path)
    print("Best model loaded successfully!")

    # Evaluate the best model on the test set
    evaluate_model(best_model, test_gen)


if __name__ == "__main__":
    main()