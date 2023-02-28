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
    Entao valido a conta criada com sucesso
    
    @CT02
  Cenario: Validar erro cpf invalido
    Dado que esteja no site de cadastro de usuario
    Quando preencho um cpf invalido
    E clico em avancar
    Entao valido msg erro 
    
     @CT03
  Cenario: Validar erro cpf já cadastrado
    Dado que esteja no site de cadastro de usuario
    Quando preencho um cpf ja cadastrado
    E clico em avancar
    Entao valido msg erro 
    
    
     
    
    
    