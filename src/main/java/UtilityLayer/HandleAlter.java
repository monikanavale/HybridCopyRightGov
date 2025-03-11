package UtilityLayer;

import org.openqa.selenium.Alert;

import BaseLayer.BaseClass;

public class HandleAlter extends BaseClass{
	public static void ClickOkButtonOnAlert()
	{
		 Alert alt = driver.switchTo().alert();
		 alt.accept();
		 
	}
	
	

}
