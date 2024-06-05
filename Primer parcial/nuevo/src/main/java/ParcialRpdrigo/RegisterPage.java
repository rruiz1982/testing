package ParcialRpdrigo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage{
    private By nombre = By.id("input-firstname");
    private By apellido = By.id("input-lastname");
    private By email = By.id("input-email");
    private By telefono = By.id("input-telephone");
    private By password = By.id("input-password");
    private By repassword = By.id("input-confirm");
    private By newsletter = By.xpath("//input[@value='0']");
    private By btnMyAccount = By.linkText("My Account");
    private By btnRegister = By.linkText("Register");
    private By btnConfirmRegister = By.xpath("(//input[@value='Continue'])[1]");
    private By acceptConditions = By.name("agree");
    private By exito = By.xpath("(//p[contains(text(),'Congratulations! Your new account has been success')])[1]");
    private  By mailObligatorio = By.id("input-email");

    // Constructor de la clase que inicializa el WebDriver y el WebDriverWait

    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, null);
    }

    // Método para hacer clic en "My Account"

    public void clickCrearCuenta() throws InterruptedException {
        this.click(btnMyAccount);
    }

    // Método para hacer clic en "Register"

    public void clickRegistrarse() throws InterruptedException {
        this.click(btnRegister);
    }

    // Método para hacer clic en el botón de confirmación de registro

    public void clickConfirmRegister() throws InterruptedException {
        this.click(btnConfirmRegister);
    }

    // Método para ingresar el nombre en el campo correspondiente

    public void escribirNombre(String name) throws InterruptedException {
        this.sendText(name, nombre);
    }

    // Método para ingresar el apellido en el campo correspondiente

    public void escribirApellido(String name) throws InterruptedException {
        this.sendText(name, apellido);
    }

    // Método para ingresar el correo electrónico en el campo correspondiente

    public void escribirCorreo(String mail) throws InterruptedException {
        this.sendText(mail, email);
    }

    // Método para ingresar el teléfono en el campo correspondiente

    public void escribirTelefono(String tel) throws InterruptedException {
        this.sendText(tel, telefono);
    }

    // Método para ingresar la contraseña en el campo correspondiente

    public void escribirContraseña(String pass) throws InterruptedException {
        this.sendText(pass, password);
    }
    // Método para repetir la contraseña en el campo correspondiente

    public void repetirContraseña(String pass) throws InterruptedException {
        this.sendText(pass, repassword);
    }

    // Método para rechazar la suscripción al newsletter

    public void clickRejectNewsletter() throws InterruptedException {
        this.click(newsletter);
    }

    // Método para aceptar los términos y condiciones

    public void clickPoliciesCheckbox() throws InterruptedException {
        this.click(acceptConditions);
    }

    // Método para finalizar el registro haciendo clic en el botón de confirmación

    public void clickFinalizarRegistro() throws InterruptedException {
        this.click(btnConfirmRegister);
    }

    // Método para obtener y devolver el mensaje de éxito del registro

    public String cuentaCreadaExito() throws InterruptedException {
        String res = this.getText(exito);
        System.out.println("Resultado Card value: " + res);
        return res;
    }
    // Método para validar y devolver el mensaje de error de correo obligatorio

    public String validaMailObligatorio() throws InterruptedException {
        System.out.println("Se valida mensaje de Mail Obligatorio: " + this.getText(mailObligatorio));
        return this.getText(mailObligatorio);
    }

}
