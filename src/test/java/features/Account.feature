Feature: Application Login

  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "jin" and "1234"
    Then Home page is populated
    And Cards are displayed true

