package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaThankYou {

    @FindBy (xpath = ("//button[contains(text(),'Continue')]"))
    private WebElement buttonContinue;

    @FindBy (xpath = "//h1[contains(text(),'Thank you')]")
            private WebElement labelThankYou;

    public void validarLabel(){
        Assert.assertTrue((labelThankYou.isDisplayed()));
    }
    public void botonContinuar(){
        buttonContinue.click();
    }

    public PaginaThankYou(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
}
