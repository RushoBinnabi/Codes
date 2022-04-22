import os
import time
import JournalSystem
import JournalSystemExit

def journalSystemExitProcess(): # this journalSystemExitProcess() function exits the program.
    endTime3 = time.time() # creates a variable called endTime3 which will have the end of the execution time in seconds.
    elaspedTime3 = endTime3 - JournalSystem.beginTime # creates a variable called elaspedTime3 which will have the value of endTime3 - beginTime from the JournalSystem file which is the total amount of time it took for the program to run.
    print("\nTotal Execution Time: ", time.strftime("%H:%M:%S", time.gmtime(elaspedTime3))) # shows how long it took for the program to run using the gmtime() function of the time module and elaspedTime3 as it's argument.
    time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
    os.system('cls') # using the system() function of the os module, it clears the screen.
    JournalSystemExit.exitProgram() # calls the exitProgram() function from the JournalSystemExit file.