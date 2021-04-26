package system;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;
import system.pages.MainPage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

//****** O Main foi usado apenas para testar funcionalidades e seletores *******//

public class Main {

    private WebDriver driver;
    private WebDriverWait wait;

    MainPage mainPage = new MainPage();


    @Test
    @Disabled
    void TesteEntrarNoSite() {
        // GIVEN
        driver = DriverManager.getDriver();
        wait = DriverManager.getDriverWait();
        //driver.get("https://steamcommunity.com/linkfilter/?url=http://dyinglightgame.com/?utm_source=Steam&amp;utm_medium=Link&amp;utm_campaign=Dying_Light_2");
        driver.get("https://store.steampowered.com/");
        //WebElement StoreNav = driver.findElement(By.cssSelector(".store_nav"));
        //WeElement SearchBoxInput = StoreNav.findElement(By.id("store_nav_search_term"));
        //WebElement buttonSoon = driver.findElement(By.cssSelector(".home_page_gutter  div:nth-child(8) > a:nth-child(3)"));

        // WHEN
        //mainPage.acessarPagina();

        // THEN
/*
        SearchBoxInput.sendKeys("GTA");
        WebElement FirstItemList = wait.until(ExpectedConditions.elementToBeClickable(By.className("match")));
        FirstItemList.click();
        WebElement GameName = driver.findElement(By.cssSelector(".apphub_HomeHeaderContent .apphub_AppName"));
        assertEquals("Grand Theft Auto V", GameName.getText(), "O Jogo está correto");
*/
        //buttonSoon.click();


        WebElement ButtonSoon = driver.findElement(By.cssSelector(".home_page_gutter  div:nth-child(8) > a:nth-child(3)"));
        ButtonSoon.click();
        WebElement SliderItem = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".store_horizontal_autoslider_ctn a")));
        SliderItem.click();
        WebElement SiteButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".block.responsive_apppage_details_left.game_details div:nth-child(2) a:nth-child(2)")));
        SiteButton.click();
        String currentwindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> i = allWindows.iterator();
        while (i.hasNext()) {
            String childwindow = i.next();
            if (!childwindow.equalsIgnoreCase(currentwindow)) {
                driver.switchTo().window(childwindow);
                WebElement WarningPanelText = driver.findElement(By.cssSelector(".warningPanel.friendlyInterstital h2"));
                assertEquals("Você está saindo de um site do Steam.", WarningPanelText.getText(), "OK!");
                WebElement ProceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#proceedButton")));
                ProceedButton.click();

            }  else {
            System.out.println("There are no children");
        }


            //WebElement WarningPanelText = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".warningPanel.friendlyInterstital h2")));
            // assertEquals("Você está saindo de um site do Steam.", WarningPanelText.getText(), "OK!");
            //WebElement ProceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#proceedButton")));
            //ProceedButton.click();

            // FINALLY
            //DriverManager.endSession();
        }
    }

    @Test
    @Disabled
    void TesteEntrarNoSite2() {
        driver = DriverManager.getDriver();
        driver.get("https://store.steampowered.com/");

        mainPage.loginConta();
    }
    //****** O Main foi usado apenas para testar funcionalidades e seletores *******//

}
