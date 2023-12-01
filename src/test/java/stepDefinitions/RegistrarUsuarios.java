package stepDefinitions;

import UserInterfaces.IngresoUserInterfaces;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static hooks.TheActor.Manuel;

public class RegistrarUsuarios {
    IngresoUserInterfaces Url;

    @Given("El usuario este en la pagina de inicio")
    public void PaginaInicio() {Manuel.wasAbleTo(Open.browserOn().the(Url));
    }

    @When("El usuario selecciona la opcion de registro")
    public void OpcionRegistro() {
    }

    @And("Ingresa el nombre de usuario {string} y Password {string}")
    public void RegistroUsuarioPass(String userName, String passWord) {
        Manuel.attemptsTo(Tasks.RegistrarUsuarios.registrarUsuarios(userName, passWord)
        );
    }

    @Then("Si la pagina visualizar el mensaje Sign up successful")
    public void siLaPaginaAparece() {
    }
}
