import time # imports the time module in this program for use.
import os # imports the os module in this program for use.

# this program will contain the readJournals() function that will be used in the main Journal System program.

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