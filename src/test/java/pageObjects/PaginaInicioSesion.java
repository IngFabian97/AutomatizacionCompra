package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaInicioSesion {

    @FindBy(xpath = ("//button[contains(text(),'Checkout as Guest')]"))
            private WebElement buttonGuest;

    public void ingresarComoInvitado(){
        buttonGuest.click();
    }


    public PaginaInicioSesion(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }
}
