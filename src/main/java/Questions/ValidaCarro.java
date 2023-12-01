package Questions;

import UserInterfaces.EliminarProductoCarro;
import UserInterfaces.IngresarProductoCarro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidaCarro {
    public static Boolean ValidaCarroLleno(Actor actor) {
        return EliminarProductoCarro.ELIMINAR.resolveFor(actor).isCurrentlyVisible();
    }

    public static Boolean ValidaCarrovacio(Actor actor) {
        return !EliminarProductoCarro.ELIMINAR.resolveFor(actor).isCurrentlyVisible();
    }
}
