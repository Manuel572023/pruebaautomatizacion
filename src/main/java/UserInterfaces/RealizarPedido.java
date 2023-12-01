package UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RealizarPedido {

    public static final Target PRODUCTO1 = Target.the("Boton para registrar usuarios").located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img"));
    public static final Target PRODUCTO2 = Target.the("Boton para registrar usuarios").located(By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/a/img"));

    public static final Target PLACE_ORDER = Target.the("Boton para registrar usuarios").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));

    public static final Target CONFIRMAR = Target.the("Boton para registrar usuarios").located(By.xpath("/html/body/div[10]/div[7]/div/button"));




    public static final Target name2 = Target.the("Caja de texto para ingresar el nombre de usuario").located(By.id("name"));
    public static final Target country2 = Target.the("Caja de texto para ingresar el nombre de usuario").located(By.id("country"));
    public static final Target city2 = Target.the("Caja de texto para ingresar el nombre de usuario").located(By.id("city"));
    public static final Target card2 = Target.the("Caja de texto para ingresar el nombre de usuario").located(By.id("card"));
    public static final Target month2 = Target.the("Caja de texto para ingresar el nombre de usuario").located(By.id("month"));

    public static final Target year2 = Target.the("Caja de texto para ingresar el nombre de usuario").located(By.id("year"));

    public static final Target PURCHASE = Target.the("Boton para registrar usuarios").located(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
    public static final Target HOME = Target.the("Boton para registrar usuarios").located(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a"));

}
