import com.sun.javafx.stage.WindowCloseRequestHandler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import sun.awt.windows.WBufferStrategy;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Compra {
    private WebDriver ChromeDriver;

    @Before
    public void abrirDriver(){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("marionette",false);
        ChromeDriver = new ChromeDriver(options);
        ChromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void hacerUnaCompra() throws InterruptedException {
        ChromeDriver.get("https://demo.nopcommerce.com/");

        //Crear accion+
        Actions accion = new Actions(ChromeDriver);

        //Computers a Notebooks
        WebElement Computers = ChromeDriver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        accion.moveToElement(Computers).moveToElement(ChromeDriver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]"))).
                click().build().perform();

        //Elegir Notebook
        WebElement notebook = ChromeDriver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        notebook.click();

        //Cerrar banner
        WebElement closeBanner = ChromeDriver.findElement((By.cssSelector("body:nth-child(2) div.bar-notification-container:nth-child(6) div.bar-notification.success > span.close")));
        closeBanner.click();

        sleep(5000);

        //Shopping go to cart
        WebElement goToCart = ChromeDriver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
        accion.moveToElement(goToCart).moveToElement(ChromeDriver.findElement(By.xpath("//button[contains(text(),'Go to cart')]")))
                .click().build().perform();


        //Aceptar terminos
        WebElement terminos = ChromeDriver.findElement(By.xpath("//input[@id='termsofservice']"));
        terminos.click();

        //Hacer checkout
        WebElement checkout = ChromeDriver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        //Input de email
        WebElement inputEmail = ChromeDriver.findElement((By.cssSelector("#Email")));
        inputEmail.sendKeys("ing.pruebas@hotmail.com");

        //Input de password
        WebElement inputPassword = ChromeDriver.findElement(By.cssSelector("#Password"));
        inputPassword.sendKeys("123456");

        //Boton Log In
        WebElement butonLogIn = ChromeDriver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        butonLogIn.click();

        //Aceptar terminos
        WebElement terminos1 = ChromeDriver.findElement(By.cssSelector("#termsofservice"));
        terminos1.click();

        //Hacer checkout
        WebElement checkout1 = ChromeDriver.findElement(By.cssSelector("#checkout"));
        checkout1.click();

        //Boton continuar dirección
        WebElement continuarDireccion = ChromeDriver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]"));
        continuarDireccion.click();

        /*
        //Seleccionar Colombia
        WebElement Colombia = ChromeDriver.findElement(By.xpath("//option[contains(text(),'Colombia')]"));
        Colombia.click();

        //Pais
        WebElement country = ChromeDriver.findElement(By.cssSelector("#BillingNewAddress_CountryId"));
        country.click();

        //Ingresar ciudad
        WebElement city = ChromeDriver.findElement(By.cssSelector("#BillingNewAddress_City"));
        city.sendKeys("Bello");

        //Ingresar dirección
        WebElement address = ChromeDriver.findElement(By.cssSelector("#BillingNewAddress_Address1"));
        address.sendKeys("Diagonal 59");

        //Ingresar codigo postal
        WebElement postalCode = ChromeDriver.findElement(By.cssSelector("#BillingNewAddress_ZipPostalCode"));
        postalCode.sendKeys("9900");

        //Ingresar numero de celular
        WebElement phoneNumber = ChromeDriver.findElement(By.cssSelector("#BillingNewAddress_PhoneNumber"));
        phoneNumber.sendKeys("1234567890");

        //Boton continuar direccion
        WebElement continuarDireccion = ChromeDriver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]"));
        continuarDireccion.click();*/

        //Boton continuar envio
        WebElement continuarEnvio = ChromeDriver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]"));
        continuarEnvio.click();

        //Boton continuar pago
        WebElement continuarPago = ChromeDriver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]"));
        continuarPago.click();

        //Boton información de pago
        WebElement continuarInformacion = ChromeDriver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]"));
        continuarInformacion.click();

        //boton
        WebElement continuarAlguno = ChromeDriver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));
        continuarAlguno.click();

        //Boton confirmar orden
        WebElement confirm = ChromeDriver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
        confirm.click();

        //Boton continuar finalzar orden
         WebElement continuarFinish = ChromeDriver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/button"));
        continuarFinish.click();

        sleep(10000);

    }

    @After
    public void cerrarDriver(){
        ChromeDriver.quit();
    }
}
