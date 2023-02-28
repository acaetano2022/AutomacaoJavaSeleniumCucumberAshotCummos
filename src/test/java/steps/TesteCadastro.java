package steps;

import drivers.Drivers;
import elementos.ElementosWeb;
import formularios.FormulariosNomes;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import metodos.Metodos;

public class TesteCadastro extends Drivers {
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

	@Entao("valido a conta criada com sucesso")
	public void valido_a_conta_criada_com_sucesso() throws InterruptedException {
		metodos.esperar();
		metodos.evidencias("CT01");

	}

	@Quando("preencho um cpf invalido")
	public void preencho_um_cpf_invalido() throws InterruptedException {
		metodos.esperar();
		metodos.clicar(elementos.elementocpf);
		metodos.escrever(elementos.elementocpf, "000.000.000.00");
		metodos.clicar(elementos.avancar);

	}

	@Entao("valido msg erro")
	public void valido_msg_erro() {
		metodos.evidencias("CT02");
	}

	@Quando("preencho um cpf ja cadastrado")
	public void preencho_um_cpf_ja_cadastrado() throws InterruptedException {
		metodos.esperar();
		metodos.clicar(elementos.elementocpf);
		metodos.escrever(elementos.elementocpf, "379.604.210-48");
		metodos.clicar(elementos.avancar);
		metodos.evidencias("CT03");
	}

}