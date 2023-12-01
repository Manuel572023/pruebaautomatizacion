package stepDefinitions;

import UserInterfaces.IngresoUserInterfaces;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static hooks.TheActor.Manuel;

public class PlayVideoCerrar {
    IngresoUserInterfaces Url;
    @Given("El usuario se encuentre en la sesion About Us")
    public void SesionAbout() {
        Manuel.wasAbleTo(Open.browserOn().the(Url));
    }

    @When("El usuario de Play y visualice el video")
    public void PlayVideo() {
        Manuel.attemptsTo(Tasks.Playvideocerrar.playvideocerrar());
    }

    @Then("Esperar 5 segundos y cerrar la modal del video")
    public void CerrarVideo() {

    }
}


