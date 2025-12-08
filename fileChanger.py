# Name: Rusho Binnabi
# Date: 5/20/2025
# Project: fileExtensionChanger
# Contact Information: RushoBinnabi123@yahoo.com

# this script changes the file extension of a folder of files based on the function parameters.

# run this script from the folder containing the files with the extensions you want to change.

import os

def changeFileExtension(directory, oldExtension, newExtension):
    for file in os.listdir(directory):
        if file.endswith(oldExtension):
            obj = os.path.splitext(file)[0]
            ext = os.path.splitext(file)[1]
            os.rename(obj + ext, obj + newExtension)

folder = input("Enter Directory: ")
oldFileExtension = input("Enter Old File Extension: ")
newFileExtension = input("Enter New File Extension: ")

changeFileExtension(folder, oldFileExtension, newFileExtension)

condition = input("\nDo you want to use the program again? (y/n) ")

while condition == "y":
    folder = input("Enter Directory: ")
    oldFileExtension = input("Enter Old File Extension: ")
    newFileExtension = input("Enter New File Extension: ")
    changeFileExtension(folder, oldFileExtension, newFileExtension)
    condition = input("\nDo you want to use the program again? (y/n) ")
    if condition == "n":
        exit