package StepsDefinations;

import PageObjects.LoginClassPOM;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    WebDriver driver;
    LoginClassPOM LoginPOM;

    @Given("user launch Chrome browser")
    public void user_launch_chrome_browser() {
        String SysPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", SysPath + "/src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        LoginPOM = new LoginClassPOM(driver);
    }

    @And("user open the URL {string}")
    public void user_open_the_url(String LoginURL) throws InterruptedException {
        driver.get(LoginURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @When("User enter the email as {string} & password as {string}")
    public void userEnterTheEmailAsPasswordAs(String email1, String pass1) throws InterruptedException {
        LoginPOM.EmailFiled(email1);
        LoginPOM.Passwordfield(pass1);

    }

    @When("^User enter (.*) and (.*)$")
    public void user_enter_the_email_as_password_as(String Email, String Pass) throws InterruptedException {
        LoginPOM.EmailFiled(Email);
        LoginPOM.Passwordfield(Pass);
    }

    @When("User click on login button")
    public void user_click_on_login_button() throws InterruptedException {
        LoginPOM.LoginButton();
    }

//    @Then("Verify the Error is {string}")
//    public void verify_the_error_is(String Error) {
//        String VerificationText = LoginPOM.LoginErrorMessage();
//        Assert.assertEquals(Error, VerificationText);
//    }

    // Forget Password Step Definitions
    @And("User click on the forgot password link")
    public void userClickOnTheForgotPasswordLink() {
        LoginPOM.forgotpassword();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Then("Verify the Title should be {string}")
    public void verifyTheTitleShouldBe(String title) {
        String VerificationText = LoginPOM.labelText1();
        Assert.assertEquals(title, VerificationText);
    }

    @And("User enter an email as {string}")
    public void userEnterAnEmailAs(String Forgotemail) {
        LoginPOM.ForgotPasswordemail(Forgotemail);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Then("User click on Reset Password button")
    public void userClickOnResetPasswordButton() throws InterruptedException {
        LoginPOM.ForgetRest();
    }

    @And("Verify the Title is {string}")
    public void verifyTheTitleIs(String Errortext1) throws InterruptedException {
        LoginPOM.ErrorText();
    }

    @Then("Verify the Success message {string}")
    public void verifyTheSuccessMessage(String SuccesssMessage1) throws InterruptedException {
        String SuccessMsg = LoginPOM.SuccessMessage();
        Assert.assertEquals(SuccesssMessage1, SuccessMsg);
        Thread.sleep(2000);

    }

// Step Definition for Clicking on all the links for other's region on login page

    @When("User click on Zameen.com logo then redirected to url {string}")
    public void userClickOnZameenComLogoThenRedirectedToUrl(String url1) throws InterruptedException {
       String ZameenUrl =  LoginPOM.Zameenlogo1(url1);
       Assert.assertEquals(url1,ZameenUrl);
        WebDriverWait wait = new WebDriverWait(driver,4000);


    }

    @When("User click on Kaidee logo then redirected to url {string}")
    public void userClickOnKaideeLogoThenRedirectedToUrl(String url2) {
       String ValidURL = LoginPOM.Kaideelogo1(url2);
       Assert.assertEquals(url2, ValidURL);
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);


    }

    @When("User click on Mubawab logo then redirected to url {string}")
    public void userClickOnMubawabLogoThenRedirectedToUrl(String url3) {
        String VerifyURL = LoginPOM.Mubawablogo1(url3);
        Assert.assertEquals(url3,VerifyURL);
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);

    }

    @When("User click on Bproperty logo then redirected to url {string}")
    public void userClickOnBpropertyLogoThenRedirectedToUrl(String url4) {
        String VerifyURL = LoginPOM.Bpropertylogo1(url4);
        Assert.assertEquals(url4,VerifyURL);
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);

    }

// Hooks function
    @After
    public void Teardown() {
        driver.close();
    }


}