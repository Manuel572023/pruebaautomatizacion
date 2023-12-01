package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
              features = "src/test/resources/Features/RegistrarUsuario.feature",
        glue = {"stepDefinitions","hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RegistrarUsuariosRunners {

}
