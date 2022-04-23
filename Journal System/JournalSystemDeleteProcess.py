import os # imports the os module for use in this program.
import JournalSystem # imports the code file from JournalSystem for use in this program.
import time # imports the time module for use in this program.
import JournalSystemDelete # imports the code file from JournalSystemDelete for use in this program.

# this program will have the code that creates a journal entry which will be used as a function in the main Journal System program.

def journalSystemDeleteProcess(): # this journalSystemDeleteProcess() function deletes journal entries.
    name = input("\nEnter journal entry name: ") # prompts the user to enter a name for the journal entry file which will be deleted and saves that input in the name variale that was created.
    JournalSystemDelete.deleteJournals(name) # calls the deleteJournals() function from the JournalSystemDelete file and uses name as it's argument.
    endTime5 = time.time() # creates a variable called endTime5 which will have the end of the execution time.
    elaspedTime5 = endTime5 - JournalSystem.beginTime # creates a variable called elaspedTime5 which will have the value of endTime5 - beginTime from the JournalSystem file which is the total amount of time it took for the program to run.
    print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime5))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime5 as it's argument.
    time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
    os.system('cls') # using the system() function of the os module, it clears the screen.
