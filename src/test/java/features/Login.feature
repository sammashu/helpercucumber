Feature: Application Login

  Background:
  Given validate the browser
  When Browser is triggered
  Then check if browser is displayed

  @RegTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "jin" and "1234"
    Then Home page is populated
    And Cards are displayed true


  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "john" and "4321"
    Then Home page is populated
    And Cards are displayed false

  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with the following details
    | name  | password | email | country | number|
    | jenny | abcd | joan@abcd.com | Australia | 3325678 |
    | Paul | abcd | jan@abcd.com | canada | 3325678 |
    | John | abcd | jake@abcd.com | USA | 3325678 |

    Then Home page is populated
    And Cards are displayed false

  @RegTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with the following name as jenny
    Then Home page is populated
    And Cards are displayed false

  @RegTest
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User sign up with the following <Username> and <Password>
    Then Home page is populated
    And Cards are displayed false


    Examples:
      | Username | Password |
      | Alex     | 123      |
      | Bob      | 1234     |
      | Carl     | 3333     |
      | Suzy     | 4444     |