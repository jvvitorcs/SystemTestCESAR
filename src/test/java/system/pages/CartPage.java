package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartPage {
    /*
     Representação
     */

    private WebDriver driver;
    private WebDriverWait wait;

    //Cart Page
    private By cartPage = By.cssSelector(".responsive_page_template_content");
    private By addedMessage = By.cssSelector(".cart_status_message");
    private By itemCartList = By.cssSelector(".cart_item_list");
    private By lastItemCart = By.cssSelector(".cart_item_list > div:last-child");
    private By btnRemoveGame = By.cssSelector(".cart_item_list > div:last-child .remove_link");
    private By cartValue = By.cssSelector(".checkout_content.cart #cart_estimated_total");

    public CartPage() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    public void CheckMessage(){
        WebElement AddMessage = driver.findElement(addedMessage);
        assertEquals("ITEM ADICIONADO!", AddMessage.getText(), "OK!");
    }

    public void RemoveTheGame(){
        WebElement BtnRemoveGame = wait.until(ExpectedConditions.elementToBeClickable(btnRemoveGame));
        BtnRemoveGame.click();
    }

    public void CheckCartValue(){
        WebElement CartValue = driver.findElement(cartValue);
        assertEquals("R$ 0,00", CartValue.getText(), "OK!");
    }
}
