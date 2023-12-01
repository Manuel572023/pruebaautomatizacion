package UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarUsuarios extends PageObject {
    public static final Target TEXTBOX_USERNAME = Target.the("Caja de texto para ingresar el nombre de usuario").located(By.id("sign-username"));
    public static final Target TEXTBOX_PASSW = Target.the("Caja de texto para ingresar la clave").located(By.id("sign-password"));
    public static final Target BTN_SINGUP = Target.the("Boton para registrar usuarios").located(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
}
