package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefs {
    @Given("Lucy is (\\d+)m from Sean")
    public void lucy_is_m_from_Sean(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("Sean shoutd \"(.*?)\"$")
    public void sean_shouts(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("Lucy should hear Sean's message")
    public void lucy_should_hear_Sean_s_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



}
