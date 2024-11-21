Feature: Test CRM application

  Background: 
    Given open crm application using "https://automationplayground.com/crm/"
    When User click on SignIn link

  Scenario: Test for signIn link
    Then User should navigate to login page

  Scenario: Test for login
    When user enter valid email and password
    When user click on submit button
    Then user should navigate to customers page
