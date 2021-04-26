package system.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //notUsed
    private By cartPage = By.cssSelector(".responsive_page_template_content");
    private By itemCartList = By.cssSelector(".cart_item_list");
    private By lastItemCart = By.cssSelector(".cart_item_list > div:last-child");

    //Cart Page
    private By addedMessage = By.cssSelector(".cart_status_message");
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

    public void TakeSnapShot() throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File("c:\\tmp\\Cart.png"));
    }

    public void TakeSnapShot2() throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File("c:\\tmp\\Cart2.png"));
    }
}
