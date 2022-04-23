import os # imports the os module for use in this program.
import time # imports the time module for use in this program.
import JournalSystemWrite # imports the code file from JournalSystemWrite for use in this program.
import JournalSystem # imports the code file from JournalSystem for use in this program.

# this program will have the code needed to write journal entries as a function that will be used in the main Journal System prorgam.

def journalSystemWriteProcess(): # this journalSystemWriteProcess() function creates and writes journal entries.
    name = input("\nEnter journal entry name: ") # prompts the user to enter a name for the journal entry file that will be created and saves that input in the name variable that was created.
    JournalSystemWrite.writeJournals(name) # calls the writeJournals() function from the JournalSystemWrite file and uses name as it's argument.
    endTime1 = time.time() # creates a variable called endTime1 which will have the end of the execution time.
    elaspedTime1 = endTime1 - JournalSystem.beginTime # creates a variable called elaspedTime1 which will have the value of endTime1 - beginTime from the JournalSystem file which is the total amount of time it took for the program to run.
    print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime1))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime1 as it's argument.
    time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
    os.system('cls') # using the system() function of the os module, it clears the screen.
