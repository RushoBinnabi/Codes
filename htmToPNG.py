import os

obj = ""
ext = ""

for file in os.listdir(r"C:\Users\Rusho\Downloads"): # change this according to the directory you want this script to be used in.
    if file.endswith(".htm"):
        obj = os.path.splitext(file)[0]
        ext = os.path.splitext(file)[1]
        os.rename(file, obj + ".png")