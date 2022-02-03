Feature: Login Case

  Scenario Outline: verify login
    When  I open the hamburger menu
    And I open the My Account section
    And I open the Sign In section
    And I enter email "<email>" and password "<password>"
    Then username "<username>" should be seen

    Examples:
      | email                       | password      | username        |
      | seleniumtester102@gmail.com | sahibinden102 | Selenium Tester |