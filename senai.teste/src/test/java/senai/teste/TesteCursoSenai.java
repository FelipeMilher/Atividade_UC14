package senai.teste;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCursoSenai {
	
private WebDriver driver;
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chormedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegabilidade () {
		
		driver.get("https://informatica.sp.senai.br/");
		
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Software");
		
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}

}
