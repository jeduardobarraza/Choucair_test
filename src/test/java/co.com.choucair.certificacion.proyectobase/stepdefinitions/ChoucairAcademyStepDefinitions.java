package co.com.choucair.certificacion.proyectobase.stepdefinitions;


import co.com.choucair.certificacion.proyectobase.task.Login;
import co.com.choucair.certificacion.proyectobase.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void  setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon desire create his profile in Utest platform$")
    public void thanbrandondesirecreatehisprofileinUtestplatform(){
        OnStage.theActorCalled("Brandon").wasAbleTo(Login.onthepage());
    }

    /*@When("^he search for the Utest page a select Join Today for make it$")
    public void hesearchfortheUtestpageaselectJoinTodayformakeit(){
        OnStage.theActorCalled("Brandon").wasAbleTo(Login.onthepage());
    }

    @Then("^he find the form with required information for create a new profile on that platform$")
    public void hefindtheformwithrequiredinformationforcreateanewprofileonthatplatform (){
    }*/
}
