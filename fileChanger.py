# Name: Rusho Binnabi
# Date: 5/20/2025
# Project: fileExtensionChanger
# Contact Information: RushoBinnabi123@yahoo.com

# this script changes the file extension of a folder of files based on the function parameters.

# run this script from the folder containing the files with the extensions you want to change.

import os

def changeFileExtension(oldFileExtension, newFileExtension):
    for file in os.listdir():
        if file.endswith(oldFileExtension):
            oldFileName = os.path.splitext(file)[0]
            oldFileExtension = os.path.splitext(file)[1]
            os.rename(oldFileName + oldFileExtension, oldFileName + newFileExtension)

oldFileExtension = input("Enter Old File Extension: ")
newFileExtension = input("Enter New File Extension: ")

changeFileExtension(oldFileExtension, newFileExtension)