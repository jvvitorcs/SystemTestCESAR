package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarketPage {

    private By firstItem = By.cssSelector("#popularItemsRows a:nth-child(2)");
    private By buyButton = By.cssSelector(".market_commodity_orders_header a");
    private By startSession = By.cssSelector(".modal_box_ctn .notLoggedInButtons .btn_green_white_innerfade.btn_medium");

    /*
     Representação
     */

    private WebDriver driver;
    private WebDriverWait wait;

    public MarketPage() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    public void ItemClick(){
        WebElement FirstItem = wait.until(ExpectedConditions.elementToBeClickable(firstItem));
        FirstItem.click();
    }

    public void BuyClick(){
        WebElement BuyButton = wait.until(ExpectedConditions.elementToBeClickable(buyButton));
        BuyButton.click();
    }

    public void CheckStartSession(){
        WebElement StartSession = driver.findElement(startSession);
        assertEquals("Iniciar sessão", StartSession.getText(), "OK!");
    }
}
