package UtilityLayer;

import org.openqa.selenium.Alert;

import BaseLayer.BaseClass;

public class HandleAlert extends BaseClass{
	public static  Alert alt;
	public static void ClickOkButtonOnAlert()
	{
		  alt = driver.switchTo().alert();
		 alt.accept();
		 
	}
	
	public static String CapturText()
	{
		return alt.getText();
	}
	
	public static void clickOnCancelButton() {
		
		alt.dismiss();
	
	}
	
	public static void sendKeys(String value)
	{
		alt.sendKeys(value);
	}

}
