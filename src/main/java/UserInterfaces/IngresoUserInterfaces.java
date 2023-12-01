package UserInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
@DefaultUrl("page:webdriver.base.url")
public class IngresoUserInterfaces extends PageObject {
    public static final Target LINK1 = Target.the("LINK PARA ACCEDER ").located(By.id("signin2"));
}

