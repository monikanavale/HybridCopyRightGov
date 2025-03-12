package UtilityLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class Action extends BaseClass{
public static Actions act;

	public static void rightClick() {
		
		WebElement wb= driver.findElement(By.name(""));
		 act = new Actions(driver);
		
		act.contextClick(wb).build().perform();
		
	}
	
	public static void click()
	{
		WebElement wb1= driver.findElement(By.name(""));
		 act = new Actions(driver);
		
		act.contextClick(wb1).build().perform();;
	}
}
