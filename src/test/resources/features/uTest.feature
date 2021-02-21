@stories
Feature: Utest
  As a user I want to create my user in Utest
  @scenario1
Scenario: Create new user on uTest page
    Given Andres wants to fill out a form to register
    When I have entered the form and fill out the first part name Andres lastname Rojas email andres20ka@gmail.com month April day 20 year 2000
    When he fill out the second part of the form ciudad Cali
    When he fill out the third part of the form mobile Alcatel
    When he fill out the fourth part of the form
    Then he can log in
