package system.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommunityPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //notUsed
    private By communityTab = By.cssSelector(".apphub_sectionTabs.responsive_hidden");
    private By imageFather = By.cssSelector(".apphub_CardContentClickable");
    private By rightMenuImage = By.cssSelector("#modalMediaRightScroll");

    //community Page
    private By screenShotButton = By.cssSelector(".apphub_sectionTabs.responsive_hidden a:nth-child(2)");
    private By imageButton = By.cssSelector(".apphub_CardContentTypeContainer");
    private By linkButton = By.cssSelector("#modalContentTitleBarImageLink");
    private By favoriteButtonNonClicked = By.cssSelector(".general_btn.favorite .favoriteOption.addfavorite.selected");
    private By favoriteButtonClicked = By.cssSelector(".toggled .favoriteOption.favorited.selected");
    private By favoriteText = By.cssSelector(".just_added_text");

    public CommunityPage() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }

    public void ScreenShotClick(){
        WebElement ScreenShotButton = wait.until(ExpectedConditions.elementToBeClickable(screenShotButton));
        ScreenShotButton.click();
    }

    public void SelectImage(){
        WebElement ImageButton = wait.until(ExpectedConditions.elementToBeClickable(imageButton));
        ImageButton.click();
    }

    public void LinkClick(){
        WebElement LinkButton = wait.until(ExpectedConditions.elementToBeClickable(linkButton));
        LinkButton.click();

    }
    public void FavoriteClick(){
            String currentwindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            Iterator<String> i = allWindows.iterator();
            while (i.hasNext()) {
                String childwindow = i.next();
                if (!childwindow.equalsIgnoreCase(currentwindow)) {

                    driver.switchTo().window(childwindow);

                    try {
                        WebElement FavoriteButtonClicked = wait.until(ExpectedConditions.elementToBeClickable(favoriteButtonClicked));
                        FavoriteButtonClicked.click();
                    } catch (Exception e) {
                        System.out.println("Não estava favoritado");
                    }
                    WebElement FavoriteButtonNonClicked = wait.until(ExpectedConditions.elementToBeClickable(favoriteButtonNonClicked));
                    FavoriteButtonNonClicked.click();
                }
            }
        }

    public void TextFavoriteCheck(){
        WebElement FavoriteText = wait.until(ExpectedConditions.presenceOfElementLocated(favoriteText));
        assertEquals("Este item foi adicionado aos seus Favoritos.", FavoriteText.getText(),"OK");
    }

    public void TakeSnapShot() throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File("c:\\tmp\\FavoriteScreenshot.png"));
    }
}