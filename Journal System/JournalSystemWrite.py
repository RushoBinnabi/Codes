import os # imports the os module for use in this program.
import time # imports the time module for use in this program.

# this program will contain the writeJournals() function that will be used in the main Journal System program.

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