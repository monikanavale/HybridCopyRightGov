package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass{

	public static void sendKeys(WebElement wb,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		waitwb.sendKeys(value);
	
	}
	
	public static void click(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOf(wb)).click();
		
	
	}
	
	public static void clear(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOf(wb)).clear();;
		
	
	}
	
	
	public static String getText(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	return wait.until(ExpectedConditions.visibilityOf(wb)).getText();
		
	
	}
	

	public static String getAttribute(WebElement wb, String keyName)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	return wait.until(ExpectedConditions.visibilityOf(wb)).getAttribute(keyName);
		
	}
	
	

	public static boolean isSelected(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	return wait.until(ExpectedConditions.visibilityOf(wb)).isSelected();
		
	}
	
	
	
	
	
	
	
	
	
}