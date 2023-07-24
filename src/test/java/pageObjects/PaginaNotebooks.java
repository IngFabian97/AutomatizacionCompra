package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static java.lang.Thread.sleep;

public class PaginaNotebooks {

    WebDriver driver;

    @FindBy(xpath = ("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]"))
            private WebElement notebook;

    @FindBy(xpath = ("//body/div[@id='bar-notification']/div[1]/span[1]"))
            private WebElement closeBanner;

    @FindBy(xpath = ("//span[contains(text(),'Shopping cart')]"))
            private WebElement shoppingCart;

    @FindBy(xpath = ("//button[contains(text(),'Go to cart')]"))
            private WebElement goToCart;

    public void agregarAlCarrito() throws InterruptedException {
        notebook.click();
        closeBanner.click();
        sleep(5000);
    }

    public void irACarrito(){
        Actions accion = new Actions(this.driver);
        accion.moveToElement(shoppingCart).moveToElement(goToCart)
            .click().build().perform();

    }

    public PaginaNotebooks (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
