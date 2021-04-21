package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;


public class GamePage {

    //Game Page
    private By gamePage = By.cssSelector(".page_content_ctn");
    private By purchaseArea = By.id("#game_area_purchase");
    private By btnAddCart = By.cssSelector("#game_area_purchase .btn_green_steamui");

    /*
     Representação
     */

    private WebDriver driver;
    private WebDriverWait wait;

    public GamePage() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }


    public void AddToCart(){
        WebElement BtnAddCart = wait.until(ExpectedConditions.elementToBeClickable(btnAddCart));
        BtnAddCart.click();
    }


}
