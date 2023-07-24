package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaCarrito {

    @FindBy(xpath = "//input[@id='termsofservice']")
            private WebElement terminos;

    @FindBy(xpath = "//button[@id='checkout']")
            private WebElement checkout;

    private void aceptarTerminos(){
        terminos.click();
    }

    private void hacerCheckout(){
        checkout.click();
    }

    public void irAIniciarSesion () {
        aceptarTerminos();
        hacerCheckout();
    }

    public PaginaCarrito(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
