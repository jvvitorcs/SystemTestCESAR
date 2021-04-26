package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import system.pages.CommunityPage;
import system.pages.MainPage;
import system.pages.TopMenu;

public class FavoritarCapturaDeTela {

    MainPage mainPage = new MainPage();
    TopMenu topMenu = new TopMenu();
    CommunityPage communityPage = new CommunityPage();

    @Before
    public void Start(){ mainPage.acessarPagina(); }
//
    @Given("o usuário está logado na aplicação")
    public void LoginApplication() {
        mainPage.loginConta();
    }
    @Given("o cliente clica no botão Comunidade no Menu do Topo")
    public void CommunityButton() throws InterruptedException {
        Thread.sleep(8000);
        topMenu.CommunityButtonClick();
    }
    @When("o usuário clicar em Captura de Tela")
    public void ScreenshotClick() {
        communityPage.ScreenShotClick();
    }
    @When("selecionar alguma imagem")
    public void SelectImage() throws InterruptedException {
        Thread.sleep(8000);
        communityPage.SelectImage();
    }

    @When("O usuário clicar no link da imagem")
    public void LinkClick() {
        communityPage.LinkClick();
    }
    @When("O usuário clicar no botão +favoritos")
    public void FavoriteButton() throws InterruptedException {
        Thread.sleep(5000);
        communityPage.FavoriteClick();
    }
    @Then("a captura é adicionada aos favoritos!\"")
    public void CheckFavorite() throws Exception {
        Thread.sleep(8000);
        communityPage.TextFavoriteCheck();
        communityPage.TakeSnapShot();
    }

    @After
    public void End() {
        mainPage.Finalizar();
    }


}
