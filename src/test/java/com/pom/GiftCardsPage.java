package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.LibGlobal;

public class GiftCardsPage extends LibGlobal{

	public GiftCardsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='nav-a nav-b']")
	private WebElement giftCardsLinkinGiftPage;
	
	@FindBy(xpath="(//a[@class='nav-a'])[2]")
	private WebElement bestSellersLink;
	
	@FindBy(xpath="(//a[@class='nav-a'])[3]")
	private WebElement birthdayLink;
	
	@FindBy(xpath="(//a[@class='nav-a'])[4]")
	private WebElement weddingAndEngagementLink;
	
	@FindBy(xpath="(//a[@class='nav-a'])[5]")
	private WebElement byOcassionLink;
	
	@FindBy(xpath="(//a[@class='nav-a'])[6]")
	private WebElement byBrandLink;
	
	@FindBy(xpath="(//a[@class='nav-a'])[7]")
	private WebElement addGiftCardToAmazonPayBalanceLink;
	
	@FindBy(xpath="(//a[@class='nav-a'])[2]")
	private WebElement corporateGiftingLink;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[1]")
	private WebElement anniversaryRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[2]")
	private WebElement birthdayRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[3]")
	private WebElement fathersDayRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[4]")
	private WebElement friendshipRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[5]")
	private WebElement justBecauseRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[6]")
	private WebElement mothersDayRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[7]")
	private WebElement womensDayRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[8]")
	private WebElement brotherRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[9]")
	private WebElement daughterRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[10]")
	private WebElement forHerRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[11]")
	private WebElement forHimRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[12]")
	private WebElement friendRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[13]")
	private WebElement sisterRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[14]")
	private WebElement wifeRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[15]")
	private WebElement lifeStyleRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[16]")
	private WebElement boschRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[17]")
	private WebElement pantaloonsRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[18]")
	private WebElement titanRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[19]")
	private WebElement fabIndiaRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[20]")
	private WebElement starbucksRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[21]")
	private WebElement osramRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[22]")
	private WebElement eGiftCardsLink;
	

	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[23]")
	private WebElement physicalGiftCardsLink;
	

	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[24]")
	private WebElement englishRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[25]")
	private WebElement bengaliRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[26]")
	private WebElement gujratiRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[27]")
	private WebElement hindiRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[28]")
	private WebElement kannadaRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[29]")
	private WebElement malayalamRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[30]")
	private WebElement marathiRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[31]")
	private WebElement punjabiRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[32]")
	private WebElement tamilRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[33]")
	private WebElement teluguRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[34]")
	private WebElement amazonGiftCardsRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[35]")
	private WebElement appsRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[36]")
	private WebElement clothingRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[37]")
	private WebElement fasionAccessoriesRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[38]")
	private WebElement jewelleryRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[39]")
	private WebElement shoesAndBagsRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[40]")
	private WebElement storesRadioBtn;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[41]")
	private WebElement includeOutOfStockRadioBtn;
	
	@FindBy(xpath="(//span[@dir='auto'])[77]")
	private WebElement giftCardHoldersLink;
	
	@FindBy(xpath="(//span[@dir='auto'])[78]")
	private WebElement giftCardsAndGiftVouchersLink;
	
	@FindBy(xpath="//a[text()='MakeMyTrip Gift Voucher']")
	private WebElement mmtgiftVoucherLink;
	
	@FindBy(xpath="//a[text()='BookMyShow Voucher']")
	private WebElement bookMyShowVoucherLink;
	
	@FindBy(xpath="//a[text()='Joyalukkas Gift Voucher']")
	private WebElement joyalukkasGiftVoucherLink;
	
	@FindBy(xpath="//a[text()='Cleartrip']")
	private WebElement cleartripLink;
	
	@FindBy(xpath="//a[text()='Big Bazaar Gift Card']")
	private WebElement bigBazaarGiftCardLink;
	
	@FindBy(xpath="//a[text()='Shoppers Stop']")
	private WebElement shoppersStopLink;
	
	@FindBy(xpath="//a[text()='PVR Gift Voucher']")
	private WebElement pvrGiftVoucherLink;
	
	@FindBy(xpath="//a[text()='Westside Gift Voucher']")
	private WebElement westsideGiftVoucherLink;
	
	@FindBy(xpath="//a[text()='Lifestyle Gift Voucher']")
	private WebElement lifestyleGiftVoucherLink;
	
	@FindBy(xpath="(//input[@name='fieldResponses[0].contents[0]'])[1]")
	private WebElement yesInfoHelpfulRadioBtn;
	
	@FindBy(xpath="(//input[@name='fieldResponses[0].contents[0]'])[2]")
	private WebElement noInfoHelpfulRadioBtn;
	
	@FindBy(xpath="//textarea[@id='formInput1']")
	private WebElement otherInfoTextBox;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	private WebElement otherInfoSubmitBtn;
	
	@FindBy(xpath="//span[@class='navFooterBackToTopText']")
	private WebElement backToTopLink;
	
	@FindBy(xpath="(//img[@onload='window.uet && uet.call && uet(\"af\");'])[1]")
	private WebElement eGiftCardsImgLink;
	
	@FindBy(xpath="(//img[@onload='window.uet && uet.call && uet(\"af\");'])[2]")
	private WebElement physicalGiftCardsImgLink;
	
	@FindBy(xpath="(//img[@onload='window.uet && uet.call && uet(\"af\");'])[3]")
	private WebElement brandVouchersImgLink;
	
	@FindBy(xpath="(//img[@onload='window.uet && uet.call && uet(\"af\");'])[4]")
	private WebElement corporateGiftingImgLink;
	
	@FindBy(xpath="(//img[@onload='window.uet && uet.call && uet(\"af\");'])[6]")
	private WebElement shopByOcassionImgLink;
	
	@FindBy(xpath="(//img[@onload='window.uet && uet.call && uet(\"af\");'])[7]")
	private WebElement shopByRecipientImgLink;
	
	@FindBy(xpath="(//img[@onload='window.uet && uet.call && uet(\"af\");'])[8]")
	private WebElement giftCardsHelpPageImgLink;
	
	@FindBy(xpath="(//img[@onload='window.uet && uet.call && uet(\"af\");'])[9]")
	private WebElement beAwareImgLink;
	
	@FindBy(xpath="(//img[@onload='window.uet && uet.call && uet(\"af\");'])[14]")
	private WebElement addToAccountImgLink;

	public boolean checkGiftCardsLink() {
		return isEnabled(giftCardsLinkinGiftPage);
	}
	
	public boolean checkBestSellersLink() {
		return isEnabled(bestSellersLink);
	}
	
	public boolean checkBirthdayLink() {
		return isEnabled(birthdayLink);
	}
	
	public boolean checkWeddingAndEngagementLink() {
		return isEnabled(weddingAndEngagementLink);
	}
	
	public boolean checkByOcassionLink() {
		return isEnabled(byOcassionLink);
	}
	
	public boolean checkByBrandLink() {
		return isEnabled(byBrandLink);
	}
	
	public boolean checkAddGiftCardToAmazonPayBalanceLink() {
		return isEnabled(addGiftCardToAmazonPayBalanceLink);
	}
	
	public boolean checkCorporateGiftingLink() {
		return isEnabled(corporateGiftingLink);
	}
	
	public boolean checkAnniversaryRadioBtn() {
		return isEnabled(anniversaryRadioBtn);
	}
	
	public boolean checkBirthdayRadioBtn() {
		return isEnabled(birthdayRadioBtn);
	}
	
	public boolean checkFathersDayRadioBtn() {
		return isEnabled(fathersDayRadioBtn);
	}
	
	public boolean checkFriendshipRadioBtn() {
		return isEnabled(friendshipRadioBtn);
	}
	
	public boolean checkJustBecauseRadioBtn() {
		return isEnabled(justBecauseRadioBtn);
	}
	
	public boolean checkMothersDayRadioBtn() {
		return isEnabled(mothersDayRadioBtn);
	}
	
	public boolean checkWomensDayRadioBtn() {
		return isEnabled(womensDayRadioBtn);
	}
	
	public boolean checkBrotherRadioBtn() {
		return isEnabled(brotherRadioBtn);
	}
	
	public boolean checkDaughterRadioBtn() {
		return isEnabled(daughterRadioBtn);
	}
	
	public boolean checkForHerRadioBtn() {
		return isEnabled(forHerRadioBtn);
	}
	
	public boolean checkForHimRadioBtn() {
		return isEnabled(forHimRadioBtn);
	}
	
	public boolean checkFriendRadioBtn() {
		return isEnabled(friendRadioBtn);
	}
	
	public boolean checkSisterRadioBtn() {
		return isEnabled(sisterRadioBtn);
	}
	
	public boolean checkWifeRadioBtn() {
		return isEnabled(wifeRadioBtn);
	}
	
	public boolean checkLifeStyleRadioBtn() {
		return isEnabled(lifeStyleRadioBtn);
	}
	
	public boolean checkBoschRadioBtn() {
		return isEnabled(boschRadioBtn);
	}
	
	public boolean checkPantaloonsRadioBtn() {
		return isEnabled(pantaloonsRadioBtn);
	}
	
	public boolean checkTitanRadioBtn() {
		return isEnabled(titanRadioBtn);
	}
	
	public boolean checkFabIndiaRadioBtn() {
		return isEnabled(fabIndiaRadioBtn);
	}
	
	public boolean checkStarbucksRadioBtn() {
		return isEnabled(starbucksRadioBtn);
	}
	
	public boolean checkOsramRadioBtn() {
		return isEnabled(osramRadioBtn);
	}
	
	public boolean checkEGiftCardsLink() {
		return isEnabled(eGiftCardsLink);
	}
	
	public boolean checkPhysicalGiftCardsLink() {
		return isEnabled(physicalGiftCardsLink);
	}
	
	public boolean checkEnglishRadioBtn() {
		return isEnabled(englishRadioBtn);
	}
	
	public boolean checkBengaliRadioBtn() {
		return isEnabled(bengaliRadioBtn);
	}
	
	public boolean checkGujratiRadioBtn() {
		return isEnabled(gujratiRadioBtn);
	}
	
	public boolean checkHindiRadioBtn() {
		return isEnabled(hindiRadioBtn);
	}
	
	public boolean checkKannadaRadioBtn() {
		return isEnabled(kannadaRadioBtn);
	}
	
	public boolean checkMalayalamRadioBtn() {
		return isEnabled(malayalamRadioBtn);
	}
	
	public boolean checkMarathiRadioBtn() {
		return isEnabled(marathiRadioBtn);
	}
	
	public boolean checkPunjabiRadioBtn() {
		return isEnabled(punjabiRadioBtn);
	}
	
	public boolean checkTamilRadioBtn() {
		return isEnabled(tamilRadioBtn);
	}
	
	public boolean checkTeluguRadioBtn() {
		return isEnabled(teluguRadioBtn);
	}
	
	public boolean checkAmazonGiftCardsRadioBtn() {
		return isEnabled(amazonGiftCardsRadioBtn);
	}
	
	public boolean checkAppsRadioBtn() {
		return isEnabled(appsRadioBtn);
	}
	
	public boolean checkClothingRadioBtn() {
		return isEnabled(clothingRadioBtn);
	}
	
	public boolean checkFasionAccessoriesRadioBtn() {
		return isEnabled(fasionAccessoriesRadioBtn);
	}
	
	public boolean checkJewelleryRadioBtn() {
		return isEnabled(jewelleryRadioBtn);
	}
	
	public boolean checkShoesAndBagsRadioBtn() {
		return isEnabled(shoesAndBagsRadioBtn);
	}
	
	public boolean checkStoresRadioBtn() {
		return isEnabled(storesRadioBtn);
	}
	
	public boolean checkIncludeOutOfStockRadioBtn() {
		return isEnabled(includeOutOfStockRadioBtn);
	}
	
	public boolean checkGiftCardHoldersLink() {
		return isEnabled(giftCardHoldersLink);
	}
	
	public boolean checkGiftCardsAndGiftVouchersLink() {
		return isEnabled(giftCardsAndGiftVouchersLink);
	}
	
	public boolean checkMmtgiftVoucherLink() {
		return isEnabled(mmtgiftVoucherLink);
	}
	
	public boolean checkBookMyShowVoucherLink() {
		return isEnabled(bookMyShowVoucherLink);
	}
	
	public boolean checkJoyalukkasGiftVoucherLink() {
		return isEnabled(joyalukkasGiftVoucherLink);
	}
	
	public boolean checkCleartripLink() {
		return isEnabled(cleartripLink);
	}
	
	public boolean checkBigBazaarGiftCardLink() {
		return isEnabled(bigBazaarGiftCardLink);
	}
	
	public boolean checkShoppersStopLink() {
		return isEnabled(shoppersStopLink);
	}
	
	public boolean checkPvrGiftVoucherLink() {
		return isEnabled(pvrGiftVoucherLink);
	}
	
	public boolean checkWestsideGiftVoucherLink() {
		return isEnabled(westsideGiftVoucherLink);
	}
	
	public boolean checkLifestyleGiftVoucherLink() {
		return isEnabled(lifestyleGiftVoucherLink);
	}
	
	public boolean checkYesInfoHelpfulRadioBtn() {
		return isEnabled(yesInfoHelpfulRadioBtn);
	}
	
	public boolean checkNoInfoHelpfulRadioBtn() {
		return isEnabled(noInfoHelpfulRadioBtn);
	}
	
	public boolean checkOtherInfoTextBox() {
		return isEnabled(otherInfoTextBox);
	}
	
	public boolean checkOtherInfoSubmitBtn() {
		return isEnabled(otherInfoSubmitBtn);
	}
	
	
	
	public boolean checkBackToTopLink() {
		return isEnabled(backToTopLink);
	}
	
	public boolean checkEGiftCardsImgLink() {
		return isEnabled(eGiftCardsImgLink);
	}
	
	public boolean checkPhysicalGiftCardsImgLink() {
		return isEnabled(physicalGiftCardsImgLink);
	}
	
	public boolean checkBrandVouchersImgLink() {
		return isEnabled(brandVouchersImgLink);
	}
	
	public boolean checkCorporateGiftingImgLink() {
		return isEnabled(corporateGiftingImgLink);
	}
	
	public boolean checkShopByOcassionImgLink() {
		return isEnabled(shopByOcassionImgLink);
	}
	
	public boolean checkShopByRecipientImgLink() {
		return isEnabled(shopByRecipientImgLink);
	}
	
	public boolean checkGiftCardsHelpPageImgLink() {
		return isEnabled(giftCardsHelpPageImgLink);
	}
	
	public boolean checkBeAwareImgLink() {
		return isEnabled(beAwareImgLink);
	}
	
	public boolean checkAddToAccountImgLink() {
		return isEnabled(addToAccountImgLink);
	}
	
}
