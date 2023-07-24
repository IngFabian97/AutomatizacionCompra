package pruebas;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.PaginaCarrito;
import pageObjects.PaginaNotebooks;

import static java.lang.Thread.sleep;

public class Compra extends BaseTestSuite {

    @Test
    public void hacerUnaCompra() throws InterruptedException {
        ChromeDriver.get("https://demo.nopcommerce.com/");

        paginaPrincipal.irANotebooks();

        paginaNotebooks.agregarAlCarrito();

        paginaNotebooks.irACarrito();

        paginaCarrito.irAIniciarSesion();

        paginaInicioSesion.ingresarComoInvitado();

        paginaCheckout.realizarOrden("Fabian","Guarin","ing.pruebas@hotmail.com","HDI","Medellin","Diagonal 50","9911","1234567890");

        sleep(2000);

        paginaThankYou.validarLabel();

        paginaThankYou.botonContinuar();

        sleep(10000);

    }
}
