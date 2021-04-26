package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import system.pages.MainPage;
import system.pages.MarketPage;
import system.pages.TopMenu;

public class ComprarItemMercadoStep {

    MainPage mainPage = new MainPage();
    TopMenu topMenu = new TopMenu();
    MarketPage marketPage = new MarketPage();

    @Before
    public void Start(){ mainPage.acessarPagina(); }

    @Given("o cliente clica no botão Mercado no Submenu de Comunidade")
    public void MarketButton() {
            topMenu.MarketButtonClick();
         }
    @When("o usuário clicar no Item")
    public void ItemClick() {
        marketPage.ItemClick();
    }
    @When("clicar em Comprar")
    public void BuyClick() {
        marketPage.BuyClick();
    }
    @Then("o site pede que o usuário inicie a sessão ou crie uma conta!\"")
    public void CheckStartSession() throws Exception {
        marketPage.CheckStartSession();
        marketPage.takeSnapShot();
    }

    @After
    public void End() {
        mainPage.Finalizar();
    }

}
