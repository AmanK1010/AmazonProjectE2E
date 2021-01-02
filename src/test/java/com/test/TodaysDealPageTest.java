package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.LibGlobal;
import com.pom.HomePage;
import com.pom.TodaysdealPage;

public class TodaysDealPageTest extends LibGlobal{

	HomePage home;
	TodaysdealPage today;
	@BeforeMethod
	public void launchTodaysDealsPage() {
		launchBrowser("chrome");
		getToUrl("https://www.amazon.in/");
		home = new HomePage();
		home.getTodaysDealsPage();
		today = new TodaysdealPage();
	}
	
	@Test
	public void verifyAllNavBarLinks() {
		Assert.assertTrue(today.checkTodaysDealsTab(), "Todays deals link is not enabled");
		Assert.assertTrue(today.checkAllDealsTab(), "All deals link is not enabled");
		Assert.assertTrue(today.checkWatchedDealsTab(), "Watched deals link is not enabled");
		Assert.assertTrue(today.checkSubscribeAndSaveTab(), "Subscribe And Save link is not enabled");
		Assert.assertTrue(today.checkCouponsTab(), "Coupons link is not enabled");
		Assert.assertTrue(today.checkAmazonAssistantTab(), "Amazon Assistant link is not enabled");
		Assert.assertTrue(today.checkRefurbishedAndOpenBoxTab(), "Refurbished And OpenBox link is not enabled");
		
	}
	
	
	@Test
	public void verifySideNavBarRadioBtns() {
		Assert.assertTrue(today.checkAppliancesRadioBtn(), "Appliances radio btn is not enabled");
		Assert.assertTrue(today.checkArtworkRadioBtn(), "Artwork radio btn is not enabled");
		Assert.assertTrue(today.checkBabyProductsRadioBtn(), "Baby products radio btn is not enabled");
		Assert.assertTrue(today.checkBeautyRadioBtn(), "Beauty radio btn is not enabled");
		Assert.assertTrue(today.checkBooksRadioBtn(), "Books radio btn is not enabled");
		Assert.assertTrue(today.checkBusinessIndustrialAndScientificSuppliesRadioBtn(), "Business Industrial And Scientific Supplies radio btn is not enabled");
		Assert.assertTrue(today.checkCameraAccessoriesRadioBtn(), "Camera Accessories radio btn is not enabled");
		Assert.assertTrue(today.checkCamerasAndPhotographyRadioBtn(), "Cameras And Photography radio btn is not enabled");
		Assert.assertTrue(today.checkCarAndMotorbikeAccessoriesRadioBtn(), "Car And Motorbike Accessories radio btn is not enabled");
		Assert.assertTrue(today.checkChimneysKitchenRadioBtn(), "Chimneys Kitchen radio btn is not enabled");
		Assert.assertTrue(today.checkClothingBabyRadioBtn(), "Clothing Baby radio btn is not enabled");
		Assert.assertTrue(today.checkClothingBoysRadioBtn(), "Clothing Boys radio btn is not enabled");
		Assert.assertTrue(today.checkClothingGirlsRadioBtn(), "Clothing Girls radio btn is not enabled");
		Assert.assertTrue(today.checkClothingMensRadioBtn(), "Clothing Mens radio btn is not enabled");
		Assert.assertTrue(today.checkClothingWomensRadioBtn(), "Clothing Womens radio btn is not enabled");
		Assert.assertTrue(today.checkClothingAndAccessoriesRadioBtn(), "Clothing And Accessories radio btn is not enabled");
		Assert.assertTrue(today.checkComputerComponentsRadioBtn(), "Computer Components radio btn is not enabled");
		Assert.assertTrue(today.checkComputersAndAccessoriesRadioBtn(), "Computers And Accessories radio btn is not enabled");
		Assert.assertTrue(today.checkDataStorageAndExternalDevicesRadioBtn(), "Data Storage And External Devices radio btn is not enabled");
		Assert.assertTrue(today.checkDesktopsRadioBtn(), "Desktops radio btn is not enabled");
		Assert.assertTrue(today.checkElectronicsRadioBtn(), "Electronics radio btn is not enabled");
		Assert.assertTrue(today.checkElectonicsAccessoriesRadioBtn(), "Electonics Accessories radio btn is not enabled");
		Assert.assertTrue(today.checkFurnitureRadioBtn(), "Furniture radio btn is not enabled");
		Assert.assertTrue(today.checkGardenAndOutdoorsRadioBtn(), "Garden And Outdoors radio btn is not enabled");
		Assert.assertTrue(today.checkGiftsCardsRadioBtn(), "Gifts cards radio btn is not enabled");
		Assert.assertTrue(today.checkGroceryRadioBtn(), "Grocery radio btn is not enabled");
		Assert.assertTrue(today.checkHandbagsRadioBtn(), "Handbags radio btn is not enabled");
		Assert.assertTrue(today.checkHeadphonesRadioBtn(), "Headphones radio btn is not enabled");
		Assert.assertTrue(today.checkHealthAndPersonalCareRadioBtn(), "Health And Personal Care radio btn is not enabled");
		Assert.assertTrue(today.checkHomeAndDecorRadioBtn(), "Home And Decor radio btn is not enabled");
		Assert.assertTrue(today.checkHomeAndKitchenRadioBtn(), "Home And Kitchen radio btn is not enabled");
		Assert.assertTrue(today.checkHomeAudioAndAccessoriesRadioBtn(), "Home Audio And Accessories radio btn is not enabled");
		Assert.assertTrue(today.checkHomeEntertainmentSystemsRadioBtn(), "Home Entertainment Systems radio btn is not enabled");
		Assert.assertTrue(today.checkHomeFurnishingRadioBtn(), "Home furnishing radio btn is not enabled");
		Assert.assertTrue(today.checkHomeImproventRadioBtn(), "Home improvement radio btn is not enabled");
		Assert.assertTrue(today.checkHomestorageAndOrganisationRadioBtn(), "Home storage And Organisation radio btn is not enabled");
		Assert.assertTrue(today.checkHouseholdSuppliesRadioBtn(), "Household Supplies radio btn is not enabled");
		Assert.assertTrue(today.checkIndoorLightingRadioBtn(), "Indoor Lighting radio btn is not enabled");
		Assert.assertTrue(today.checkJewelleryRadioBtn(), "Jewellery radio btn is not enabled");
		Assert.assertTrue(today.checkKeyboardsMouseAndInputRadioBtn(), "Keyboards Mouse And Input radio btn is not enabled");
		Assert.assertTrue(today.checkKindleEbooksRadioBtn(), "Kindle Ebooks radio btn is not enabled");
		Assert.assertTrue(today.checkKitchenAndDiningRadioBtn(), "Kitchen And Dining radio btn is not enabled");
		Assert.assertTrue(today.checkLaptopsRadioBtn(), "Laptops radio btn is not enabled");
		Assert.assertTrue(today.checkLargeAppliancesRadioBtn(), "Large Appliances radio btn is not enabled");
		Assert.assertTrue(today.checkLuggageAndBagsRadioBtn(), "Luggage And Bags radio btn is not enabled");
		Assert.assertTrue(today.checkMobileAccessoriesRadioBtn(), "Mobile Accessories radio btn is not enabled");
		Assert.assertTrue(today.checkMobilesRadioBtn(), "Mobiles radio btn is not enabled");
		Assert.assertTrue(today.checkMoviesAndTvShowsRadioBtn(), "Movies And tvShows radio btn is not enabled");
		Assert.assertTrue(today.checkMp3PlayersAndAccessoriesRadioBtn(), "Mp3 Players And Accessories radio btn is not enabled");
		Assert.assertTrue(today.checkMusicRadioBtn(), "Music radio btn is not enabled");
		Assert.assertTrue(today.checkMusicalInstrumentsRadioBtn(), "Musical Instruments radio btn is not enabled");
		Assert.assertTrue(today.checkNetworkingDevicesRadioBtn(), "Networking Devices radio btn is not enabled");
		Assert.assertTrue(today.checkOfficeAndSchoolSuppliesRadioBtn(), "Office And School Supplies radio btn is not enabled");
		Assert.assertTrue(today.checkPersonalCareRadioBtn(), "Personal care radio btn is not enabled");
		Assert.assertTrue(today.checkPetSuppliesRadioBtn(), "Pet Supplies radio btn is not enabled");
		Assert.assertTrue(today.checkShoeCareAndAccessoriesRadioBtn(), "ShoeCare And Accessories radio btn is not enabled");
		Assert.assertTrue(today.checkRefrigeratorsRadioBtn(), "Refrigerators radio btn is not enabled");
		Assert.assertTrue(today.checkShoesBoysRadioBtn(), "Shoes boys radio btn is not enabled");
		Assert.assertTrue(today.checkShoesMensRadioBtn(), "Shoes mens radio btn is not enabled");
		Assert.assertTrue(today.checkShoesWomensRadioBtn(), "Shoes womens radio btn is not enabled");
		Assert.assertTrue(today.checkShowersRadioBtn(), "Showers radio btn is not enabled");
		Assert.assertTrue(today.checkSoftwareRadioBtn(), "Software radio btn is not enabled");
		Assert.assertTrue(today.checkSpeakersRadioBtn(), "Speakers radio btn is not enabled");
		Assert.assertTrue(today.checkSportingGoodsRadioBtn(), "Sporting Goods radio btn is not enabled");
		Assert.assertTrue(today.checkSunglassesMensRadioBtn(), "Sunglasses Mens radio btn is not enabled");
		Assert.assertTrue(today.checkSunglassesGirlsRadioBtn(), "Sunglasses Girls radio btn is not enabled");
		Assert.assertTrue(today.checkSunglassesWomensRadioBtn(), "Sunglasses womens radio btn is not enabled");
		Assert.assertTrue(today.checkTabletsRadioBtn(), "Tablets radio btn is not enabled");
		Assert.assertTrue(today.checkTelevisionsRadioBtn(), "Televisions radio btn is not enabled");
		Assert.assertTrue(today.checkToysRadioBtn(), "Toys radio btn is not enabled");
		Assert.assertTrue(today.checkVideoGamesRadioBtn(), "Video games radio btn is not enabled");
		Assert.assertTrue(today.checkWatchesRadioBtn(), "Watches radio btn is not enabled");
		Assert.assertTrue(today.checkWatchesKidsRadioBtn(), "Watches kids radio btn is not enabled");
		Assert.assertTrue(today.checkWatchesMensRadioBtn(), "Watches mens radio btn is not enabled");
		Assert.assertTrue(today.checkWatchesWomensRadioBtn(), "Watches womens radio btn is not enabled");
		Assert.assertTrue(today.checkActiveRadioBtn(), "Active radio btn is not enabled");
		Assert.assertTrue(today.checkMissedRadioBtn(), "Missed radio btn is not enabled");
		Assert.assertTrue(today.checkUpcomingRadioBtn(), "Upcoming radio btn is not enabled");
		Assert.assertTrue(today.checkUnder500RadioBtn(), "Under 500 radio btn is not enabled");
		Assert.assertTrue(today.checkBetween500And1000RadioBtn(), "Between 500 And 1000 radio btn is not enabled");
		Assert.assertTrue(today.checkBetween1000And2000RadioBtn(), "Between 1000 And 2000 radio btn is not enabled");
		Assert.assertTrue(today.checkBetween2000And5000RadioBtn(), "Between 2000 And 5000 radio btn is not enabled");
		Assert.assertTrue(today.checkAbove5000RadioBtn(), "Above 5000 radio btn is not enabled");
		
	}
	
	@Test
	public void verifySideNavBarLinks() {
		Assert.assertTrue(today.checkSeeMoreDeptLink(), "See more dept link is not enabled");
		Assert.assertTrue(today.checkClearLink(), "clear link is not enabled");
		Assert.assertTrue(today.checkDealOfDayLink(), "Deal Of Day link is not enabled");
		Assert.assertTrue(today.checkCouponsLink(), "Coupons link is not enabled");
		Assert.assertTrue(today.checkPrimeEarlyAccessDealsLink(), "Prime Early Access Deals link is not enabled");
		Assert.assertTrue(today.checkAppOnlyAccessDealsLink(), "App Only Access Deals link is not enabled");
		Assert.assertTrue(today.checkAppEarlyAccessDealsLink(), "App Early Access Deals link is not enabled");
		Assert.assertTrue(today.checkDiscount10perAndAboveLink(), "Discount 10 per And Above link is not enabled");
		Assert.assertTrue(today.checkDiscount25perAndAboveLink(), "Discount 25 per And Above link is not enabled");
		Assert.assertTrue(today.checkDiscount50perAndAboveLink(), "Discount 50 per And Above link is not enabled");
		Assert.assertTrue(today.checkRating4AndAboveLink(), "Rating 4 And Above link is not enabled");
		Assert.assertTrue(today.checkRating3AndAboveLink(), "Rating 3 And Above link is not enabled");
		Assert.assertTrue(today.checkrating2AndAboveLink(), "Rating 2 And Above link is not enabled");
		Assert.assertTrue(today.checkRating1AndAboveLink(), "Rating 1 And Above link is not enabled");
		Assert.assertTrue(today.checkLightingDealsLink(), "Lighting Deals link is not enabled");
		Assert.assertTrue(today.checkSavingAndSalesLink(), "Saving And Sales link is not enabled");
		
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		quit();
	}
	
}
