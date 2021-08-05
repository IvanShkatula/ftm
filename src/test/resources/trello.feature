Feature: user can add product to cart

  Scenario Outline: SignUp

    Given actor opens sign up page
    When actor enter '<email>' email
    And actor enter '<fullname>' full name
    And actor click continue button
    And actor skip trial
    Then actor clicks lets go button
    Examples:
      | email         | fullname |
      | qwe123@tut.by | IvSh     |
      | qwe124@tut.by | IvSh2    |
      | qwe125@tut.by | IvSh3    |
      | qwe126@tut.by | IvSh4    |

  Scenario: SignIn
    Given actor opens login page
    When actor enter 'ivan101@tut.by' email and 'Password1!' password
    And actor opens profile page
    Then actor verifies profile name is equals 'ivan'
    And actor opens and verifies activity tab
    And actor opens and verifies cards tab
    And actor opens and verifies setting tab
    And actor opens and verifies trello tab
    And actor opens and verifies visibility tab
