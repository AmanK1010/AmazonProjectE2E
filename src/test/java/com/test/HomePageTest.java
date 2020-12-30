package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.LibGlobal;
import com.pom.AccountsAndListsDDHome;
import com.pom.HomePage;

public class HomePageTest extends LibGlobal {

	HomePage home;
	AccountsAndListsDDHome acc;

	@BeforeMethod(groups = "only")
	public void launchAmazonHomepage() {
		launchBrowser("chrome");
		getToUrl("https://www.amazon.in/");
		home = new HomePage();
		acc = new AccountsAndListsDDHome();
	}

	@Test
	public void verifyMainMenuBar() {
		boolean checkMainMenuBar = home.checkMainMenuBar();
		Assert.assertTrue(checkMainMenuBar);
	}

	@Test
	public void verifyAmazonLogo() {
		boolean checkAmazonLogo = home.checkAmazonLogo();
		Assert.assertTrue(checkAmazonLogo);
	}

	@Test
	public void verifySelectAddressMenu() {
		boolean SelectAddressMenu = home.checkSelectAddressMenu();
		Assert.assertTrue(SelectAddressMenu);
	}

	@Test
	public void verifyCategoriesDD() {
		boolean checkCategoriesDD = home.checkCategoriesDD();
		Assert.assertTrue(checkCategoriesDD);
	}

	@Test
	public void verifyLanguageDD() {
		boolean checkLanguageDD = home.checkLanguageDD();
		Assert.assertTrue(checkLanguageDD);
	}

	@Test
	public void verifySignInDD() {
		boolean checkSignInDD = home.checkSignInDD();
		Assert.assertTrue(checkSignInDD);
	}

	@Test
	public void verifyReturnsAndOrdersMenu() {
		boolean checkReturnsAndOrdersMenu = home.checkReturnsAndOrdersMenu();
		Assert.assertTrue(checkReturnsAndOrdersMenu);
	}

	@Test
	public void verifyCartMenu() {
		boolean checkCartMenu = home.checkCartMenu();
		Assert.assertTrue(checkCartMenu);
	}

	@Test
	public void verifyGiftCardsNavBar() {
		boolean checkGiftCardsNavBar = home.checkGiftCardsNavBar();
		Assert.assertTrue(checkGiftCardsNavBar);
	}

	@Test
	public void verifyBestSellersNavBar() {
		boolean checkBestSellersNavBar = home.checkBestSellersNavBar();
		Assert.assertTrue(checkBestSellersNavBar);
	}

	@Test
	public void verifyMobilesNavBar() {
		boolean checkMobilesNavBar = home.checkMobilesNavBar();
		Assert.assertTrue(checkMobilesNavBar);
	}

	@Test
	public void verifyTodaysDealsNavBar() {
		boolean checkTodaysDealsNavBar = home.checkTodaysDealsNavBar();
		Assert.assertTrue(checkTodaysDealsNavBar);
	}

	@Test
	public void verifyNewReleasesNavBar() {
		boolean checkNewReleasesNavBar = home.checkNewReleasesNavBar();
		Assert.assertTrue(checkNewReleasesNavBar);
	}

	@Test
	public void verifyCustomerServiceNavBar() {
		boolean checkCustomerServiceNavBar = home.checkCustomerServiceNavBar();
		Assert.assertTrue(checkCustomerServiceNavBar);
	}

	@Test
	public void verifyScrollImageRight() {
		boolean checkScrollImageRight = home.checkScrollImageRight();
		Assert.assertTrue(checkScrollImageRight);
	}

	@Test
	public void verifyScrollImageLeft() {
		boolean checkScrollImageLeft = home.checkScrollImageLeft();
		Assert.assertTrue(checkScrollImageLeft);
	}

	@Test
	public void verifyBackToTopLink() {
		boolean checkBackToTopLink = home.checkBackToTopLink();
		Assert.assertTrue(checkBackToTopLink);
	}

	@Test
	public void verifyAboutUsLink() {
		boolean checkAboutUsLink = home.checkAboutUsLink();
		Assert.assertTrue(checkAboutUsLink);
	}

	@Test
	public void verifyCarrersLink() {
		boolean checkCarrersLink = home.checkCarrersLink();
		Assert.assertTrue(checkCarrersLink);
	}

	@Test
	public void verifyPressReleasesLink() {
		boolean checkPressReleasesLink = home.checkPressReleasesLink();
		Assert.assertTrue(checkPressReleasesLink);
	}

	@Test
	public void verifyAmazonCaresLink() {
		boolean checkAmazonCaresLink = home.checkAmazonCaresLink();
		Assert.assertTrue(checkAmazonCaresLink);
	}

	@Test
	public void verifyGiftASmileLink() {
		boolean checkGiftASmileLink = home.checkGiftASmileLink();
		Assert.assertTrue(checkGiftASmileLink);
	}

	@Test
	public void verifyFacebookLink() {
		boolean checkFacebookLink = home.checkFacebookLink();
		Assert.assertTrue(checkFacebookLink);
	}

	@Test
	public void verifyTwitterLink() {
		boolean checkTwitterLink = home.checkTwitterLink();
		Assert.assertTrue(checkTwitterLink);
	}

	@Test
	public void verifyInstagramLink() {
		boolean checkInstagramLink = home.checkInstagramLink();
		Assert.assertTrue(checkInstagramLink);
	}

	@Test
	public void verifySellOnAmazon() {
		boolean checkSellOnAmazon = home.checkSellOnAmazon();
		Assert.assertTrue(checkSellOnAmazon);
	}

	@Test
	public void verifySellUnderAmazonAceleratorLink() {
		boolean checkSellUnderAmazonAceleratorLink = home.checkSellUnderAmazonAceleratorLink();
		Assert.assertTrue(checkSellUnderAmazonAceleratorLink);
	}

	@Test
	public void verifyBecomeAnAffiliateLink() {
		boolean checkBecomeAnAffiliateLink = home.checkBecomeAnAffiliateLink();
		Assert.assertTrue(checkBecomeAnAffiliateLink);
	}

	@Test
	public void verifyFulfilmentByAmazonLink() {
		boolean checkFulfilmentByAmazonLink = home.checkFulfilmentByAmazonLink();
		Assert.assertTrue(checkFulfilmentByAmazonLink);
	}

	@Test
	public void verifyAdvertiseYourProductsLink() {
		boolean checkAdvertiseYourProductsLink = home.checkAdvertiseYourProductsLink();
		Assert.assertTrue(checkAdvertiseYourProductsLink);
	}

	@Test
	public void verifyAmazonPayOnMerchantsLink() {
		boolean checkAmazonPayOnMerchantsLink = home.checkAmazonPayOnMerchantsLink();
		Assert.assertTrue(checkAmazonPayOnMerchantsLink);
	}

	@Test
	public void verifyCovid19AndAmazonLink() {
		boolean checkCovid19AndAmazonLink = home.checkCovid19AndAmazonLink();
		Assert.assertTrue(checkCovid19AndAmazonLink);
	}

	@Test
	public void verifyYourAccountLink() {
		boolean checkYourAccountLink = home.checkYourAccountLink();
		Assert.assertTrue(checkYourAccountLink);
	}

	@Test
	public void verifyReturnCentreLink() {
		boolean checkReturnCentreLink = home.checkReturnCentreLink();
		Assert.assertTrue(checkReturnCentreLink);
	}

	@Test
	public void verifyPurchaseProtectionLink() {
		boolean checkPurchaseProtectionLink = home.checkPurchaseProtectionLink();
		Assert.assertTrue(checkPurchaseProtectionLink);
	}

	@Test
	public void verifyAmazonAppDownloadLink() {
		boolean checkAmazonAppDownloadLink = home.checkAmazonAppDownloadLink();
		Assert.assertTrue(checkAmazonAppDownloadLink);
	}

	@Test
	public void verifyAmazonAssistantDownloadLink() {
		boolean checkAmazonAssistantDownloadLink = home.checkAmazonAssistantDownloadLink();
		Assert.assertTrue(checkAmazonAssistantDownloadLink);
	}

	@Test
	public void verifyHelpLink() {
		boolean checkHelpLink = home.checkHelpLink();
		Assert.assertTrue(checkHelpLink);
	}

	@Test
	public void verifyAustraliaLink() {
		boolean checkAustraliaLink = home.checkAustraliaLink();
		Assert.assertTrue(checkAustraliaLink);
	}

	@Test
	public void verifyBrazilLink() {
		boolean checkBrazilLink = home.checkBrazilLink();
		Assert.assertTrue(checkBrazilLink);
	}

	@Test
	public void verifyCanadaLink() {
		boolean checkCanadaLink = home.checkCanadaLink();
		Assert.assertTrue(checkCanadaLink);
	}

	@Test
	public void verifyChinaLink() {
		boolean checkChinaLink = home.checkChinaLink();
		Assert.assertTrue(checkChinaLink);
	}

	@Test
	public void verifyFranceLink() {
		boolean checkFranceLink = home.checkFranceLink();
		Assert.assertTrue(checkFranceLink);
	}

	@Test
	public void verifyGermanyLink() {
		boolean checkGermanyLink = home.checkGermanyLink();
		Assert.assertTrue(checkGermanyLink);
	}

	@Test
	public void verifyItalyLink() {
		boolean checkItalyLink = home.checkItalyLink();
		Assert.assertTrue(checkItalyLink);
	}

	@Test
	public void verifyJapanLink() {
		boolean checkJapanLink = home.checkJapanLink();
		Assert.assertTrue(checkJapanLink);
	}

	@Test
	public void verifyMexicoLink() {
		boolean checkMexicoLink = home.checkMexicoLink();
		Assert.assertTrue(checkMexicoLink);
	}

	@Test
	public void verifyNetherlandsLink() {
		boolean checkNetherlandsLink = home.checkNetherlandsLink();
		Assert.assertTrue(checkNetherlandsLink);
	}

	@Test
	public void verifySingaporeLink() {
		boolean SingaporeLink = home.checkSingaporeLink();
		Assert.assertTrue(SingaporeLink);
	}

	@Test
	public void verifySpainLink() {
		boolean checkSpainLink = home.checkSpainLink();
		Assert.assertTrue(checkSpainLink);
	}

	@Test
	public void verifyUnitedArabEmiratesLink() {
		boolean checkUnitedArabEmiratesLink = home.checkUnitedArabEmiratesLink();
		Assert.assertTrue(checkUnitedArabEmiratesLink);
	}

	@Test
	public void verifyUkLink() {
		boolean checkUkLink = home.checkUkLink();
		Assert.assertTrue(checkUkLink);
	}

	@Test
	public void verifyUsLink() {
		boolean checkUsLink = home.checkUsLink();
		Assert.assertTrue(checkUsLink);
	}

	@Test
	public void verifyAbeBooksLink() {
		boolean checkAbeBooksLink = home.checkAbeBooksLink();
		Assert.assertTrue(checkAbeBooksLink);
	}

	@Test
	public void verifyAmazonWebServicesLink() {
		boolean checkAmazonWebServicesLink = home.checkAmazonWebServicesLink();
		Assert.assertTrue(checkAmazonWebServicesLink);
	}

	@Test
	public void verifyAudibleLink() {
		boolean checkAudibleLink = home.checkAudibleLink();
		Assert.assertTrue(checkAudibleLink);
	}

	@Test
	public void verifyDpReviewLink() {
		boolean checkDpReviewLink = home.checkDpReviewLink();
		Assert.assertTrue(checkDpReviewLink);
	}

	@Test
	public void verifyImbdLink() {
		boolean checkImbdLink = home.checkImbdLink();
		Assert.assertTrue(checkImbdLink);
	}

	@Test
	public void verifyShopBopLink() {
		boolean checkShopBopLink = home.checkShopBopLink();
		Assert.assertTrue(checkShopBopLink);
	}

	@Test
	public void verifyAmazonBusinessLink() {
		boolean checkShopBopLink = home.checkShopBopLink();
		Assert.assertTrue(checkShopBopLink);
	}

	@Test
	public void verifyPrimeNowLink() {
		boolean checkShopBopLink = home.checkShopBopLink();
		Assert.assertTrue(checkShopBopLink);
	}

	@Test
	public void verifyAmazonPrimeMusicLink() {
		boolean checkShopBopLink = home.checkShopBopLink();
		Assert.assertTrue(checkShopBopLink);
	}

	@Test
	public void verifyConditionsOfUseAndSaleLink() {
		boolean checkConditionsOfUseAndSaleLink = home.checkConditionsOfUseAndSaleLink();
		Assert.assertTrue(checkConditionsOfUseAndSaleLink);
	}

	@Test
	public void verifyPrivacyNoticeLink() {
		boolean checkPrivacyNoticeLink = home.checkPrivacyNoticeLink();
		Assert.assertTrue(checkPrivacyNoticeLink);
	}

	@Test
	public void verifyInterestBasedAdsLink() {
		boolean checkInterestBasedAdsLink = home.checkInterestBasedAdsLink();
		Assert.assertTrue(checkInterestBasedAdsLink);
	}

	@Test
	public void changePincodeTest() throws InterruptedException {
		home.changePincode("440001");
		Thread.sleep(2000);
		Assert.assertTrue(home.retrivePincode().contains("440001"));
	}

	@Test
	public void chooseFromCategories() {
		home.selectFromCategories("Amazon Devices");
	}

	@Test
	public void searchForProduct() {
		home.searchProducts("headphones");
	}

	@Test
	public void changeLangToHindi() {
		home.changeLanguageToHindi();
	}

	@Test
	public void changeCountrytoAus() {
		home.changeCountryToAustralia();
	}

	@Test(groups = "only")
	public void checkAllLinksAvailInAccountsDD() {
		home.mouseOverAccountsAndLists();
		Assert.assertTrue(acc.checkCreateWishListLink(), "Wish list link is not enabled");
		Assert.assertTrue(acc.checkFindWishListLink(), "Find wish list link is not enabled");
		Assert.assertTrue(acc.checkWishFromAnyWebsiteLink(), "Wish from any website link is not enabled");
		Assert.assertTrue(acc.checkBabyWishListLink(), "Baby wish list link is not enabled");
		Assert.assertTrue(acc.checkDiscoverYourStyleLink(), "Discover your style link is not enabled");
		Assert.assertTrue(acc.checkExploreShowroomLink(), "Explore showroom link is not enabled");
		Assert.assertTrue(acc.checkYourAccountLink(), "Your account link is not enabled");
		Assert.assertTrue(acc.checkYourOrdersLink(), "Your Orders link is not enabled");
		Assert.assertTrue(acc.checkYourWishListLink(), "Your Wish list link is not enabled");
		Assert.assertTrue(acc.checkYourRecommendationsLink(), "Your recommendations link is not enabled");
		Assert.assertTrue(acc.checkYourPrimeMembershipLink(), "Your prime membership link is not enabled");
		Assert.assertTrue(acc.checkYourPrimeVideoLink(), "Your prime video link is not enabled");
		Assert.assertTrue(acc.checkYourSubscribeAndSavedItemsLink(), "Your subscribe and saved items link is not enabled");
		Assert.assertTrue(acc.checkMembershipsAndSubscriptionLink(), "Memberships and subscription link is not enabled");
		Assert.assertTrue(acc.checkYourAmazonBusinessAccountLink(), "Amazon business account link link is not enabled");
		Assert.assertTrue(acc.checkYourSellerAccountLink(), "Your seller account link is not enabled");
		Assert.assertTrue(acc.checkManageYourContentAndDevicesLink(), "Manage your content and devices link is not enabled");
	}

	@AfterMethod
	public void quitBrowser() {
		quit();
	}

}
