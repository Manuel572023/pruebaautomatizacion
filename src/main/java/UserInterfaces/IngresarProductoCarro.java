package UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarProductoCarro {
    public static final Target PRODUCTO = Target.the("Seleccion de un Producto").located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img"));
    public static final Target ADD_TO_CAR = Target.the("Boton para Agregar Productos al Carro").located(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));

}