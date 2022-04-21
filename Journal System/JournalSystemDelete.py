import os # imports the os module for use in this program.
import time # imports the time module for use in this program.

# this program will contain the deleteJournals() function that will be used in the main Journal System program.

def deleteJournals(name): # this deleteJournals() function takes a variable called name as the argument which is the name of the journal entry file as a string.
                          # this function deletes the journal entry file using the argument name as the file name of the journal entry as a string.
    file = open(name, "r") # creates a variable called file and by using the open() function, it will open the file specified in name in read mode so the name of the file can be read.
    fileName = file.name # creates a variable called fileName which will have the name of the file inside file.
    file.close() # using the close() function, it closes file.
    os.remove(name) # using the rmeove() function of the os module and name as it's argument, it removes the file that was specified in name.
    print("\n" + "Journal entry: " + fileName + " deleted.\n") # tells the user that the journal entry file inside file was deleted.
    time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
    os.system('cls') # using the system() function of the os module, it clears the screen.