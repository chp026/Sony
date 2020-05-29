Feature:

  Scenario: Makeing sure user is on SONY homepage & accept cookie
    Given user is on Sony website homepage
    When user accepts all cookie
    And user uses mouse hover action to select Electronic option
    And user clicks on Home Theater & Sound Bars
    Then user should be able to see result page

  Scenario:
     Given user is on Sony website homepage
     When user accepts all cookie
     Then user uses mouse hover action to select PlayStation option

  Scenario:
    Given user is on Sony website homepage
    When user accepts all cookie
    Then user uses mouse hover action to select Enterainment option

  Scenario:
    Given user is on Sony website homepage
    When user accepts all cookie
    Then user uses mouse hover action to select Support option