Feature: Login admin WJC
  Scenario: Admin valid login WJC
    Given Admin open browser and url
    When Admin enter valid username
    And Admin enter valid password
    And Admin click button sign-in
    Then Admin go to page Dashboard

  Scenario: Admin invalid login WJC
    When Admin click button logout
    When Admin enter invalid username
    And Admin enter invalid password
    And Admin click button sign-in
    Then Admin invalid login
