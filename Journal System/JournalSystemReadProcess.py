import os # imports the os module for use in this program.
import JournalSystemRead # imports the code file from JournalSystemRead for use in this program.
import time # imports the time module for use in this program.
import JournalSystem # imports the code file from JournalSystem for use in this program.

# this program will have the code needed to read the journal entries as a function which will be used in the main Journal System program.

def journalSystemReadProcess(): # this journalSystemReadProcess() function reads the journal entries.
    name = input("\nEnter journal entry name: ") # prompts the user to enter a name for the journal entry file whose contents will be read and saves that input in the name variale that was created.
    JournalSystemRead.readJournals(name) # calls the readJournals() function from the JournalSystemRead file and uses name as it's argument.
    endTime2 = time.time() # creates a variable called endTime2 which will have the end of the execution time.
    elaspedTime2 = endTime2 - JournalSystem.beginTime # creates a variable called elaspedTime2 which will have the value of endTime2 - beginTime from the JournalSystem file which is the total amount of time it took for the program to run.
    print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime2))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime2 as it's argument.
    time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
    os.system('cls') # using the system() function of the os module, it clears the screen.
