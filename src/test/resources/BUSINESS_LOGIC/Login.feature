Feature: Login functionality

Background: User successfully clicked on initial Login page
When user provide "webdriver.chrome.driver" and exe location as "F:\\Automation Support\\chromedriver.exe"
When user provide url as "https://www.flipkart.com/"
When user cancel initial login page


Scenario: Login functionality with valid credentials 
When user navigate on Login
When user click on My Profile
When user enter 8308440478 as username
When user enter pa$$w0rd as password
When user click on Login button
Then application shows user profile to user 
