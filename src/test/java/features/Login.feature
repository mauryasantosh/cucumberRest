Feature: Login

Scenario: Successful Login with Valid Credentials
 Given User is on Home Page
 When User Navigate to LogIn Page
 And User enters UserName="John" and Password="password"
 Then Message displayed Login Successfully
 
 Scenario: Successful Login with Valid Credentials
 Given User is on Home Page
 When User Navigate to LogIn Page
 And User enters UserName="John" and Password="password" 
 Then Message displayed Login Successfully
 
Scenario: Successful LogOut
 When User LogOut from the Application
 Then Message displayed LogOut Successfully


