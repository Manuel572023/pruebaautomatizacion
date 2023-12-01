package stepDefinitions;

import Questions.ValidaCarro;
import UserInterfaces.IngresoUserInterfaces;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import org.junit.Assert;

import static Questions.ValidaCarro.ValidaCarroLleno;
import static hooks.TheActor.Manuel;

public class EliminarProductoCarro {
    IngresoUserInterfaces Url;


    @Given("El usuario se encuentre en la pagina de carro de compras")
    public void IngresoCarroCompras() {
        Manuel.wasAbleTo(Open.browserOn().the(Url));

    }

    @When("Elimina el producto agregado que se visualiza en el contenedor")
    public void EliminarProducto() {
        Manuel.attemptsTo(Tasks.EliminarProductoCarro.eliminarProductoCarro());
    }

    @Then("Se elimine el producto")
    public void ProductoEliminado() {
        Assert.assertTrue("El registro debe ser exitoso", ValidaCarro.ValidaCarrovacio(Manuel));

    }
}
