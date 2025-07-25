import json

with open("info.json", "r") as f:
    data = json.load(f)

gemini = chatgpt = copilot = deepseek = bad = 0

for key, value in data.items():
    if (value["quality"] == "good" or value["quality"] == "over") and value["origin"] == "gemini":
        gemini += 1
    elif (value["quality"] == "good" or value["quality"] == "over") and value["origin"] == "chatgpt":
        chatgpt += 1
    elif (value["quality"] == "good" or value["quality"] == "over") and value["origin"] == "copilot":
        copilot += 1
    elif (value["quality"] == "good" or value["quality"] == "over") and value["origin"] == "deepseek":
        deepseek += 1
    else:
        bad += 1

print(f"gemini: {gemini}")
print(f"chatgpt: {chatgpt}")
print(f"copilot: {copilot}")
print(f"deepseek: {deepseek}")
print(f"too small: {bad}")