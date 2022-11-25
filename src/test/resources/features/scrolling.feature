@scrolling
Feature: Scrolling menu
  Background:
    Given User is on login page
    When User input username "admin"
    When User input password "admin"
    When User click login button
    Then User successfully login

  @scrollWithPointer
  Scenario: Scroll list with pointer
    Given User is on calculator page
    When User click on hamburger button and click on list menu
    Then User doing swipe in the screen

  @scrollToText
  Scenario: Scroll list until text showed
    Given User is on calculator page
    When User click on hamburger button and click on list menu
    Then User doing scroll until text "List ke-100" showed

  @longpress
  Scenario: Longpress on list menu
    Given User is on calculator page
    When User click on hamburger button and click on list menu
    Then user doing long press in list menu

  @multipleTap
  Scenario: Multiple tap on single list menu
    Given User is on calculator page
    When User click on hamburger button and click on list menu
    Then User doing multiple tap on single list menu

  @randomMultiple
  Scenario: Multiple tap in random list menu
    Given User is on calculator page
    When User click on hamburger button and click on list menu
    Then User doing random 5 multiple tap in list menu
