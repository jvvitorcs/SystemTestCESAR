#language: en

@ts2020 @Mercado @ComprarItem
Feature: Comprar Item no Mercado
  Como usuário do aplicativo
  Quando eu clicar do Botão Mecado no Submenu de Comunidade
  Quero encontrar algum item
  Para que eu possa comprar para minha conta

  @automated @ItemMercado
  Scenario: Comprar Item do mercado
    Given o cliente clica no botão Mercado no Submenu de Comunidade
    When o usuário clicar no Item
    And clicar em Comprar
    Then o site pede que o usuário inicie a sessão ou crie uma conta!"