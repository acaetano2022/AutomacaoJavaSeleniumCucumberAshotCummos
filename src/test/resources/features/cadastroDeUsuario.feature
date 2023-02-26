# language: pt
@todos
Funcionalidade: Simular cadastro
  Eu como cliente
  Quero realizar cadastro
  Para poder licitar

  @CT01
  Cenario: simular cadastro cliente

    Dado que esteja no site de cadastro de usuario
    Quando preencho um cpf valido
    E clico em avancar
    E preencho nome
    E preencho telefone
    E preencho email
    E clico em avancar
    E cadostro uma senha
    E repito a senha correta
    E clico em concordo
    E clico em criar conta
    Entao valido a conta crada com sucesso