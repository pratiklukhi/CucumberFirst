Feature: Refer a friend

  As a registered user, I can refer a friend on DemoNopeCommerce website
  So that, they can see all product features
  @test
  Scenario: Registered user should able to refer a friend

    Given user is already registered
    When user is on homepage
    And select a AppleMacBook product
    And click on Email a friend
    Then user should able to refer a friend successfully
