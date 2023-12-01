package Tasks;

import Utils.AlertHandler;
import hooks.TheActor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static UserInterfaces.Loguearse.LINK2;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Loguearse implements Task {

    private static String userName;
    private static String passWord;
    public Loguearse(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
    AlertHandler alertHandler = new AlertHandler(TheActor.getDriver());
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK2),
                WaitUntil.the(UserInterfaces.Loguearse.LOGIN_USERNAME, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(userName).into(UserInterfaces.Loguearse.LOGIN_USERNAME),
                Enter.theValue(passWord).into(UserInterfaces.Loguearse.LOGIN_PASS),
                Click.on(UserInterfaces.Loguearse.BTN_LOGIN),
                WaitUntil.the(UserInterfaces.Loguearse.LOGOUT, isVisible()).forNoMoreThan(5).seconds()
        );

    }
    public static Loguearse Loguearse(String userName, String passWord) {
        {
            return new Loguearse(userName, passWord);
        }
    }
}