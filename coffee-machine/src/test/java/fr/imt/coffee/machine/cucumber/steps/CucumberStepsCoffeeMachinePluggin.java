package fr.imt.coffee.machine.cucumber.steps;

import fr.imt.coffee.machine.CoffeeMachine;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CucumberStepsCoffeeMachinePluggin {

    public CoffeeMachine coffeeMachine;

    @Given("a coffee machine")
    public void givenACertainCoffeeMachine(){
        coffeeMachine = new CoffeeMachine(0.1, 0.6, 0.15, 2.0, 600);
    }

    @When("we plug the machine to electricity")
    public void wePlugTheMachineToElectricity() {
        coffeeMachine.plugToElectricalPlug();
    }

    @Then("the machine is now plugged")
    public void machinePlugged() {Assertions.assertTrue(coffeeMachine.isPlugged()); }

}
