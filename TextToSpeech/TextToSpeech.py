# Name: Rusho Binnabi
# Date: 5/10/2024
# Project: Text to Speech
# Contact Information: RushoBinnabi123@yahoo.com

# this text to speech program turns the text entered using either the keyboard or from a text file into speech.

from gtts import gTTS
import sys

# this state variable will be used to switch between the different states for the functionality for the program.
state = 0

# this text() function takes input from the keyboard and turns it into speech.
# @param input this input is the text being entered from the keyboard.
# @param name the name of the output file 
def text(input, name):
    data = input
    textToSpeech = gTTS(text=data, lang='en', slow=False)
    textToSpeech.save(name)
    print("Phrase saved!")

def file(input, name):
    try:
        with open (input, "r") as file:
            data = file.readlines()
        fileText = ""
        fileText = fileText.join(data)
        textToSpeech = gTTS(text=fileText, lang='en', slow=False)
        textToSpeech.save(name)
        print("File Saved!")
    except:
        print("Error. Please enter a filename.")

while state == 0:
    userInput = input("Would you like to use the text-to-speech with a file or keyboard (f/k) (press n to exit)?: ")
    if userInput == "f":
        state = 1
    elif userInput == "k":
        state = 2
    elif userInput == "n":
        print("Goodbye!")
        sys.exit()
    if state == 1:
        fileName = str(input("Enter the filename to save the phrase to: "))
        fileName = fileName + ".mp3"
        phrase = str(input("Enter the filename to read from: "))
        phrase = phrase + ".mp3"
        file(phrase, fileName)
        repeat = input("Would you like to use the program again (y/n)?: ")
        if repeat == "y":
            state = 0
        elif repeat == "n":
            print("Goodbye!")
            sys.exit()
    elif state == 2:
        fileName = str(input("Enter the filename to save the phrase to: "))
        fileName = fileName + ".mp3"
        phrase = str(input("Enter the phrase: "))
        text(phrase, fileName)
        repeat = str(input("Would you like to use the program again (y/n)?: "))
        if repeat == "y":
            state = 0
        elif repeat == "n":
            print("Goodbye!")
            sys.exit()