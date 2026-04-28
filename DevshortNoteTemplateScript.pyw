# Name: Rusho Binnabi
# Date: 05-14-2026
# Project: Devshort Note Template Script.
# Description: This script automates the process of creating a note template for Devshorts, a 15min podcast-style livestream about news from Warframe and Soulframe.
# Contact: RushoBinnabi123@yahoo.com

import pyautogui as bot

# this script should not be run until after the hotkey "Ctrl + 4" is pressed using AHK. Refer to DevshortNoteTemplateScript.ahk for more information.

# this controlB() function is used to simulate the keyboard shortcut "Ctrl + B".
def controlB():
    bot.hotkey("ctrl", "b")

# this devshortTemplate() function is the main function that creates the note template for Devshorts by using the pyautogui library.
def devshortTemplate():
    controlB()
    bot.write("Warframe:")
    bot.hotkey("enter")
    bot.write("- Jade")

    for i in range(0, 3):
        bot.hotkey("enter")

    controlB()
    bot.write("Soulframe:")
    bot.hotkey("enter")
    bot.write("- Jade")

    for i in range(0, 3):
        bot.hotkey("enter")

    controlB()
    bot.write("Misc:")
    bot.hotkey("enter")
    bot.write("- Jade")

    for i in range(0, 3):
        bot.hotkey("enter")

    bot.write("Disclaimer: Information marked with * is a joke.")


devshortTemplate()