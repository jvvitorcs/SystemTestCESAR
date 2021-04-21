#language: en

@ts2020 @Comunidade @PremiarCaptura
Feature: Premiar Captura de Tela da Comunidade
  Como usuário do aplicativo
  Quando eu clicar do Botão da Comunidade
  E quando clicar em Capturas de Tela
  Quero que a imagem expanda
  Para que eu possa premiar a captura de tela

  @automated @Screenshot
  Scenario: Premiar captura de tela da comunidade
    Given o cliente clica no botão Comunidade no Menu do Topo
    When o usuário clicar em Captura de Tela
    And selecionar alguma imagem
    And A imagem abrir na tela
    And O usuário clicar no botão premiar
    Then o site pede que o usuário inicie a sessão ou crie uma conta!"