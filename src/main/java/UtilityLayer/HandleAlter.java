package UtilityLayer;

import org.openqa.selenium.Alert;

import BaseLayer.BaseClass;

public class HandleAlter extends BaseClass{
	public static  Alert alt;
	public static void ClickOkButtonOnAlert()
	{
		 Alert alt = driver.switchTo().alert();
		 alt.accept();
		 
	}
	
	public static String CapturText()
	{
		return alt.getText();
	}
	
	
	
	

}
