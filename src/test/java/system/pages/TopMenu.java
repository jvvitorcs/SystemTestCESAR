package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

public class TopMenu {

    private By containerMenu = By.cssSelector(".supernav_container");
    private By communityButton = By.cssSelector(".supernav_container > a:nth-child(3)");
    private By communitySubmenu = By.cssSelector(".supernav_container .supernav_content");
    private By marketButton = By.cssSelector(".supernav_container .supernav_content a:nth-child(4)");

    /*
     Representação
     */

    private WebDriver driver;
    private WebDriverWait wait;

    public TopMenu(){
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    public void MarketButtonClick(){
        Actions actions = new Actions(driver);
        WebElement CommunityButton = driver.findElement(communityButton);
        actions.moveToElement(CommunityButton).build().perform();
        WebElement MarketButton = wait.until(ExpectedConditions.elementToBeClickable(marketButton));
        MarketButton.click();
    }




}