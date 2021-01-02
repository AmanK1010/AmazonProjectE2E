package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.LibGlobal;
import com.pom.HomePage;
import com.pom.NewReleasesPage;

public class NewReleasesPageTest extends LibGlobal {

	HomePage home;
	NewReleasesPage releases;

	@BeforeMethod
	public void launchNewReleasesAmazonPage() {
		launchBrowser("chrome");
		getToUrl("https://www.amazon.in/");
		home = new HomePage();
		home.getNewReleasesPage();
		releases = new NewReleasesPage();

	}

	@Test
	public void verifyAllNavBarLinks() {
		Assert.assertTrue(releases.checkBestSellersNavBar(), "Best sellers link is not enabled");
		Assert.assertTrue(releases.checkHotNewReleasesNavBar(), "Hot New Releases link is not enabled");
		Assert.assertTrue(releases.checkMoversAndShakersNavBar(), "BMovers And Shakers link is not enabled");
		Assert.assertTrue(releases.checkMostWishedForNavBar(), "Most Wished For link is not enabled");
		Assert.assertTrue(releases.checkMostGiftedNavBar(), "Most Gifted link is not enabled");

	}

	@Test
	public void verifyAllSideNavBarLinks() {
		Assert.assertTrue(releases.checkaAmazonLaunchpadlink(), "Amazon Launchpad link is not enabled");
		Assert.assertTrue(releases.checkAudibleAudiobooksAndOriginalsLink(),
				"Audible Audiobooks And Originals link is not enabled");
		Assert.assertTrue(releases.checkaBabyProductsLink(), "Baby products link is not enabled");
		Assert.assertTrue(releases.checkaBagsWalletsAndLuggageLink(), "Bags Wallets And Luggage link is not enabled");
		Assert.assertTrue(releases.checkaBeautyLink(), "Beauty link is not enabled");
		Assert.assertTrue(releases.checkBooksLink(), "Books link is not enabled");
		Assert.assertTrue(releases.checkClothingAndAccessoriesLink(), "Clothing And Accessories link is not enabled");
		Assert.assertTrue(releases.checkComputersAndAccessoriesLink(), "Computers And Accessories link is not enabled");
		Assert.assertTrue(releases.checkElectronicsLink(), "Electronics link is not enabled");
		Assert.assertTrue(releases.checkGardenAndOutdoorsLink(), "Garden And Outdoors link is not enabled");
		Assert.assertTrue(releases.checkGroceryAndGourmetFoodsLink(), "Grocery And Gourmet Foods link is not enabled");
		Assert.assertTrue(releases.checkHealthAndPersonalCareLink(), "Health And Personal Care link is not enabled");
		Assert.assertTrue(releases.checkHomeAndKitchenLink(), "Home And Kitchen link is not enabled");
		Assert.assertTrue(releases.checkHomeImprovementLink(), "Home Improvement link is not enabled");
		Assert.assertTrue(releases.checkJewelleryLink(), "Jewellery link is not enabled");
		Assert.assertTrue(releases.checkKindleStoreLink(), "Kindle store link is not enabled");
		Assert.assertTrue(releases.checkMoviesAndTvShowsLink(), "Movies And Tv Shows link is not enabled");
		Assert.assertTrue(releases.checkMusicLink(), "Music link is not enabled");
		Assert.assertTrue(releases.checkMusicalInstrumentsLink(), "Musical Instruments link is not enabled");
		Assert.assertTrue(releases.checkOfficeProductsLink(), "Office Products link is not enabled");
		Assert.assertTrue(releases.checkPetSuppliesLink(), "Pet Supplies link is not enabled");
		Assert.assertTrue(releases.checkShoesAndHandbagsLink(), "Shoes And Handbags link is not enabled");
		Assert.assertTrue(releases.checkSportsFitnessAndOutdoorsLink(),
				"Sports Fitness And Outdoors link is not enabled");
		Assert.assertTrue(releases.checkToysAndGamesLink(), "Toys And Games link is not enabled");
		Assert.assertTrue(releases.checkVideoGamesLink(), "Video Games link is not enabled");
		Assert.assertTrue(releases.checkWatchesLink(), "watches Link is not enabled");

	}
	
	@AfterMethod
	public void closeBrowser() {
		quit();
	}

}
