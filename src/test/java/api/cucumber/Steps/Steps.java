package api.cucumber.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
    @Given("given{int}")
    public void given(int arg0) {
        System.out.println("give int value of age");
    }

    @When("when")
    public void when() {
    }

    @And("and")
    public void and() {
    }

    @Then("then")
    public void then() {
    }

    @When("when{int}")
    public void when(int arg0) {
    }

    @And("and{int}")
    public void and(int arg0) {
    }

    @Then("then{int}")
    public void then(int arg0) {
    }
}
