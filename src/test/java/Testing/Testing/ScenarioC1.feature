
Feature: Test Me App

  Scenario: SignUp/Register
    Given I want to register new user
    When I open the TestMeApp URL
    And click on register/Signup
     Then i enter my data
      | username  | Firstname| Lastname| Password   |ConfirmPassword|Gender|Email              |Mobile no |   DOB    |  Address   |   S Question         |Answer|
      | gokulram  | gokul    | ram     | gokulMEC123| gokulMEC123   | Male |15euee029@gmail.com|8825991969|07/03/1998|bgihgthhgwer|What is your pet name?|Tommy |
    And The user click on register
