package system.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

public class StoreNav {

    private WebDriver driver;
    private WebDriverWait wait;

    //notUsed
    private By storeNavMenu = By.cssSelector(".store_nav");
    private By storePointButton = By.cssSelector(".store_nav > a:nth-child(5)");
    private By newsButton = By.cssSelector(".store_nav > a:nth-child(6)");
    private By labButton = By.cssSelector(".store_nav .tab:nth-child(7)");

    // Store Nav Menu
    private By searchBoxInput = By.id("store_nav_search_term");
    private By firstItemList = By.cssSelector(".match");

    public StoreNav() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    public void SearchGame(String texto){
        driver.findElement(searchBoxInput).sendKeys(texto);
    }

    public void SelectGame(){
        WebElement FirstItemList = wait.until(ExpectedConditions.elementToBeClickable(firstItemList));
        FirstItemList.click();
    }
}
