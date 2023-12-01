package Tasks;

import Utils.AlertHandler;
import Utils.WaitDriver;
import hooks.TheActor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UserInterfaces.EliminarProductoCarro.CART;
import static UserInterfaces.RealizarPedido.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RealizarPedido implements Task {
    private static String name;
    private static String country;
    private static String city;
    private static String card;
    private static String month;
    private static String year;


    public RealizarPedido(String name, String country,String city ,String card,String month,String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.card = card;
        this.month = month;
        this.year = year;

    }
    AlertHandler alertHandler = new AlertHandler(TheActor.getDriver());

    @Override


    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCTO1),
                WaitUntil.the(UserInterfaces.IngresarProductoCarro.ADD_TO_CAR, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(UserInterfaces.IngresarProductoCarro.ADD_TO_CAR)
        );
        WaitDriver.fiveSecond();
        alertHandler.acceptAlert();

          actor.attemptsTo(

                  Click.on(HOME),
                             Click.on(PRODUCTO2),
                WaitUntil.the(UserInterfaces.IngresarProductoCarro.ADD_TO_CAR, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(UserInterfaces.IngresarProductoCarro.ADD_TO_CAR)
        );
        WaitDriver.fiveSecond();
        alertHandler.acceptAlert();
        actor.attemptsTo(
                Click.on(CART)
        );
        WaitDriver.fiveSecond();
        actor.attemptsTo(
                Click.on(PLACE_ORDER),
                Enter.theValue(name).into(UserInterfaces.RealizarPedido.name2),
                Enter.theValue(country).into(UserInterfaces.RealizarPedido.country2),
                Enter.theValue(city).into(UserInterfaces.RealizarPedido.city2),
                Enter.theValue(card).into(UserInterfaces.RealizarPedido.card2),
                Enter.theValue(month).into(UserInterfaces.RealizarPedido.month2),
                Enter.theValue(year).into(UserInterfaces.RealizarPedido.year2),
                Click.on(PURCHASE),
                WaitUntil.the(UserInterfaces.RealizarPedido.CONFIRMAR, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CONFIRMAR)
        );
    }
    public static RealizarPedido realizarPedido(String name, String city, String country, String card, String month, String year) {

        return new RealizarPedido(name, city, country, card, month, year);
    }

}
