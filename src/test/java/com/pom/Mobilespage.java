package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.LibGlobal;

public class Mobilespage extends LibGlobal {

	public Mobilespage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Electronics']")
	private WebElement electronicsTab;

	@FindBy(xpath = "(//span[@class='nav-a-content'])[2]")
	private WebElement mobilesAndAccDD;

	@FindBy(xpath = "(//span[@class='nav-a-content'])[3]")
	private WebElement laptopAndAccessoriesDD;

	@FindBy(xpath = "(//span[@class='nav-a-content'])[4]")
	private WebElement tvAndHomeEntertainmentDD;

	@FindBy(xpath = "(//span[@class='nav-a-content'])[5]")
	private WebElement audioDD;

	@FindBy(xpath = "(//span[@class='nav-a-content'])[6]")
	private WebElement camerasDD;

	@FindBy(xpath = "(//span[@class='nav-a-content'])[7]")
	private WebElement computerPeriferalsDD;

	@FindBy(xpath = "(//span[@class='nav-a-content'])[8]")
	private WebElement smartTechnologyDD;

	@FindBy(xpath = "(//span[@class='nav-a-content'])[9]")
	private WebElement musicalInstrumentsDD;

	@FindBy(xpath = "(//span[@class='nav-a-content'])[10]")
	private WebElement officeAndStationaryDD;

	@FindBy(xpath = "(//a[@class='a-color-base a-link-normal'])[1]")
	private WebElement backToElectronicsLink;
	
	@FindBy(xpath = "(//a[@class='a-color-base a-link-normal'])[2]")
	private WebElement mobileAccessoriesLink;

	@FindBy(xpath = "(//a[@class='a-color-base a-link-normal'])[3]")
	private WebElement simCardsLink;

	@FindBy(xpath = "(//a[@class='a-color-base a-link-normal'])[4]")
	private WebElement smartPhonesAndBasicMobilesLink;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[1]")
	private WebElement madeForAmazonRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[2]")
	private WebElement amazonPrimeRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[3]")
	private WebElement elegibleForPayOnDeliveryRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[4]")
	private WebElement redmiRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[5]")
	private WebElement boatRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[6]")
	private WebElement oneplusRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[7]")
	private WebElement samsungRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[8]")
	private WebElement jblRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[9]")
	private WebElement ptronRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[10]")
	private WebElement noiseRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[11]")
	private WebElement todaysDealsRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[12]")
	private WebElement apparioRetailRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[13]")
	private WebElement shopMagicsRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[14]")
	private WebElement sparewareRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[15]")
	private WebElement goSaleRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[16]")
	private WebElement pankajTelecomRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[17]")
	private WebElement raghavEnterpriseRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[18]")
	private WebElement dailyShoppersRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[19]")
	private WebElement vishalSparesRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[20]")
	private WebElement cloudTailRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[21]")
	private WebElement cart2IndiaRadioBtn;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[22]")
	private WebElement includeOutOfStockRadioBtn;

	@FindBy(xpath = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	private WebElement rating4StarsAndAbove;

	@FindBy(xpath = "//i[@class='a-icon a-icon-star-medium a-star-medium-3']")
	private WebElement rating3StarsAndAbove;

	@FindBy(xpath = "//i[@class='a-icon a-icon-star-medium a-star-medium-2']")
	private WebElement rating2StarsAndAbove;

	@FindBy(xpath = "//i[@class='a-icon a-icon-star-medium a-star-medium-1']")
	private WebElement rating1StarsAndAbove;

	@FindBy(xpath = "//span[text()='Last 30 days']")
	private WebElement last30DaysLink;

	@FindBy(xpath = "//span[text()='Last 90 days']")
	private WebElement last90DaysLink;

	@FindBy(xpath = "//span[text()='New']")
	private WebElement newLink;

	@FindBy(xpath = "//span[text()='Renewed']")
	private WebElement renewedLink;

	@FindBy(xpath = "//span[text()='Used']")
	private WebElement usedLink;

	@FindBy(xpath = "//span[text()='Under ₹1,000']")
	private WebElement under1000Link;

	@FindBy(xpath = "//span[text()='₹1,000 - ₹5,000']")
	private WebElement bet1000And5000Link;

	@FindBy(xpath = "//span[text()='₹5,000 - ₹10,000']")
	private WebElement bet5000And10000Link;

	@FindBy(xpath = "//span[text()='₹10,000 - ₹20,000']")
	private WebElement bet10000And20000Link;

	@FindBy(xpath = "//span[text()='Over ₹20,000']")
	private WebElement over20000Link;

	@FindBy(xpath = "//span[text()='10% Off or more']")
	private WebElement discountMoreThan10percentLink;

	@FindBy(xpath = "//span[text()='25% Off or more']")
	private WebElement discountMoreThan25percentLink;

	@FindBy(xpath = "//span[text()='35% Off or more']")
	private WebElement discountMoreThan35percentLink;

	@FindBy(xpath = "//span[text()='50% Off or more']")
	private WebElement discountMoreThan50percentLink;

	public boolean checkElectronicsLink() {
		return isEnabled(electronicsTab);
	}

	public boolean checkmobilesAndAccDD() {
		return isEnabled(mobilesAndAccDD);
	}

	public boolean checkLaptopAndAccessoriesDD() {
		return isEnabled(laptopAndAccessoriesDD);
	}

	public boolean checkTvAndHomeEntertainmentDD() {
		return isEnabled(tvAndHomeEntertainmentDD);
	}

	public boolean checkAudioDD() {
		return isEnabled(audioDD);
	}

	public boolean checkCamerasDD() {
		return isEnabled(camerasDD);
	}

	public boolean checkComputerPeriferalsDD() {
		return isEnabled(computerPeriferalsDD);
	}

	public boolean checkSmartTechnologyDD() {
		return isEnabled(smartTechnologyDD);
	}

	public boolean checkMusicalInstrumentsDD() {
		return isEnabled(musicalInstrumentsDD);
	}

	public boolean checkOfficeAndStationaryDD() {
		return isEnabled(officeAndStationaryDD);
	}

	public boolean checkBackToElectronicsLink() {
		return isEnabled(backToElectronicsLink);
	}
	
	public boolean checkMobileAccessoriesLink() {
		return isEnabled(mobileAccessoriesLink);
	}

	public boolean checkSimCardsLink() {
		return isEnabled(simCardsLink);
	}

	public boolean checkSmartPhonesAndBasicMobilesLink() {
		return isEnabled(smartPhonesAndBasicMobilesLink);
	}

	public boolean checkMadeForAmazonRadioBtn() {
		return isEnabled(madeForAmazonRadioBtn);
	}

	public boolean checkAmazonPrimeRadioBtn() {
		return isEnabled(amazonPrimeRadioBtn);
	}

	public boolean checkElegibleForPayOnDeliveryRadioBtn() {
		return isEnabled(elegibleForPayOnDeliveryRadioBtn);
	}

	public boolean checkRedmiRadioBtn() {
		return isEnabled(redmiRadioBtn);
	}

	public boolean checkBoatRadioBtn() {
		return isEnabled(boatRadioBtn);
	}

	public boolean checkOneplusRadioBtn() {
		return isEnabled(oneplusRadioBtn);
	}

	public boolean checkSamsungRadioBtn() {
		return isEnabled(samsungRadioBtn);
	}

	public boolean checkJblRadioBtn() {
		return isEnabled(jblRadioBtn);
	}

	public boolean checkPtronRadioBtn() {
		return isEnabled(ptronRadioBtn);
	}

	public boolean checkTodaysDealsRadioBtn() {
		return isEnabled(todaysDealsRadioBtn);
	}

	public boolean checkApparioRetailRadioBtn() {
		return isEnabled(apparioRetailRadioBtn);
	}

	public boolean checkShopMagicsRadioBtn() {
		return isEnabled(shopMagicsRadioBtn);
	}

	public boolean checkSparewareRadioBtn() {
		return isEnabled(sparewareRadioBtn);
	}

	public boolean checkGoSaleRadioBtn() {
		return isEnabled(goSaleRadioBtn);
	}

	public boolean checkNoiseRadioBtn() {
		return isEnabled(noiseRadioBtn);
	}

	public boolean checkPankajTelecomRadioBtn() {
		return isEnabled(pankajTelecomRadioBtn);
	}

	public boolean checkRaghavEnterpriseRadioBtn() {
		return isEnabled(raghavEnterpriseRadioBtn);
	}

	public boolean checkDailyShoppersRadioBtn() {
		return isEnabled(dailyShoppersRadioBtn);
	}

	public boolean checkVishalSparesRadioBtn() {
		return isEnabled(vishalSparesRadioBtn);
	}

	public boolean checkCloudTailRadioBtn() {
		return isEnabled(cloudTailRadioBtn);
	}

	public boolean checkCart2IndiaRadioBtn() {
		return isEnabled(cart2IndiaRadioBtn);
	}

	public boolean checkIncludeOutOfStockRadioBtn() {
		return isEnabled(includeOutOfStockRadioBtn);
	}

	public boolean checkRating4StarsAndAbove() {
		return isEnabled(rating4StarsAndAbove);
	}

	public boolean checkRating3StarsAndAbove() {
		return isEnabled(rating3StarsAndAbove);
	}

	public boolean checkRating2StarsAndAbove() {
		return isEnabled(rating2StarsAndAbove);
	}

	public boolean checkRating1StarsAndAbove() {
		return isEnabled(rating1StarsAndAbove);
	}

	public boolean checkLast30DaysLink() {
		return isEnabled(last30DaysLink);
	}

	public boolean checkLast90DaysLink() {
		return isEnabled(last90DaysLink);
	}

	public boolean checkNewLink() {
		return isEnabled(newLink);
	}

	public boolean checkRenewedLink() {
		return isEnabled(renewedLink);
	}

	public boolean checkUsedLink() {
		return isEnabled(usedLink);
	}

	public boolean checkUnder1000Link() {
		return isEnabled(under1000Link);
	}

	public boolean checkBet1000And5000Link() {
		return isEnabled(bet1000And5000Link);
	}

	public boolean checkBet5000And10000Link() {
		return isEnabled(bet5000And10000Link);
	}

	public boolean checkBet10000And20000Link() {
		return isEnabled(bet10000And20000Link);
	}

	public boolean checkOver20000Link() {
		return isEnabled(over20000Link);
	}

	public boolean checkDiscountMoreThan10percentLink() {
		return isEnabled(discountMoreThan10percentLink);
	}

	public boolean checkDiscountMoreThan25percentLink() {
		return isEnabled(discountMoreThan25percentLink);
	}

	public boolean checkDiscountMoreThan35percentLink() {
		return isEnabled(discountMoreThan35percentLink);
	}

	public boolean checkDiscountMoreThan50percentLink() {
		return isEnabled(discountMoreThan50percentLink);
	}

}
