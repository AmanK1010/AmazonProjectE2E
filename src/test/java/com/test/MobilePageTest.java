package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.LibGlobal;
import com.pom.HomePage;
import com.pom.Mobilespage;

public class MobilePageTest extends LibGlobal{

	HomePage home;
	Mobilespage mob;
	@BeforeMethod
	public void launchMobilePageOfAmazon() {
		launchBrowser("chrome");
		getToUrl("https://www.amazon.in/");
		home = new HomePage();
		home.getMobilesPage();
		mob = new Mobilespage();
		
	}
	
	@Test
	public void checkAllNavBarLinks() {
		Assert.assertTrue(mob.checkElectronicsLink(), "Electronics link is not enabled");
		Assert.assertTrue(mob.checkmobilesAndAccDD(), "mobiles And Acc DD link is not enabled");
		Assert.assertTrue(mob.checkLaptopAndAccessoriesDD(), "Laptop And Accessories link is not enabled");
		Assert.assertTrue(mob.checkTvAndHomeEntertainmentDD(), "Tv And Home Entertainment link is not enabled");
		Assert.assertTrue(mob.checkAudioDD(), "Audio link is not enabled");
		Assert.assertTrue(mob.checkCamerasDD(), "Camera link is not enabled");
		Assert.assertTrue(mob.checkComputerPeriferalsDD(), "Computer Periferals link is not enabled");
		Assert.assertTrue(mob.checkSmartTechnologyDD(), "Smart Technology DD link is not enabled");
		Assert.assertTrue(mob.checkMusicalInstrumentsDD(), "Musical Instruments link is not enabled");
		Assert.assertTrue(mob.checkOfficeAndStationaryDD(), "Office And Stationary DD link is not enabled");
		
	}
	@Test
	public void verifyAllSideNavBarLinks() {
		Assert.assertTrue(mob.checkBackToElectronicsLink(), "Electronics link is not enabled");
		Assert.assertTrue(mob.checkMobileAccessoriesLink(), "Mobile Accessories link is not enabled");
		Assert.assertTrue(mob.checkSimCardsLink(), "Sim Cards link is not enabled");
		Assert.assertTrue(mob.checkSmartPhonesAndBasicMobilesLink(), "Smart Phones And Basic Mobiles link is not enabled");
		Assert.assertTrue(mob.checkLast30DaysLink(), "Last 30 Days link is not enabled");
		Assert.assertTrue(mob.checkLast90DaysLink(), "Last 90 Days link is not enabled");
		Assert.assertTrue(mob.checkNewLink(), "New link is not enabled");
		Assert.assertTrue(mob.checkRenewedLink(), "Renewed link is not enabled");
		Assert.assertTrue(mob.checkUsedLink(), "Used link is not enabled");
		Assert.assertTrue(mob.checkUnder1000Link(), "Under 1000 link is not enabled");
		Assert.assertTrue(mob.checkBet1000And5000Link(), "Bet 1000 And 5000 link is not enabled");
		Assert.assertTrue(mob.checkBet5000And10000Link(), "Bet 5000 And 10000 link is not enabled");
		Assert.assertTrue(mob.checkBet10000And20000Link(), "Bet 10000 And 20000 link is not enabled");
		Assert.assertTrue(mob.checkOver20000Link(), "Over 20000 link is not enabled");
		Assert.assertTrue(mob.checkDiscountMoreThan10percentLink(), "Discount More Than 10 percent link is not enabled");
		Assert.assertTrue(mob.checkDiscountMoreThan25percentLink(), "Discount More Than 25 percent link is not enabled");
		Assert.assertTrue(mob.checkDiscountMoreThan35percentLink(), "Discount More Than 35 percent link is not enabled");
		Assert.assertTrue(mob.checkDiscountMoreThan50percentLink(), "Discount More Than 50 percent link is not enabled");
	}
	
	
	@Test
	public void verifyAllSideBarRadioBtns() {
		Assert.assertTrue(mob.checkMadeForAmazonRadioBtn(), "Made For Amazon RadioBtn is not enabled");
		Assert.assertTrue(mob.checkAmazonPrimeRadioBtn(), "Amazon Prime RadioBtn is not enabled");
		Assert.assertTrue(mob.checkElegibleForPayOnDeliveryRadioBtn(), "Elegible For Pay On Delivery RadioBtn is not enabled");
		Assert.assertTrue(mob.checkRedmiRadioBtn(), "Redmi RadioBtn is not enabled");
		Assert.assertTrue(mob.checkBoatRadioBtn(), "Boat RadioBtn is not enabled");
		Assert.assertTrue(mob.checkOneplusRadioBtn(), "Oneplus RadioBtn is not enabled");
		Assert.assertTrue(mob.checkSamsungRadioBtn(), "Samsung RadioBtn is not enabled");
		Assert.assertTrue(mob.checkJblRadioBtn(), "Jbl RadioBtn is not enabled");
		Assert.assertTrue(mob.checkPtronRadioBtn(), "Ptron RadioBtn is not enabled");
		Assert.assertTrue(mob.checkTodaysDealsRadioBtn(), "Todays Deals RadioBtn is not enabled");
		Assert.assertTrue(mob.checkApparioRetailRadioBtn(), "Appario Retail RadioBtn is not enabled");
		Assert.assertTrue(mob.checkShopMagicsRadioBtn(), "Shop Magics RadioBtn is not enabled");
		Assert.assertTrue(mob.checkSparewareRadioBtn(), "Spareware RadioBtn is not enabled");
		Assert.assertTrue(mob.checkGoSaleRadioBtn(), "Go sale RadioBtn is not enabled");
		Assert.assertTrue(mob.checkNoiseRadioBtn(), "Noise RadioBtn is not enabled");
		Assert.assertTrue(mob.checkPankajTelecomRadioBtn(), "Pankaj Telecom RadioBtn is not enabled");
		Assert.assertTrue(mob.checkRaghavEnterpriseRadioBtn(), "Raghav Enterprise RadioBtn is not enabled");
		Assert.assertTrue(mob.checkDailyShoppersRadioBtn(), "Daily Shoppers RadioBtn is not enabled");
		Assert.assertTrue(mob.checkVishalSparesRadioBtn(), "Vishal Spares RadioBtn is not enabled");
		Assert.assertTrue(mob.checkCloudTailRadioBtn(), "CloudTail RadioBtn is not enabled");
		Assert.assertTrue(mob.checkCart2IndiaRadioBtn(), "Cart 2 India RadioBtn is not enabled");
		Assert.assertTrue(mob.checkIncludeOutOfStockRadioBtn(), "Include Out Of Stock RadioBtn is not enabled");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		quit();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
