# Name: Rusho Binnabi
# Date: 4/10/2022
# Project: Journal System
# Code File Updated: 4/20/2022 at 10:05 PM
# Contact Information: RushoBinnabi23@yahoo.com or 518-364-7101

import os # imports the os module for use in this program.
import time # imports the time module for use in this program.
import JournalSystemDelete # imports the code file from JournalSystemDelete for use in this program.
import JournalSystemListing # imports the code file from JournalSystemListing for use in this program.
import JournalSystemWrite # imports the code file from JournalSyetmWrite for use in this program.
import JournalSystemExit # imports the code file from JournalSystemExit for use in this program.
import JournalSystemRead # imports the code file from JournalSystemRead for use in this program.

# this program acts as a journal system where it can create, read, list, and delete journal entries. It can use the functions from other files to carry out the appropriate commands when needed. 

beginTime = time.time() # creates a variable called beginTime which will have the beginning of the execution time.

userInput = input("\nJournal System\n\n1: Create Journal Entry\n2: Read Journal Entry\n3: Exit\n4: List Journal Entries and Location\n5: Remove Journal Entry\n\nEnter Choice: ") # prompts the user to enter a number which corresponds to a command and saves that number inside the userInput variable that was created.

while userInput != 3: # the code in the while loop will run as long as the user didn't enter a "3" that's stored inside userInput which means the user is done using the program.
    if userInput == "1": # if the value inside userInput is equal to 1, then the code inside the if statement will be run.
        name = input("\nEnter journal entry name: ") # prompts the user to enter a name for the journal entry file that will be created and saves that input in the name variable that was created.
        JournalSystemWrite.writeJournals(name) # calls the writeJournals() function from the JournalSystemWrite file and uses name as it's argument.
        endTime1 = time.time() # creates a variable called endTime1 which will have the end of the execution time.
        elaspedTime1 = endTime1 - beginTime # creates a variable called elaspedTime1 which will have the value of endTime1 - beginTime which is the total amount of time it took for the program to run.
        print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime1))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime1 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.

    elif userInput == "2": # or if the value inside userInput is equal to 2, then the code inside the elif statement will be run.
        name = input("\nEnter journal entry name: ") # prompts the user to enter a name for the journal entry file whose contents will be read and saves that input in the name variale that was created.
        JournalSystemRead.readJournals(name) # calls the readJournals() function from the JournalSystemRead file and uses name as it's argument.
        endTime2 = time.time() # creates a variable called endTime2 which will have the end of the execution time.
        elaspedTime2 = endTime2 - beginTime # creates a variable called elaspedTime2 which will have the value of endTime2 - beginTime which is the total amount of time it took for the program to run.
        print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime2))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime2 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.

    elif userInput == "3": # or if the value inside userInput is equal to 3, then the code inside the elif statement will be run.
        endTime3 = time.time() # creates a variable called endTime3 which will have the end of the execution time in seconds.
        elaspedTime3 = endTime3 - beginTime # creates a variable called elaspedTime3 which will have the value of endTime3 - beginTime which is the total amount of time it took for the program to run.
        print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime3))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime3 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
        JournalSystemExit.exitProgram() # calls the exitProgram() function from the JournalSystemExit file.

    elif userInput == "4": # or if the value inside userInput is equal to 4, then the code inside the elif statement will be run.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
        JournalSystemListing.listing() # calls the listing() function from the JournalSystemListing file.
        endTime4 = time.time() # creates a variable called endTime4 which will have the end of the execution time.
        elaspedTime4 = endTime4 - beginTime # creates a variable called elaspedTime4 which will have the value of endTime4 - beginTime which is the total amount of time it took for the program to run.
        print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime4))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime4 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
    
    elif userInput == "5": # or if the value inside userInput is equal to 5, then the code inside the elif statement will be run.
        name = input("\nEnter journal entry name: ") # prompts the user to enter a name for the journal entry file which will be deleted and saves that input in the name variale that was created.
        JournalSystemDelete.deleteJournals(name) # calls the deleteJournals() function from the JournalSystemDelete file and uses name as it's argument.
        endTime5 = time.time() # creates a variable called endTime5 which will have the end of the execution time.
        elaspedTime5 = endTime5 - beginTime # creates a variable called elaspedTime5 which will have the value of endTime5 - beginTime which is the total amount of time it took for the program to run.
        print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime5))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime5 as it's argument.
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
        endTime6 = time.time() # creates a variable called endTime6 which will have the end of the execution time in.
        elaspedTime6 = endTime6 - beginTime # creates a variable called elaspedTime6 which will have the value of endTime6 - beginTime which is the total amount of time it took for the program to run.
        print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime6))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime6 as it's argument.
        time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
        os.system('cls') # using the system() function of the os module, it clears the screen.
        quit()