# this code script file will get all the WiFi names and their passwords as profiles that this computer has connected to in the past and is connected to at the moment and puts that data into a text file or prints it out to the console depending on what the user wants.

import subprocess


def outputDatatoFile(): # this outputDatatoFile() function gets called if the user wants to have the wifi usernames and passwords put into a file.

    data = subprocess.check_output(['netsh', 'wlan', 'show', 'profiles']).decode('utf-8', errors="backslashreplace").split('\n') # this gets the output for the command "netsh wlan show profiles" using the method from the subprocess module called check_output().
                                                                                                                             # then it decodes the output with a universal text format 8 format and splits the text that gets generated and then decoded with a new line character to get each of the lines of text on their own seperate line.
    profiles = [i.split(":")[1][1:-1] for i in data if "All User Profile" in i] # this gets the lines of text from the list that only have "All User Profile".

    file = open("WiFi Usernames and Passwords.txt", "a") # creates a text file called WiFi Usernames and Passwords so it can write the WiFi usernames and passwords to the file.
                                                                            # with those lines of text, it splits those lines with a colon to get the right hand side of the text and it removes the first and last characters of the text.
    for i in profiles: # this for loop gets the output for the command "netsh wlan show profile {Profile Name} key=clear" using the check_output() method from the subprocess module which checks the profile again while it loops through the code for all the profiles.
        try: # the try block will try to run the code.
            results = subprocess.check_output(['netsh', 'wlan', 'show', 'profile', i, 'key=clear']).decode('utf-8', errors="backslashreplace").split('\n') # while it is looping through the code, the program looks for a specific profile while it's looping through all of the other profiles.
            results = [b.split(":")[1][1:-1] for b in results if "Key Content" in b] # while it is looping through the code, the program looks for the lines of text that have "Key Content" in them which is then splits the text with a colon and it removes the first and last characters from above.
            try: # the try block will try to run the code.
                file.writelines("{:<30}| {:<}".format(i, results[0] + "\n\n")) # writes the list of profiles to the file that has one string which is that profile's key.
            except IndexError: # the code in the except block will run if the program catches an IndexError exception.
                file.writelines("{:<30}|  {:<}".format(i, "\n\n")) # writes the list of profiles to the file that has one string which is that profile's key with some formatting.
        except subprocess.CalledProcessError: # the code in the except block will run if the program, while it's using the subprocess module, catches an CalledProcessError exception.
            file.writelines("") # creates some line spacing in the file.
            file.writelines("{:<30}|  {:<}".format(i, "ENCODING ERROR" + "\n\n")) # formats the text in the file before providing it as output and this text means that the profiles weren't encoded correctly and something went wrong.
    file.close() # closes the file.

    print() # creates some line spacing.
    print("The data has been written to the file. Please check the file.") # tells the user that the data has been written to the file and to check the file.
    print() # creates some line spacing.
    input("") # this input function makes it so the program doesn't immediately stop running after being started.


def outputDatatoConsole(): # this outputDatatoConsole() function gets called if the user wants to have the wifi usernames and passwords printed out onto the console.

    data = subprocess.check_output(['netsh', 'wlan', 'show', 'profiles']).decode('utf-8', errors="backslashreplace").split('\n') # this gets the output for the command "netsh wlan show profiles" using the method from the subprocess module called check_output().
                                                                                                                                 # then it decodes the output with a universal text format 8 format and splits the text that gets generated and then decoded with a new line character to get each of the lines of text on their own seperate line.              
    profiles = [i.split(":")[1][1:-1] for i in data if "All User Profile" in i] # this gets the lines of text from the list that only have "All User Profile".

    for i in profiles:  # this for loop gets the output for the command "netsh wlan show profile {Profile Name} key=clear" using the check_output() method from the subprocess module which checks the profile again while it loops through the code for all the profiles.
        try: # the try block will try to run the code.
            results = subprocess.check_output(['netsh', 'wlan', 'show', 'profile', i, 'key=clear']).decode('utf-8', errors="backslashreplace").split('\n') # while it is looping through the code, the program looks for a specific profile while it's looping through all of the other profiles.
            results = [b.split(":")[1][1:-1] for b in results if "Key Content" in b] # while it is looping through the code, the program looks for the lines of text that have "Key Content" in them which is then splits the text with a colon and it removes the first and last characters from above.
            try: # the try block will try to run the code.
                print() # creates some line spacing.
                print("{:<30}|  {:<}".format(i, results[0])) # prints out the list of profiles that has one string which is that profile's key.
            except IndexError: # the code in the except block will run if the program catches and IndexError exception.
                print() # creates some line spacing.
                print("{:<30}|  {:<}".format(i, "")) # prints out the list of profiles that has one string which is that profile's key with some formatting.
        except subprocess.CalledProcessError: # the code in the except block will run if the program, while it's using the subprocess module, catches an CalledProcessError exception.
            print() # creates some line spacing.
            print("{:<30}|  {:<}".format(i, "ENCODING ERROR")) # formats the text before providing it as output and this text means that the profiles weren't encoded correctly and something went wrong.

    print() # creates some line spacing.
    input("") # this input function makes it so the program doesn't immediately stop running after being started.


choice = input("Do you want to put the WiFi usernames and passwords to a file or to the console (F/C): ") # asks the user if they want the wifi usernames and passwords printed out to the console or put into a file and stores that character c or f into the choice variable.

choice = choice.lower() # the character inside choice gets converted into a lowercase character.

if choice == "f": # if choice has a f for the user wanting to put the wifi usernames and passwords data into a text file, then the code in the if statement gets run.
    outputDatatoFile() # calls the outputDatatoFile() function.
elif choice == "c": # or if choice has a c for the user wanting to have the wifi usernames and passwords data printed out onto the console.
    outputDatatoConsole() # calls the outputDatatoConsole() function.