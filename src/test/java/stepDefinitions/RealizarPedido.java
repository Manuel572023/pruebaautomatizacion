package stepDefinitions;

import Tasks.Loguearse;
import UserInterfaces.IngresoUserInterfaces;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static hooks.TheActor.Manuel;

public class RealizarPedido {

    IngresoUserInterfaces Url;

    @Given("El usuario se encuentre en la Opcion Carro de compras")
    public void IngresarRealizarPedido() {
        Manuel.wasAbleTo(Open.browserOn().the(Url));
    }
    @When("El usuario Ingrese a la Opcion Pedidos")
    public void OpcionPedidos() {
    }

    @And("Ingresar el {string} y {string} y {string} y {string} y {string} y {string}")
    public void IngresarInformacionPedido(String name, String city, String country, String card, String month, String year) {
        Manuel.attemptsTo(Tasks.RealizarPedido.realizarPedido(name,city,country,card,month,year)
        );
    }
    @Then("Visualice la Modal Thank you for your purchase")
    public void PedidoRegistrado() {
}
}
