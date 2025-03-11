package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class RegisterNewUserPage extends BaseClass{

	@FindBy(name="ctl00$ContentPlaceHolder1$ddlTitle")
	private WebElement title;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtFName")
	private WebElement fname;
	
	@FindBy(name="cctl00$ContentPlaceHolder1$txtLName")
	private WebElement lname;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtAddress")
	private WebElement add1;
	

	@FindBy(name="ctl00$ContentPlaceHolder1$txtAddress2")
	private WebElement add2;
	

	@FindBy(name="ctl00$ContentPlaceHolder1$txtCity")
	private WebElement city;
	

	@FindBy(name="ctl00$ContentPlaceHolder1$ddlCountry")
	private WebElement country;  //dropdown
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlState")
	private WebElement state; 
	
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtNationality")
	private WebElement nationality; 
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPinCode")
	private WebElement pincode; 
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtEmail")
	private WebElement email; 
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPhoneNumber")
	private WebElement phoneNo; 
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtMobileNum")
	private WebElement mobileNo; 
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlQuestions")
	private WebElement ques; 
	

	@FindBy(name="ctl00$ContentPlaceHolder1$ddlQuestions")
	private WebElement ans; 
	
	
	@FindBy(name="ctl00_ContentPlaceHolder1_rdoGeneral")
	private WebElement radioButton; 
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtUserId")
	private WebElement uname; 
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPassword")
	private WebElement pass; 
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtConfirmPwd")
	private WebElement cpass; 
	
	
	public RegisterNewUserPage() {
		PageFactory.initElements(driver, this);
	}
	
	// create method
	
	public void registerNewUserFuctionality(String Title, String Fname, String Lname, String Add1, String Add2, String City, String Country
			,String State, String Nationality, String Pincode, String Email, String PhoneNo, String MobilaNo,String Question, String Answer,
			String UserId, String Pass, String Cpass)
	{
		HandleDropDown.selectByVisibleText(title, Title);
		Wait.sendKeys(fname, Fname);
		Wait.sendKeys(lname, Lname);
		Wait.sendKeys(add1, Add1);
		Wait.sendKeys(add2, Add2);
		Wait.sendKeys(city, City);
		HandleDropDown.selectByVisibleText(country, Country);
		HandleDropDown.selectByVisibleText(state, State);
		Wait.sendKeys(nationality, Nationality);
		Wait.sendKeys(pincode, Pincode);
		Wait.sendKeys(email, Email);
		Wait.sendKeys(phoneNo, PhoneNo);
		Wait.sendKeys(mobileNo, MobilaNo);
		HandleDropDown.selectByVisibleText(ques, Question);
		Wait.sendKeys(ans, Answer);
		Wait.sendKeys(uname, UserId);
		Wait.sendKeys(pass, Pass);
		Wait.sendKeys(cpass, Cpass);
	
	}
	
	
}
