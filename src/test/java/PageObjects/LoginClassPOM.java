package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClassPOM {

    WebDriver driver;

    public LoginClassPOM(WebDriver Idriver) {
        driver = Idriver;
        PageFactory.initElements(Idriver, this);

    }

    // successful login with valid credentials
    @FindBy(id = "login-username-label")
    @CacheLookup
    WebElement txt_Username;

    @FindBy(id = "login-password-label")
    @CacheLookup
    WebElement txt_Password;

    @FindBy(xpath = "//button[@class='prop-btn prop-btn-primary prop-btn-block prop-btn-lg']")
    @CacheLookup
    WebElement lgnButton;


    // Unsuccessful login Error Message

//    @FindBy(xpath = "/html/body/app-root/authentication/app-login/div/article/app-login-alert-box/div/span")
//    @CacheLookup
//    WebElement LoginErrorMsg;

    // Forgot Password test cases

    @FindBy(xpath = "//a[@class='prop-btn-link display-inline-block']")
    @CacheLookup
    WebElement Frgtlink;

    @FindBy(xpath = "//h1[@class=\'text-left\']")
    @CacheLookup
    WebElement labeltext;

    @FindBy(id = "forgot-password-label")
    @CacheLookup
    WebElement ForgotEmail;

    @FindBy(xpath = "//button[@class='prop-btn prop-btn-primary prop-btn-block prop-btn-lg']")
    @CacheLookup
    WebElement Resetbutton;

    @FindBy(xpath = "/html/body/app-root/authentication/app-login/div/article/app-login-alert-box/div/span")
    @CacheLookup
    WebElement IncorctFgtEmailMsg;

    @FindBy(xpath = "/html/body/app-root/authentication/app-login/div/article/app-login-alert-box/div/span")
    @CacheLookup
    WebElement SuccessText;

    // Logo link test cases

    @FindBy (xpath = "/html/body/app-root/authentication/app-login/div/aside/div[3]/ul/li[1]/a")
    @CacheLookup
    WebElement Zameenlogo;

    @FindBy (xpath = "/html/body/app-root/authentication/app-login/div/aside/div[3]/ul/li[2]/a/img")
    @CacheLookup
    WebElement KaideeLogo;

    @FindBy (xpath = "/html/body/app-root/authentication/app-login/div/aside/div[3]/ul/li[3]/a/img")
    @CacheLookup
    WebElement Mubawablogo;

    @FindBy (xpath = "/html/body/app-root/authentication/app-login/div/aside/div[3]/ul/li[4]/a")
    @CacheLookup
    WebElement BpropertyLogo;

// Methods for Objects

    public void EmailFiled(String Email) {
        txt_Username.clear();
        txt_Username.sendKeys(Email);
    }

    public void Passwordfield(String Pass) {
        txt_Password.clear();
        txt_Password.sendKeys(Pass);
    }

    public void LoginButton() {
        lgnButton.click();
    }

//    public String LoginErrorMessage() {
//        return LoginErrorMsg.getText();
//    }

    public void forgotpassword() {
        Frgtlink.click();
    }

    public String labelText1() {
        return labeltext.getText();
    }

    public void ForgotPasswordemail(String fgtEmail) {
        ForgotEmail.clear();
        ForgotEmail.sendKeys(fgtEmail);
    }

    public void ForgetRest() {
        Resetbutton.click();
    }

    public String ErrorText() {
        return IncorctFgtEmailMsg.getText();
    }

    public String SuccessMessage() {
        return SuccessText.getText();
    }

// methods for Clicking on all the links for other's region on login page

    public String Zameenlogo1(String url1){
         Zameenlogo.click();
        return url1;
    }

    public String Kaideelogo1(String url2){
        KaideeLogo.click();
        return url2;
    }

    public String Mubawablogo1(String url3){
        Mubawablogo.click();
        return url3;
    }

    public String Bpropertylogo1(String url4){
        BpropertyLogo.click();
        return url4;
    }


}
