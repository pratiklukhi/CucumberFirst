Feature: New Store Open

  As a registered user, I able to see title, subtitle and comment successfully and comments always appeared in last on DemoNopeCommerce website
  So that, I can use all user features.
  @test
  Scenario: User should able to see title,subtitle and comment successfully

    Given user is already registered
    When user is on Homepage
    And click on new online store is open
    And type title and comment
    And click on new comment button
    Then user should able to see news comment is successfully added
    And also see his comments in the last of the comment page
