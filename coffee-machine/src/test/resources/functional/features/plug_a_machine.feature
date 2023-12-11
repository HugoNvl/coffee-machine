Feature: Plug a coffee machine before using
  Scenario: A user plug a coffee machine
  Given a coffee machine
  When we plug the machine to electricity
  Then the machine is now plugged