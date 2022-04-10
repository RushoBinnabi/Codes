# Name: Rusho Binnabi
# Date: 4/10/2022
# Project: Journal System
# Code File Updated: 4/10/2022 at 1:35 PM
# Contact Information: RushoBinnabi23@yahoo.com or 518-364-7101

import sys # imports the sys module for use in this program.
import os # imports the os module for use in this program.
import glob # import the glob module for use in this program.
import time # imports the time module for use in this program.

# this program acts as a journal system where it can create, read, and list journal entries. 

def writeJournals(name): # this writeJournals() function takes a variable  called name as the argument which is the name of the journal entry files as a string.
                         # this function creates and writes new journal entries using the argument name as the file name of the journal entry as a string.
    characters = 40 # creates a variable called characters which is initialized to 40 and will be used as the number of characters that each line of the journal entry files will consist of after splitting.
    try: # the try block will try to run the code.
        file = open(name, "a") # creates a variable called file and by using the open() function, it will open the file specified in name in appending mode so the contents of the file can also be edited and the file can be created if it doesn't exist.
        journalData = input("\nEnter text: ") # prompts the user for text which will be entered into the journal entry file that was created using file and saves that prompt in the journalData variable that was created.
        while True: # the code in the while loop will run as long as the current string value isn't equal to "done" which means the user is done entering text into the file.
            journalData = [(journalData[i:i+characters]) for i in range(0, len(journalData), characters)] # the string values inside journalData will be split into the number of characters specified inside characters.
            file.writelines(journalData) # using the writelines() function, it writes the data inside journalData using file and journalData as the argument for the writelines() function.
            journalData = input() # journalData reads in the next input value.
            if journalData == "done": # if the current input value in journalData is equal to "done", then the code inside the if statement will be run.
                break # breaks out of the while loop.
        file.close() # using the close() function, it closes file.
        print("\nJournal entry created.") # tells the user that the journal entry was created.
    except FileNotFoundError: # the code inside the except statement will run if the file that was specified in name doesn't exist.
        print("\nError. That journal entry doesn't exist.") # tells the user that the journal entry doesn't exist.

def readJournals(name): # this readJournals() function takes a variable called name as the argument which is  the name of the journal entry files as a string.
                        # this function reads the contents of the journal entries using the argument name as the file name of the journal entry as a string.
    try: # the try block will try to run the code.
        file = open(name, "r") # creates a variable called file and by using the open() function, it will open the file specified in name in read mode so the contents of the file can be read.
        journalData = file.read() # creates a variable called journalData which will read the contents of file using the read() function.
        fileName = file.name # creates a variable called fileName which will have the name of the file inside file.
        file.close() # using the close() function, it closes file.
        print("\n" + "Journal entry: " + fileName + " contents: \n\n" + journalData) # prints the name of the file inside file and the data inside journalData.
    except FileNotFoundError: # the code inside the except statement will run if the file that was specified in name doesn't exist.
        print("\nError. That journal entry doesn't exist.") # tells the user that the journal entry doesn't exist.

def exitProgram(): # this exitProgram() function exits the program.
    sys.exit(0) # using the exit() function from the sys module and the integer value of 0 which means the program stopped succesfully.

def listing(): # this listing() function lists the number of journal entry files and where the journal system program are saved.
    cwd = os.path.dirname(os.path.realpath(__file__)) # creates a variable called cwd which gets the full path of the current working directory and saves that path inside cwd as a string.
    print("\nThe Journal System is saved here: \n\n" + cwd + "\n") # tells the user where the journal system program is saved at.
    print("\nSaved Journal Entries:\n") # tells the user how many number of journal entries are saved.
    for file in glob.glob("*.txt"): # creates a for loop for every file that ends with the .txt extension using the glob() function from the glob module.
        print(file) # prints the name of the current file.

userInput = input("\nJournal System\n\n1: Create Journal Entry\n2: Read Journal Entry\n3: Exit\n4: List Journal Entries and Location\n\nEnter Choice: ") # prompts the user to enter a number which corresponds to a command and saves that number inside the userInput variable that was created.

while userInput != 3: # the code in the while loop will run as long as the user didn't enter a "3" that's stored inside userInput which means the user is done using the program.
    if userInput == "1": # if the value inside userInput is equal to 1, then the code inside the if statement will be run.
        name = input("\nEnter journal entry name: ") # prompts the user to enter a name for the journal entry file that will be created and saves that input in the name variable that was created.
        writeJournals(name) # calls the writeJournals() function and uses name as it's argument.

    elif userInput == "2": # or if the value inside userInput is equal to 2, then the code inside the elif statement will be run.
        name = input("\nEnter journal entry name: ") # prompts the user to enter a name for the journal entry file whose contents will be read and saves that input in the name variale that was created.
        readJournals(name) # calls the readJournals() function and uses name as it's argument.

    elif userInput == "3": # or if the value inside userInput is equal to 3, then the code inside the elif statement will be run.
        exitProgram() # calls the exitProgram() function.

    elif userInput == "4": # or if the value inside userInput is equal to 4, then the code inside the elif statement will be run.
        listing() # calls the listing() function.

    time.sleep(2) # slows down the execution speed of the program by 2 seconds using the sleep() function of the time module using the integer value of 2 as it's argument.

    choice = input("\nDo you want to use the Journal System again (y/n)? ") # prompts the user to see if they want to use the journal system program again, and saves that input in the choice variable that was created.
    choice = choice.lower() # the values inside choice will in lowercase.

    if choice == "y": # if the value inside choice was a "y" which means the user wants to use the program again, then the code inside the if statement will be run.
        userInput = input("\nJournal System\n\n1: Create Journal Entry\n2: Read Journal Entry\n3: Exit\n4: List Journal Entries and Location\n\nEnter Choice: ") # prompts the user to enter a number again which corresponds to a command and saves that number inside the userInput variable that was created. 
    elif choice == "n": # or if the value inside choice was a "n" which means the user doesn't want to use the program again, then the code inside the elif statement will be run.
        sys.exit(0) # using the exit() function from the sys module and the integer value of 0 which means the program stopped succesfully.