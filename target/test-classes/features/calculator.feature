@calculator
Feature: Calculator
  Background:
    Given User is on login page
    When User input username "admin"
    When User input password "admin"
    When User click login button
    Then User successfully login

  @addition
  Scenario: Sum of the 1st and 2nd digits
    Given User is on calculator page
    When User input 3 as first number
    When User selected sum option
    When User input 4 as second number
    When User click equal to button
    Then Result showing as expected sum

  @subtraction
  Scenario: Subtraction of the 1st and 2nd digits
    Given User is on calculator page
    When User input 20 as first number
    When User selected subtraction option
    When User input 5 as second number
    When User click equal to button
    Then Result showing as expected subtraction

  @multiple
  Scenario: Multiplication of the 1st and 2nd digits
    Given User is on calculator page
    When User input 5 as first number
    When User selected multiplication option
    When User input 6 as second number
    When User click equal to button
    Then Result showing as expected multiplication

  @division
  Scenario: Division of the 1st and 2nd digits
    Given User is on calculator page
    When User input 100 as first number
    When User selected division option
    When User input 25 as second number
    When User click equal to button
    Then Result showing as expected division