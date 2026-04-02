# Name: Rusho Binnabi
# Date: 4/2/2026
# Project: Link Embedder
# Contact: RushoBinnabi123@yahoo.com


# This Link Embedder program allows users to change the embeds of links from Twitter, Instagram, and Reddit to their respective alternatives. 
# The program provides options to add new embeds, replace existing embeds in the list, and change the embed of a given link. 
# The changed embed is automatically copied to the user's clipboard for easier accessibility. 
# The program also includes a clean-up function to allow users to continue using the program or exit as desired.

import pyautogui as bot
import pyperclip as otherbot
import subprocess

embeds = ["fxtwitter.com", "ddinstagram.com", "rxddit.com"] # these three embeds are default.
pointer = 0

# this addToEmbeds() function adds a new embed to the list of embeds.
def addToEmbeds(newEmbed):
    embeds.append(newEmbed)

# this replaceEmbed() function replaces an existing embed in the list with a new one.
def replaceEmbed(replacementEmbed, oldEmbed):
    pointer = embeds.index(oldEmbed)
    embeds.remove(oldEmbed)
    embeds.insert(pointer, replacementEmbed)

# this changeEmbed() function changes the embed of a given link and copies the new embed to the clipboard.
def changeEmbed(oldLink):
    newLink = ""
    if "x.com" in oldLink:
        newLink += oldLink.replace("x.com", embeds[0])
        otherbot.copy(newLink)
        newLink = ""
    elif "instagram.com" in oldLink:
        newLink += oldLink.replace("instagram.com", embeds[1])
        otherbot.copy(newLink)
        newLink = ""
    if "reddit.com" in oldLink:
        newLink += oldLink.replace("reddit.com", embeds[2])
        otherbot.copy(newLink)
        newLink = ""

# this cleanUp() function allows users to choose whether they want to use the program again or exit.
def cleanUp():
    choice2 = str(input("\nDo you want to use the program again (y/n)? "))
    if choice2 == "y":
        subprocess.run("clear || cls", shell=True)
    elif choice2 == "n":
        exit()

# this clearScreen() function clears the console screen for better readability and organization.
def clearScreen():
    subprocess.run("clear || cls", shell=True)


####################################################################### below this divider line is the execution of the program.

while True: 
    confirmation = str(input("Do you want to change an embed (y/n)? "))

    if confirmation == "y":
        choice = int(input("\nPlease choose from the following: \n\n" \
    
        "1 - Add a new embed \n" \
        "2 - Replace an embed in the list of embeds\n" \
        "3 - Change an embed\n" \
        "4 - Exit \n\n" \
    
        "Choice: "))
        clearScreen()

        oldEmbed = str(input("\nEnter old embed: "))

        if choice == 1:
            newEmbed = str(input("Enter new embed: "))
            addToEmbeds(newEmbed)
            print("Added new embed. ")
            print("")
            cleanUp()
        elif choice == 2:
            replacementEmbed = str(input("Enter replacement embed: "))
            oldEmbed = str(input("Enter old embed: "))
            replaceEmbed(replacementEmbed, oldEmbed)
            print("Replaced embed. ")
            print("")
            cleanUp()
        elif choice == 3:
            changeEmbed(oldEmbed)
            print("Changed embed. The embed has been automatically copied to your clipboard.")
            print("")
            cleanUp()
        elif choice == 4:
            exit()

    elif confirmation == "n":
        exit()