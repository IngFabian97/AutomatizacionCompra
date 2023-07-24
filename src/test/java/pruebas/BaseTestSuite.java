package pruebas;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {

    WebDriver ChromeDriver;

    PaginaPrincipal paginaPrincipal;
    PaginaNotebooks paginaNotebooks;
    PaginaCarrito paginaCarrito;
    PaginaInicioSesion paginaInicioSesion;

    PaginaCheckout paginaCheckout;

    PaginaThankYou paginaThankYou;


    private  void inicializarPaginas(WebDriver driver){
        paginaPrincipal = new PaginaPrincipal(driver);
        paginaNotebooks = new PaginaNotebooks(driver);
        paginaInicioSesion = new PaginaInicioSesion(driver);
        paginaCarrito = new PaginaCarrito(driver);
        paginaCheckout = new PaginaCheckout(driver);
        paginaThankYou = new PaginaThankYou(driver);

    }

    @Before
    public void abrirDriver(){
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("marionette",false);
        ChromeDriver = new ChromeDriver(options);
        //Actions accion = new Actions(ChromeDriver);
        ChromeDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        inicializarPaginas(ChromeDriver);
    }

    @After
    public void cerrarDriver() throws InterruptedException {
        Thread.sleep(5000);
        ChromeDriver.quit();
    }
}
