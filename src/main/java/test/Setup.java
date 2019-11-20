package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Datos.cargaDatos;
import Paginas.Pantallas;
import Utilidades.Generales;
import Utilidades.Utilidades;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {

	
	static WebDriver d;
	
	//Pantallas pantallas=new Pantallas();
	//PantallaLogin pantalla=new PantallaLogin();
	public  static String [][]  elementos=Pantallas.cargaLogin();
	//@Test
    public void openURL() throws Exception
    {
    	
    	
		cargaDatos.CargarParametrosDeEjecucion();
		System.out.println(cargaDatos.getUrl());
		//ChromeDriverManager.getInstance(CHROME).setup(); 

		System.setProperty("webdriver.chromedriver.driver",cargaDatos.getPathDriver());
    	d = new ChromeDriver();
    	d.manage().window().maximize();
    	d.get(cargaDatos.getUrl());
    	
    	new Utilidades(d);
		new Generales(d);
		
		
		//Pantallas.carga();
		
		
		//PantallaLogin.test();
    }
public static void Cerrar() {
	d.close();
	
}

}
