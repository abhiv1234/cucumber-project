@testGoogle
Feature: Test navigation to google page
  I want to test navigation to google page with this feature file

  @tag1
  Scenario Outline: Open browser
    Given I want to open "<Browser>"
    Examples:
    |Browser|
    |Safari|

  @tag2
  Scenario Outline: Navigate to "<PageName>" page
    Then I navigate to "<PageURL>" URL
    Examples: 
      | PageName  | PageURL |
      |Google |www.google.co.in|