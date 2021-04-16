#language: en

@ts2020 @JogoEmBreve @OutroSite
Feature: Entrar no site de um dos jogos listado no "Em Breve"
  Como usuário do aplicativo
  Quando eu entrar na opção "Em breve"
  Quero selecionar algum jogo do slider horizontal
  Dentro da página no jogo, quero clicar no botão do site oficial
  Para que eu possa ser direcionado para o site

  @automated @AcessarSite
  Scenario: Acessar o Site Oficial do Jogo
    Given o cliente clica no Botão Em Breve no menu lateral
    When seleciona o jogo no slider horizontal
    When o usuário clicar no botão do Site Oficial
    And surgir a mensagem alertando a mudança de site
    And o usuário clicar em Continuar
    Then ele é encaminhado para o site!"