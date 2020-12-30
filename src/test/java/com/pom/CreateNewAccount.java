package com.pom;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.LibGlobal;

public class CreateNewAccount extends LibGlobal {

	public CreateNewAccount() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='a-link-nav-icon']")
	private WebElement logo;

	@FindBy(id = "ap_customer_name")
	private WebElement txtname;

	@FindBy(xpath = "//span[@class='a-dropdown-prompt']")
	private WebElement countryCodeDD;

	@FindBy(id = "ap_phone_number")
	private WebElement txtPhoneNum;

	@FindBy(id = "ap_email")
	private WebElement txtEmail;

	@FindBy(id = "ap_password")
	private WebElement txtPswrd;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	@FindBy(xpath = "//a[@class='a-link-emphasis']")
	private WebElement signInLink;
	
	@FindBy(xpath = "//input[@id='auth-pv-enter-code']")
	private WebElement enterOtpTxt;
	
	@FindBy(xpath = "//input[@id='auth-verify-button']")
	private WebElement createYourAmazonAccBtn;
	
	@FindBy(xpath="//span[@class='a-list-item']")
	private WebElement existingEmailMessage;
	
	

	public boolean checklogo() {
		boolean logodisplayed = isDisplayed(logo);
		return logodisplayed;
	}

	public boolean checkYourNameTxt() {
		return isEnabled(txtname);
	}

	public boolean checkCountryCodeDD() {
		return isEnabled(countryCodeDD);
	}

	public boolean checkMobileNoTxt() {
		return isEnabled(txtPhoneNum);
	}

	public boolean checkEmailTxt() {
		return isEnabled(txtEmail);
	}

	public boolean checkPassTxt() {
		return isEnabled(txtPswrd);
	}

	public boolean checkContinueBtn() {
		return isEnabled(continueBtn);
	}

	public boolean checkSignInLink() {
		return isDisplayed(signInLink);
	}
	
	public boolean checkExistingEmailMessage() {
		return isDisplayed(existingEmailMessage);
	}
	public void createANewAccForIndia(String name, String phNo, String email, String pass) {
		sendKey(txtname, name);
		sendKey(txtPhoneNum, phNo);
		sendKey(txtEmail, email);
		sendKey(txtPswrd, pass);
		click(continueBtn);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter otp");
		String otp = sc.nextLine();
		sendKey(enterOtpTxt, otp);
		click(createYourAmazonAccBtn);
	}

	public void createNewAccWithExistingEmail(String name, String phNo, String email, String pass) {
		sendKey(txtname, name);
		sendKey(txtPhoneNum, phNo);
		sendKey(txtEmail, email);
		sendKey(txtPswrd, pass);
		click(continueBtn);
	}
}
