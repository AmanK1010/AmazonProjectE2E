package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.LibGlobal;

public class NewReleasesPage extends LibGlobal {

	public NewReleasesPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Bestsellers']")
	private WebElement bestSellersNavBar;

	@FindBy(xpath = "//a[text()='Hot New Releases']")
	private WebElement hotNewReleasesNavBar;

	@FindBy(xpath = "(//a[text()='Movers and Shakers'])[1]")
	private WebElement moversAndShakersNavBar;

	@FindBy(xpath = "(//a[text()='Most Wished For'])")
	private WebElement mostWishedForNavBar;

	@FindBy(xpath = "(//a[text()='Most Gifted'])")
	private WebElement mostGiftedNavBar;

	public boolean checkBestSellersNavBar() {
		return isEnabled(bestSellersNavBar);
	}

	public boolean checkHotNewReleasesNavBar() {
		return isEnabled(hotNewReleasesNavBar);
	}

	public boolean checkMoversAndShakersNavBar() {
		return isEnabled(moversAndShakersNavBar);
	}

	public boolean checkMostWishedForNavBar() {
		return isEnabled(mostWishedForNavBar);
	}

	public boolean checkMostGiftedNavBar() {
		return isEnabled(mostGiftedNavBar);
	}

	@FindBy(xpath = "//a[text()='Amazon Launchpad']")
	private WebElement amazonLaunchpadlink;

	@FindBy(xpath = "//a[text()='Audible Audiobooks & Originals']")
	private WebElement audibleAudiobooksAndOriginalsLink;

	@FindBy(xpath = "//a[text()='Baby Products']")
	private WebElement babyProductsLink;

	@FindBy(xpath = "//a[contains(text(),'Bags, Wallets and Luggage')]")
	private WebElement bagsWalletsAndLuggageLink;

	@FindBy(xpath = "//a[text()='Beauty']")
	private WebElement beautyLink;

	@FindBy(xpath = "(//a[text()='Books'])[2]")
	private WebElement booksLink;

	@FindBy(xpath = "//a[contains(text(),'Clothing & Accessories')]")
	private WebElement clothingAndAccessoriesLink;

	@FindBy(xpath = "//a[contains(text(),'Computers & Accessories')]")
	private WebElement computersAndAccessoriesLink;

	@FindBy(xpath = "(//a[text()='Electronics'])")
	private WebElement electronicsLink;

	@FindBy(xpath = "//a[contains(text(),'Garden & Outdoors')]")
	private WebElement gardenAndOutdoorsLink;

	@FindBy(xpath = "(//a[text()='Grocery & Gourmet Foods'])[2]")
	private WebElement groceryAndGourmetFoodsLink;

	@FindBy(xpath = "//a[contains(text(),'Health & Personal Care')]")
	private WebElement healthAndPersonalCareLink;

	@FindBy(xpath = "(//a[text()='Home & Kitchen'])[2]")
	private WebElement homeAndKitchenLink;

	@FindBy(xpath = "(//a[text()='Home Improvement'])[2]")
	private WebElement homeImprovementLink;

	@FindBy(xpath = "//a[contains(text(),'Jewellery')]")
	private WebElement jewelleryLink;

	@FindBy(xpath = "//a[contains(text(),'Kindle Store')]")
	private WebElement kindleStoreLink;

	@FindBy(xpath = "//a[contains(text(),'Movies & TV Shows')]")
	private WebElement moviesAndTvShowsLink;

	@FindBy(xpath = "(//a[text()='Music'])")
	private WebElement musicLink;

	@FindBy(xpath = "(//a[text()='Musical Instruments'])")
	private WebElement musicalInstrumentsLink;

	@FindBy(xpath = "//a[contains(text(),'Office Products')]")
	private WebElement officeProductsLink;

	@FindBy(xpath = "(//a[text()='Pet Supplies'])[2]")
	private WebElement petSuppliesLink;

	@FindBy(xpath = "//a[contains(text(),'Shoes & Handbags')]")
	private WebElement shoesAndHandbagsLink;

	@FindBy(xpath = "(//a[text()='Sports, Fitness & Outdoors'])[2]")
	private WebElement sportsFitnessAndOutdoorsLink;

	@FindBy(xpath = "(//a[text()='Toys & Games'])[2]")
	private WebElement toysAndGamesLink;

	@FindBy(xpath = "(//a[text()='Video Games'])[2]")
	private WebElement videoGamesLink;

	@FindBy(xpath = "//a[contains(text(),'Watches')]")
	private WebElement watchesLink;

	public boolean checkaAmazonLaunchpadlink() {
		return isEnabled(amazonLaunchpadlink);
	}

	public boolean checkAudibleAudiobooksAndOriginalsLink() {
		return isEnabled(audibleAudiobooksAndOriginalsLink);
	}

	public boolean checkaBabyProductsLink() {
		return isEnabled(babyProductsLink);
	}

	public boolean checkaBagsWalletsAndLuggageLink() {
		return isEnabled(bagsWalletsAndLuggageLink);
	}

	public boolean checkaBeautyLink() {
		return isEnabled(beautyLink);
	}

	public boolean checkBooksLink() {
		return isEnabled(booksLink);
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

	public boolean checkGardenAndOutdoorsLink() {
		return isEnabled(gardenAndOutdoorsLink);
	}

	public boolean checkGroceryAndGourmetFoodsLink() {
		return isEnabled(groceryAndGourmetFoodsLink);
	}

	public boolean checkHealthAndPersonalCareLink() {
		return isEnabled(healthAndPersonalCareLink);
	}

	public boolean checkHomeAndKitchenLink() {
		return isEnabled(homeAndKitchenLink);
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

	public boolean checkMoviesAndTvShowsLink() {
		return isEnabled(moviesAndTvShowsLink);
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
