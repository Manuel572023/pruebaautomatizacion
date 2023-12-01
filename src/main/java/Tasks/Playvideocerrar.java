package Tasks;

import Utils.WaitDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static UserInterfaces.PlayVideoCerrar.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Playvideocerrar implements Task {



        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(ABOUT_US),
                    WaitUntil.the(CERRAR, isVisible()).forNoMoreThan(5).seconds(),
                    Click.on(PLAY)

                 );
            WaitDriver.fiveSecond();
            actor.attemptsTo(
                    Click.on(CERRAR)
            );
        }

        public static Playvideocerrar playvideocerrar() {
            {
                return new Playvideocerrar();

            }


        }
}

