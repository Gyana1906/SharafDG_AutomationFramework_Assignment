Selenium  Automation Framework Set up for Sharf DG Web App:
1.Pre- requisite :Java version - "21.0.2"
2.Framework design pattern :Page Object model
3.Create Project and in Main Folder : 
•	AbsractClass(all reusable methods for Page Object Class)
•	ExtentReportNG (for reporting)
•	PageObject Classes (For all the Test cases action methods and locators are present)
 Test Folder :
•	Test cases , Listeners & Base Test 
5.Pom.xml (All  dependencies required for the project like :TestNg,Selenium, WebdriverManager,ExtentReports)
6.Prop.properties file for configuration.
7.Create TestNG.xml for test suites execution
8.Listners class for implementing ITestListener
Interface, to attach screenshots ,logs for test pass & test fail


Test case design:

User Registration:
-	Landing page 
-	// Sharaf DG Staging Website Details
base url:https://uae.sdgstage.com
 Basic auth username: nginx
 Basic auth password: Y2XD.4vM9xcfh0!E]QI9wTu}UcTkMO)oPGn
-	Final url: https://nginx:Y2XD.4vM9xcfh0!E]QI9wTu}UcTkMO)oPGn@uae.sdgstage.com

-	Handle Cookie

-	Click on sign-in button

-	Click on Create Account

-	Input User id,Password,First Name ,Last Name,Mobile Number in Field 

-	Accept “terms & Condition” & Click on Register

-	Page will redirect to user account Page ,if the user account dashboard dropdown button is displayed then user is successfully registered.

   

2.	User Login:
 
-	Landing page 
-	Handle Cookie
-	Click on sign-in button
-	Enter Email id 
-	Click on next
-	Wait till the login with password element is populated ( WebDriver wait logic to handle )
-	Enter password & click on login button
-	Page will redirect to user account Page ,if the user account dashboard dropdown button is displayed then user is successfully logged in
 


3.Product Purchase Flow:
-	Landing page 
-	Handle Cookie
-	Seach  “Apple iPhone 14 Pro (256GB) – Silver “ product & click on the element which contains  ‘(256GB) – Silver’
-	Click on add to cart
-	Click Proceed to check out
-	It will land on sign in page to enter Email id
-	Click on next
-	Wait till the login with password element is populated ( WebDriver wait logic to handle )
-	Enter password & click on login button
-	Wil be  landed on Check out page 
-	Fill Emirates,Area & Address mandatory field.
-	Scroll down and select COD
-	Click on Place Order
-	Verify - " Thank you for 20 years of tech, trust, and transformation. "
Is displayed .



Push Source code to repository:
1.Login to gihub and create repository - https://github.com/Gyana1906/SharafDG_AutomationFramework_Assignment.git
2.Go to the local project folder
3.Right click and click on “Git bash”
4.input below commands 

git init
git add README.md
git add .
git commit -m "code updated"
git branch -M main
git remote add origin https://github.com/Gyana1906/SharafDG_AutomationFramework_Assignment.git
git push -u origin main
