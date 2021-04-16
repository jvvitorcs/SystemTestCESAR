package system.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;
import static org.junit.jupiter.api.Assertions.*;

public class StoreNav {

    /*
     Representação
     */

    private WebDriver driver;
    private WebDriverWait wait;

    // Store Nav Menu
    private By storeNavMenu = By.cssSelector(".store_nav");
    private By storePointButton = By.cssSelector(".store_nav > a:nth-child(5)");
    private By newsButton = By.cssSelector(".store_nav > a:nth-child(6)");
    private By labButton = By.cssSelector(".store_nav .tab:nth-child(7)");
    private By searchBoxInput = By.id("store_nav_search_term");
    private By firstItemList = By.cssSelector(".match");
    private By newAreaButton = By.cssSelector(".left-column > div:nth-child(2)");


    //Game Page
    private By gamePage = By.cssSelector(".page_content_ctn");
    private By purchaseArea = By.id("#game_area_purchase");
    private By btnAddCart = By.cssSelector("#game_area_purchase .btn_green_steamui");

    //Cart Page
    private  By cartPage = By.cssSelector(".responsive_page_template_content");
    private  By addedMessage = By.cssSelector(".cart_status_message");
    private By itemCartList = By.cssSelector(".cart_item_list");
    private By lastItemCart = By.cssSelector(".cart_item_list > div:last-child");
    private By btnRemoveGame = By.cssSelector(".cart_item_list > div:last-child .remove_link");
    private By cartValue = By.cssSelector(".checkout_content.cart #cart_estimated_total");



    public StoreNav() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    /*public void Lab(){
        WebElement LabButton = driver.findElement(labButton);
        LabButton.click();
        WebElement NewAreaButton = wait.until(ExpectedConditions.elementToBeClickable(newAreaButton));
        NewAreaButton.click();
    }*/

    public void SearchGame(String texto){
        driver.findElement(searchBoxInput).sendKeys(texto);

    }

    public void SelectGame(){
        WebElement FirstItemList = wait.until(ExpectedConditions.elementToBeClickable(firstItemList));
        FirstItemList.click();
    }

    public void AddToCart(){
        WebElement BtnAddCart = wait.until(ExpectedConditions.elementToBeClickable(btnAddCart));
        BtnAddCart.click();
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


    //clase: .labs-content filho: .left-column segundo filho: .capsule botão: .experiment-button
}
