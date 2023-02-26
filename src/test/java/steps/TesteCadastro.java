package steps;

import elementos.ElementosWeb;
import formularios.FormulariosNomes;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import metodos.Metodos;

public class TesteCadastro {
	Metodos metodos = new Metodos();
	ElementosWeb elementos = new ElementosWeb();
	FormulariosNomes formulario = new FormulariosNomes();

	@Before
	public void iniciarTeste() {
		metodos.abrirNavegador();
	}

	@After
	public void finalizarTeste() {
		 metodos.fexarNavegador();
	}

	@Dado("que esteja no site de cadastro de usuario")
	public void que_esteja_no_site_de_cadastro_de_usuario() {

	}

	@Quando("preencho um cpf valido")
	public void preencho_um_cpf_valido() throws InterruptedException {
		metodos.esperar();
		metodos.clicar(elementos.elementocpf);
		metodos.escrever(elementos.elementocpf, formulario.numeroCPF());
	}

	@Quando("clico em avancar")
	public void clico_em_avancar() throws InterruptedException {
		metodos.esperar();
		metodos.clicar(elementos.avancar);
	}

	@Quando("preencho nome")
	public void preencho_nome() throws InterruptedException {
		metodos.esperar();
		metodos.escrever(elementos.cadastroNome, formulario.nome());
	}

	@Quando("preencho telefone")
	public void preencho_telefone() throws InterruptedException {
		metodos.esperar();
		metodos.clicar(elementos.cadastroTelefone);
		metodos.escrever(elementos.cadastroTelefone, formulario.telefone());
	}

	@Quando("preencho email")
	public void preencho_email() throws InterruptedException {
		metodos.esperar();
		metodos.escrever(elementos.cadastroEmail, formulario.email());
		metodos.clicar(elementos.avancar2);

	}

	@Quando("cadostro uma senha")
	public void cadostro_uma_senha() throws InterruptedException {
		metodos.esperar();
		metodos.clicar(elementos.senha);
		metodos.escrever(elementos.senha, formulario.senha());

	}

	@Quando("repito a senha correta")
	public void repito_a_senha_correta() throws InterruptedException {
		metodos.esperar();
		metodos.clicar(elementos.confirmacaoSenha);
		metodos.escrever(elementos.confirmacaoSenha, formulario.confirmacaoSenha());
	}

	@Quando("clico em concordo")
	public void clico_em_concordo() throws InterruptedException {
		metodos.esperar();
		metodos.clicar(elementos.chekBox);

	}

	@Quando("clico em criar conta")
	public void clico_em_criar_conta() throws InterruptedException {
		metodos.esperar();
		metodos.clicar(elementos.criarconta);
	}

	@Entao("valido a conta crada com sucesso")
	public void valido_a_conta_crada_com_sucesso() throws InterruptedException {
		metodos.esperar();
		metodos.evidencias("CT01");
	}
}