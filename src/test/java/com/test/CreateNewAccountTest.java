package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseClass.LibGlobal;
import com.pom.CreateNewAccount;
import com.pom.HomePage;

public class CreateNewAccountTest extends LibGlobal{

	HomePage home;
	CreateNewAccount newAcc;
	@BeforeMethod
	public void launchCreateNewAccPage() {
		launchBrowser("chrome");
		getToUrl("https://www.amazon.in/");
		home = new HomePage();
		home.getCreateNewAccPage();
		newAcc = new CreateNewAccount();
	}
	
	@Test
	public void verifyLogo() {
		boolean checklogo = newAcc.checklogo();
		Assert.assertTrue(checklogo);
	}
	
	@Test
	public void verifyNameTxtBox() {
		boolean checkYourNameTxt = newAcc.checkYourNameTxt();
		Assert.assertTrue(checkYourNameTxt);
	}
	
	@Test
	public void verifyCountryCodeDD() {
		boolean checkCountryCodeDD = newAcc.checkCountryCodeDD();
		Assert.assertTrue(checkCountryCodeDD);
	}
	
	@Test
	public void verifyMobNoTxtBox() {
		boolean checkMobileNoTxt = newAcc.checkMobileNoTxt();
		Assert.assertTrue(checkMobileNoTxt);
	}
	
	@Test
	public void verifyEmailTxtBox() {
		boolean checkEmailTxt = newAcc.checkEmailTxt();
		Assert.assertTrue(checkEmailTxt);
	}
	
	@Test
	public void verifyPasswrdTxtBox() {
		boolean checkPassTxt = newAcc.checkPassTxt();
		Assert.assertTrue(checkPassTxt);
	}
	
	@Test
	public void verifyContinueBtn() {
		boolean checkContinueBtn = newAcc.checkContinueBtn();
		Assert.assertTrue(checkContinueBtn);
	}
	
	@Test
	public void verifySignInLink() {
		boolean checkSignInLink = newAcc.checkSignInLink();
		Assert.assertTrue(checkSignInLink);
	}
	
//	@Test(dataProvider="createNewAccData")
//	public void verifyCreateNewAccTest(String name, String phNo, String email, String pass) {
//		newAcc.createANewAccForIndia(name, phNo, email, pass);
//		
//	}
	
	@Test(dataProvider="createNewAccData")
	public void createAccWithExistingEmail(String name, String phNo, String email, String pass) {
		newAcc.createNewAccWithExistingEmail(name, phNo, email, pass);
		boolean checkExistingEmailMessage = newAcc.checkExistingEmailMessage();
		Assert.assertTrue(checkExistingEmailMessage);
	}
	
	@DataProvider(name="createNewAccData")
	public Object[][] getCreateNewData() {
		return new Object[][]  {
			{"Udhaya","9421776178","udhayaganesan@gmail.com","Udhaya@786!"}
		};
	}
	
	@AfterMethod
	public void quitBrowser() {
		quit();
	}
}
	


