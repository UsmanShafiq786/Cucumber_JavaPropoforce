package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/usman.shafique/IdeaProjects/CucumberJava/Featurefiles/SmokeTestSuit/LoginPage.feature",
        glue = {"StepsDefinations"},
        plugin = {"json:target/cucumber.json"}


)

public class TestRunner {


}
