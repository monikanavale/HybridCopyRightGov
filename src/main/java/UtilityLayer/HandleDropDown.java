package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{

	public static void selectByVisibleText(WebElement wb,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement wd1 = wait.until(ExpectedConditions.visibilityOf(wb));
	Select sel = new Select(wd1);
	sel.selectByVisibleText(value);
	
	}
	
	public static void selectByValue(WebElement wb,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement wd1 = wait.until(ExpectedConditions.visibilityOf(wb));
	Select sel = new Select(wd1);
	sel.selectByValue(value);
	
	
	}
	
	
	public static void selectByIndex(WebElement wb,int index)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement wd1 = wait.until(ExpectedConditions.visibilityOf(wb));
	Select sel = new Select(wd1);
	sel.selectByIndex(index);
	
	
	}
	

	public static void getOptions(WebElement wb, String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement wd1 = wait.until(ExpectedConditions.visibilityOf(wb));
	Select sel = new Select(wd1);
	List<WebElement> ls = sel.getOptions();
	for(WebElement a:ls)
	  {
		if(a.getText().equalsIgnoreCase(value))
		 {
			a.click();
			break;
		}
		 
	   }
	
	}
	
	public static int size(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement wd1 = wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel = new Select(wd1);
		List<WebElement> ls = sel.getOptions();
			int i = ls.size();
	      return i;
	}
	
	public static String getFirstSelectedOption(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement wd1 = wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel = new Select(wd1);
		WebElement wd = sel.getFirstSelectedOption();
		String a1 = wd.getText();
		return a1;
	}
	
	
}
