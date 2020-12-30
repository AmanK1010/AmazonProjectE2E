package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.LibGlobal;

import bsh.org.objectweb.asm.Type;

public class LoginPage extends LibGlobal{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='a-icon a-icon-logo']")
	private WebElement logo;
	
	@FindBy(id="ap_email")
	private WebElement txtEmail;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(xpath="//a[text()='Conditions of Use']")
	private WebElement conditionsLink;
	
	@FindBy(xpath="//a[text()='Privacy Notice']")
	private WebElement privacyLink;
	
	@FindBy(xpath="//span[@class='a-expander-prompt']")
	private WebElement needHelpLink;
	

	@FindBy(id="createAccountSubmit")
	private WebElement createNewAccBtn;
	
	@FindBy(id="ap_password")
	private WebElement txtPass;
	
	@FindBy(id="signInSubmit")
	private WebElement loginBtn;
	
	@FindBy(id="auth-fpp-link-bottom")
	private WebElement forgetPassLink;
	
	@FindBy(xpath="//input[@name='rememberMe']")
	private WebElement keepSignedInRadio;
	
	@FindBy(xpath="//span[@id='auth-login-via-otp-btn']")
	private WebElement getOTPbtn;
	
	
	public boolean checkAmazonLogo() {
		return isDisplayed(logo);
	}
	
	public boolean checkUsernameTextbox() {
		return isEnabled(txtEmail);
	}
	
	public boolean checkLoginBtn() {
		return isEnabled(loginBtn);
	}
	
	public boolean checkConditionsOfUseLink() {
		return isDisplayed(conditionsLink);
	}
	
	public boolean checkPrivacyNoticeLink() {
		return isDisplayed(privacyLink);
	}
	
	public boolean checkNeedHelpLink() {
		return isDisplayed(needHelpLink);
	}
	
	public boolean checkCreateAccountBtn() {
		return isEnabled(createNewAccBtn);
	}
	
	public void loginIntoAccount(String username, String pass) {
		sendKey(txtEmail, username);
		click(continueBtn);
		sendKey(txtPass, pass);
		click(loginBtn);
	}
	
	public void navigateToCreateNewAccPage() {
		click(createNewAccBtn);
	}
	
	public void getToPassPage(String username) {
		sendKey(txtEmail, username);
		click(continueBtn);
	}
}
