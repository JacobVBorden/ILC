import json
from pysentimiento import create_analyzer

anaylzer = create_analyzer(task="sentiment", lang="es")

temp = anaylzer.predict("I hate you")

index = str(temp).find("{")

splitString = str(temp)[index:len(str(temp)) - 1]

neg = splitString[6:11]

neu = splitString[18:23]

pos = splitString[30:35]

print(neg)
print(neu)
print(pos)