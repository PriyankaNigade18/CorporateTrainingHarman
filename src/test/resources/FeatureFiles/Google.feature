@All
Feature: Test Google application

  Background: 
    Given Open Google application

  @Title @Regression
  Scenario: Test google application title
    #Given Open Google application
    When I get the current page title
    Then title should match to Google

  @Search @Regression
  Scenario: Test search feature of google
    #Given Open Google application
    When I enter "java" in google search
    Then I should get valid search result
