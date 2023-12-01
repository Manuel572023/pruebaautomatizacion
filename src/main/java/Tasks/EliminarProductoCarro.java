package Tasks;

import Utils.AlertHandler;
import Utils.WaitDriver;
import hooks.TheActor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UserInterfaces.EliminarProductoCarro.CART;
import static UserInterfaces.IngresarProductoCarro.PRODUCTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EliminarProductoCarro implements Task {
    AlertHandler alertHandler = new AlertHandler(TheActor.getDriver());
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCTO),
                WaitUntil.the(UserInterfaces.IngresarProductoCarro.ADD_TO_CAR, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(UserInterfaces.IngresarProductoCarro.ADD_TO_CAR)
        );
        WaitDriver.fiveSecond();
        alertHandler.acceptAlert();

        actor.attemptsTo(
                Click.on(CART),
                WaitUntil.the(UserInterfaces.EliminarProductoCarro.ELIMINAR, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(UserInterfaces.EliminarProductoCarro.ELIMINAR)
        );
    }


    public static EliminarProductoCarro eliminarProductoCarro() {
        return new EliminarProductoCarro();
    }

}

