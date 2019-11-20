package principal;
import org.openqa.selenium.WebDriver;

import test.Setup;
import Paginas.PantallaLogin;
import Paginas.PantallaPrincipal;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class principal {

	public static void main(String[] args) throws Exception {
	/*	WebDriver driver;
 		//cargaDatos.CargarParametrosDeEjecucion();
	System.setProperty("webdriver.chromedriver.driver","./src/test/resources/Drivers");
	driver = new ChromeDriver();test/src/test/resources/Drivers
	//driver.manage().window().maximize();
	driver.get("http://localhost/testlink/testlink-1.9.19/index.php");
	//driver.get(cargaDatos.getUrl());
*/
	//	WebDriver d;
		Setup inicio = new Setup();
inicio.openURL();
PantallaLogin.test();
PantallaPrincipal.test();
	}
	}

