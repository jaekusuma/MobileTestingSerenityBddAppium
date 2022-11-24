Feature: Login
  @loginPositif
  Scenario: User login with input valid email and password
    Given User is on login page
    When User input username "admin"
    When User input password "admin"
    When User click login button
    Then User successfully login

  Scenario: User login with input invalid email and password
    Given User is on login page
    When User input username "invalid"
    When User input password "invalid"
    When User click login button