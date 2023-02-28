package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void enter(By elemento) {
		driver.findElement(elemento).click();

	}

	public void evidencias(String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void abrirNavegador() {
		String url = "https://app2.licitardigital.com.br/cadastro/";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	public void fexarNavegador() {
		driver.quit();
	}

	public void esperar() throws InterruptedException {
		Thread.sleep(3000);
	}

	@SuppressWarnings("deprecation")
	public void valicao(By elemento, String texto) {
		Assert.assertEquals(elemento, texto);

	}
}
