package StepsDefinations;

import PageObjects.GoogleloginClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLogin {
    WebDriver driver;
    GoogleloginClass Glc;

    @Given("Given user launch Chrome browser")
    public void givenUserLaunchChromeBrowser() {
    String SysPath = System.getProperty("user.dir");
    System.setProperty("webdriver.chrome.driver", SysPath + "/src/test/Drivers/chromedriver.exe");
    driver = new ChromeDriver();
    Glc = new GoogleloginClass(driver);

    }

    @When("User open the URL {string}")
    public void userOpenTheURL(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Then("user redirected to the URL {string}")
    public void userRedirectedToTheURL(String Url2) {
        driver.get(Url2);
    }

    @Then("There should be a label IAP EMPGLabs")
    public void thereShouldBeAbleLabelIAPEMPGLabs() {
        Glc.labelText();
    }

    @Then("User should be able to click on IAP EMPGLABS")
    public void userShouldBeAbleToClickOnIAPEMPGLABS() throws InterruptedException {
        Glc.Clciklabel();
        Thread.sleep(2000);

    }

    @Then("user click on the got it button")
    public void userClickOnTheGotItButton()  {
        Glc.CLickonButton();

    }
    @When("User enter an email as {string} in the email field")
    public void userEnterAnEmailAsInTheEmailField(String email1) {
        Glc.EnterEmail(email1);
    }

    @And("User Click on Next button")
    public void userClickOnNextButton() {
        Glc.NextButton();
    }
    @Then("User redirected to the password screen {string}")
    public void userRedirectedToThePasswordScreen(String NxtURl) throws InterruptedException {
        System.out.println("THis is test &**************************");
        driver.get(NxtURl);
        Thread.sleep(1000);
        System.out.println("THis is test &**************************");

    }

    @And("User enter the password as {string} in the password")
    public void userEnterThePasswordAsInThePassword(String pass1) {
        Glc.Passwordfield(pass1);

    }

    @Then("User redirected to the login URL {string} of Propforce login")
    public void userRedirectedToTheLoginURLOfPropforceLogin(String loginURL) {
        driver.get(loginURL);
    }



}
