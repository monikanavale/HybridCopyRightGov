package UtilityLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class Action extends BaseClass{

	public static void rightClick() {
		
		WebElement wb= driver.findElement(By.name(""));
		Actions act = new Actions(driver);
		
		act.contextClick();
		
	}
}
