import os
import webbrowser
import speech_recognition as sr
from gtts import gTTS

def getaudio():
    r = sr.Recognizer()
    with sr.Microphone() as source:
        audio = r.listen(source)
        output = ""
    try:
        said = r.recognize_google(audio)
        if "" in said:
            print(said)
            webbrowser.open_new_tab("")
    except:
        print("Error")

getaudio()