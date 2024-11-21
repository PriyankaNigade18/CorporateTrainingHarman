Feature: Test OpenCart

  @Register
  Scenario: Test user registration process
    Given Open opencart register page
    When User enters required credentials
      | fname  | lname  | email                 | telephone | password | cpassword |
      | Kavita | sharma | kavita12345@gmail.com |   6655433 | test123  | test123   |
    And User click on yes radio button
    And user click privacy policy
    And user click on continue button
    Then User should navigate to account page with success message

  @Login
  Scenario: Test Login for register user
    Given Open Opercart login page
    When User enter valid credientials
      | kavita12345@gmail.com | test123 |
    When user click on cart login button
    Then User should be navigated to account page
