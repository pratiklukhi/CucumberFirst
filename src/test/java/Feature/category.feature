Feature: Navigate to category pages

  @test
  Scenario Outline: As a user, I should able to navigate to correct category pages when I click on menu category button

    Given I am on homepage
    When I click on "<category>" button
    Then i should be able to verify the "<page_Url>" accordingly
    And i should  able to verify from the get text "<page_title>" accordingly

    Examples:
      | category    | page_Url                                 | page_title  |
      | Computers   | https://demo.nopcommerce.com/computers   | Computers   |
      | Electronics | https://demo.nopcommerce.com/electronics | Electronics |
      | Apparel     | https://demo.nopcommerce.com/apparel     | Apparel     |