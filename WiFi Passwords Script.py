# Name: Rusho Binnabi
# Date: 7/8/2023
# Project: WiFi Password Script
# Code File Updated: 7/8/2023 at 8:45 PM
# Contact Information: RushoBinnabi123@yahoo.com

# this code script file will get all the WiFi names and their passwords as profiles that this computer has connected to in the past and is connected to at the moment and puts that data into a text file or prints it out to the console depending on what the user wants.

import subprocess

# this outputDatatoFile() function outputs all the WiFi Usernames and Passwords to a text file.

def outputDatatoFile():
    data = subprocess.check_output(['netsh', 'wlan', 'show', 'profiles']).decode('utf-8', errors="backslashreplace").split('\n')                                                                                                              
    profiles = [i.split(":")[1][1:-1] for i in data if "All User Profile" in i]
    file = open("WiFi Usernames and Passwords.txt", "a")                                                               
    for i in profiles: 
        try:
            results = subprocess.check_output(['netsh', 'wlan', 'show', 'profile', i, 'key=clear']).decode('utf-8', errors="backslashreplace").split('\n') 
            results = [b.split(":")[1][1:-1] for b in results if "Key Content" in b]
            try:
                file.writelines("{:<30}| {:<}".format(i, results[0] + "\n\n")) 
            except IndexError:
                file.writelines("{:<30}|  {:<}".format(i, "\n\n")) 
        except subprocess.CalledProcessError:
            file.writelines("")
            file.writelines("{:<30}|  {:<}".format(i, "ENCODING ERROR" + "\n\n"))
    file.close()

    print()
    print("The data has been written to the file. Please check the file.")
    print()
    input("")

# this outputDatatoConsole() function outputs all the WiFi Usernames and Passwords to the console.

def outputDatatoConsole():
    data = subprocess.check_output(['netsh', 'wlan', 'show', 'profiles']).decode('utf-8', errors="backslashreplace").split('\n')                                  
    profiles = [i.split(":")[1][1:-1] for i in data if "All User Profile" in i] 
    for i in profiles:
        try:
            results = subprocess.check_output(['netsh', 'wlan', 'show', 'profile', i, 'key=clear']).decode('utf-8', errors="backslashreplace").split('\n')
            results = [b.split(":")[1][1:-1] for b in results if "Key Content" in b]
            try:
                print()
                print("{:<30}|  {:<}".format(i, results[0])) 
            except IndexError:
                print()
                print("{:<30}|  {:<}".format(i, "")) 
        except subprocess.CalledProcessError:
            print("{:<30}|  {:<}".format(i, "ENCODING ERROR"))
    print()
    input("")


choice = input("Do you want to put the WiFi usernames and passwords to a file or to the console (F/C): ") 

choice = choice.lower()

if choice == "f":
    outputDatatoFile()
elif choice == "c":
    outputDatatoConsole()
