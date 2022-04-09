# Name: Rusho Binnabi
# Date: 4/8/2022
# Project: White Space Characters and String Files
# Code File Updated: 4/8/2022 at 7:55 PM
# Contact Information: RushoBinnabi123@yahoo.com or 518-364-7101

# this program will calculate the number of white space characters and actual characters in either some string text or a file depending on what the user wants.

def WhiteSpaceString(string): # this WhiteSpaceString() function takes in a string argument called string which is the string text from the user.
                              # this WhiteSpaceString() function will calculate the number of white space characters in a text string.
    counter = 0 # creates an integer variable called counter and initializes it to 0 and it will be used as the counter for the number of white space characters from string.
    for word in string: # creates a for loop that uses each word called word from string.
        if word == " ": # if the current word in word has a white space character, then the code inside the if statement will run.
            counter += 1 # the value of counter gets increased by 1.
    return counter # counter gets returned.

def CharacterString(string): # this CharacterString() function takes in a string argument called string which is the string text from the user.
                             # this CharacterString() function will calculate the number of characters in a text string.
    counter = 0 # creates an integer variable called counter and initializes it to 0 and it will be used as the counter for the number of characters from string.
    for word in string: # creates a for loop that uses each word called word from string.
        if word != " ": # if the current word in word has a character, then the code inside the if statement will run.
            counter += 1 # the value of counter gets increased by 1.
    return counter # counter gets returned.

def WhiteSpaceFile(fileName): # this WhiteSpaceFile() function takes in a string argument called fileName which is the name of the file from the user.
                              # this WhiteSpaceFile() function will calculate the number of white space characters in a file.
    counter = 0 # creates an integer variable called counter and initializes it to 0 and it will be used as the counter for the number of white space characters from fileName.
    try: # the try block will try to run the code.
        file = open(fileName, "r") # creates a variable called file and it will be used to open fileName in read mode.
        fileData = file.read() # creates a variable called fileData and it will be used to read all the lines from fileName using file.
        file.close() # using the close() method, it closes file.
        for word in fileData: # creates a for loop that uses each word called word from fileData.
            if word == " ": # if the current word in word has a white space character, then the code inside the if statement will run.
                counter += 1 # the value of counter gets increased by 1.
        return counter # counter gets returned.
    except FileNotFoundError: # the code inside the catch block will run if the code runs into a FileNotFoundException which means that the file probably doesn't exist.
        print("\nError. The file does not exist. Try again.") # tells the user to try again because the file doesn't exist.
        input("\nPress Enter to exit.") # tells the user to press enter to exit the program.
        quit() # using the quit() function, it quits the program.

def CharacterFile(fileName): # this CharacterFile() function takes in a string argument called fileName which is the name of the file from the user.
    counter = 0 # creates an integer variable called counter and initializes it to 0 and it will be used as the counter for the number of characters from fileName.
    try: # the try block will try to run the code.
        file = open(fileName, "r") # creates a variable called file and it will be used to open fileName in read mode.
        fileData = file.read() # creates a variable called fileData and it will be used to read all the lines from fileName using file.
        file.close() # using the close() method, it closes file.
        for word in fileData: # creates a for loop that uses each word called word from fileData.
            if word != " ": # if the current word in word has a character, then the code inside the if statement will run.
                counter += 1 # the value of counter gets increased by 1.
        return counter # counter gets returned.
    except FileNotFoundError: # the code inside the catch block will run if the code runs into a FileNotFoundException which means that the file probably doesn't exist.
        print("\nError. The file does not exist. Try again.") # tells the user to try again because the file doesn't exist.
        input("\nPress Enter to exit.") # tells the user to press enter to exit the program.
        quit() # using the quit() function, it quits the program.


choice = input("Do you want to check the characters and white space characters of a file or some text (f/t): ") # creates a variable called choice which prompts the user to 
                                                                                                                # enter f or t depending on whether they want to check the characters 
                                                                                                                # and white space characters of a file or some text and saves that string inside choice.
choice = choice.lower() # choice will have the string inside itself as a lowercase string.

if choice == "f": # if the string text inside choice was a f, then the code inside the if statement gets run.
    fileName = input("\nEnter the name of the file: ") # creates a variable called fileName and prompts the user for a file name and saves that string text inside fileName.
    print("\nThere are " + str(WhiteSpaceFile(fileName)) + " white space characters in the file.") # shows the number of white space characters, as a text string using the str() function, in the file using the WhiteSpaceCharacters() function and fileName as it's argument.
    print("\nThere are " + str(CharacterFile(fileName)) + " characters in the file.") # shows the number of characters, as a text string using the str() function, in the file using the CharacterFile() function and fileName as it's argument.
    input("\nPress Enter to exit.") # tells the user to press enter to exit the program.

elif choice == "t": # or if the string text inside choice was a t, then the code inside the elif statement gets run.
    text = input("\nEnter text: ") # creates a variable called text and prompts the user to enter some text and saves that string text inside text.
    print("\nThere are " + str(WhiteSpaceString(text)) + " white space characters in the text.") # shows the number of white space characters, as a text string using the str() function, in the text using the WhiteSpaceCharacters() function and text as it's argument. 
    print("\nThere are " + str(CharacterString(text)) + " characters in the text.") # shows the number of characters, as a text string using the str() function, in the text using the CharacterString() function and text as it's argument.
    input("\nPress Enter to exit.") # tells the user to press enter to exit the program.