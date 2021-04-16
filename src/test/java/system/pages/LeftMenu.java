package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


public class LeftMenu {

     /*
     Representação
     */

    private WebDriver driver;
    private WebDriverWait wait;

    //LeftMenu
    private By homePageGutter = By.cssSelector(".home_page_gutter");
    private By buttonSoon = By.cssSelector(".home_page_gutter  div:nth-child(8) > a:nth-child(3)");
    private By bucketList = By.cssSelector(".bucket.popularwishlist");
    private By slider = By.cssSelector(".store_horizontal_autoslider_ctn");
    private By sliderItemButton = By.cssSelector(".store_horizontal_autoslider_ctn a");
    private By gameDetails = By.cssSelector(".block.responsive_apppage_details_left.game_details");
    private By siteButton = By.cssSelector(".block.responsive_apppage_details_left.game_details div:nth-child(2) a:nth-child(2)");
    private By warningPanel = By.cssSelector(".warningPanel.friendlyInterstital");
    private By warningPanelText = By.cssSelector(".warningPanel.friendlyInterstital h2");
    private By proceedButton = By.cssSelector("#proceedButton");

    public LeftMenu() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    public void Soon(){
        WebElement ButtonSoon = driver.findElement(buttonSoon);
        ButtonSoon.click();
    }

    public void ClickItemSlider(){
        WebElement SliderItem = wait.until(ExpectedConditions.elementToBeClickable(sliderItemButton));
        SliderItem.click();
    }

    public void ClickButtonSite(){
        WebElement SiteButton = wait.until(ExpectedConditions.elementToBeClickable(siteButton));
        SiteButton.click();
    }

    public void CheckMessageWarning(){
        //WebElement WarningPanelText = driver.findElement(warningPanelText);
        WebElement WarningPanelText = wait.until(ExpectedConditions.presenceOfElementLocated(warningPanelText));
        assertEquals("Você está saindo de um site do Steam.", WarningPanelText.getText(), "OK!");
    }

    public void ClickButtonContinue() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement ProceedButton =  wait.until(ExpectedConditions.elementToBeClickable(proceedButton));
        //WebElement ProceedButton = driver.findElement(proceedButton);
        ProceedButton.click();
    }

    public void LoadSite(){

    }
}
