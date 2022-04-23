# Name: Rusho Binnabi
# Date: 4/10/2022
# Project: Journal System
# Code File Updated: 4/22/2022 at 7:10 PM
# Contact Information: RushoBinnabi23@yahoo.com or 518-364-7101

import os # imports the os module for use in this program.
import time # imports the time module for use in this program.
import JournalSystemDeleteProcess # imports the code file from JournalSystemDeleteProcess for use in this program.
import JournalSystemListingProcess # imports the code file from JournalSystemListingProcess for use in this program.
import JournalSystemWriteProcess # imports the code file from JournalSystemWriteProcess for use in this program.
import JournalSystemExitProcess # imports the code file from JournalSystemExitProcess for use in this program.
import JournalSystemReadProcess # imports the code file from JournalSystemReadProcess for use in this program.

# this program acts as a journal system where it can create, read, list, and delete journal entries. It can use the functions from other files to carry out the appropriate commands when needed. 

beginTime = time.time() # creates a variable called beginTime which will have the beginning of the execution time.

userInput = input("\nJournal System\n\n1: Create Journal Entry\n2: Read Journal Entry\n3: Exit\n4: List Journal Entries and Location\n5: Remove Journal Entry\n\nEnter Choice: ") # prompts the user to enter a number which corresponds to a command and saves that number inside the userInput variable that was created.

while userInput != 3: # the code in the while loop will run as long as the user didn't enter a "3" that's stored inside userInput which means the user is done using the program.
    
    if userInput == "1": # if the value inside userInput is equal to 1, then the code inside the if statement will be run.
        JournalSystemWriteProcess.journalSystemWriteProcess() # calls the journalSystemWriteProcess() function from the JournalSystemWriteProcess file.
    elif userInput == "2": # or if the value inside userInput is equal to 2, then the code inside the elif statement will be run.
        JournalSystemReadProcess.journalSystemReadProcess() # calls the journalSystemReadProcess() function from the JournalSystemReadProcess file.
    elif userInput == "3": # or if the value inside userInput is equal to 3, then the code inside the elif statement will be run.
        JournalSystemExitProcess.journalSystemExitProcess() # calls the journalSystemExitProcess() function from the JournalSystemExitProcess file.
    elif userInput == "4": # or if the value inside userInput is equal to 4, then the code inside the elif statement will be run.
        JournalSystemListingProcess.journalSystemListingProcess() # calls the journalSystemListingProcess() function from the JournalSystemListing file.
    elif userInput == "5": # or if the value inside userInput is equal to 5, then the code inside the elif statement will be run.
        JournalSystemDeleteProcess.journalSystemDeleteProcess() # calls the journalSystemDeleteProcess() function from the journalSystemDeleteProcess file.

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
        endTime6 = time.time() # creates a variable called endTime6 which will have the end of the execution time in.
        elaspedTime6 = endTime6 - beginTime # creates a variable called elaspedTime6 which will have the value of endTime6 - beginTime which is the total amount of time it took for the program to run.
        print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime6))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime6 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
        quit()
