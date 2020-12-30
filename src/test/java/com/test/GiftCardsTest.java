package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.LibGlobal;
import com.pom.GiftCardsPage;
import com.pom.HomePage;

public class GiftCardsTest extends LibGlobal {

	HomePage home;
	GiftCardsPage gifts;
	@BeforeMethod
	public void getGiftCardsPage() {
		launchBrowser("chrome");
		getToUrl("https://www.amazon.in/");
		home = new HomePage();
		home.getGiftCardsPage();
		gifts=new GiftCardsPage();
	}
	
	@Test(enabled=false)
	public void verifyNavBarLinks() {
		Assert.assertTrue(gifts.checkGiftCardsLink(), "Gift Card link is not enabled");
		Assert.assertTrue(gifts.checkBestSellersLink(), "Best seller link is not enabled");
		Assert.assertTrue(gifts.checkBirthdayLink(), "Birthday link is not enabled");
		Assert.assertTrue(gifts.checkWeddingAndEngagementLink(), "Wedding link is not enabled");
		Assert.assertTrue(gifts.checkByOcassionLink(), "Ocassion link is not enabled");
		Assert.assertTrue(gifts.checkByBrandLink(), "Brand link is not enabled");
		Assert.assertTrue(gifts.checkAddGiftCardToAmazonPayBalanceLink(), "Add gift card to amazon pay balance link is not enabled");
		Assert.assertTrue(gifts.checkCorporateGiftingLink(), "Corporate Gifting link is not enabled");
		
	}
	
	@Test(enabled=false)
	public void verifyAllRadioBtns() {
		Assert.assertTrue(gifts.checkAnniversaryRadioBtn(), "Anniversary radio btn is not enabled");
		Assert.assertTrue(gifts.checkBirthdayRadioBtn(), "Birthday radio btn is not enabled");
		Assert.assertTrue(gifts.checkFathersDayRadioBtn(), "Fathers day radio btn is not enabled");
		Assert.assertTrue(gifts.checkFriendshipRadioBtn(), "Friendship radio btn is not enabled");
		Assert.assertTrue(gifts.checkJustBecauseRadioBtn(), "Just because radio btn is not enabled");
		Assert.assertTrue(gifts.checkMothersDayRadioBtn(), "Mothers day radio btn is not enabled");
		Assert.assertTrue(gifts.checkWomensDayRadioBtn(), "Womens day radio btn is not enabled");
		Assert.assertTrue(gifts.checkBrotherRadioBtn(), "Brother radio btn is not enabled");
		Assert.assertTrue(gifts.checkDaughterRadioBtn(), "Daughter radio btn is not enabled");
		Assert.assertTrue(gifts.checkForHerRadioBtn(), "For her radio btn is not enabled");
		Assert.assertTrue(gifts.checkForHimRadioBtn(), "Daughter radio btn is not enabled");
		Assert.assertTrue(gifts.checkFriendRadioBtn(), "Friend radio btn is not enabled");
		Assert.assertTrue(gifts.checkSisterRadioBtn(), "Sister radio btn is not enabled");
		Assert.assertTrue(gifts.checkWifeRadioBtn(), "Wife radio btn is not enabled");
		Assert.assertTrue(gifts.checkLifeStyleRadioBtn(), "Life Style radio btn is not enabled");
		Assert.assertTrue(gifts.checkBoschRadioBtn(), "Bosch radio btn is not enabled");
		Assert.assertTrue(gifts.checkPantaloonsRadioBtn(), "Pantaloons radio btn is not enabled");
		Assert.assertTrue(gifts.checkTitanRadioBtn(), "Tiatn radio btn is not enabled");
		Assert.assertTrue(gifts.checkFabIndiaRadioBtn(), "Fab India radio btn is not enabled");
		Assert.assertTrue(gifts.checkStarbucksRadioBtn(), "Starbucks radio btn is not enabled");
		Assert.assertTrue(gifts.checkOsramRadioBtn(), "Osram radio btn is not enabled");
		Assert.assertTrue(gifts.checkEnglishRadioBtn(), "English radio btn is not enabled");
		Assert.assertTrue(gifts.checkBengaliRadioBtn(), "Bengali radio btn is not enabled");
		Assert.assertTrue(gifts.checkGujratiRadioBtn(), "Gujrati radio btn is not enabled");
		Assert.assertTrue(gifts.checkHindiRadioBtn(), "Hindi radio btn is not enabled");
		Assert.assertTrue(gifts.checkKannadaRadioBtn(), "Kannada radio btn is not enabled");
		Assert.assertTrue(gifts.checkMalayalamRadioBtn(), "Malayalam radio btn is not enabled");
		Assert.assertTrue(gifts.checkMarathiRadioBtn(), "Marathi radio btn is not enabled");
		Assert.assertTrue(gifts.checkPunjabiRadioBtn(), "Punjabi radio btn is not enabled");
		Assert.assertTrue(gifts.checkTamilRadioBtn(), "Tamil radio btn is not enabled");
		Assert.assertTrue(gifts.checkTeluguRadioBtn(), "Telugu radio btn is not enabled");
		Assert.assertTrue(gifts.checkAmazonGiftCardsRadioBtn(), "Amazon gift cards radio btn is not enabled");
		Assert.assertTrue(gifts.checkAppsRadioBtn(), "Apps radio btn is not enabled");
		Assert.assertTrue(gifts.checkClothingRadioBtn(), "Clothing radio btn is not enabled");
		Assert.assertTrue(gifts.checkFasionAccessoriesRadioBtn(), "Fashion Accessories radio btn is not enabled");
		Assert.assertTrue(gifts.checkJewelleryRadioBtn(), "Jewellery radio btn is not enabled");
		Assert.assertTrue(gifts.checkShoesAndBagsRadioBtn(), "Shoes and bags radio btn is not enabled");
		Assert.assertTrue(gifts.checkStoresRadioBtn(), "Stores radio btn is not enabled");
		Assert.assertTrue(gifts.checkIncludeOutOfStockRadioBtn(), "Include out of stock radio btn is not enabled");
		Assert.assertTrue(gifts.checkYesInfoHelpfulRadioBtn(), "Yes info radio btn is not enabled");
		Assert.assertTrue(gifts.checkNoInfoHelpfulRadioBtn(), "No info radio btn is not enabled");
 
	}
	
	@Test(enabled=false)
	public void verifyRemainingLinks() {
		Assert.assertTrue(gifts.checkEGiftCardsLink(), "Egift cards link is not enabled");
		Assert.assertTrue(gifts.checkPhysicalGiftCardsLink(), "Physical gift cards link is not enabled");
		Assert.assertTrue(gifts.checkGiftCardHoldersLink(), "Gift card holders link is not enabled");
		Assert.assertTrue(gifts.checkGiftCardsAndGiftVouchersLink(), "Gift cards and vouchers link is not enabled");
		Assert.assertTrue(gifts.checkMmtgiftVoucherLink(), "MMT gift voucherlink is not enabled");
		Assert.assertTrue(gifts.checkBookMyShowVoucherLink(), "Book my show voucher link is not enabled");
		Assert.assertTrue(gifts.checkJoyalukkasGiftVoucherLink(), "Joyalukkas gift voucher link is not enabled");
		Assert.assertTrue(gifts.checkCleartripLink(), "Clear trip link is not enabled");
		Assert.assertTrue(gifts.checkBigBazaarGiftCardLink(), "Big bazaar card link is not enabled");
		Assert.assertTrue(gifts.checkShoppersStopLink(), "Shoppers stop link is not enabled");
		Assert.assertTrue(gifts.checkPvrGiftVoucherLink(), "Pvr gift voucher link is not enabled");
		Assert.assertTrue(gifts.checkWestsideGiftVoucherLink(), "Westside gift voucher link is not enabled");
		Assert.assertTrue(gifts.checkLifestyleGiftVoucherLink(), "Lifestyle gift voucher link is not enabled");
		
	}
	
	@Test
	public void verifyImageLinks() {
		Assert.assertTrue(gifts.checkEGiftCardsImgLink(), "Egift cards image link is not enabled");
		Assert.assertTrue(gifts.checkPhysicalGiftCardsImgLink(), "Physical gift cards image link is not enabled");
		Assert.assertTrue(gifts.checkBrandVouchersImgLink(), "Brand vouchers link is not enabled");
		Assert.assertTrue(gifts.checkCorporateGiftingImgLink(), "Corporate gifting image link is not enabled");
		Assert.assertTrue(gifts.checkShopByOcassionImgLink(), "Shop by ocassion image link is not enabled");
		Assert.assertTrue(gifts.checkShopByRecipientImgLink(), "Shop by recipient image link is not enabled");
		Assert.assertTrue(gifts.checkGiftCardsHelpPageImgLink(), "Gift Cards Help Page Img link is not enabled");
		Assert.assertTrue(gifts.checkBeAwareImgLink(), "Be Aware Img link is not enabled");
		Assert.assertTrue(gifts.checkAddToAccountImgLink(), "Add to account Img link is not enabled");
	}
	
}
