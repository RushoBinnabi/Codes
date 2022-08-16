# Name: Rusho Binnabi
# Date: 08/15/2022
# Project: Counting
# Code File Updated: 08/15/2022 at 8:40 PM
# Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101

import math # imports the math module for use in this program.
import os # imports the os module for use in this program.

# this permutationsWithRepitition() method uses permutations with repitition.
# this method uses 2 arguments, n and r. n is the total number of objects and r is the number of objects to choose from.
# returns number which is the total number of permuations with repitition using n and r.

def permutationsWithRepetition(n, r):
    number = pow(n, r) # number will contain the value of the value of n raised to the power of the value of r which is the formula for permutations with repitition and using the pow() method as well as n and r.
    return number # returns number.

# this permutationsWithRepitition() method uses permutations without repitition.
# this method uses 2 arguments, n and r. n is the total number of objects and r is the number of objects to choose from.
# returns number which is the total number of permuations without repitition using n and r.

def permutationsWithoutRepetition(n, r):
    number = math.perm(n, r) # number will contain the value of the value of n and r using the pemu() method from the math module which is the formula for permutations without repitition.
    return number # returns the number.

# this combinationsWithoutRepitition() method uses combinations without repitition.
# this method uses 2 arguments, n and r. n is the total number of objects and r is the number of objects to choose from.
# returns number which is the total number of combinations without repitition using n and r.

def combinationsWithoutRepitition(n, r):
    number = math.comb(n, r) # number will contain the value of the value of n and r using the comb() method from the math module which is the formula for combinations without repitition.
    return number # returns number.

# this combinationsWithRepitition() method uses combinations with repitition.
# this method uses 2 arguments, n and r. n is the total number of objects and r is the number of objects to choose from.
# returns number which is the total number of combination with repitition using n and r.

def combinationsWithRepitition(n, r):
    number1 = (r + n) - 1 # number1 will have the value of r + n - 1.
    number2 = math.factorial(number1) # number2 will have the value of the factorial of number1 using the factorial() method from the math module.
    number3 = math.factorial(r) # number3 will have the value of the factorial of r.
    number4 = n - 1 # number4 will have the value of n - 1.
    number5 = math.factorial(number4) # number5 will have the value of the factorial of number4.
    number6 = int(number2 / (number3 * number5)) # number6 will have the integer value of number2 divided by the multiplied values of number3 and number5.
    return number6 # returns number6.

choice = input("Do you want to calculate combinations with repitition, combinations without repitition, permutations with repitition, permutations without repititions (cr, cwr, pr, pwr): ") # choice will have the user input.

while choice != "n": # the code inside the while loop will run as long as the value of choice is not equal to no.
    if choice == "cr": # the code inside the will run if the value of choice is cr, which means the user wants to use combinations with repitition.
        n = int(input("\nEnter the number of things to choose from: ")) # n will have the value of the user input of n which is the total number of things to choose from as an integer value.
        r = int(input("Enter the number of things to choose: ")) # r will have the value of the user input of r which is the total number of things to choose as an integer value.
        print() # creates some line spacing.
        print("Combining " + str(n) + " total objects with " + str(r) + " objects chosen with repitition gives us " + str((combinationsWithRepitition(n, r))) + " combinations with repitition.") # shows the user the total number of combinations with repitition that can be made with n and r.
    elif choice == "cwr": # the code inside the will run if the value of choice is cwr, which means the user wants to use combinations without repitition.
        n = int(input("\nEnter the number of things to choose from: ")) # n will have the value of the user input of n which is the total number of things to choose from as an integer value.
        r = int(input("Enter the number of things to choose: ")) # r will have the value of the user input of r which is the total number of things to choose as an integer value.
        print() # creates some line spacing.
        print("Combining " + str(n) + " total objects with " + str(r) + " objects chosen without repitition gives us " + str((combinationsWithoutRepitition(n, r))) + " combinations without repitition.") # shows the user the total number of combinations without repitition that can be made with n and r.
    elif choice == "pr": # the code inside the will run if the value of choice is pr, which means the user wants to use permutations with repitition.
        n = int(input("\nEnter the number of things to choose from: ")) # n will have the value of the user input of n which is the total number of things to choose from as an integer value.
        r = int(input("Enter the number of things to choose: ")) # r will have the value of the user input of r which is the total number of things to choose as an integer value.
        print() # creates some line spacing.
        print("Permuting " + str(n) + " total objects with " + str(r) + " objects chosen with repitition gives us " + str((permutationsWithRepetition(n, r))) + " permutations with repitition.") # shows the user the total number of permutations with repitition that can be made with n and r.
    elif choice == "pwr": # the code inside the will run if the value of choice is pr, which means the user wants to use permutations without repitition.
        n = int(input("\nEnter the number of things to choose from: ")) # n will have the value of the user input of n which is the total number of things to choose from as an integer value.
        r = int(input("Enter the number of things to choose: ")) # r will have the value of the user input of r which is the total number of things to choose as an integer value.
        print() # creates some line spacing.
        print("Permuting " + str(n) + " total objects with " + str(r) + " objects chosen without repitition gives us " + str((permutationsWithoutRepetition(n, r))) + " permutations without repitition.") # shows the user the total number of permutations without repitition that can be made with n and r.

    input("") # prompts for input, but not really, so that the user can actually see the output instead of the program immediately ending after it finishes.
    choice = input("\nDo you want to use the program again (y/n)?: ") # choice will have the user input.

    if choice == "y": # the code inside the if statement will run if the value of choice is equal to y, which means that the user wants to use the program again.
        os.system('cls') # clears the screen by using the system() method from the os module and cls as it's argument.
        choice = input("\nDo you want to calculate combinations with repitition, combinations without repitition, permutations with repitition, permutations without repititions (cr, cwr, pr, pwr): ") # choice will have the user input.