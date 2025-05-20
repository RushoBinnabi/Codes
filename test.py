import csv

names = []
count1, count2, count3, count4 =  0, 0, 0, 0

with open("499 Project - Code Implementation.csv") as file:
    reader = csv.DictReader(file)
    for row in reader:
        names.append(row['Completed By:'])

for name in names:
    if name == "Ammar":
        count1 += 1
    elif name == "Leo":
        count2 += 1
    elif name == "Maddie":
        count3 += 1
    elif name == "Rusho":
        count4 += 1
    #print(name) # used only for debugging.

print("Ammar: " + str(count1))
print("Leo: " + str(count2))
print("Maddie: " + str(count3))
print("Rusho: " + str(count4))