package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

public class CommunityPage {

    private By communityTab = By.cssSelector(".apphub_sectionTabs.responsive_hidden");
    private By screenCaptureButton = By.cssSelector(".apphub_sectionTabs.responsive_hidden a:nth-child(2)");
    private By imageFather = By.cssSelector(".apphub_CardContentClickable");
    private By imageButton = By.cssSelector(".apphub_CardContentClickable .apphub_CardContentPreviewImage");
    private By rightMenuImage = By.cssSelector("#modalMediaRightScroll");
    private By premiarButton = By.cssSelector("#modalMediaRightScroll span:nth-child(1)");

    /*
     Representação
     */

    private WebDriver driver;
    private WebDriverWait wait;

    public CommunityPage() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }
}
