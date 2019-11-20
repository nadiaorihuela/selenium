package Paginas;

import java.util.Map;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Datos.cargaDatos;
import Utilidades.Excel;
import Utilidades.Generales;
import Utilidades.Utilidades;

public class PantallaLogin extends Pantallas {


	protected static WebDriver d;
	Utilidades util;
	
	public  static String [][]  elementos=Pantallas.cargaLogin();
		
	public static void test() throws Exception{
		
		System.out.println(elementos[1][1] +"\n"+ elementos[2][1]+"\n"+elementos[3][1]);
		Utilidades.reconocerXpath(elementos[1][1]);
		Utilidades.reconocerXpath(elementos[2][1]);
		Utilidades.reconocerXpath(elementos[3][1]);
		
		/*WebElement user= d.findElement(By.xpath(elementos[1][1]));
		WebElement pass= d.findElement(By.xpath(elementos[2][1]));
		WebElement btnIngresar= d.findElement(By.xpath(elementos[3][1]));
		
		user.sendKeys("emergencia.argentina@enelcare.uat");
		pass.sendKeys("Deloitte2019");
		btnIngresar.click();
		*/
		//Utilidades.sendKeysXpath(elementos[1][1],"emergencia.argentina@enelcare.uat");
		Utilidades.sendKeysXpath(elementos[1][1],cargaDatos.getUserLogin());
		Utilidades.sendKeysXpath(elementos[2][1],cargaDatos.getPassLogin());
		Utilidades.clickXpath(elementos[3][1]);
	}
	

}
    
  
	
	
