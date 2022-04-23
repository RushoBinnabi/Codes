import os # imports the os module for use in this program.
import JournalSystemListing # imports the code file from JournalSystemListing for use in this program.
import time # imports the time module for use in this program.
import JournalSystem # imports the code file from JournalSystem for use in this program.

# this program will have the code needed to list where the Journal System program is saved at and to list the journal entries as a function that will be used in the main Journal System program.

def journalSystemListingProcess(): # this journalSystemListingProcess() function lists all the journal entries.
    time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
    os.system('cls') # using the system() function of the os module, it clears the screen.
    JournalSystemListing.listing() # calls the listing() function from the JournalSystemListing file.
    endTime4 = time.time() # creates a variable called endTime4 which will have the end of the execution time.
    elaspedTime4 = endTime4 - JournalSystem.beginTime # creates a variable called elaspedTime4 which will have the value of endTime4 - beginTime from the JournalSystem file which is the total amount of time it took for the program to run.
    print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime4))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime4 as it's argument.
    time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
    os.system('cls') # using the system() function of the os module, it clears the screen.
