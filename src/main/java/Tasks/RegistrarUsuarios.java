package Tasks;

import Utils.AlertHandler;
import hooks.TheActor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Assert;

import static UserInterfaces.IngresoUserInterfaces.LINK1;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarUsuarios implements Task {
    private static String userName;
    private static String passWord;
    public RegistrarUsuarios(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
    AlertHandler alertHandler = new AlertHandler(TheActor.getDriver());
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK1),
                WaitUntil.the(UserInterfaces.RegistrarUsuarios.TEXTBOX_USERNAME, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(userName).into(UserInterfaces.RegistrarUsuarios.TEXTBOX_USERNAME),
                Enter.theValue(passWord).into(UserInterfaces.RegistrarUsuarios.TEXTBOX_PASSW),
                Click.on(UserInterfaces.RegistrarUsuarios.BTN_SINGUP)
        );
        AlertHandler alert = new AlertHandler(TheActor.getDriver());
        String alertText = alert.getAndCloseAlertText();
        Assert.assertEquals("Sign up successful.", alertText);
    }
    public static RegistrarUsuarios registrarUsuarios(String userName, String passWord) {
        {
            return new RegistrarUsuarios(userName, passWord);
        }
    }
}

