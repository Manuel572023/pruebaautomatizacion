package UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlayVideoCerrar {


    public static final Target ABOUT_US = Target.the("Boton para registrar usuarios").located(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a"));
    public static final Target CERRAR = Target.the("Boton para registrar usuarios").located(By.xpath(" //*[@id=\"videoModal\"]/div/div/div[3]/button"));
    public static final Target PLAY = Target.the("Boton para registrar usuarios").located(By.xpath(" //*[@id=\"example-video\"]/div[1]"));


}
