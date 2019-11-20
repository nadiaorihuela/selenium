package Paginas;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import Utilidades.Excel;
import Utilidades.Generales;
import Utilidades.Utilidades;

public class Pantallas {
	

	protected static WebDriver d;
	public  static String [][]  elementosLogin;
	public  static String [][]  elementosPrincipal;




public static String[][] cargaLogin() {
		elementosLogin = Excel.levantarDatos("Login", "Xpath");
	return elementosLogin;	
	    }

public static String[][] cargaPrincipal() {
	elementosPrincipal = Excel.levantarDatos("Principal", "Xpath");
return elementosPrincipal;	
    }

}
