package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.LibGlobal;
import com.pom.BestSellersPage;
import com.pom.HomePage;

public class BestSellersTest extends LibGlobal{
	HomePage home;
	BestSellersPage sell;
	@BeforeMethod
	public void launchAmazonBestSellerPage() {
		launchBrowser("chrome");
		getToUrl("https://www.amazon.in/");
		home = new HomePage();
		home.getBestSellersPage();
		sell = new BestSellersPage();
		
	}
	
	
	@Test
	public void verifySideNavBarLinks() {
		Assert.assertTrue(sell.checkBestSellersLink(), "Best seller link is not enabled");
		Assert.assertTrue(sell.checkHotNewReleasesLink(), "Hot New Releases link is not enabled");
		Assert.assertTrue(sell.checkMoversAndShakersLink(), "Movers And Shakers Link is not enabled");
		Assert.assertTrue(sell.checkMostWishedForLink(), "Most Wished For link is not enabled");
		Assert.assertTrue(sell.checkMostGiftedLink(), "Most Gifted link is not enabled");
		Assert.assertTrue(sell.checkAmazonLaunchpadLink(), "Amazon Launchpad link is not enabled");
		Assert.assertTrue(sell.checkAppsForAndroidLink(), "Apps For Android link is not enabled");
		Assert.assertTrue(sell.checkAudibleAudiobooksLink(), "Audible Audio books link is not enabled");
		Assert.assertTrue(sell.checkBabyProductsLink(), "Baby Products link is not enabled");
		Assert.assertTrue(sell.checkBeautyLink(), "Beauty link is not enabled");
		Assert.assertTrue(sell.checkBooksLink(), "books link is not enabled");
		Assert.assertTrue(sell.checkCarAndMotorbikeLink(), "Car And Motorbike link is not enabled");
		Assert.assertTrue(sell.checkClothingAndAccessoriesLink(), "Clothing And Accessories link is not enabled");
		Assert.assertTrue(sell.checkComputersAndAccessoriesLink(), "Computers And Accessories link is not enabled");
		Assert.assertTrue(sell.checkElectronicsLink(), "Electronics link is not enabled");
		Assert.assertTrue(sell.checkGroceryAndGourmetFoodsLink(), "Grocery And Gourmet Foods link is not enabled");
		Assert.assertTrue(sell.checkHealthAndPersonalCareLink(), "Health And Personal Care link is not enabled");
		Assert.assertTrue(sell.checkGardenAndOutdoorsLink(), "Garden And Outdoors link is not enabled");
		Assert.assertTrue(sell.checkGiftCardsLink(), "Gift cards link is not enabled");
		Assert.assertTrue(sell.checkHomeAndKitchenLink(), "Home And Kitchen link is not enabled");
		Assert.assertTrue(sell.checkIndustrialAndScientificLink(), "Industrial And Scientific link is not enabled");
		Assert.assertTrue(sell.checkHomeImprovementLink(), "Home Improvement link is not enabled");
		Assert.assertTrue(sell.checkJewelleryLink(), "Jewellery link is not enabled");
		Assert.assertTrue(sell.checkKindleStoreLink(), "Kindle store link is not enabled");
		Assert.assertTrue(sell.checkMoviesAndTVShowsLink(), "Movies And TVShows link is not enabled");
		Assert.assertTrue(sell.checkMusicLink(), "Music link is not enabled");
		Assert.assertTrue(sell.checkMusicalInstrumentsLink(), "Musical Instruments link is not enabled");
		Assert.assertTrue(sell.checkOfficeProductsLink(), "Office Products link is not enabled");
		Assert.assertTrue(sell.checkPetSuppliesLink(), "Pet Supplies link is not enabled");
		Assert.assertTrue(sell.checkShoesAndHandbagsLink(), "Shoes And Handbags link is not enabled");
		Assert.assertTrue(sell.checkSoftwareLink(), "software link is not enabled");
		Assert.assertTrue(sell.checkSportsFitnessAndOutdoorsLink(), "Sports Fitness And Outdoors link is not enabled");
		Assert.assertTrue(sell.checkToysAndGamesLink(), "Toys And Games link is not enabled");
		Assert.assertTrue(sell.checkVideoGamesLink(), "video Games link is not enabled");
		Assert.assertTrue(sell.checkWatchesLink(), "watches link is not enabled");
	
	}
	
}
