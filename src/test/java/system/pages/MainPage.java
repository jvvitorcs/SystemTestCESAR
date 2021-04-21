package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import system.helpers.DriverManager;
import static system.pages.URL.MAIN_PAGE;

public class MainPage {

    /*
     Representação
     */
    private WebDriver driver;

    /*
     Serviços
     */
    public MainPage() {
        driver = DriverManager.getDriver();
    }

    public void acessarPagina(){
        driver.get(MAIN_PAGE);
        //driver.manage().window().fullscreen();
    }

    public void Finalizar() {
        DriverManager.endSession();
    }


}
