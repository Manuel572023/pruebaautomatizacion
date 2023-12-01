package UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class Loguearse extends PageObject {
    public static final Target LINK2 = Target.the("Boton de LOGIN  ").located(By.id("login2"));
    public static final Target LOGIN_USERNAME = Target.the("Caja de texto para ingresar el nombre de usuario").located(By.id("loginusername"));
    public static final Target LOGIN_PASS = Target.the("Caja de texto para ingresar la clave").located(By.id("loginpassword"));
    public static final Target BTN_LOGIN = Target.the("Boton para Loguearse dentro de la Modal").located(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));

    public static final Target LOGOUT = Target.the("Boton para des Loguearse ").located(By.xpath("//*[@id=\"logout2\"]"));

}