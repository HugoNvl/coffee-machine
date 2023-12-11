Feature: Make an espresso with an espresso machine
  A user want an espresso
  Scenario: A user plug the espresso machine and make an espresso Arabica
    Given an espresso machine with 0.10 l of min bean tank capacity, 2.0 l of max bean tank capacity, 0.10 l of min water capacity, 3.0 l of max water capacity, 600.0 l per h of water flow for the pump
    And a "cup" with a capacity of 0.20 l
    When I plug the espresso machine to electricity
    And I add 1 l of water in the water tank
    And I add 0.5 l of "ARABICA" in the bean tank
    And I made an espresso "ARABICA"
    Then the espresso machine return a coffee cup not empty
    And an espresso volume equals to 0.20
    And an espresso "cup" containing a coffee type "ARABICA"