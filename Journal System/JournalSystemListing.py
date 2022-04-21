import os # imports the os module for use in this program.
import time # imports the time module for use in this program.
import glob # imports the glob module for use in this program.

# this program will contain the listing() function that will be used in the main Journal System program.

def listing(): # this listing() function lists the number of journal entry files and where the journal system program are saved.
    cwd = os.path.dirname(os.path.realpath(__file__)) # creates a variable called cwd which gets the full path of the current working directory and saves that path inside cwd as a string.
    print("\nThe Journal System is saved here: \n\n" + cwd + "\n") # tells the user where the journal system program is saved at.
    print("\nSaved Journal Entries:\n") # tells the user how many number of journal entries are saved.
    for file in glob.glob("*.txt"): # creates a for loop for every file that ends with the .txt extension using the glob() function from the glob module.
        print(file) # prints the name of the current file.
    time.sleep(2) # slows down the execution speed of the program by 1 second using the sleep() function of the time module and the integer value of 1 as it's argument.
    os.system('cls') # using the system() function of the os module, it clears the screen.