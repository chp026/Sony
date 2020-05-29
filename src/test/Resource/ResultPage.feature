Feature:

  Background:
    Given user is on Sony website homepage
    When user accepts all cookie
    And user uses mouse hover action to select Electronic option
    And user clicks on Home Theater & Sound Bars
    Then user should be able to see result page

  Scenario:
    Given user should be able to see result page
    When user clicks on home cinema speaker
    And user should be able to see all the home cinema speakers
    And user selects Stereo Bookshelf Speaker
    And user clicks where to buy information button
    Then user should be able to see the result page