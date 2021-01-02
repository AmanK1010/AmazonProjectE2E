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
	private WebElement subscribeAndSaveTab;
	
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
	
	  
		
	public boolean checkTodaysDealsTab() {
		return isEnabled(todaysDealsTab);
	}
	
	public boolean checkAllDealsTab() {
		return isEnabled(allDealsTab);
	}
	
	public boolean checkWatchedDealsTab() {
		return isEnabled(watchedDealsTab);
	}
	
	public boolean checkSubscribeAndSaveTab() {
		return isEnabled(subscribeAndSaveTab);
	}
	
	public boolean checkCouponsTab() {
		return isEnabled(couponsTab);
	}
	
	public boolean checkAmazonAssistantTab() {
		return isEnabled(amazonAssistantTab);
	}
	
	public boolean checkClearanceTab() {
		return isEnabled(clearanceTab);
	}
	
	     
	public boolean checkRefurbishedAndOpenBoxTab() {
		return isEnabled(refurbishedAndOpenBoxTab);
	}
	
	public boolean checkAppliancesRadioBtn() {
		return isEnabled(appliancesRadioBtn);
	}
	
	public boolean checkArtworkRadioBtn() {
		return isEnabled(artworkRadioBtn);
	}
	
	public boolean checkBabyProductsRadioBtn() {
		return isEnabled(babyProductsRadioBtn);
	}
	
	   
	public boolean checkBeautyRadioBtn() {
		return isEnabled(beautyRadioBtn);
	}
	
	public boolean checkBooksRadioBtn() {
		return isEnabled(booksRadioBtn);
	}
	
	public boolean checkBusinessIndustrialAndScientificSuppliesRadioBtn() {
		return isEnabled(businessIndustrialAndScientificSuppliesRadioBtn);
	}
	
	public boolean checkCameraAccessoriesRadioBtn() {
		return isEnabled(cameraAccessoriesRadioBtn);
	}
	
	public boolean checkCamerasAndPhotographyRadioBtn() {
		return isEnabled(camerasAndPhotographyRadioBtn);
	}
	
	public boolean checkCarAndMotorbikeAccessoriesRadioBtn() {
		return isEnabled(carAndMotorbikeAccessoriesRadioBtn);
	}
	
	     
	public boolean checkChimneysKitchenRadioBtn() {
		return isEnabled(chimneysKitchenRadioBtn);
	}
	
	
	public boolean checkClothingBabyRadioBtn() {
		return isEnabled(clothingBabyRadioBtn);
	}
	
	public boolean checkClothingBoysRadioBtn() {
		return isEnabled(clothingBoysRadioBtn);
	}
	
	public boolean checkSeeMoreDeptLink() {
		return isEnabled(seeMoreDeptLink);
	}
	
	
	public boolean checkClothingGirlsRadioBtn() {
		return isEnabled(clothingGirlsRadioBtn);
	}
	
	
	public boolean checkClothingMensRadioBtn() {
		return isEnabled(clothingMensRadioBtn);
	}
	 
	public boolean checkClothingWomensRadioBtn() {
		return isEnabled(clothingWomensRadioBtn);
	}
	
	public boolean checkClothingAndAccessoriesRadioBtn() {
		return isEnabled(clothingAndAccessoriesRadioBtn);
	}
	
	public boolean checkComputerComponentsRadioBtn() {
		return isEnabled(computerComponentsRadioBtn);
	}
	
	public boolean checkComputersAndAccessoriesRadioBtn() {
		return isEnabled(computersAndAccessoriesRadioBtn);
	}
	
	public boolean checkDataStorageAndExternalDevicesRadioBtn() {
		return isEnabled(dataStorageAndExternalDevicesRadioBtn);
	}
	
	      
	
	public boolean checkDesktopsRadioBtn() {
		return isEnabled(desktopsRadioBtn);
	}
	
	public boolean checkElectronicsRadioBtn() {
		return isEnabled(electronicsRadioBtn);
	}
	
	public boolean checkElectonicsAccessoriesRadioBtn() {
		return isEnabled(electonicsAccessoriesRadioBtn);
	}
	
	public boolean checkFurnitureRadioBtn() {
		return isEnabled(furnitureRadioBtn);
	}
	
	public boolean checkGardenAndOutdoorsRadioBtn() {
		return isEnabled(gardenAndOutdoorsRadioBtn);
	}
	
	          
	public boolean checkGiftsCardsRadioBtn() {
		return isEnabled(giftsCardsRadioBtn);
	}
	
	public boolean checkGroceryRadioBtn() {
		return isEnabled(groceryRadioBtn);
	}
	
	public boolean checkHandbagsRadioBtn() {
		return isEnabled(handbagsRadioBtn);
	}
	
	public boolean checkHeadphonesRadioBtn() {
		return isEnabled(headphonesRadioBtn);
	}
	
	public boolean checkHealthAndPersonalCareRadioBtn() {
		return isEnabled(healthAndPersonalCareRadioBtn);
	}
	
	public boolean checkHomeAndDecorRadioBtn() {
		return isEnabled(homeAndDecorRadioBtn);
	}
	
	public boolean checkHomeAndKitchenRadioBtn() {
		return isEnabled(homeAndKitchenRadioBtn);
	}
	
	public boolean checkHomeAudioAndAccessoriesRadioBtn() {
		return isEnabled(homeAudioAndAccessoriesRadioBtn);
	}
	
	public boolean checkHomeEntertainmentSystemsRadioBtn() {
		return isEnabled(homeEntertainmentSystemsRadioBtn);
	}
	
	public boolean checkHomeFurnishingRadioBtn() {
		return isEnabled(homeFurnishingRadioBtn);
	}
	
	public boolean checkHomeImproventRadioBtn() {
		return isEnabled(homeImproventRadioBtn);
	}
	
	    
	public boolean checkHomestorageAndOrganisationRadioBtn() {
		return isEnabled(homestorageAndOrganisationRadioBtn);
	}
	
	public boolean checkHouseholdSuppliesRadioBtn() {
		return isEnabled(householdSuppliesRadioBtn);
	}
	
	public boolean checkIndoorLightingRadioBtn() {
		return isEnabled(indoorLightingRadioBtn);
	}
	
	public boolean checkJewelleryRadioBtn() {
		return isEnabled(jewelleryRadioBtn);
	}
	
	public boolean checkKeyboardsMouseAndInputRadioBtn() {
		return isEnabled(keyboardsMouseAndInputRadioBtn);
	}
	
	     
	
	public boolean checkKindleEbooksRadioBtn() {
		return isEnabled(kindleEbooksRadioBtn);
	}
	
	public boolean checkKitchenAndDiningRadioBtn() {
		return isEnabled(kitchenAndDiningRadioBtn);
	}
	
	public boolean checkLaptopsRadioBtn() {
		return isEnabled(laptopsRadioBtn);
	}
	
	public boolean checkLargeAppliancesRadioBtn() {
		return isEnabled(largeAppliancesRadioBtn);
	}
	
	      
	public boolean checkLuggageAndBagsRadioBtn() {
		return isEnabled(luggageAndBagsRadioBtn);
	}
	
	public boolean checkMobileAccessoriesRadioBtn() {
		return isEnabled(mobileAccessoriesRadioBtn);
	}
	public boolean checkMobilesRadioBtn() {
		return isEnabled(mobilesRadioBtn);
	}
	public boolean checkMoviesAndTvShowsRadioBtn() {
		return isEnabled(moviesAndTvShowsRadioBtn);
	}
	
	public boolean checkMp3PlayersAndAccessoriesRadioBtn() {
		return isEnabled(mp3PlayersAndAccessoriesRadioBtn);
	}
	
	public boolean checkMusicRadioBtn() {
		return isEnabled(musicRadioBtn);
	}
	
	public boolean checkMusicalInstrumentsRadioBtn() {
		return isEnabled(musicalInstrumentsRadioBtn);
	}
	
	public boolean checkNetworkingDevicesRadioBtn() {
		return isEnabled(networkingDevicesRadioBtn);
	}
	
	    
	public boolean checkOfficeAndSchoolSuppliesRadioBtn() {
		return isEnabled(officeAndSchoolSuppliesRadioBtn);
	}
	
	public boolean checkPersonalCareRadioBtn() {
		return isEnabled(personalCareRadioBtn);
	}
	
	public boolean checkPetSuppliesRadioBtn() {
		return isEnabled(petSuppliesRadioBtn);
	}
	
	
	public boolean checkShoeCareAndAccessoriesRadioBtn() {
		return isEnabled(shoeCareAndAccessoriesRadioBtn);
	}
	
	public boolean checkRefrigeratorsRadioBtn() {
		return isEnabled(refrigeratorsRadioBtn);
	}

	       
	public boolean checkShoesBoysRadioBtn() {
		return isEnabled(shoesBoysRadioBtn);
	}
	
	public boolean checkShoesMensRadioBtn() {
		return isEnabled(shoesMensRadioBtn);
	}
	
	public boolean checkShoesWomensRadioBtn() {
		return isEnabled(shoesWomensRadioBtn);
	}
	
	public boolean checkShowersRadioBtn() {
		return isEnabled(showersRadioBtn);
	}
	
	public boolean checkSoftwareRadioBtn() {
		return isEnabled(softwareRadioBtn);
	}
	
	public boolean checkSpeakersRadioBtn() {
		return isEnabled(speakersRadioBtn);
	}
	
	public boolean checkSportingGoodsRadioBtn() {
		return isEnabled(sportingGoodsRadioBtn);
	}
	
	      
	
	public boolean checkSunglassesGirlsRadioBtn() {
		return isEnabled(sunglassesGirlsRadioBtn);
	}
	
	public boolean checkSunglassesMensRadioBtn() {
		return isEnabled(sunglassesMensRadioBtn);
	}
	
	public boolean checkSunglassesWomensRadioBtn() {
		return isEnabled(sunglassesWomensRadioBtn);
	}
	
	public boolean checkTabletsRadioBtn() {
		return isEnabled(tabletsRadioBtn);
	}
	
	public boolean checkTelevisionsRadioBtn() {
		return isEnabled(televisionsRadioBtn);
	}
	
	      
	public boolean checkToysRadioBtn() {
		return isEnabled(toysRadioBtn);
	}
	
	public boolean checkVideoGamesRadioBtn() {
		return isEnabled(videoGamesRadioBtn);
	}
	
	public boolean checkWatchesRadioBtn() {
		return isEnabled(watchesRadioBtn);
	}
	
	public boolean checkWatchesKidsRadioBtn() {
		return isEnabled(watchesKidsRadioBtn);
	}
	
	public boolean checkWatchesMensRadioBtn() {
		return isEnabled(watchesMensRadioBtn);
	}
	
	public boolean checkWatchesWomensRadioBtn() {
		return isEnabled(watchesWomensRadioBtn);
	}
	
	public boolean checkActiveRadioBtn() {
		return isEnabled(activeRadioBtn);
	}
	
	public boolean checkMissedRadioBtn() {
		return isEnabled(missedRadioBtn);
	}
	     
	
	public boolean checkUpcomingRadioBtn() {
		return isEnabled(upcomingRadioBtn);
	}
	
	public boolean checkUnder500RadioBtn() {
		return isEnabled(under500RadioBtn);
	}
	
	public boolean checkBetween500And1000RadioBtn() {
		return isEnabled(between500And1000RadioBtn);
	}
	
	public boolean checkBetween1000And2000RadioBtn() {
		return isEnabled(between1000And2000RadioBtn);
	}
	
	public boolean checkBetween2000And5000RadioBtn() {
		return isEnabled(between2000And5000RadioBtn);
	}
	
	public boolean checkAbove5000RadioBtn() {
		return isEnabled(above5000RadioBtn);
	}
	      
	public boolean checkClearLink() {
		return isEnabled(clearLink);
	}
	
	public boolean checkDealOfDayLink() {
		return isEnabled(dealOfDayLink);
	}
	
	public boolean checkCouponsLink() {
		return isEnabled(couponsLink);
	}
	
	public boolean checkPrimeEarlyAccessDealsLink() {
		return isEnabled(primeEarlyAccessDealsLink);
	}
	
	public boolean checkAppOnlyAccessDealsLink() {
		return isEnabled(appOnlyAccessDealsLink);
	}
	
	public boolean checkAppEarlyAccessDealsLink() {
		return isEnabled(appEarlyAccessDealsLink);
	}
	
	public boolean checkDiscount10perAndAboveLink() {
		return isEnabled(discount10perAndAboveLink);
	}
	      
	public boolean checkDiscount25perAndAboveLink() {
		return isEnabled(discount25perAndAboveLink);
	}
	
	public boolean checkDiscount50perAndAboveLink() {
		return isEnabled(discount50perAndAboveLink);
	}
	
	public boolean checkRating4AndAboveLink() {
		return isEnabled(rating4AndAboveLink);
	}
	
	public boolean checkRating3AndAboveLink() {
		return isEnabled(rating3AndAboveLink);
	}
	
	public boolean checkrating2AndAboveLink() {
		return isEnabled(rating2AndAboveLink);
	}
	
	public boolean checkRating1AndAboveLink() {
		return isEnabled(rating1AndAboveLink);
	}
	  
	public boolean checkLightingDealsLink() {
		return isEnabled(lightingDealsLink);
	}
	
	public boolean checkSavingAndSalesLink() {
		return isEnabled(savingAndSalesLink);
	}
	
	
	
}
