package com.crm.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//input[@type='email' and @id='email']")
	 WebElement Username;
	
	@FindBy(xpath="//input[@type='password' and @id='pass']")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement Loginbtn;
	
	public HomePage Login(String uname, String pwd) {
		Username.sendKeys(uname);
		Password.sendKeys(pwd);
		Loginbtn.click();
		return new HomePage();
	}
	
	public LoginPage() throws FileNotFoundException {
	
		PageFactory.initElements(driver, this);
	}


	
	
	

}
