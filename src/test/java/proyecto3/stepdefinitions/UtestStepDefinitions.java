package proyecto3.stepdefinitions;
import cucumber.api.java.Before;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyecto3.task.FirstPart;
import proyecto3.task.OpenUp;
import proyecto3.task.SecondPart;
import proyecto3.task.ThirdPart;
//import sun.security.util.PendingException;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Andres wants to fill out a form to register$")
    public void andresWantsToFillOutAFormToRegister() {
        // Abrimos la pagina y entramos
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage());
    }


    @When("^I have entered the form and fill out the first part name (.*) lastname (.*) email (.*) month (.*) day (.*) year (.*)$")
    public void heFillOutTheFirstPartOfTheForm(String name, String lastname, String email, String month, String day, String year) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(FirstPart.the(name,lastname,email,month,day,year));

    }

    @When("^he fill out the second part of the form ciudad (.*)$")
    public void heFillOutTheSecondPartOfTheForm(String ciudad) {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(SecondPart.the(ciudad));


    }

    @When("^he fill out the third part of the form mobile (.*)$")
    public void heFillOutTheThirdPartOfTheForm(String mobile) {
        OnStage.theActorInTheSpotlight().attemptsTo(ThirdPart.the(mobile));

        // Write code here that turns the phrase above into concrete actions
    }

    @When("^he fill out the fourth part of the form$")
    public void heFillOutTheFourthPartOfTheForm() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^he can log in$")
    public void heCanLogIn() {
        // Write code here that turns the phrase above into concrete actions
    }

}
