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

public class PantallaPrincipal extends Pantallas {


	protected static WebDriver d;
	Utilidades util;
	static String cliente="12345";
	public  static String [][]  elementos=Pantallas.cargaPrincipal();
		
	public static void test() throws Exception{
		
		for(int i = 1;i<20;i++){
		System.out.println(elementos[i][1] +"\n");
		}
		
		Utilidades.reconocerXpath(elementos[1][1]);
		Utilidades.sendKeysXpath(elementos[1][1],cliente);
		Utilidades.sendKeysENTER(elementos[1][1]);
		
				
		Utilidades.reconocerXpath(elementos[2][1]);
		Utilidades.clickXpath(elementos[2][1]);
	
		Utilidades.reconocerXpath(elementos[3][1]);
		Utilidades.sendKeysXpath(elementos[3][1],cliente);
		
		Utilidades.reconocerXpath(elementos[4][1]);
		Utilidades.clickXpath(elementos[4][1]);
		
		Utilidades.reconocerXpath(elementos[5][1]);
		Utilidades.clickXpath(elementos[5][1]);
		
		
		/*WebElement user= d.findElement(By.xpath(elementos[1][1]));
		WebElement pass= d.findElement(By.xpath(elementos[2][1]));
		WebElement btnIngresar= d.findElement(By.xpath(elementos[3][1]));
		
		user.sendKeys("emergencia.argentina@enelcare.uat");
		pass.sendKeys("Deloitte2019");
		btnIngresar.click();
		*/
		//Utilidades.sendKeysXpath(elementos[1][1],"emergencia.argentina@enelcare.uat");
		
	}
	

}
    
  
	
	
