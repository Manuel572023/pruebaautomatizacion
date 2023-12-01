package UserInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EliminarProductoCarro {


    public static final Target ELIMINAR = Target.the("Boton para Eliminar Productos").located(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a"));
    public static final Target CART = Target.the("Boton para Acceder a la Opción Carro de Compras").located(By.id("cartur"));
}
