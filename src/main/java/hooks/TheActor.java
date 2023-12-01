package hooks;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.webdriver.driverproviders.ChromeDriverCapabilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TheActor {

    public static Actor Manuel;


   @Managed
   private static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }

///comentario

    @Before(order = 1)
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Before(order = 2)
    public void setTheActor(){
        Manuel = Actor.named("Manuel");
        Manuel.can(BrowseTheWeb.with(driver));
    }
}