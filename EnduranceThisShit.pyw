import pyautogui as bot
import time

def pickUpStick():
    bot.press("f")

def throwTheStick():
    bot.middleClick()
    
def goToStickLocation():
    bot.hold("w", 1)


pickUpStick()
time.sleep(1)
throwTheStick()
time.sleep(2)
goToStickLocation()