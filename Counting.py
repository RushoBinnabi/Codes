# Name: Rusho Binnabi
# Date: 08/15/2022
# Project: Counting
# Code File Updated: 09/20/2022 at 8:35 PM
# Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101

import math # imports the math module for use in this program.
import os # imports the os module for use in this program.

choice = "" # a string variable called choice gets created and initialized to an empty string.
choice1 = "" # a string variable called choice1 gets created and initialized to an empty string.
choice2 = "" # a string variable called choice2 gets created and initialized to an empty string.
n = "" # a string variable called n gets created and initialized to an empty string.
r = "" # a string variable called r gets created and initialized to an empty string.

# this clearDara() function resets all the values of the variables to their default value for memory management.

def clearData():
    n = "" # n gets set to an empty string,
    r = "" # r gets set to an empty string.
    choice = "" # choice gets set to an empty string.
    choice1 = "" # choice1 gets set to an empty string.
    choice2 = "" # choice2 gets set to an empty string.

# this permutationsWithRepitition() method uses permutations with repitition.
# this method uses 2 arguments, n and r. n is the total number of objects and r is the number of objects to choose from.
# returns number which is the total number of permuations with repitition using n and r.

def permutationsWithRepetition(n, r):
    number = pow(n, r) # number will contain the value of the value of n raised to the power of the value of r which is the formula for permutations with repitition and using the pow() method as well as n and r.
    return number # returns number.
    number = 0 # number gets set to 0 after finishing for memory management.

# this permutationsWithRepitition() method uses permutations without repitition.
# this method uses 2 arguments, n and r. n is the total number of objects and r is the number of objects to choose from.
# returns number which is the total number of permuations without repitition using n and r.

def permutationsWithoutRepetition(n, r):
    number = math.perm(n, r) # number will contain the value of the value of n and r using the pemu() method from the math module which is the formula for permutations without repitition.
    return number # returns the number.
    number = 0 # number gets set to 0 after finishing for memory management.

# this combinationsWithoutRepitition() method uses combinations without repitition.
# this method uses 2 arguments, n and r. n is the total number of objects and r is the number of objects to choose from.
# returns number which is the total number of combinations without repitition using n and r.

def combinationsWithoutRepitition(n, r):
    number = math.comb(n, r) # number will contain the value of the value of n and r using the comb() method from the math module which is the formula for combinations without repitition.
    return number # returns number.
    number = 0 # number gets set to 0 after finishing for memory management.

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
    number1 = 0 # number1 gets set to 0 after finishing for memory management.
    number2 = 0 # number2 gets set to 0 after finishing for memory management.
    number3 = 0 # number3 gets set to 0 after finishing for memory management.
    number4 = 0 # number4 gets set to 0 after finishing for memory management.
    number5 = 0 # number5 gets set to 0 after finishing for memory management.
    number6 = 0 # number6 gets set to 0 after finishing for memory management.


while choice != "n": # the code inside the while loop will run as long as the value of choice isn't equal to n which means the user wants to use the program again.
    choice1 = input("Does the order matter (y/n)?: ") # choice1 will have the user input.
    choice2 = input("Is there repitition involved (y/n)? ") # choice2 will have the user input.

    if choice1 == "y" and choice2 == "y": # the code inside the if statement will run if the value of choice1 and choice2 are y which means that the order matters and repitition is allowed.
        print() # creates some line spacing.
        n = int(input("Enter the total number of objects: ")) # prompts the user to enter the total number of objects as an integer number.
        r = int(input("Enter the number of objects that will be chosen: ")) # prompts the user to enter the number of objects that will be chosen as an integer number.
        print() # creates some line spacing.
        print("Permutating " + str(n) + " total objects with " + str(r) + " number of objects while allowing for repitition gives us " + str(permutationsWithRepetition(n, r)) + " permutations with repitition.") # tells the user how many permutations with repitition can be made with the values that they entered for n and r.
    
    elif choice1 == "y" and choice2 == "n": # the code inside the if statement will run if the value of choice1 is y and choice2 are n which means that the order matters but repitition is not allowed.
        print() # creates some line spacing.
        n = int(input("Enter the total number of objects: ")) # prompts the user to enter the total number of objects as an integer number.
        r = int(input("Enter the numbers that will be chosen: ")) # prompts the user to enter the number of objects that will be chosen as an integer number.
        print() # creates some line spacing.
        print("Permutating " + str(n) + " total objects with " + str(r) + " number of objects while not allowing for repitition gives us " + str(permutationsWithoutRepetition(n, r)) + " permutations without repitition.") # tells the user how many permutations without repitition can be made with the values that they entered for n and r.

    elif choice1 == "n" and choice2 == "y": # the code inside the if statement will run if the value of choice1 is n and choice2 are y which means that the order doesn't matter but repitition is allowed.
        print() # creates some line spacing.
        n = int(input("Enter the total number of objects: ")) # prompts the user to enter the total number of objects as an integer number.
        r = int(input("Enter the numbers that will be chosen: ")) # prompts the user to enter the number of objects that will be chosen as an integer number.
        print() # creates some line spacing.
        print("Combining " + str(n) + " total objects with " + str(r) + " number of objects while allowing for repitition gives us " + str(combinationsWithRepitition(n, r)) + " combinations with repitition.") # tells the user how many combinations with repitition can be made with the values that they entered for n and r.
    
    elif choice1 == "n" and choice2 == "n": # the code inside the if statement will run if the value of choice1 and choice2 are n which means that the order doesn't matter and repitition is not allowed.
        print() # creates some line spacing.
        n = int(input("Enter the total number of objects: ")) # prompts the user to enter the total number of objects as an integer number.
        r = int(input("Enter the numbers that will be chosen: ")) # prompts the user to enter the number of objects that will be chosen as an integer number.
        print() # creates some line spacing.
        print("Combining " + str(n) + " total objects with " + str(r) + " number of objects while not allowing for repitition gives us " + str(combinationsWithoutRepitition(n, r)) + " combinations without repitition.") # tells the user how many combinations without repitition can be made with the values that they entered for n and r.

    print() # creates some line spacing.
    choice = input("Do you want to use the program again (y/n)? ") # prompts the user to enter y or n depending on whether they want to use the program again.
    os.system('cls') # clears the screen by using the os.system() function and cls as it's argument.

    if choice == "n": # the code inside the if statement will run if the value of choice is equal to n which means the user doesn't want to use the program again.
        clearData() # calls the clearData() function.
        exit() # using the exit() function, it exits the program.