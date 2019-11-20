package Utilidades;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Utilidades{

	private static Actions actions;
	protected static WebDriver d;
		
	public Utilidades(WebDriver driver) {
		d = driver;
		actions = new Actions(d);
	}
	
	public static void reconocerXpath(String xpath) throws Exception {
		try {
			new WebDriverWait(d, 50).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		} catch (Exception e)  {
			System.out.println(e.getMessage());
			throw new Exception(e);
			
		}
		
	}
	
	public static void reconocerName(String name) {	
		new WebDriverWait(d, 10).until(ExpectedConditions.presenceOfElementLocated(By.name(name)));
	}
	public static void reconocerId(String id) {	
		new WebDriverWait(d, 10).until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	}
	public static void reconocerClassName(String className) {	
		new WebDriverWait(d, 10).until(ExpectedConditions.presenceOfElementLocated(By.className(className)));
	}
	public static void reconocerLinkText(String linkText) {
		new WebDriverWait(d, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
	}
	public static void reconocerPartialLinkText(String partialLinkText) {
		new WebDriverWait(d, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(partialLinkText)));
	}
	

	public static  void reconocerRapXpath(String xpath) {	
		new WebDriverWait(d, 5).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}
	public static  void reconocerRapName(String name) {	
		new WebDriverWait(d, 2).until(ExpectedConditions.presenceOfElementLocated(By.name(name)));
	}
	public static  void reconocerRapId(String id) {	
		new WebDriverWait(d, 2).until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	}
	public static  void reconocerRapClassName(String className) {	
		new WebDriverWait(d, 2).until(ExpectedConditions.presenceOfElementLocated(By.className(className)));
	}
	public static void reconocerRapLinkText(String linkText) {
		new WebDriverWait(d, 2).until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText)));
	}
	public static void reconocerRapPartialLinkText(String partialLinkText) {
		new WebDriverWait(d, 2).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(partialLinkText)));
	}
	
	
	public static void clickXpath(String xpath) throws Exception {
		d.findElement(By.xpath(xpath)).click();
	}
	public static void clickName(String name) {
		reconocerName(name);
		d.findElement(By.name(name)).click();
	}
	public static void clickId(String id) {
		reconocerId(id);
		d.findElement(By.id(id)).click();
	}
	public static void clickClassName(String className) {
		reconocerClassName(className);
		d.findElement(By.className(className)).click();
	}	
	public static void clickLinkText(String linkText) {
		reconocerLinkText(linkText);
		d.findElement(By.linkText(linkText)).click();
	}
	public static void clickPartialLinkText(String partialLinkText) {
		reconocerPartialLinkText(partialLinkText);
		d.findElement(By.partialLinkText(partialLinkText)).click();
	}
	
	
	public static void sendKeysXpath(String xpath, String keys) throws InterruptedException {
		d.findElement(By.xpath(xpath)).sendKeys(keys);; 

	}
	
	public static void sendKeysENTER(String xpath) throws InterruptedException {
		d.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);

	}

	public static void sendKeysName(String name, String keys) {
		reconocerRapName(name);
		WebElement element = d.findElement(By.name(name)); 
		element.sendKeys(keys);  		
	}
	public static void sendKeysId(String id, String keys) {
		reconocerRapId(id);
		WebElement element = d.findElement(By.id(id)); 
		element.sendKeys(keys);  		
	}
	public static void sendKeysClassName(String className, String keys) {
		reconocerRapClassName(className);
		WebElement element = d.findElement(By.className(className)); 
		element.sendKeys(keys);  		
	}
	public static void sendKeysLinkText(String linkText, String keys) {
		reconocerRapLinkText(linkText);
		WebElement element = d.findElement(By.linkText(linkText)); 
		element.sendKeys(keys);  		
	}
	public static void sendKeysPartialLinkText(String partialLinkText, String keys) {
		reconocerRapPartialLinkText(partialLinkText);
		WebElement element = d.findElement(By.partialLinkText(partialLinkText)); 
		element.sendKeys(keys);  		
	}
	
	
	public static String tomarTextoXpath(String xpath) {
		reconocerRapXpath(xpath);
		return d.findElement(By.xpath(xpath)).getText();
	}
	public static String tomarTextoName(String name) {
		reconocerRapName(name);
		return d.findElement(By.name(name)).getText();
	}
	public static String tomarTextoId(String id) {
		reconocerRapId(id);
		return d.findElement(By.id(id)).getText();
	}
	public static String tomarTextoClassName(String className) {
		reconocerRapClassName(className);
		return d.findElement(By.className(className)).getText();
	}
	public static String tomarTextoLinkText(String linkText) {
		reconocerRapLinkText(linkText);
		return d.findElement(By.linkText(linkText)).getText();
	}
	public static String tomarTextoPartialLinkText(String partialLinkText) {
		reconocerRapPartialLinkText(partialLinkText);
		return d.findElement(By.partialLinkText(partialLinkText)).getText();
	}

	public static void submitXpath(String xpath) {
		d.findElement(By.xpath(xpath)).submit();
	}
	public static boolean disableXpath(String xpath) {
		return d.findElement(By.xpath(xpath)).isDisplayed();
	}
	public static void submitName(String name) {
		d.findElement(By.name(name)).submit();
	}
	public static void submitId(String id) {
		d.findElement(By.id(id)).submit();
	}
	public static void submitClassName(String className) {
		d.findElement(By.className(className)).submit();
	}
	public static void submitLinkText(String linkText) {
		d.findElement(By.linkText(linkText)).submit();
	}
	public static void submitPartialLinkText(String partialLinkText) {
		d.findElement(By.partialLinkText(partialLinkText)).submit();
	}
	
	public static void swipeToXpath(String xpath) {
		WebElement element = d.findElement(By.xpath(xpath));
		actions.moveToElement(element);
		actions.perform();
	}
	public static void swipeToName(String name) {
		WebElement element = d.findElement(By.name(name));
		actions.moveToElement(element);
		actions.perform();
	}public static void swipeToId(String id) {
		WebElement element = d.findElement(By.id(id));
		actions.moveToElement(element);
		actions.perform();
	}
	public static void swipeToClassName(String className) {
		WebElement element = d.findElement(By.className(className));
		actions.moveToElement(element);
		actions.perform();
	}
	public static void swipeToLinkText(String linkText) {
		WebElement element = d.findElement(By.linkText(linkText));
		actions.moveToElement(element);
		actions.perform();
	}
	public static void swipeToPartialLinkText(String partialLinkText) {
		WebElement element = d.findElement(By.partialLinkText(partialLinkText));
		actions.moveToElement(element);
		actions.perform();
	}
	
	public static void clearId(String id) {
		 d.findElement(By.id(id)).clear();
	}
	
	public static void F5(String id) {
		 d.navigate().refresh();
	}
	
	public static void esperarSeg(double n) {
		try {
			Thread.sleep((long) (n*1000));
		}catch(Exception e) {}
	}
	
	public static void puntero(String xpath) throws AWTException
	{
		Robot r = new Robot();
	
		Point pointer;
		
		 pointer = d.findElement(By.xpath(xpath)).getLocation();
        r.mouseMove((pointer.getX()*2)+400,(pointer.getY()+120)+100);
		  r.mouseMove(pointer.getX(),pointer.getY()+120);
	}

}
