from selenium import webdriver
from selenium.webdriver.common.by import By

driver = ""
videoLinkElement = ""

def checkVideos(browser, videoOldSiteLink, videoNewYouTubeLink):
    global driver
    if browser == "Chrome":
        driver = webdriver.Chrome()
    elif browser == "Firefox":
        driver = webdriver.Firefox()
    driver.get(videoOldSiteLink)
    videoLinkElement = driver.find_element(By.CLASS_NAME, "site-body-center-column").get_attribute("href")
    print()
    print("Is the new video on the site? => " + str(videoLinkElement == videoNewYouTubeLink))
    driver.quit()
    print()
    input("Press any key to continue...")

print()
browser = input("Enter your browser (ex: Firefox): ")
videoOldSiteLink = input("Enter the link from the site: ")
videoNewYouTubeLink = input("Enter your new YouTube video link to check against: ")

checkVideos(browser, videoOldSiteLink, videoNewYouTubeLink)