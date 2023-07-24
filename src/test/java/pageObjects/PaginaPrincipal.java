package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pruebas.BaseTestSuite;


//public class PaginaPrincipal extends BaseTestSuite{
public class PaginaPrincipal{
    WebDriver driver;
    @FindBy(xpath = ("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"))
    private WebElement computers;

    @FindBy(xpath = ("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]"))
    private WebElement notebooks;

    public void irANotebooks(){
        Actions accion = new Actions(this.driver);
        accion.moveToElement(computers).moveToElement(notebooks).
                click().build().perform();
    }

    public PaginaPrincipal(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
