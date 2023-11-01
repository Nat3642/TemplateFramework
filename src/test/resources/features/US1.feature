@us1 @ui
Feature: as a user i should be able to access all menus from Home page

  Scenario Outline:
    Given user is on the landing page and user clicks on "<menu>" button
    Then user must see "<title_text>" in title
    Examples:
      | menu              | title_text           |
      | Create a Username | Confirm Your Account |
      | Sign In           | Sign In              |
