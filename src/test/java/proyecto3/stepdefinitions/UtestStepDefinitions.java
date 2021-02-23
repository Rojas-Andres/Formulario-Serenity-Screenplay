package proyecto3.stepdefinitions;
import cucumber.api.java.Before;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyecto3.model.ProyectoData;
import proyecto3.task.*;

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


    @When("^I have entered the form and fill out the first part$")
    public void heFillOutTheFirstPartOfTheForm(List<ProyectoData> proyecto3Data) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(FirstPart.
                the(proyecto3Data.get(0).getStrName(),proyecto3Data.get(0).getStrLastname(),
                        proyecto3Data.get(0).getStrEmail(),proyecto3Data.get(0).getStrMonth(),
                        proyecto3Data.get(0).getStrDay(),proyecto3Data.get(0).getStrYear()));
    }

    @When("^he fill out the second part of the form ciudad$")
    public void heFillOutTheSecondPartOfTheForm(List<ProyectoData> proyecto3Data) throws Exception{
    // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(SecondPart.the(proyecto3Data.get(0).getStrCity()));


    }

    @When("^he fill out the third part of the form mobile$")
    public void heFillOutTheThirdPartOfTheForm(List<ProyectoData> proyecto3Data) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(ThirdPart.the(proyecto3Data.get(0).getStrMobile(),proyecto3Data.get(0).getStrModel(),
                proyecto3Data.get(0).getStrSo()));

        // Write code here that turns the phrase above into concrete actions
    }

    @When("^he fill out the fourth part of the form password$")
    public void heFillOutTheFourthPartOfTheForm(List<ProyectoData> proyecto3Data) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(FourthPart.the(proyecto3Data.get(0).getStrPassword()));

    }

    @Then("^he can log in email$")
    public void heCanLogIn(List<ProyectoData> proyecto3Data) throws Exception{
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Check.the(proyecto3Data.get(0).getStrEmail(),proyecto3Data.get(0).getStrPassword()));

    }

}
