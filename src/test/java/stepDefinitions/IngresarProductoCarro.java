package stepDefinitions;

import UserInterfaces.IngresoUserInterfaces;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Assert;

import static Questions.ValidaCarro.ValidaCarroLleno;
import static hooks.TheActor.Manuel;

public class IngresarProductoCarro {
    IngresoUserInterfaces Url;

    @Given("El usuario se encuentre en la pagina principal")
    public void PaginaPrincipal() {
        Manuel.wasAbleTo(Open.browserOn().the(Url));
    }
    @When("Seleccione el producto y lo agrege al carro")
    public void ProductoCarro() {
        Manuel.attemptsTo(Tasks.IngresarProductoCarro.ingresarProductoCarro());
    }

    @Then("La pagina emita el mensaje de Product added")
    public void ProductoAgregado() {
            Assert.assertTrue("El registro debe ser exitoso", ValidaCarroLleno(Manuel));
    }
}
