package Utilidades;

import org.openqa.selenium.WebDriver;

public class Generales {

	protected static WebDriver d;
	
	public Generales (WebDriver driver) {
		Generales.d=driver;
	}
}
