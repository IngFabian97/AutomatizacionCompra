package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaCheckout {

    @FindBy (css = "#BillingNewAddress_FirstName")
        private WebElement inputNombre;

    @FindBy (css = "#BillingNewAddress_LastName")
        private WebElement inputApellido;

    @FindBy (css = "#BillingNewAddress_Email")
        private WebElement inputEmail;
    @FindBy (css = "#BillingNewAddress_Company")
        private WebElement inputCompany;

    @FindBy (css = "#BillingNewAddress_CountryId")
        private WebElement selectCountry;

    @FindBy (xpath = "//option[contains(text(),'Colombia')]")
        private  WebElement ColombiaCountry;

    @FindBy (css = "#BillingNewAddress_City")
        private WebElement inputCity;

    @FindBy (css = "#BillingNewAddress_Address1")
        private WebElement inputAddress;

    @FindBy (css = "#BillingNewAddress_ZipPostalCode")
        private WebElement inputPostalCode;

    @FindBy (css ="#BillingNewAddress_PhoneNumber")
        private WebElement inputPhoneNumber;

    @FindBy (xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
        private WebElement continuarDirrecion;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
            private WebElement continuarEnvio;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
            private WebElement continuarPago;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
            private WebElement continuarInformacion;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
            private WebElement continuarAlguno;

    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
        private WebElement confirmarOrden;

    private void ingresarNombre(String nombre){

        inputNombre.sendKeys(nombre);
    }

    private void ingresarApellido(String apellido){

        inputApellido.sendKeys(apellido);
    }

    private void ingresarCorreo(String correo){

        inputEmail.sendKeys(correo);
    }

    private void ingresarCompania(String compania){

        inputCompany.sendKeys(compania);
    }

    private void seleccionarPais(){

        selectCountry.click();
    }

    private void seleccionarColombia(){

        ColombiaCountry.click();
    }

    private void ingresarCiudad(String ciudad){

        inputCity.sendKeys(ciudad);
    }

    private void ingresarDireccion(String direccion){

        inputAddress.sendKeys(direccion);
    }

    private void ingresarCodPostal(String codigoPostal){

        inputPostalCode.sendKeys(codigoPostal);
    }

    private void ingresarCelular(String celular){

        inputPhoneNumber.sendKeys(celular);
    }

    private void botonContinuarDireccion(){

        continuarDirrecion.click();
    }

    private void botonContinuarEnvio(){

        continuarEnvio.click();
    }

    private void botonContinuarPago(){

        continuarPago.click();
    }

    private void botonInformacionPago(){

        continuarInformacion.click();
    }

    private void botonContinuarAlguno(){
        continuarAlguno.click();
    }

    private void botonConfirmarOrden(){
        confirmarOrden.click();
    }

    public void realizarOrden(String nombre, String apellido, String correo, String compania, String ciudad, String direcion, String codigoPostal, String celular){

        ingresarNombre(nombre);
        ingresarApellido(apellido);
        ingresarCorreo(correo);
        ingresarCompania(compania);
        seleccionarPais();
        seleccionarColombia();
        ingresarCiudad(ciudad);
        ingresarDireccion(direcion);
        ingresarCodPostal(codigoPostal);
        ingresarCelular(celular);
        botonContinuarDireccion();
        botonContinuarEnvio();
        botonContinuarPago();
        botonInformacionPago();
        botonContinuarAlguno();
        botonConfirmarOrden();
    }

        public PaginaCheckout(WebDriver driver){
            PageFactory.initElements(driver,this);
        }

}
