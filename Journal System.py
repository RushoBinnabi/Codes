# Name: Rusho Binnabi
# Date: 4/10/2022
# Project: Journal System
# Code File Updated: 4/16/2022 at 10:31 PM
# Contact Information: RushoBinnabi23@yahoo.com or 518-364-7101

import sys # imports the sys module for use in this program.
import os # imports the os module for use in this program.
import glob # import the glob module for use in this program.
import time # imports the time module for use in this program.

# this program acts as a journal system where it can create, read, list, and delete journal entries. 

beginTime = time.time() # creates a variable called beginTime which will have the beginning of the execution time in seconds.

def writeJournals(name): # this writeJournals() function takes a variable  called name as the argument which is the name of the journal entry files as a string.
                         # this function creates and writes new journal entries using the argument name as the file name of the journal entry as a string.
    characters = 35 # creates a variable called characters which is initialized to 35 and will be used as the number of characters that each line of the journal entry files will consist of after splitting.
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
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
    except FileNotFoundError: # the code inside the except statement will run if the file that was specified in name doesn't exist.
        print("\nError. That journal entry doesn't exist.") # tells the user that the journal entry doesn't exist.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.

def readJournals(name): # this readJournals() function takes a variable called name as the argument which is the name of the journal entry file as a string.
                        # this function reads the contents of the journal entries using the argument name as the file name of the journal entry as a string.
    try: # the try block will try to run the code.
        file = open(name, "r") # creates a variable called file and by using the open() function, it will open the file specified in name in read mode so the contents of the file can be read.
        journalData = file.read() # creates a variable called journalData which will read the contents of file using the read() function.
        fileName = file.name # creates a variable called fileName which will have the name of the file inside file.
        file.close() # using the close() function, it closes file.
        print("\n" + "Journal entry: " + fileName + " contents: \n\n" + journalData) # prints the name of the file inside file and the data inside journalData.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
    except FileNotFoundError: # the code inside the except statement will run if the file that was specified in name doesn't exist.
        print("\nError. That journal entry doesn't exist.") # tells the user that the journal entry doesn't exist.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.

def exitProgram(): # this exitProgram() function exits the program.
    sys.exit(0) # using the exit() function from the sys module and the integer value of 0 which means the program stopped succesfully.

def listing(): # this listing() function lists the number of journal entry files and where the journal system program are saved.
    cwd = os.path.dirname(os.path.realpath(__file__)) # creates a variable called cwd which gets the full path of the current working directory and saves that path inside cwd as a string.
    print("\nThe Journal System is saved here: \n\n" + cwd + "\n") # tells the user where the journal system program is saved at.
    print("\nSaved Journal Entries:\n") # tells the user how many number of journal entries are saved.
    for file in glob.glob("*.txt"): # creates a for loop for every file that ends with the .txt extension using the glob() function from the glob module.
        print(file) # prints the name of the current file.
    time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
    os.system('cls') # using the system() function of the os module, it clears the screen.
    
def deleteJournals(name): # this deleteJournals() function takes a variable called name as the argument which is the name of the journal entry file as a string.
                          # this function deletes the journal entry file using the argument name as the file name of the journal entry as a string.
    file = open(name, "r") # creates a variable called file and by using the open() function, it will open the file specified in name in read mode so the name of the file can be read.
    fileName = file.name # creates a variable called fileName which will have the name of the file inside file.
    file.close() # using the close() function, it closes file.
    os.remove(name) # using the rmeove() function of the os module and name as it's argument, it removes the file that was specified in name.
    print("\n" + "Journal entry: " + fileName + " deleted.\n") # tells the user that the journal entry file inside file was deleted.
    time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
    os.system('cls') # using the system() function of the os module, it clears the screen.

userInput = input("\nJournal System\n\n1: Create Journal Entry\n2: Read Journal Entry\n3: Exit\n4: List Journal Entries and Location\n5: Remove Journal Entry\n\nEnter Choice: ") # prompts the user to enter a number which corresponds to a command and saves that number inside the userInput variable that was created.

while userInput != 3: # the code in the while loop will run as long as the user didn't enter a "3" that's stored inside userInput which means the user is done using the program.
    if userInput == "1": # if the value inside userInput is equal to 1, then the code inside the if statement will be run.
        name = input("\nEnter journal entry name: ") # prompts the user to enter a name for the journal entry file that will be created and saves that input in the name variable that was created.
        writeJournals(name) # calls the writeJournals() function and uses name as it's argument.
        endTime1 = time.time() # creates a variable called endTime1 which will have the end of the execution time in seconds.
        elaspedTime1 = endTime1 - beginTime # creates a variable called elaspedTime1 which will have the value of endTime1 - beginTime which is the total amount of time it took for the program to run in seconds.
        print("\nExecution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime1))) # shows how many seconds it took for the program to run using the gmtime() function of the time module and elaspedTime1 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.

    elif userInput == "2": # or if the value inside userInput is equal to 2, then the code inside the elif statement will be run.
        name = input("\nEnter journal entry name: ") # prompts the user to enter a name for the journal entry file whose contents will be read and saves that input in the name variale that was created.
        readJournals(name) # calls the readJournals() function and uses name as it's argument.
        endTime2 = time.time() # creates a variable called endTime2 which will have the end of the execution time in seconds.
        elaspedTime2 = endTime2 - beginTime # creates a variable called elaspedTime2 which will have the value of endTime2 - beginTime which is the total amount of time it took for the program to run in seconds.
        print("\nExecution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime2))) # shows how many seconds it took for the program to run using the gmtime() function of the time module and elaspedTime2 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.

    elif userInput == "3": # or if the value inside userInput is equal to 3, then the code inside the elif statement will be run.
        endTime3 = time.time() # creates a variable called endTime3 which will have the end of the execution time in seconds.
        elaspedTime3 = endTime3 - beginTime # creates a variable called elaspedTime3 which will have the value of endTime3 - beginTime which is the total amount of time it took for the program to run in seconds.
        print("\nExecution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime3))) # shows how many seconds it took for the program to run using the gmtime() function of the time module and elaspedTime3 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
        exitProgram() # calls the exitProgram() function.

    elif userInput == "4": # or if the value inside userInput is equal to 4, then the code inside the elif statement will be run.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
        listing() # calls the listing() function.
        endTime4 = time.time() # creates a variable called endTime4 which will have the end of the execution time in seconds.
        elaspedTime4 = endTime4 - beginTime # creates a variable called elaspedTime4 which will have the value of endTime4 - beginTime which is the total amount of time it took for the program to run in seconds.
        print("\nExecution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime4))) # shows how many seconds it took for the program to run using the gmtime() function of the time module and elaspedTime4 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
    
    elif userInput == "5": # or if the value inside userInput is equal to 5, then the code inside the elif statement will be run.
        name = input("\nEnter journal entry name: ") # prompts the user to enter a name for the journal entry file which will be deleted and saves that input in the name variale that was created.
        deleteJournals(name) # calls the deleteJournals() function and uses name as it's argument.
        endTime5 = time.time() # creates a variable called endTime5 which will have the end of the execution time in seconds.
        elaspedTime5 = endTime5 - beginTime # creates a variable called elaspedTime5 which will have the value of endTime5 - beginTime which is the total amount of time it took for the program to run in seconds.
        print("\nExecution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime5))) # shows how many seconds it took for the program to run using the gmtime() function of the time module and elaspedTime5 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
    
    time.sleep(2) # slows down the execution speed of the program by 2 seconds using the sleep() function of the time module and the integer value of 2 as it's argument.

    choice = input("Do you want to use the Journal System again (y/n)? ") # prompts the user to see if they want to use the journal system program again, and saves that input in the choice variable that was created.
    time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
    os.system('cls') # using the system() function of the os module, it clears the screen.
    choice = choice.lower() # the values inside choice will be in lowercase.

    if choice == "y": # if the value inside choice was a "y" which means the user wants to use the program again, then the code inside the if statement will be run.
        userInput = input("\nJournal System\n\n1: Create Journal Entry\n2: Read Journal Entry\n3: Exit\n4: List Journal Entries and Location\n5: Remove Journal Entry\n\nEnter Choice: ") # prompts the user to enter a number again which corresponds to a command and saves that number inside the userInput variable that was created.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen. 
    elif choice == "n": # or if the value inside choice was a "n" which means the user doesn't want to use the program again, then the code inside the elif statement will be run.
        endTime6 = time.time() # creates a variable called endTime6 which will have the end of the execution time in seconds.
        elaspedTime6 = endTime6 - beginTime # creates a variable called elaspedTime6 which will have the value of endTime6 - beginTime which is the total amount of time it took for the program to run in seconds.
        print("\nExecution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime6))) # shows how many seconds it took for the program to run using the gmtime() function of the time module and elaspedTime6 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
        quit()