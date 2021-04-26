#language: en

@ts2021 @Comunidade @FavoritarCaptura
Feature: Favoritar Captura de Tela da Comunidade
  Como usuário do aplicativo
  Quando eu clicar do Botão da Comunidade
  E quando clicar em Capturas de Tela
  Quero que a imagem expanda
  E quando eu clicar no link da imagem
  Quero ser redirecionado para a página da imagem
  Para que eu possa favoritar

  Background:
    Given o usuário está logado na aplicação

  @automated @Screenshot @Favorite
  Scenario: Favoritar captura de tela da comunidade
    Given o cliente clica no botão Comunidade no Menu do Topo
    When o usuário clicar em Captura de Tela
    And selecionar alguma imagem
    And O usuário clicar no link da imagem
    And O usuário clicar no botão +favoritos
    Then a captura é adicionada aos favoritos!"