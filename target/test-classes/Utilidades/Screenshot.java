package Utilidades;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot extends Generales{

	public Screenshot(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

/*	public static void captureScreenshot(String direccion, String nombreScreen) {
		
		try {
			File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(scrFile, new File(direccion + "\\" + Casuistica.fecha + "\\" + Casuistica.hora + "\\" + nombreScreen + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error al querer hacer el Screenshot");
		}
	
	}
	*/
}
