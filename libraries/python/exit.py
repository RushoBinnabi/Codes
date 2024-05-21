# Name: Rusho Binnabi
# Date: 5/21/2024
# Project: libraries - exit
# Contact Information: RushoBinnabi123@yahoo.com

# this exit library file has the function for exiting programs.

import slow
import clearscreen
import sys

# this exitProgram() function exits the program.
def exitProgram():
    print("Goodbye!")
    slow.sleepFor2Seconds()
    clearscreen.clearScreen()
    sys.exit()