# Name of Owner: Rusho Binnabi
# Project Name: Password Generator
# Code File Updated: January 13th, 2021 at 3:02pm
# Contact Information: RushoBinnabi123@yahoo.com

import random
# import sys
import time

capital_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"  # a variable called capital_letters that is holding a string of capital letters is created.
lowercase_letters = "abcdefghijklmnopqrstuvwxyz"  # a variable called lowercase_letters that is holding a string of lowercase letters is created.
numbers = "0123456789"  # a variable called numbers that is holding a string of numbers is created.
symbols = "!@#$%^&*()_-+=?/>.<,':;{[}]"  # a variable called symbols that is holding a string of symbols is created.

upper, lower, nums, syms = False, False, False, False  # 4 boolean variables called upper, lower, nums, and syms are created and are all set to false to begin with because they will be set to true according to how the user wants their password to be generated.

everything = ""  # a variable called everything is created and will have either the values of capital_letters, lowercase_letters, numbers, symbols based on if either the boolean value of upper, lower, nums, or syms is true or false.

length = int(input("How long do you want the generated password to be? "))  # a variable called length will have the length of the password that the user wants to generate as an integer.
print()  # creates some line spacing.
time.sleep(.6)  # pauses the program for .6 seconds so it won't be really fast.
print("Choose from the following:")  # asks the user to choose from the following.
print()  # creates some line spacing.
time.sleep(.6)  # pauses the program for .6 seconds so it won't be really fast.
print("1: Capital Letters")  # if the user only wants capital letters in the password.
time.sleep(.6)  # pauses the program for .6 seconds so it won't be really fast.
print("2: Lowercase Letters")  # if the user only wants lowercase letters in the password.
time.sleep(.6)  # pauses the program for .6 seconds so it won't be really fast.
print("3: Numbers")  # if the user only wants numbers in the password.
time.sleep(.6)  # pauses the program for .6 seconds so it won't be really fast.
print("4: Symbols")  # if the user only wants symbols in the password.
time.sleep(.6)  # pauses the program for .6 seconds so it won't be really fast.
print("5: A Combination of Everything")  # if the user wants a bit of everything in the password.
print()  # creates some line spacing.
time.sleep(.6)  # pauses the program for .6 seconds so it won't be really fast.
condition = input("What kind of password do you want to generate: ")  # asks the user of what kind of password that they want to have generated.
print()  # creates some line spacing.
time.sleep(.6)  # pauses the program for .6 seconds so it won't be really fast.
if "1" in condition:  # if the user only wanted capital letters in the generated password.
    upper = True  # upper becomes true.
    if upper:  # if the value of upper is true, which means the user wants capital letters in their password.
        everything += capital_letters  # everything will have the values of capital_letters.
elif "2" in condition:  # if the user only wanted lowercase letters in the generated password.
    lower = True  # lower becomes true.
    if lower:  # if the value of upper is true, which means the user wants lowercase letters in their password.
        everything += lowercase_letters  # everything will have the values of lowercase_letters.
elif "3" in condition:  # if the user only wanted numbers letters in the generated password.
    nums = True  # nums becomes true.
    if nums:  # if the value of upper is true, which means the user wants numbers in their password.
        everything += numbers  # everything will have the values of numbers.
elif "4" in condition:  # if the user only wanted symbols letters in the generated password.
    syms = True  # syms becomes true.
    if syms:  # if the value of upper is true, which means the user wants symbols in their password.
        everything += symbols  # everything will have the values of symbols.
elif "5" in condition:  # if the user only wanted a bit of everything in the generated password.
    upper = True  # upper becomes true.
    lower = True  # lower becomes true.
    nums = True  # nums becomes true.
    syms = True  # syms becomes true.
    if upper:  # if the value of upper is true, which means the user wants capital letters in their password.
        everything += capital_letters  # everything will have the values of capital_letters.
    if lower:  # if the value of upper is true, which means the user wants lowercase letters in their password.
        everything += lowercase_letters  # everything will have the values of lowercase_letters.
    if nums:  # if the value of upper is true, which means the user wants numbers in their password.
        everything += numbers  # everything will have the values of numbers.
    if syms:  # if the value of upper is true, which means the user wants symbols in their password.
        everything += symbols  # everything will have the values of symbols.

# sys.stdin.write("Generating Your Password")
# time.sleep(.8)
# sys.stdin.write(".")
# time.sleep(.8)
# sys.stdin.write(".")
# time.sleep(.8)
# sys.stdin.write(".")
# time.sleep(.8)

for x in range(1):  # this for loop will generate 1 random password.
    password = "".join(random.sample(everything, length))  # a variable called password gets created and will have the generated password using everything and length.
    print("Your Generated Password Is: " + password)  # shows the generated password.

print()  # creates some line spacing.
input("")  # the input keyword makes sure the program doesn't just stop after it generates the random password.
