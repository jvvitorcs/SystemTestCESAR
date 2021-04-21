package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import system.helpers.DriverManager;
import system.pages.CommunityPage;
import system.pages.MainPage;
import system.pages.TopMenu;

public class PremiarCapturaDeTela {

    MainPage mainPage = new MainPage();
    TopMenu topMenu = new TopMenu();
    CommunityPage comunnityPage = new CommunityPage();

    @Before
    public void Start(){ mainPage.acessarPagina(); }

    @Given("o cliente clica no botão Comunidade no Menu do Topo")
    public void CommunityButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("o usuário clicar em Captura de Tela")
    public void ScreenshotClick() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("selecionar alguma imagem")
    public void SelectImage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("A imagem abrir na tela")
    public void CheckOpenImage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("O usuário clicar no botão premiar")
    public void PremiarClick() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After
    public void End() {
        mainPage.Finalizar();
    }
}
