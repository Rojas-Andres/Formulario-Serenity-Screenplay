@stories
Feature: Utest
  As a user I want to create my user in Utest
  @scenario1
Scenario: Create new user on uTest page
    Given Andres wants to fill out a form to register
    When I have entered the form and fill out the first part
    | strName | strLastname  | strEmail               | strMonth | strDay | strYear |
    | Andres  | Rojas        | andres20ka@gmail.com   | April    | 20     | 2000    |
    When he fill out the second part of the form ciudad
    | strCity     | strZipCode |
    | Limari      | 78520      |
    When he fill out the third part of the form mobile
    | strMobile   | strModel   | strSo   |
    | Apple       | iPhone 3GS | iOS 3.0 |
    When he fill out the fourth part of the form password
    | strPassword |
    | t#%y1uF1nzvRI9AJK |
    Then he can log in email
    | strEmail             | strPassword       |
    | andres20ka@gmail.com | t#%y1uF1nzvRI9AJK |
