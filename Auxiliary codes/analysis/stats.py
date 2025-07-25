import os
from tabulate import tabulate  # to display output in tabular format, you can install it using `pip install tabulate`
import pandas as pd


def count_java_solutions(base_dir, threshold):
    """
    Iterates through the directories in the specified structure and counts Java solutions.
    Ensures all entries in the threshold are represented in the dataset, filling with 0 where missing.
    :param base_dir: The base directory containing exercise sheets.
    :param threshold: Dictionary containing expected solution numbers for each exercise sheet and exercise.
    :return: A dictionary containing the statistics.
    """
    stats = []  # To store the statistics

    sheets = sorted(os.listdir(base_dir))  # List all sheets (e.g., Lab2, Lab3...)
    for sheet in threshold.keys():  # Iterate through all sheets in the threshold
        sheet_path = os.path.join(base_dir, sheet)
        if not os.path.isdir(sheet_path):
            # If the sheet directory doesn't exist, fill all exercises for the sheet with zeroes
            for exercise in threshold[sheet]:
                stats.append([sheet, exercise, 0, 0, 0, 0, 0, threshold[sheet][exercise]])
            continue

        # Get exercises in the dataset for the existing sheet
        exercises = sorted(os.listdir(sheet_path))  # List all exercises (e.g., Ex1, Ex2...)
        for exercise in threshold[sheet]:  # Iterate through all exercises in the threshold for the sheet
            exercise_path = os.path.join(sheet_path, exercise)
            if exercise not in exercises or not os.path.isdir(exercise_path):
                # If an exercise is missing in the dataset, set all counts for it to zero
                stats.append([sheet, exercise, 0, 0, 0, 0, 0, threshold[sheet][exercise]])
                continue

            # Initialize counts for each model
            counts = {"chatgpt": 0, "copilot": 0, "deepseek": 0, "gemini": 0}

            models = sorted(os.listdir(exercise_path))  # List models (e.g., chatgpt, copilot...)
            for model in models:
                model_path = os.path.join(exercise_path, model)
                if not os.path.isdir(model_path) or model not in counts:
                    continue

                solution_folders = sorted(os.listdir(model_path))  # List solution folders (e.g., sol1, sol2...)
                for solution_folder in solution_folders:
                    solution_path = os.path.join(model_path, solution_folder)
                    if os.path.isdir(solution_path):
                        java_count = sum(
                            1 for f in os.listdir(solution_path)
                            if f.endswith(".java") or (os.path.isdir(os.path.join(solution_path, f)) and f == "package")
                        )
                        counts[model] += java_count

            # Sum the counts across all models for total
            total = sum(counts.values())

            # Append data to stats for tabular output
            stats.append(
                [sheet, exercise, counts["chatgpt"], counts["copilot"], counts["deepseek"], counts["gemini"], total,
                 threshold[sheet][exercise]]
            )

    return stats


def summarize_totals(stats):
    """
    Summarizes total actual and expected Java files per exercise sheet.
    :param stats: The collected statistics as a list of rows.
    :return: A summary list showing totals per exercise sheet.
    """
    sheet_totals = {}  # Dictionary to store totals for each exercise sheet

    for row in stats:
        sheet = row[0]  # Ex. Sheet
        total = row[6]  # Actual total
        expected = row[7]  # Expected total

        # Initialize sheet in the dictionary if not already present
        if sheet not in sheet_totals:
            sheet_totals[sheet] = {"actual": 0, "expected": 0}

        # Add current totals to the respective sheet
        sheet_totals[sheet]["actual"] += total
        if expected != "N/A":
            sheet_totals[sheet]["expected"] += int(expected)

    # Create a summary table
    summary = []
    for sheet, totals in sheet_totals.items():
        summary.append([sheet, totals["actual"], totals["expected"]])

    return summary  # Return summary data



def main():
    # Define the base directory where the exercise sheets are located
    base_dir = os.path.dirname(os.path.abspath(__file__))
    # Define the threshold of expected solutions, modify this as needed
    threshold = {
        "lab1": {
            "Ex. 4": 20, "Ex. 5": 20,
            "Ex. 6": 20, "Ex. 7": 20
        },
        "lab2": {
    "Ex. 1": 20, "Ex. 2": 20, "Ex. 3": 20, "Ex. 4": 20, "Ex. 5": 40,
    "Ex. 6": 20, "Ex. 7": 20, "Ex. 8": 20, "Ex. 9": 20
},
        "lab3": {
    "Ex. 1": 80, "Ex. 2": 20, "Ex. 3": 20, "Ex. 4": 40, "Ex. 5": 20,
    "Ex. 6": 20, "Ex. 7": 20, "Ex. 8": 20
}
,
        "lab4": {
    "Ex. 1": 40, "Ex. 2": 20, "Ex. 3": 40, "Ex. 4": 80, "Ex. 5": 20,
    "Ex. 6": 20, "Ex. 7": 20
}
,
        "lab5": {
    "Ex. 1": 40, "Ex. 2": 40, "Ex. 3": 60, "Ex. 4": 80, "Ex. 5": 60
}
,
        "lab6": {
    "Ex. 1": 80, "Ex. 2": 120, "Ex. 3": 100
}
,
        "lab7": {
    "Ex. 1": 100, "Ex. 2": 40, "Ex. 3": 80, "Ex. 4": 120
}
,
        "lab8": {
    "Ex. 1": 100, "Ex. 2": 60, "Ex. 3": 20, "Ex. 4": 80
}
,
        "lab9": {
    "Ex. 1": 100, "Ex. 2": 100, "Ex. 3": 40
}
,
        "lab10": {
    "Ex. 1": 60, "Ex. 2": 80, "Ex. 3": 100
}

    }

    # Calculate the statistics
    stats = count_java_solutions(base_dir, threshold)
    summary = summarize_totals(stats)

    # Create DataFrames for both tables
    stats_df = pd.DataFrame(stats, columns=["Ex. Sheet", "Ex.", "chatgpt", "copilot", "deepseek", "gemini", "Total", "Expected"])
    summary_df = pd.DataFrame(summary, columns=["Ex. Sheet", "Actual", "Expected"])

    # Export to Excel file
    with pd.ExcelWriter('statistics.xlsx') as writer:
        stats_df.to_excel(writer, sheet_name='Detailed Stats', index=False)
        summary_df.to_excel(writer, sheet_name='Summary', index=False)

    # Print the statistics in tabular format (keep existing console output)
    headers = ["Ex. Sheet", "Ex.", "chatgpt", "copilot", "deepseek", "gemini", "Total", "Expected"]
    print(tabulate(stats, headers=headers, tablefmt="grid"))
    print(tabulate(summary, headers=["Ex. Sheet", "Actual", "Expected"], tablefmt="grid"))
    print("\nStatistics have been exported to 'statistics.xlsx'")

if __name__ == "__main__":
    main()