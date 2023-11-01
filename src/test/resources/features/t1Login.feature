Feature: login functionality

  Scenario Outline:
    Given user on the login home page ("https://thinking-tester-contact-list.herokuapp.com/")
    When user enters "<login>" and "<password>" information
    Then user sees "<title>" in title
    Examples:
      | login          | password  | title       |
      | kir1@gmail.com | 321321321 | My Contacts |


