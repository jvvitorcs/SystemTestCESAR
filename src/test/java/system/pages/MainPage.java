package system.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

import static system.pages.URL.MAIN_PAGE;

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Login
    private By loginButton = By.cssSelector(".global_action_link");
    private By usernameField = By.cssSelector(".login_row input");
    private By passwordField = By.cssSelector("#login_form div:nth-child(2) .text_field");
    private By startSessionButton = By.cssSelector(".login_btn_ctn .btn_blue_steamui.btn_medium.login_btn");

    public MainPage() {
        driver = DriverManager.getDriver();
        wait = DriverManager.getDriverWait();
    }

    public void acessarPagina(){
        driver.get(MAIN_PAGE);
        driver.manage().window().maximize();
    }

    public void loginConta(){
        WebElement LoginButton = driver.findElement(loginButton);
        LoginButton.click();
        WebElement UsernameField = driver.findElement(usernameField);
        UsernameField.sendKeys("TesteCesar");
        WebElement PasswordField = driver.findElement(passwordField);
        PasswordField.sendKeys("testes@123");
        WebElement StartSessionButton = driver.findElement(startSessionButton);
        StartSessionButton.click();
    }

    public void Finalizar() {
        DriverManager.endSession();
    }
}
