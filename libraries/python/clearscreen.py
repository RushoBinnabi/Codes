# Name: Rusho Binnabi
# Date: 5/21/2024
# Project: libraries - clear screen
# Contact Information: RushoBinnabi123@yahoo.com

# this clearscreen library file has the function for clearing the screen.

import sys
from os import system, name

# this clearScreen() function clears the screen.
def clearScreen():
    if name == "nt":
        _ = system("cls")
    else:
        _ = system("clear")