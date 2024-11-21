Feature: Test Hrm application

  Scenario Outline: Test Login for data driven
    Given Open Hrm application
    When user enter "<username>" and enter "<password>"
    And User click on hrm login button
    Then as per valid credentials user should be login

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Kiran    | test123  |
      | Neha     | test123  |
