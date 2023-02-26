package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	public  By elementocpf = By
			.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div/input");
	public By avancar = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/form/div[2]/button/span[1]");

	public By cadastroNome = By
			.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div/div/input");

	public By cadastroTelefone = By
			.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div[2]/div/input");
	public By cadastroEmail = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/form/div[2]/div/div/input");

	public By avancar2 = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/form/div[3]/button[2]/span[1]");

	public By senha = By.xpath("//input[@name= 'password']");
	
	public By confirmacaoSenha = By.xpath("//input[@name= 'confirmPassword']");

	public By chekBox = By.xpath(
			"//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/form/div[1]/div/div[4]/div/label/span[1]/span[1]/input");
	public By criarconta = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[2]/div/form/div[2]/button[2]/span[1]");

}
