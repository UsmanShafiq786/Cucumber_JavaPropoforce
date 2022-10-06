package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleloginClass {

   public WebDriver driver ;

    public GoogleloginClass(WebDriver idriver){
        driver = idriver;
        PageFactory.initElements(idriver,this);
    }

    @FindBy(xpath = "//*[@id=\"headingSubtext\"]/span/button")
    @CacheLookup
    WebElement Label;

    @FindBy(xpath = "//*[@id=\"headingSubtext\"]/span/button")
    @CacheLookup
    WebElement ClickonLabel;

    @FindBy (xpath = "//*[@id=\"jBjuwf\"]/span/div/div/span/div[1]/a")
    @CacheLookup
    WebElement EmailTempelate;

    @FindBy (xpath = "//*[@id=\"jBjuwf\"]/div[3]/div/span/span")
    @CacheLookup
    WebElement ButtonClick;

    @FindBy (id = "identifierId")
    @CacheLookup
    WebElement EmailID;

    @FindBy(xpath = "//button[@data-idom-class='nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")
    @CacheLookup
    WebElement NextButton;

    @FindBy (id = "password")
    @CacheLookup
    WebElement EnterPassword;


    public void labelText (){
        Label.isDisplayed();
    }
    public void Clciklabel(){
        ClickonLabel.click();
    }

    public void EmailLink(){
        EmailTempelate.isDisplayed();
    }

    public void CLickonButton(){
        ButtonClick.click();
    }

    public void EnterEmail (String email1){
        EmailID.sendKeys("usman.shafique@empglabs.com");
    }

    public void NextButton(){
        NextButton.click();
    }

    public void Passwordfield(String pass1){
        EnterPassword.sendKeys("usman@sibgha7890");
    }
}
