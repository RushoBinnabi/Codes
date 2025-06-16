from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = ""
videoLinkElement = ""
newVideoLinkElement = ""

def checkVideos(browser, videoOldSiteLink, videoNewYouTubeLink):
    global driver
    if browser == "Chrome":
        driver = webdriver.Chrome()
    elif browser == "Firefox":
        driver = webdriver.Firefox()
    driver.get(videoOldSiteLink)
    videoLinkElement = driver.find_element(By.CLASS_NAME, "site-body-center-column").get_attribute("href")
    driver.execute_script("window.open("");")
    driver.switch_to.window(driver.window_handles[1])
    driver.get(videoNewYouTubeLink)
    time.sleep(30)
    newVideoLinkElement = driver.find_element(By.CLASS_NAME, "style-scope ytd-player").get_attribute("href")
    print()
    print("Is the new video on the site? => " + str(videoLinkElement == newVideoLinkElement))
    driver.quit()
    print()
    input("Press any key to continue...")

print()
browser = input("Enter your browser (ex: Firefox): ")
videoOldSiteLink = input("Enter the link from the site: ")
videoNewYouTubeLink = input("Enter your new YouTube video link to check against: ")

checkVideos(browser, videoOldSiteLink, videoNewYouTubeLink)