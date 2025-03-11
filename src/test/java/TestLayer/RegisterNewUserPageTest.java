package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RegisterNewUserPage;

public class RegisterNewUserPageTest extends BaseClass{

	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateNewUserFunctionality() {
		RegisterNewUserPage registerNewUserPage = new RegisterNewUserPage();
		registerNewUserPage.registerNewUserFuctionality(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
	
	
	
	
	
	
	
}
