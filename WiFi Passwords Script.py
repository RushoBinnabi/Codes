# this code script file will get all the WiFi names and their passwords as profiles that this computer has connected to in the past and is connected to at the moment.

import subprocess # this is the module that will be used when interacting with the command prompt function.

data = subprocess.check_output(['netsh', 'wlan', 'show', 'profiles']).decode('utf-8', errors="backslashreplace").split('\n') # this gets the output for the command "netsh wlan show profiles" using the method from the subprocess module called check_output().
                                                                                                                             # then it decodes the output with a universal text format 8 format and splits the text that gets generated and then decoded with a new line character to get each of the lines of text on their own seperate line.
profiles = [i.split(":")[1][1:-1] for i in data if "All User Profile" in i] # this gets the lines of text from the list that only have "All User Profile".
                                                                            # with those lines of text, it splits those lines with a colon to get the right hand side of the text and it removes the first and last characters of the text.
for i in profiles: # this for loop gets the output for the command "netsh wlan show profile {Profile Name} key=clear" using the check_output() method from the subprocess module which checks the profile again while it loops through the code for all the profiles.
    try: # the try block will try to run the code.
        results = subprocess.check_output(['netsh', 'wlan', 'show', 'profile', i, 'key=clear']).decode('utf-8', errors="backslashreplace").split('\n') # while it is looping through the code, the program looks for a specific profile while it's looping through all of the other profiles.
        results = [b.split(":")[1][1:-1] for b in results if "Key Content" in b] # while it is looping through the code, the program looks for the lines of text that have "Key Content" in them which is then splits the text with a colon and it removes the first and last characters from above.
        try:
            print() # creates some line spacing.
            print ("{:<30}|  {:<}".format(i, results[0])) # prints out the list of profiles that has one string which is that profile's key.
        except IndexError: # the code in the except block will run if the program catches and IndexError exception.
            print() # creates some line spacing.
            print ("{:<30}|  {:<}".format(i, "")) # prints out the list of profiles that has one string which is that profile's key with some formatting.
    except subprocess.CalledProcessError: # the code in the except block will run if the program, while it's using the subprocess module, catches an CalledProcessError exception.
        print() # creates some line spacing.
        print ("{:<30}|  {:<}".format(i, "ENCODING ERROR")) # formats the text before providing it as output and this text means that the profiles weren't encoded correctly and something went wrong.
input("") # this input function makes it so the program doesn't immediately stop running after being started.