Feature: Desktop page

  User should able to navigate Desktop page on DemoNopeCommerce website
  So that, user can use all features of Desktop page
@test
  Scenario: User should able to navigate Desktop page

    Given user is on homepage
    When user click on computers
    And select desktop
    Then user should able to navigate Desktop page
