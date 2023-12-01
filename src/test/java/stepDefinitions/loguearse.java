package stepDefinitions;
import Tasks.Loguearse;
import UserInterfaces.IngresoUserInterfaces;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;


import static hooks.TheActor.Manuel;

public class loguearse {
    IngresoUserInterfaces Url;


    @Given("El usuario se encuetra en la pagina de inicio")
    public void Loguearse() {
        Manuel.wasAbleTo(Open.browserOn().the(Url));
    }
    @When("El usuario selecciona la opcion de login")
    public void Login() {
    }
    @And("Digita el nombre de usuario {string} y Password {string}")
    public void DigitarUsuario(String userName, String passWord) {
        Manuel.attemptsTo(Loguearse.Loguearse(userName,passWord)
        );
    }
    @Then("Si la pagina visualizar la opcion Log Out")
    public void Logueado() {
    }
}