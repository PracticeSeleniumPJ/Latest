package com.crm.qa.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtility;

public class LoginTest extends TestBase{

	public LoginPage LP=new LoginPage();
	public HomePage homepage;
	public WebDriver driver;
	public LoginTest() throws FileNotFoundException  {
		super();
	}

	@BeforeTest
	public void setUp() throws FileNotFoundException {
			initialization();
		
		
	}
	
	@DataProvider
	public Object[][] getLoginData() {
	Object data[][]=TestUtility.getTestData("Sheet1");
	System.out.println("got the data");
	return data;
		
	}
	@Test(dataProvider="getLoginData")
	public void TC1(String username, String password) {
		System.out.println("entered function");
		System.out.println(password);
		
		for(int s=0;s<=2;s++) {
			LP.Login(username, password);
		}
		
		System.out.println("entered function1");
		
	}
	
	@AfterTest
	public void Stop() {

	}
}
