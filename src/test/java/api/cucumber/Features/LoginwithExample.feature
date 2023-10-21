Feature: Login with example
  @DixitKasodariya
  Scenario Outline: login with username and password
    Given user on login page
    When user enter "<Username>" and "<Password>"
    And click on login button
    Then if all right go to home otherwise give message
    Examples:
      | Username                | Password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |

  Scenario: click on product and count on cart
      When user enter homepage and click add to cart
      And user check how many iteam on cart
      Then it is not same then give error





