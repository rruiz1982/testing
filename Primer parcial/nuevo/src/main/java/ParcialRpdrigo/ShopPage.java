package ParcialRpdrigo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage extends BasePage{
    private By searchBar = By.xpath("(//input[@placeholder='Search'])[1]");
    private By btnSearch = By.cssSelector(".fa.fa-search");
    private By btnAddProduct = By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
    private By success = By.xpath("(//div[@class='alert alert-success alert-dismissible'])[1]");



    public ShopPage(WebDriver driver, WebDriverWait wait) {
        super(driver, null);
    }


    public void escribirProducto(String producto) throws InterruptedException {
        this.sendText(producto, searchBar);
    }


    public void clickBuscar() throws InterruptedException {
        this.click(btnSearch);
    }


    public void clickAgregar() throws InterruptedException {
        this.click(btnAddProduct);
    }


    public String productoAgregadoConExito() throws InterruptedException {
        String res = this.getText(success);
        System.out.println("Resultado Card value: " + res);
        return res;
    }
}
