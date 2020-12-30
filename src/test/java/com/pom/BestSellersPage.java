package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.LibGlobal;

public class BestSellersPage extends LibGlobal {

	public BestSellersPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Bestsellers']")
	private WebElement bestSellersLink;
	
	@FindBy(xpath="//a[text()='Hot New Releases']")
	private WebElement hotNewReleasesLink;
	
	@FindBy(xpath="//a[text()='Movers and Shakers']")
	private WebElement moversAndShakersLink;
	
	@FindBy(xpath="//a[text()='Most Wished For']")
	private WebElement mostWishedForLink;
	
	@FindBy(xpath="//a[text()='Most Gifted']")
	private WebElement mostGiftedLink;
	
	@FindBy(xpath="//a[text()='Amazon Launchpad']")
	private WebElement amazonLaunchpadLink;
	
	@FindBy(xpath="//a[text()='Apps for Android']")
	private WebElement appsForAndroidLink;
	
	@FindBy(xpath="//a[text()='Audible Audiobooks & Originals']")
	private WebElement audibleAudiobooksLink;
	
	@FindBy(xpath="//a[text()='Baby Products']")
	private WebElement babyProductsLink;
	
	@FindBy(xpath="//a[text()='Bags, Wallets and Luggage']")
	private WebElement bagsWalletsAndLuggageLink;
	
	@FindBy(xpath="//a[text()='Beauty']")
	private WebElement beautyLink;
	
	@FindBy(xpath="//a[text()='Books']")
	private WebElement booksLink;
	
	@FindBy(xpath="//a[text()='Car & Motorbike']")
	private WebElement carAndMotorbikeLink;
	
	@FindBy(xpath="//a[text()='Clothing & Accessories']")
	private WebElement clothingAndAccessoriesLink;
	
	@FindBy(xpath="//a[text()='Computers & Accessories']")
	private WebElement computersAndAccessoriesLink;
	
	@FindBy(xpath="//a[text()='Electronics']")
	private WebElement electronicsLink;
	
	@FindBy(xpath="//a[text()='Garden & Outdoors']")
	private WebElement gardenAndOutdoorsLink;
	
	@FindBy(xpath="//a[text()='Gift Cards']")
	private WebElement giftCardsLink;
	
	@FindBy(xpath="//a[text()='Grocery & Gourmet Foods']")
	private WebElement groceryAndGourmetFoodsLink;
	
	@FindBy(xpath="//a[text()='Health & Personal Care']")
	private WebElement healthAndPersonalCareLink;
	
	@FindBy(xpath="//a[text()='Home & Kitchen']")
	private WebElement homeAndKitchenLink;
	
	@FindBy(xpath="//a[text()='Home Improvement']")
	private WebElement homeImprovementLink;
	
	@FindBy(xpath="//a[text()='Industrial & Scientific']")
	private WebElement industrialAndScientificLink;
	
	@FindBy(xpath="//a[text()='Jewellery']")
	private WebElement jewelleryLink;
	
	@FindBy(xpath="//a[text()='Kindle Store']")
	private WebElement kindleStoreLink;
	
	@FindBy(xpath="//a[text()='Movies & TV Shows']")
	private WebElement moviesAndTVShowsLink;
	
	@FindBy(xpath="//a[text()='Music']")
	private WebElement musicLink;
	
	@FindBy(xpath="//a[text()='Musical Instruments']")
	private WebElement musicalInstrumentsLink;
	
	@FindBy(xpath="//a[text()='Office Products']")
	private WebElement officeProductsLink;
	
	@FindBy(xpath="//a[text()='Pet Supplies']")
	private WebElement petSuppliesLink;
	
	@FindBy(xpath="//a[text()='Shoes & Handbags']")
	private WebElement shoesAndHandbagsLink;
	
	@FindBy(xpath="//a[text()='Software']")
	private WebElement softwareLink;
	
	@FindBy(xpath="//a[text()='Sports, Fitness & Outdoors']")
	private WebElement sportsFitnessAndOutdoorsLink;
	
	@FindBy(xpath="//a[text()='Toys & Games']")
	private WebElement toysAndGamesLink;
	
	@FindBy(xpath="//a[text()='Video Games']")
	private WebElement videoGamesLink;
	
	@FindBy(xpath="//a[text()='Watches']")
	private WebElement watchesLink;
	
	public boolean checkBestSellersLink() {
		return isEnabled(bestSellersLink);
	}
	
	public boolean checkHotNewReleasesLink() {
		return isEnabled(hotNewReleasesLink);
	}
	
	public boolean checkMoversAndShakersLink() {
		return isEnabled(moversAndShakersLink);
	}
	
	public boolean checkMostWishedForLink() {
		return isEnabled(mostWishedForLink);
	}
	
	public boolean checkMostGiftedLink() {
		return isEnabled(mostGiftedLink);
	}
	
	public boolean checkAmazonLaunchpadLink() {
		return isEnabled(amazonLaunchpadLink);
	}
	
	public boolean checkAppsForAndroidLink() {
		return isEnabled(appsForAndroidLink);
	}
	
	public boolean checkAudibleAudiobooksLink() {
		return isEnabled(audibleAudiobooksLink);
	}
	
	public boolean checkBabyProductsLink() {
		return isEnabled(babyProductsLink);
	}
	
	public boolean checkBeautyLink() {
		return isEnabled(beautyLink);
	}
	
	public boolean checkBooksLink() {
		return isEnabled(booksLink);
	}
	
	public boolean checkCarAndMotorbikeLink() {
		return isEnabled(carAndMotorbikeLink);
	}
	
	public boolean checkClothingAndAccessoriesLink() {
		return isEnabled(clothingAndAccessoriesLink);
	}
	
	public boolean checkComputersAndAccessoriesLink() {
		return isEnabled(computersAndAccessoriesLink);
	}
	
	public boolean checkElectronicsLink() {
		return isEnabled(electronicsLink);
	}
	
	public boolean checkGroceryAndGourmetFoodsLink() {
		return isEnabled(groceryAndGourmetFoodsLink);
	}
	
	public boolean checkHealthAndPersonalCareLink() {
		return isEnabled(healthAndPersonalCareLink);
	}
	
	public boolean checkGardenAndOutdoorsLink() {
		return isEnabled(gardenAndOutdoorsLink);
	}
	
	public boolean checkGiftCardsLink() {
		return isEnabled(giftCardsLink);
	}
	
	public boolean checkHomeAndKitchenLink() {
		return isEnabled(homeAndKitchenLink);
	}
	
	public boolean checkIndustrialAndScientificLink() {
		return isEnabled(industrialAndScientificLink);
	}
	
	public boolean checkHomeImprovementLink() {
		return isEnabled(homeImprovementLink);
	}
	
	public boolean checkJewelleryLink() {
		return isEnabled(jewelleryLink);
	}
	
	public boolean checkKindleStoreLink() {
		return isEnabled(kindleStoreLink);
	}
	
	public boolean checkMoviesAndTVShowsLink() {
		return isEnabled(moviesAndTVShowsLink);
	}
	
	public boolean checkMusicLink() {
		return isEnabled(musicLink);
	}
	
	public boolean checkMusicalInstrumentsLink() {
		return isEnabled(musicalInstrumentsLink);
	}
	
	public boolean checkOfficeProductsLink() {
		return isEnabled(officeProductsLink);
	}
	
	public boolean checkPetSuppliesLink() {
		return isEnabled(petSuppliesLink);
	}
	
	public boolean checkShoesAndHandbagsLink() {
		return isEnabled(shoesAndHandbagsLink);
	}
	
	public boolean checkSoftwareLink() {
		return isEnabled(softwareLink);
	}
	
	public boolean checkSportsFitnessAndOutdoorsLink() {
		return isEnabled(sportsFitnessAndOutdoorsLink);
	}
	
	public boolean checkToysAndGamesLink() {
		return isEnabled(toysAndGamesLink);
	}
	
	public boolean checkVideoGamesLink() {
		return isEnabled(videoGamesLink);
	}
	
	public boolean checkWatchesLink() {
		return isEnabled(watchesLink);
	}
	
}
