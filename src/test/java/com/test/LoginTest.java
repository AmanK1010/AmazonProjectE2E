package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.LibGlobal;
import com.pom.HomePage;
import com.pom.LoginPage;

public class LoginTest extends LibGlobal {

	HomePage home;
	LoginPage login;

	@BeforeMethod
	public void launchAmazonUrl() {
		launchBrowser("chrome");
		getToUrl("https://www.amazon.in/");
		home = new HomePage();
		login = new LoginPage();
		home.getSignInPage();

	}

	@Test
	public void verifyLogo() {

		boolean logo = login.checkAmazonLogo();
		Assert.assertTrue(logo);
	}

	@Test
	public void verifyUserNameTxtBox() {
		boolean checkUsernameTextbox = login.checkUsernameTextbox();
		Assert.assertTrue(checkUsernameTextbox);
	}

	@Test
	public void verifyloginBtn() {
		login.getToPassPage("7448268399");
		boolean checkLoginBtn = login.checkLoginBtn();
		Assert.assertTrue(checkLoginBtn);
	}

	@Test
	public void verifyConditionsLink() {
		boolean checkConditionsLink = login.checkConditionsOfUseLink();
		Assert.assertTrue(checkConditionsLink);
	}

	@Test
	public void verifyPrivacyLink() {
		boolean checkPrivacyNoticeLink = login.checkPrivacyNoticeLink();
		Assert.assertTrue(checkPrivacyNoticeLink);
	}

	@Test
	public void verifyNeedHelpLink() {
		boolean checkNeedHelpLink = login.checkNeedHelpLink();
		Assert.assertTrue(checkNeedHelpLink);
	}

	@Test
	public void verifyCreateAccBtn() {
		boolean checkCreateAccountBtn = login.checkCreateAccountBtn();
		Assert.assertTrue(checkCreateAccountBtn);
	}

	@Test
	public void verifyLoginPage() {

		login.loginIntoAccount("7448268399", "12345");
	}

	@AfterMethod
	private void quitBrowser() {
		quit();
	}

}
