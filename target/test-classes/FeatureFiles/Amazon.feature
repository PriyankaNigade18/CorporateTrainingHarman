Feature: Test Amazon application

  Background: 
    Given Open amazon appliication

  @homepage @smoke
  Scenario: Test title of home page
    When User get the title of home page
    Then title should match to homepage

  @sellpage @regression @ignore
  Scenario: Test title of Sells page
    When user open Sell page
    When user get the title of sell page
    Then title of sell page should match

  @mobilepage @regression @ignore
  Scenario: Test title of mobiles page
    When user open Mobile page
    When user get the title of Mobile page
    Then title of Mobile page should match
