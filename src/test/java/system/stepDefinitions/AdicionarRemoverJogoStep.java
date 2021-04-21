package system.stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import system.helpers.DriverManager;
import system.pages.CartPage;
import system.pages.GamePage;
import system.pages.MainPage;
import system.pages.StoreNav;

public class AdicionarRemoverJogoStep {

    MainPage mainPage = new MainPage();
    StoreNav storeNav = new StoreNav();
    CartPage cartpage = new CartPage();
    GamePage gamePage = new GamePage();

    @Before
    public void Start(){ mainPage.acessarPagina(); }

    @Given("o cliente busca um jogo na pesquisa")
    public void SearchGame() {
        storeNav.SearchGame("The Witcher 3");
    }
    @Given("seleciona o jogo")
    public void SelectGame() {
        storeNav.SelectGame();
    }
    @When("o usuário clicar para adicionar o jogo ao carrinho")
    public void ClickAddGame() {

        gamePage.AddToCart();
    }
    @Then("a lista de jogos no carrinho é atualizada!\"")
    public void SeeTheCart() {
        cartpage.CheckMessage();

    }
    @When("o usuário clicar para remover o\\(s) jogo\\(s)")
    public void RemoveGame() {
        cartpage.RemoveTheGame();
    }
    @Then("a lista de jogos no carrinho fica vazia!\"")
    public void EmptyCart() {

        cartpage.CheckCartValue();
    }

    @After
    public void End() {
        mainPage.Finalizar();
    }

}
