package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.LibGlobal;

public class HomePage extends LibGlobal{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-hamburger-menu")
	private WebElement mainMenuDD;
	
	@FindBy(id="nav-logo-sprites")
	private WebElement amazonLogoLink;
	
	@FindBy(xpath="//a[@class='nav-a nav-a-2 a-popover-trigger a-declarative']")
	private WebElement selectLoc;
	
	@FindBy(xpath="//select[@id='searchDropdownBox']")
	private WebElement categoriesDD;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement txtSearchBar;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//a[@id='icp-nav-flyout']")
	private WebElement chooseLang;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement accountsAndLists;
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	private WebElement signInBtn;
	
	@FindBy(xpath="//a[text()='Start here.']")
	private WebElement startHereLink;
	
	@FindBy(xpath="//a[@id='nav-orders']")
	private WebElement returnsAndOrders;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	private WebElement cart;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[1]")
	private WebElement giftCards;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[2]")
	private WebElement bestSellers;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[3]")
	private WebElement mobiles;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[4]")
	private WebElement todaysDeal;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[5]")
	private WebElement newReleases;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[6]")
	private WebElement customerService;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[7]")
	private WebElement fashion;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[8]")
	private WebElement electronics;
	
	@FindBy(xpath="(//a[@class='nav-a  '])[9]")
	private WebElement computers;
	
	@FindBy(xpath="//a[@class='nav-imageHref']")
	private WebElement downloadApp;
	
	@FindBy(xpath="(//img[@alt='Mobiles'])[2]")
	private WebElement mobilesImageScroll;
	
	@FindBy(xpath="//div[@class='a-carousel-col a-carousel-left celwidget']")
	private WebElement scrollLeftOnImage;
	
	@FindBy(xpath="//div[@class='a-carousel-col a-carousel-right celwidget']")
	private WebElement scrollRightOnImage;
	
	@FindBy(xpath="//a[@id='a-autoid-0-announce']")
	private WebElement signInSecurelyBtn;
	
	@FindBy(xpath="//span[@class='navFooterBackToTopText']")
	private WebElement backToTopLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[2]")
	private WebElement aboutUsLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[3]")
	private WebElement carrersLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[4]")
	private WebElement pressReleasesLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[5]")
	private WebElement amazonCaresLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[6]")
	private WebElement giftASmileLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[7]")
	private WebElement facebookLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[8]")
	private WebElement twitterLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[9]")
	private WebElement instagramLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[10]")
	private WebElement sellOnAmazon;
	
	@FindBy(xpath="(//a[@class='nav_a'])[11]")
	private WebElement sellUnderAmazonAceleratorLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[12]")
	private WebElement becomeAnAffiliateLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[13]")
	private WebElement fulfilmentByAmazonLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[14]")
	private WebElement avertiseYourProductsLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[15]")
	private WebElement amazonPayOnMerchantsLink;

	@FindBy(xpath="(//a[@class='nav_a'])[16]")
	private WebElement covid19AndAmazonLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[17]")
	private WebElement yourAccountLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[18]")
	private WebElement returnCentreLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[19]")
	private WebElement purchaseProtectionLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[20]")
	private WebElement amazonAppDownloadLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[21]")
	private WebElement amazonAssistantDownloadLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[22]")
	private WebElement helpLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[23]")
	private WebElement australiaLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[24]")
	private WebElement brazilLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[25]")
	private WebElement canadaLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[26]")
	private WebElement chinaLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[27]")
	private WebElement franceLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[28]")
	private WebElement germanyLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[29]")
	private WebElement italyLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[30]")
	private WebElement japanLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[31]")
	private WebElement mexicoLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[32]")
	private WebElement netherlandsLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[33]")
	private WebElement singaporeLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[34]")
	private WebElement spainLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[35]")
	private WebElement unitedArabEmiratesLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[36]")
	private WebElement ukLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[37]")
	private WebElement usLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[38]")
	private WebElement abeBooksLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[39]")
	private WebElement amazonWebServicesLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[40]")
	private WebElement audibleLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[41]")
	private WebElement dpReviewLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[42]")
	private WebElement imbdLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[43]")
	private WebElement shopBopLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[44]")
	private WebElement amazonBusinessLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[45]")
	private WebElement primeNowLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[46]")
	private WebElement amazonPrimeMusicLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[47]")
	private WebElement conditionsOfUseAndSaleLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[48]")
	private WebElement privacyNoticeLink;
	
	@FindBy(xpath="(//a[@class='nav_a'])[49]")
	private WebElement interestBasedAdsLink;
	
	@FindBy(xpath="//input[@class='GLUX_Full_Width a-declarative']")
	private WebElement pinCodeTxt;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	private WebElement signInToSeeYourAddBtn;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[4]")
	private WebElement applyLocBtn;
	
	@FindBy(xpath="//span[@id='glow-ingress-line2']")
	private WebElement getPincode;
	
	@FindBy(xpath="(//span[@class='nav-text'])[19]")
	private WebElement hindi;
	
	@FindBy(xpath="(//span[@class='nav-text'])[20]")
	private WebElement tamil;
	
	@FindBy(xpath="(//span[@class='nav-text'])[21]")
	private WebElement telugu;
	
	@FindBy(xpath="(//span[@class='nav-text'])[22]")
	private WebElement kannada;
	
	@FindBy(xpath="(//span[@class='nav-text'])[23]")
	private WebElement malayalam;
	
	@FindBy(xpath="(//li[@class='a-dropdown-item'])[1]")
	private WebElement australia;
	
	@FindBy(xpath="(//div[@class='icp-mkt-change-lnk'])[1]")
	private WebElement changeCountryLink;
	
	@FindBy(xpath="//span[@id='a-autoid-0']")
	private WebElement selectCountryBtn;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	private WebElement goToWebsiteBtn;
	
	@FindBy(xpath="(//span[@class='a-list-item'])[2]")
	private WebElement ordersLinkInYourorders;
	
	@FindBy(xpath="(//span[@class='a-list-item'])[3]")
	private WebElement buyAgainLinkInYourorders;
	
	@FindBy(xpath="(//span[@class='a-list-item'])[4]")
	private WebElement openOrdersLinkInYourorders;
	
	@FindBy(xpath="(//span[@class='a-list-item'])[5]")
	private WebElement cancelledOrdersLinkInYourorders;
	
	public void getSignInPage() {
		moveToElement(accountsAndLists);
		click(signInBtn);
		
	}
	
	public void mouseOverAccountsAndLists() {
		moveToElement(accountsAndLists);
	}
	
	public void getCreateNewAccPage() {
		moveToElement(accountsAndLists);
		click(startHereLink);
	}
	
	public boolean checkMainMenuBar() {
		return isEnabled(mainMenuDD);
	}
	
	public boolean checkAmazonLogo() {
		return isEnabled(amazonLogoLink);
	}
	
	public boolean checkSelectAddressMenu() {
		return isEnabled(selectLoc);
	}
	
	public boolean checkCategoriesDD() {
		return isEnabled(categoriesDD);
	}
	
	public boolean checkLanguageDD() {
		return isEnabled(chooseLang);
	}
	
	public boolean checkSignInDD() {
		return isEnabled(accountsAndLists);
	}
	
	public boolean checkReturnsAndOrdersMenu() {
		return isEnabled(returnsAndOrders);
	}
	
	public boolean checkCartMenu() {
		return isEnabled(cart);
	}
	
	public boolean checkGiftCardsNavBar() {
		return isEnabled(giftCards);
	}
	
	public boolean checkBestSellersNavBar() {
		return isEnabled(bestSellers);
	}
	
	public boolean checkMobilesNavBar() {
		return isEnabled(mobiles);
	}
	
	public boolean checkTodaysDealsNavBar() {
		return isEnabled(todaysDeal);
	}
	
	public boolean checkNewReleasesNavBar() {
		return isEnabled(newReleases);
	}	
	
	public boolean checkCustomerServiceNavBar() {
		return isEnabled(customerService);
	}
	
	public boolean checkComputersNavBar() {
		return isEnabled(giftCards);
	}
	
	public boolean checkScrollImageRight() {
		return isEnabled(scrollRightOnImage);
	}
	
	public boolean checkScrollImageLeft() {
		return isEnabled(scrollLeftOnImage);
	}
	
	public void scrollImageRight() {
		click(scrollRightOnImage);
	}
	
	public void scrollImageLeft() {
		click(scrollLeftOnImage);
	}
	
	public boolean checkBackToTopLink() {
		return isEnabled(backToTopLink);
	}
	
	public void scrollToTop() {
		click(backToTopLink);
	}
	
	public boolean checkAboutUsLink() {
		return isEnabled(aboutUsLink);
	}
	
	public boolean checkCarrersLink() {
		return isEnabled(carrersLink);
	}
	
	public boolean checkPressReleasesLink() {
		return isEnabled(pressReleasesLink);
	}
	
	public boolean checkAmazonCaresLink() {
		return isEnabled(amazonCaresLink);
	}
	
	public boolean checkGiftASmileLink() {
		return isEnabled(giftASmileLink);
	}
	
	public boolean checkFacebookLink() {
		return isEnabled(facebookLink);
	}
	
	public boolean checkTwitterLink() {
		return isEnabled(twitterLink);
	}
	
	public boolean checkInstagramLink() {
		return isEnabled(instagramLink);
	}
	
	public boolean checkSellOnAmazon() {
		return isEnabled(sellOnAmazon);
	}
	
	public boolean checkSellUnderAmazonAceleratorLink() {
		return isEnabled(sellUnderAmazonAceleratorLink);
	}
	
	public boolean checkBecomeAnAffiliateLink() {
		return isEnabled(becomeAnAffiliateLink);
	}
	
	public boolean checkFulfilmentByAmazonLink() {
		return isEnabled(fulfilmentByAmazonLink);
	}
	
	public boolean checkAdvertiseYourProductsLink() {
		return isEnabled(avertiseYourProductsLink);
	}
	
	public boolean checkAmazonPayOnMerchantsLink() {
		return isEnabled(amazonPayOnMerchantsLink);
	}
	
	public boolean checkCovid19AndAmazonLink() {
		return isEnabled(covid19AndAmazonLink);
	}
	
	public boolean checkYourAccountLink() {
		return isEnabled(yourAccountLink);
	}
	
	public boolean checkReturnCentreLink() {
		return isEnabled(returnCentreLink);
	}
	
	public boolean checkPurchaseProtectionLink() {
		return isEnabled(purchaseProtectionLink);
	}
	
	public boolean checkAmazonAppDownloadLink() {
		return isEnabled(amazonAppDownloadLink);
	}
	
	public boolean checkAmazonAssistantDownloadLink() {
		return isEnabled(amazonAssistantDownloadLink);
	}
	
	public boolean checkHelpLink() {
		return isEnabled(helpLink);
	}
	
	public boolean checkAustraliaLink() {
		return isEnabled(australiaLink);
	}
	
	public boolean checkBrazilLink() {
		return isEnabled(brazilLink);
	}
	
	public boolean checkCanadaLink() {
		return isEnabled(canadaLink);
	}
	
	public boolean checkChinaLink() {
		return isEnabled(chinaLink);
	}
	
	public boolean checkFranceLink() {
		return isEnabled(franceLink);
	}
	
	public boolean checkGermanyLink() {
		return isEnabled(germanyLink);
	}
	
	public boolean checkItalyLink() {
		return isEnabled(italyLink);
	}
	
	public boolean checkJapanLink() {
		return isEnabled(japanLink);
	}
	
	public boolean checkMexicoLink() {
		return isEnabled(mexicoLink);
	}
	
	public boolean checkNetherlandsLink() {
		return isEnabled(netherlandsLink);
	}
	
	public boolean checkSingaporeLink() {
		return isEnabled(singaporeLink);
	}
	
	public boolean checkSpainLink() {
		return isEnabled(spainLink);
	}
	
	public boolean  checkUnitedArabEmiratesLink(){
		return isEnabled(unitedArabEmiratesLink);
	}
	
	public boolean  checkUkLink(){
		return isEnabled(ukLink);
	}
	
	public boolean  checkUsLink(){
		return isEnabled(usLink);
	}
	
	public boolean  checkAbeBooksLink(){
		return isEnabled(abeBooksLink);
	}
	
	public boolean  checkAmazonWebServicesLink(){
		return isEnabled(amazonWebServicesLink);
	}
	
	public boolean  checkAudibleLink(){
		return isEnabled(audibleLink);
	}
	
	public boolean  checkDpReviewLink(){
		return isEnabled(dpReviewLink);
	}
	
	public boolean  checkImbdLink(){
		return isEnabled(imbdLink);
	}
	
	public boolean  checkShopBopLink(){
		return isEnabled(shopBopLink);
	}
	
	public boolean  checkAmazonBusinessLink(){
		return isEnabled(amazonBusinessLink);
	}
	
	public boolean  checkPrimeNowLink(){
		return isEnabled(primeNowLink);
	}
	
	public boolean  checkAmazonPrimeMusicLink(){
		return isEnabled(amazonPrimeMusicLink);
	}
	
	public boolean  checkConditionsOfUseAndSaleLink(){
		return isEnabled(conditionsOfUseAndSaleLink);
	}
	
	public boolean  checkPrivacyNoticeLink(){
		return isEnabled(privacyNoticeLink);
	}
	
	public boolean  checkInterestBasedAdsLink(){
		return isEnabled(interestBasedAdsLink);
	}
	
	public void changePincode(String pincode) {
		click(selectLoc);
		sendKey(pinCodeTxt, pincode);
		click(applyLocBtn);
		
	}
	
	public String retrivePincode() {
		 return retriveText(getPincode);
	}
	
	public void selectFromCategories(String value) {
		selectByVisibleTextDD(categoriesDD, value);
	}
	
	public void searchProducts(String product) {
		sendKey(txtSearchBar, product);
		click(searchBtn);
	}
	
	public void changeLanguageToHindi() {
		moveToElement(chooseLang);
		click(hindi);
	}
	
	public void changeCountryToAustralia() {
		moveToElement(chooseLang);
		click(changeCountryLink);
		click(selectCountryBtn);
		click(australia);
		click(goToWebsiteBtn);
		
	}
	
	public void getGiftCardsPage() {
		click(giftCards);
	}
	public void getBestSellersPage() {
		click(bestSellers);
	}
	
	public void getMobilesPage() {
		click(mobiles);
	}
	
}

