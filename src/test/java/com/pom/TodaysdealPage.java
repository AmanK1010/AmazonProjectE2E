package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.LibGlobal;

public class TodaysdealPage extends LibGlobal {

	public TodaysdealPage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="(//span[@class='nav-a-content'])[1]")
	private WebElement todaysDealsTab;
	
	@FindBy(xpath="(//span[@class='nav-a-content'])[2]")
	private WebElement allDealsTab;
	
	
	
	@FindBy(xpath="(//span[@class='nav-a-content'])[3]")
	private WebElement watchedDealsTab;
	
	@FindBy(xpath="(//span[@class='nav-a-content'])[4]")
	private WebElement subscribeAndSubscribeTab;
	
	@FindBy(xpath="(//span[@class='nav-a-content'])[5]")
	private WebElement couponsTab;
	
	@FindBy(xpath="(//span[@class='nav-a-content'])[6]")
	private WebElement amazonAssistantTab;
	
	@FindBy(xpath="(//span[@class='nav-a-content'])[7]")
	private WebElement clearanceTab;
	
	@FindBy(xpath="(//span[@class='nav-a-content'])[8]")
	private WebElement refurbishedAndOpenBoxTab;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[43]")
	private WebElement appliancesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[44]")
	private WebElement artworkRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[45]")
	private WebElement babyProductsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[46]")
	private WebElement beautyRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[47]")
	private WebElement booksRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[48]")
	private WebElement businessIndustrialAndScientificSuppliesRadioBtn;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[49]")
	private WebElement cameraAccessoriesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[50]")
	private WebElement camerasAndPhotographyRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[51]")
	private WebElement carAndMotorbikeAccessoriesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[52]")
	private WebElement chimneysKitchenRadioBtn;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[53]")
	private WebElement clothingBabyRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[54]")
	private WebElement clothingBoysRadioBtn;
	
	@FindBy(xpath="//span[@class='a-expander-prompt']")
	private WebElement seeMoreDeptLink;
	
	@FindBy(xpath="(//input[@type='checkbox'])[55]")
	private WebElement clothingGirlsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[56]")
	private WebElement clothingMensRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[57]")
	private WebElement clothingWomensRadioBtn;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[58]")
	private WebElement clothingAndAccessoriesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[59]")
	private WebElement computerComponentsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[60]")
	private WebElement computersAndAccessoriesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[61]")
	private WebElement dataStorageAndExternalDevicesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[62]")
	private WebElement desktopsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[63]")
	private WebElement dslrRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[64]")
	private WebElement electronicsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[65]")
	private WebElement electonicsAccessoriesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[66]")
	private WebElement furnitureRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[67]")
	private WebElement gardenAndOutdoorsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[68]")
	private WebElement giftsCardsRadioBtn;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[69]")
	private WebElement groceryRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[70]")
	private WebElement handbagsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[71]")
	private WebElement headphonesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[72]")
	private WebElement healthAndPersonalCareRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[73]")
	private WebElement homeAndDecorRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[74]")
	private WebElement homeAndKitchenRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[75]")
	private WebElement homeAudioAndAccessoriesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[76]")
	private WebElement homeEntertainmentSystemsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[77]")
	private WebElement homeFurnishingRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[78]")
	private WebElement homeImproventRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[79]")
	private WebElement homestorageAndOrganisationRadioBtn;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[80]")
	private WebElement householdSuppliesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[81]")
	private WebElement indoorLightingRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[82]")
	private WebElement jewelleryRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[83]")
	private WebElement keyboardsMouseAndInputRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[84]")
	private WebElement kindleEbooksRadioBtn;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[85]")
	private WebElement kitchenAndDiningRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[86]")
	private WebElement laptopsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[87]")
	private WebElement largeAppliancesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[88]")
	private WebElement luggageAndBagsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[89]")
	private WebElement mobileAccessoriesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[90]")
	private WebElement mobilesRadioBtn;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[91]")
	private WebElement moviesAndTvShowsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[92]")
	private WebElement mp3PlayersAndAccessoriesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[93]")
	private WebElement musicRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[94]")
	private WebElement musicalInstrumentsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[95]")
	private WebElement networkingDevicesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[96]")
	private WebElement officeAndSchoolSuppliesRadioBtn;
	
	 
	@FindBy(xpath="(//input[@type='checkbox'])[97]")
	private WebElement personalCareRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[98]")
	private WebElement petSuppliesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[99]")
	private WebElement refrigeratorsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[100]")
	private WebElement shoeCareAndAccessoriesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[101]")
	private WebElement shoesBoysRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[102]")
	private WebElement shoesMensRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[103]")
	private WebElement shoesWomensRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[104]")
	private WebElement showersRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[105]")
	private WebElement softwareRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[106]")
	private WebElement speakersRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[107]")
	private WebElement sportingGoodsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[108]")
	private WebElement sunglassesGirlsRadioBtn;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[109]")
	private WebElement sunglassesMensRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[110]")
	private WebElement sunglassesWomensRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[111]")
	private WebElement tabletsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[112]")
	private WebElement televisionsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[113]")
	private WebElement toysRadioBtn;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[114]")
	private WebElement videoGamesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[115]")
	private WebElement watchesRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[116]")
	private WebElement watchesKidsRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[117]")
	private WebElement watchesMensRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[118]")
	private WebElement watchesWomensRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[119]")
	private WebElement activeRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[120]")
	private WebElement missedRadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[121]")
	private WebElement upcomingRadioBtn;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[122]")
	private WebElement under500RadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[123]")
	private WebElement between500And1000RadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[124]")
	private WebElement between1000And2000RadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[125]")
	private WebElement between2000And5000RadioBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[126]")
	private WebElement above5000RadioBtn;
	
	@FindBy(xpath="(//a[@class='a-link-normal'])[11]")
	private WebElement clearLink;
	
	@FindBy(xpath="(//a[@class='a-link-normal'])[12]")
	private WebElement dealOfDayLink;
	
	
	@FindBy(xpath="(//a[@class='a-link-normal'])[13]")
	private WebElement couponsLink;
	
	@FindBy(xpath="(//a[@class='a-link-normal'])[14]")
	private WebElement primeEarlyAccessDealsLink;
	
	@FindBy(xpath="(//a[@class='a-link-normal'])[15]")
	private WebElement appOnlyAccessDealsLink;
	
	@FindBy(xpath="(//a[@class='a-link-normal'])[16]")
	private WebElement appEarlyAccessDealsLink;
	
	@FindBy(xpath="(//a[@class='a-link-normal'])[17]")
	private WebElement discount10perAndAboveLink;
	
	@FindBy(xpath="(//a[@class='a-link-normal'])[18]")
	private WebElement discount25perAndAboveLink;
	
	
	@FindBy(xpath="(//a[@class='a-link-normal'])[19]")
	private WebElement discount50perAndAboveLink;
	
	@FindBy(xpath="(//a[@class='a-link-normal'])[20]")
	private WebElement discount70perAndAboveLink;
	
	@FindBy(xpath="(//div[@class='a-row a-spacing-micro'])[10]")
	private WebElement rating4AndAboveLink;
	
	@FindBy(xpath="(//div[@class='a-row a-spacing-micro'])[11]")
	private WebElement rating3AndAboveLink;
	
	@FindBy(xpath="(//div[@class='a-row a-spacing-micro'])[12]")
	private WebElement rating2AndAboveLink;
	
	@FindBy(xpath="(//div[@class='a-row a-spacing-micro'])[13]")
	private WebElement rating1AndAboveLink;
	
	@FindBy(xpath="(//a[@class='a-link-normal a-text-bold'])[2]")
	private WebElement lightingDealsLink;
	
	@FindBy(xpath="(//a[@class='a-link-normal a-text-bold'])[3]")
	private WebElement savingAndSalesLink;
	
	  
		
	public void checkTodaysDealsTab() {
		isEnabled(todaysDealsTab);
	}
	
	public void checkAllDealsTab() {
		isEnabled(allDealsTab);
	}
	
	public void checkWatchedDealsTab() {
		isEnabled(watchedDealsTab);
	}
	
	public void checkSubscribeAndSubscribeTab() {
		isEnabled(subscribeAndSubscribeTab);
	}
	
	public void checkCouponsTab() {
		isEnabled(couponsTab);
	}
	
	public void checkAmazonAssistantTab() {
		isEnabled(amazonAssistantTab);
	}
	
	public void checkClearanceTab() {
		isEnabled(clearanceTab);
	}
	
	     
	public void checkRefurbishedAndOpenBoxTab() {
		isEnabled(refurbishedAndOpenBoxTab);
	}
	
	public void checkAppliancesRadioBtn() {
		isEnabled(appliancesRadioBtn);
	}
	
	public void checkArtworkRadioBtn() {
		isEnabled(artworkRadioBtn);
	}
	
	public void checkBabyProductsRadioBtn() {
		isEnabled(babyProductsRadioBtn);
	}
	
	   
	public void checkBeautyRadioBtn() {
		isEnabled(beautyRadioBtn);
	}
	
	public void checkBooksRadioBtn() {
		isEnabled(booksRadioBtn);
	}
	
	public void checkBusinessIndustrialAndScientificSuppliesRadioBtn() {
		isEnabled(businessIndustrialAndScientificSuppliesRadioBtn);
	}
	
	public void checkCameraAccessoriesRadioBtn() {
		isEnabled(cameraAccessoriesRadioBtn);
	}
	
	public void checkCamerasAndPhotographyRadioBtn() {
		isEnabled(camerasAndPhotographyRadioBtn);
	}
	
	public void checkCarAndMotorbikeAccessoriesRadioBtn() {
		isEnabled(carAndMotorbikeAccessoriesRadioBtn);
	}
	
	     
	public void checkChimneysKitchenRadioBtn() {
		isEnabled(chimneysKitchenRadioBtn);
	}
	
	
	public void checkClothingBabyRadioBtn() {
		isEnabled(clothingBabyRadioBtn);
	}
	
	public void checkClothingBoysRadioBtn() {
		isEnabled(clothingBoysRadioBtn);
	}
	
	public void checkSeeMoreDeptLink() {
		isEnabled(seeMoreDeptLink);
	}
	
	
	public void checkClothingGirlsRadioBtn() {
		isEnabled(clothingGirlsRadioBtn);
	}
	
	
	public void checkClothingMensRadioBtn() {
		isEnabled(clothingMensRadioBtn);
	}
	 //   
	public void checkClothingWomensRadioBtn() {
		isEnabled(clothingWomensRadioBtn);
	}
	
	public void checkClothingAndAccessoriesRadioBtn() {
		isEnabled(clothingAndAccessoriesRadioBtn);
	}
	
	public void checkComputerComponentsRadioBtn() {
		isEnabled(computerComponentsRadioBtn);
	}
	
	public void checkComputersAndAccessoriesRadioBtn() {
		isEnabled(computersAndAccessoriesRadioBtn);
	}
	
	public void checkDataStorageAndExternalDevicesRadioBtn() {
		isEnabled(dataStorageAndExternalDevicesRadioBtn);
	}
	
	      
	
	public void checkDesktopsRadioBtn() {
		isEnabled(desktopsRadioBtn);
	}
	
	public void checkElectronicsRadioBtn() {
		isEnabled(electronicsRadioBtn);
	}
	
	public void checkElectonicsAccessoriesRadioBtn() {
		isEnabled(electonicsAccessoriesRadioBtn);
	}
	
	public void checkFurnitureRadioBtn() {
		isEnabled(furnitureRadioBtn);
	}
	
	public void checkGardenAndOutdoorsRadioBtn() {
		isEnabled(gardenAndOutdoorsRadioBtn);
	}
	
	          
	public void checkGiftsCardsRadioBtn() {
		isEnabled(giftsCardsRadioBtn);
	}
	
	public void checkGroceryRadioBtn() {
		isEnabled(groceryRadioBtn);
	}
	
	public void checkHandbagsRadioBtn() {
		isEnabled(handbagsRadioBtn);
	}
	
	public void checkHeadphonesRadioBtn() {
		isEnabled(headphonesRadioBtn);
	}
	
	public void checkHealthAndPersonalCareRadioBtn() {
		isEnabled(healthAndPersonalCareRadioBtn);
	}
	
	public void checkHomeAndDecorRadioBtn() {
		isEnabled(homeAndDecorRadioBtn);
	}
	
	public void checkHomeAndKitchenRadioBtn() {
		isEnabled(homeAndKitchenRadioBtn);
	}
	
	public void checkHomeAudioAndAccessoriesRadioBtn() {
		isEnabled(homeAudioAndAccessoriesRadioBtn);
	}
	
	public void checkHomeEntertainmentSystemsRadioBtn() {
		isEnabled(homeEntertainmentSystemsRadioBtn);
	}
	
	public void checkHomeFurnishingRadioBtn() {
		isEnabled(homeFurnishingRadioBtn);
	}
	
	public void checkHomeImproventRadioBtn() {
		isEnabled(homeImproventRadioBtn);
	}
	
	    
	public void checkHomestorageAndOrganisationRadioBtn() {
		isEnabled(homestorageAndOrganisationRadioBtn);
	}
	
	public void checkHouseholdSuppliesRadioBtn() {
		isEnabled(householdSuppliesRadioBtn);
	}
	
	public void checkIndoorLightingRadioBtn() {
		isEnabled(indoorLightingRadioBtn);
	}
	
	public void checkJewelleryRadioBtn() {
		isEnabled(jewelleryRadioBtn);
	}
	
	public void checkKeyboardsMouseAndInputRadioBtn() {
		isEnabled(keyboardsMouseAndInputRadioBtn);
	}
	
	     
	
	public void checkKindleEbooksRadioBtn() {
		isEnabled(kindleEbooksRadioBtn);
	}
	
	public void checkKitchenAndDiningRadioBtn() {
		isEnabled(kitchenAndDiningRadioBtn);
	}
	
	public void checkLaptopsRadioBtn() {
		isEnabled(laptopsRadioBtn);
	}
	
	public void checkLargeAppliancesRadioBtn() {
		isEnabled(largeAppliancesRadioBtn);
	}
	
	      
	public void checkLuggageAndBagsRadioBtn() {
		isEnabled(luggageAndBagsRadioBtn);
	}
	
	public void checkMobileAccessoriesRadioBtn() {
		isEnabled(mobileAccessoriesRadioBtn);
	}
	public void checkMobilesRadioBtn() {
		isEnabled(mobilesRadioBtn);
	}
	public void checkMoviesAndTvShowsRadioBtn() {
		isEnabled(moviesAndTvShowsRadioBtn);
	}
	
	public void checkMp3PlayersAndAccessoriesRadioBtn() {
		isEnabled(mp3PlayersAndAccessoriesRadioBtn);
	}
	
	public void checkMusicRadioBtn() {
		isEnabled(musicRadioBtn);
	}
	
	public void checkMusicalInstrumentsRadioBtn() {
		isEnabled(musicalInstrumentsRadioBtn);
	}
	
	public void checkNetworkingDevicesRadioBtn() {
		isEnabled(networkingDevicesRadioBtn);
	}
	
	    
	public void checkOfficeAndSchoolSuppliesRadioBtn() {
		isEnabled(officeAndSchoolSuppliesRadioBtn);
	}
	
	public void checkPersonalCareRadioBtn() {
		isEnabled(personalCareRadioBtn);
	}
	
	public void checkPetSuppliesRadioBtn() {
		isEnabled(petSuppliesRadioBtn);
	}
	
	
	public void checkShoeCareAndAccessoriesRadioBtn() {
		isEnabled(shoeCareAndAccessoriesRadioBtn);
	}
	
	public void checkRefrigeratorsRadioBtn() {
		isEnabled(refrigeratorsRadioBtn);
	}

	       
	public void checkShoesBoysRadioBtn() {
		isEnabled(shoesBoysRadioBtn);
	}
	
	public void checkShoesMensRadioBtn() {
		isEnabled(shoesMensRadioBtn);
	}
	
	public void checkShoesWomensRadioBtn() {
		isEnabled(shoesWomensRadioBtn);
	}
	
	public void checkShowersRadioBtn() {
		isEnabled(showersRadioBtn);
	}
	
	public void checkSoftwareRadioBtn() {
		isEnabled(softwareRadioBtn);
	}
	
	public void checkSpeakersRadioBtn() {
		isEnabled(speakersRadioBtn);
	}
	
	public void checkSportingGoodsRadioBtn() {
		isEnabled(sportingGoodsRadioBtn);
	}
	
	      
	
	public void checkSunglassesGirlsRadioBtn() {
		isEnabled(sunglassesGirlsRadioBtn);
	}
	
	public void checkSunglassesMensRadioBtn() {
		isEnabled(sunglassesMensRadioBtn);
	}
	
	public void checkSunglassesWomensRadioBtn() {
		isEnabled(sunglassesWomensRadioBtn);
	}
	
	public void checkTabletsRadioBtn() {
		isEnabled(tabletsRadioBtn);
	}
	
	public void checkTelevisionsRadioBtn() {
		isEnabled(televisionsRadioBtn);
	}
	
	      
	public void checkToysRadioBtn() {
		isEnabled(toysRadioBtn);
	}
	
	public void checkVideoGamesRadioBtn() {
		isEnabled(videoGamesRadioBtn);
	}
	
	public void checkWatchesRadioBtn() {
		isEnabled(watchesRadioBtn);
	}
	
	public void checkWatchesKidsRadioBtn() {
		isEnabled(watchesKidsRadioBtn);
	}
	
	public void checkWatchesMensRadioBtn() {
		isEnabled(watchesMensRadioBtn);
	}
	
	public void checkWatchesWomensRadioBtn() {
		isEnabled(watchesWomensRadioBtn);
	}
	
	public void checkActiveRadioBtn() {
		isEnabled(activeRadioBtn);
	}
	
	public void checkMissedRadioBtn() {
		isEnabled(missedRadioBtn);
	}
	     
	
	public void checkUpcomingRadioBtn() {
		isEnabled(upcomingRadioBtn);
	}
	
	public void checkUnder500RadioBtn() {
		isEnabled(under500RadioBtn);
	}
	
	public void checkBetween500And1000RadioBtn() {
		isEnabled(between500And1000RadioBtn);
	}
	
	public void checkBetween1000And2000RadioBtn() {
		isEnabled(between1000And2000RadioBtn);
	}
	
	public void checkBetween2000And5000RadioBtn() {
		isEnabled(between2000And5000RadioBtn);
	}
	
	public void checkAbove5000RadioBtn() {
		isEnabled(above5000RadioBtn);
	}
	      
	public void checkClearLink() {
		isEnabled(clearLink);
	}
	
	public void checkDealOfDayLink() {
		isEnabled(dealOfDayLink);
	}
	
	public void checkCouponsLink() {
		isEnabled(couponsLink);
	}
	
	public void checkPrimeEarlyAccessDealsLink() {
		isEnabled(primeEarlyAccessDealsLink);
	}
	
	public void checkAppOnlyAccessDealsLink() {
		isEnabled(appOnlyAccessDealsLink);
	}
	
	public void checkAppEarlyAccessDealsLink() {
		isEnabled(appEarlyAccessDealsLink);
	}
	
	public void checkDiscount10perAndAboveLink() {
		isEnabled(discount10perAndAboveLink);
	}
	      
	public void checkDiscount25perAndAboveLink() {
		isEnabled(discount25perAndAboveLink);
	}
	
	public void checkDiscount50perAndAboveLink() {
		isEnabled(discount50perAndAboveLink);
	}
	
	public void checkRating4AndAboveLink() {
		isEnabled(rating4AndAboveLink);
	}
	
	public void checkRating3AndAboveLink() {
		isEnabled(rating3AndAboveLink);
	}
	
	public void checkrating2AndAboveLink() {
		isEnabled(rating2AndAboveLink);
	}
	
	public void checkRating1AndAboveLink() {
		isEnabled(rating1AndAboveLink);
	}
	  
	public void checkLightingDealsLink() {
		isEnabled(lightingDealsLink);
	}
	
	public void checkSavingAndSalesLink() {
		isEnabled(savingAndSalesLink);
	}
	
	
	
}
