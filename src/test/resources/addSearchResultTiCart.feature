
Feature: user can add product to cart

  Scenario: add product to cart after save

    Given actor open create account page
    When actor create account with 'Ivan' firstname, 'Shkatula' lastname, 'iwan.shkatula@tut.by' email , 'Password1!' password
    And actor search product by 'TV' value
    And actor open product page
    And actor add product to cart
    And actor open his cart
    Then actor verifies if his cart is not empty