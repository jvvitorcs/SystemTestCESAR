#language: en

@ts2021 @ComprarJogos @Carrinho
Feature: Procurar jogos e colocar no carrinho
  Como usuário do aplicativo
  Quando eu pesquisar na caixa de pesquisa
  Quero encontrar algum(s) jogo(s) específico(s)
  Para que eu possa colocar no carrinho de compras
  E também quero retirar do carrinho o(s) produto(s) que eu desejar

  @automated @AdicionarJogo
  Scenario: Adicionar jogos no carrinho
    Given o cliente busca um jogo na pesquisa
    And seleciona o jogo
    When o usuário clicar para adicionar o jogo ao carrinho
    Then a lista de jogos no carrinho é atualizada!"

  @automated @RemoverJogo
  Scenario: Remover jogos no carrinho
    Given o cliente busca um jogo na pesquisa
    And seleciona o jogo
    When o usuário clicar para adicionar o jogo ao carrinho
    Then a lista de jogos no carrinho é atualizada!"
    When o usuário clicar para remover o(s) jogo(s)
    Then a lista de jogos no carrinho fica vazia!"