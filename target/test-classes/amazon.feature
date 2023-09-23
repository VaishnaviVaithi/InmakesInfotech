Feature: To validate the creation of amazon application

@Regression
Scenario: To generate the  new account in amazon url application
Given To launch the browser and maximize the window
When To launch the url of amazon application
And To click login button
And To click the create new account button
And To pass the name in yourname textbox
And To pass the mobile number in number textbox
And To pass the password in password textbox
Then To close the chrome Browser 

@Smoke
Scenario Outline: To validate the various login functionality
Given User has to launch the browser and maximize the window
 When User has to hit the amazon Url
   And User has to pass the data "<emaildatas>" in email field
   And User has to pass the data "<passworddatas>" in password field
   And User has to click the login button
   Then User has to close the browser
   
   Examples:
   |        emaildatas        | passworddatas |
   | vvaishnavi456@gmail.com  | 12345         |
   | selenumunmakes@gmail.com | gokul         |
   | abc@gmail.com            | abc80         |
   | kindnessrep54@gmail.com  | dhkil         |
   | gokul@gmail.com          | 23789         |
   | bandle@gmail.com         | 6728hd        |
