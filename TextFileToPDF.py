# Name: Rusho Binnabi
# Date: 3/14/2023
# Project: PDF File Converter
# Code File Updated: 3/14/2023 at 3:42 PM
# Contact Information: RushoBinnabi123@yahoo.com

# this program converts the data from a text file to a pdf file for important account information.

from fpdf import FPDF
import os
import time

# this createPDF() function creates a pdf based on data from a text file.
# the name function argument is the name of the text file.

def createPDF(name):
    pdf = FPDF() # creates the pdf file.
    pdf.add_page()
    pdf.set_font("Times", size = 12)
    f = open(name, "r")
    for x in f:
        pdf.cell(120, 6, txt = x, ln = 1, align = 'L') # prints out every data x from the name into the pdf.
    pdf.output("Important Account(s) Information.pdf") # saves the pdf file under this name.
    f.close()
    print("")
    print("Conversion Done!")
    time.sleep(2)
    os.system('cls') # clears the screen.

# this startProgram() function runs the code.

def startProgram():
    os.system('cls')
    x = input("Enter file name to convert to PDF: ")
    createPDF(x) # calls the createPDF() function with x as the function argument.
    while "n" not in x:
        os.system('cls')
        x = input("Would you like to convert another file? (y/n): ")
        os.system('cls')
        if "n" in x:
            quit()
        x = input("Enter file name to convert to PDF: ")
        createPDF(x) # calls the createPDF() function with x as the function argument as long as the user wants to keep converting a text file.

startProgram()