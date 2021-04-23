package system.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import system.pages.LeftMenu;
import system.pages.MainPage;

public class AcessarSiteEmBreveStep {

    MainPage mainPage = new MainPage();
    LeftMenu leftMenu = new LeftMenu();

    @Before
    public void Start(){ mainPage.acessarPagina(); }

    @Given("o cliente clica no Botão Em Breve no menu lateral")
    public void ButtonSoonClick() {
        leftMenu.Soon();
    }
    @When("seleciona o jogo no slider horizontal")
    public void SelectGameOnSlider() {
        leftMenu.ClickItemSlider();
    }
    @When("o usuário clicar no botão do Site Oficial")
    public void OficialSiteButtonClick() {
        leftMenu.ClickButtonSite();
    }
    @When("surgir a mensagem alertando a mudança de site")
    public void AlertMessage() {
        leftMenu.CheckMessageWarning();
    }

    @When("o usuário clicar em Continuar")
    public void ContinueButton() {
        leftMenu.ClickButtonContinue();
    }
    @Then("ele é encaminhado para o site!\"")
    public void OficialSite() throws Exception {
        leftMenu.takeSnapShot();
        System.out.println("O site Carregou");
    }
}
