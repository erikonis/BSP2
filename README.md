=== INFORMATION ===

This repository contains files for the Bachelor Semester Project of the 2nd Semester at the University of Luxembourg. Project was aimed to develop a Convolutional Neural Network model, capable of distinguishing AI-generated code from Human-written one. It is done so through CNN model training via transfer learning and using well known image recogntion models for this.

Workflow:
1. We first obtain the Java codes dataset. Human dataset are students solutions from the University of Luxembourg. AI solutions were generated manually using ChatGPT, Gemini, DeepSeek and CoPilot LLM through web UI.
2. Obtained are preprocessed to remove comments and possible biases, giving away the nature of the code. This way we obtain RAW and PREPROCESSED java file datasets.
3. We then proceed to transform the java images into their image representation by reading files in binary mode and interpreting each of the 8 bits as 1 of the rgb channels for a corresponding pixel. Images are this way constructed pixel by pixel, having a fixed width of 32px and a variable height h, which is at least 32px (this is ensured with padding).
4. Before feeding images into CNNs, we scale them to 224x224 pixel dimensions (as such dimensions are expected by the CNN models).
5. Finally, we train the model, evaluate and conclude the results, checking the obtained images, describing the progress. There were essentially 2 types of training: regular (training for all 40 epochs) and best (where only the best model in 5 epochs is saved, to obtain the best model).

The partial results obtained and more details are shown in folder "images", where the images of the accuracy and loss curves are held and in the "Training results", where for each model, detailed information is provided by supplementary files.

====================
