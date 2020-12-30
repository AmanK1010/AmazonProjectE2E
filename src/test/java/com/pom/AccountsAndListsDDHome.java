package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.LibGlobal;

public class AccountsAndListsDDHome extends LibGlobal {

	public AccountsAndListsDDHome() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[1]")
	private WebElement createWishListLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[2]")
	private WebElement findWishListLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[3]")
	private WebElement wishFromAnyWebsiteLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[4]")
	private WebElement babyWishListLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[5]")
	private WebElement discoverYourStyleLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[6]")
	private WebElement exploreShowroomLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[7]")
	private WebElement yourAccountLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[8]")
	private WebElement yourOrdersLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[9]")
	private WebElement yourWishListLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[10]")
	private WebElement yourRecommendationsLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[11]")
	private WebElement yourPrimeMembershipLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[12]")
	private WebElement yourPrimeVideoLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[13]")
	private WebElement yourSubscribeAndSavedItemsLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[14]")
	private WebElement membershipsAndSubscriptionLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[15]")
	private WebElement yourAmazonBusinessAccountLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[16]")
	private WebElement yourSellerAccountLink;
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[17]")
	private WebElement manageYourContentAndDevicesLink;
	
	public boolean checkCreateWishListLink() {
		return isEnabled(createWishListLink);
	}
	
	public boolean checkFindWishListLink() {
		return isEnabled(findWishListLink);
	}
	
	public boolean checkWishFromAnyWebsiteLink() {
		return isEnabled(wishFromAnyWebsiteLink);
	}
	
	public boolean checkBabyWishListLink() {
		return isEnabled(babyWishListLink);
	}
	
	public boolean checkDiscoverYourStyleLink() {
		return isEnabled(discoverYourStyleLink);
	}
	
	public boolean checkExploreShowroomLink() {
		return isEnabled(exploreShowroomLink);
	}
	
	public boolean checkYourAccountLink() {
		return isEnabled(yourAccountLink);
	}
	
	public boolean checkYourOrdersLink() {
		return isEnabled(yourOrdersLink);
	}
	
	public boolean checkYourWishListLink() {
		return isEnabled(yourWishListLink);
	}
	
	public boolean checkYourRecommendationsLink() {
		return isEnabled(yourRecommendationsLink);
	}
	
	public boolean checkYourPrimeMembershipLink() {
		return isEnabled(yourPrimeMembershipLink);
	}
	
	public boolean checkYourPrimeVideoLink() {
		return isEnabled(yourPrimeVideoLink);
	}
	
	public boolean checkYourSubscribeAndSavedItemsLink() {
		return isEnabled(yourSubscribeAndSavedItemsLink);
	}
	
	public boolean checkMembershipsAndSubscriptionLink() {
		return isEnabled(membershipsAndSubscriptionLink);
	}
	
	public boolean checkYourAmazonBusinessAccountLink() {
		return isEnabled(yourAmazonBusinessAccountLink);
	}
	
	public boolean checkYourSellerAccountLink() {
		return isEnabled(yourSellerAccountLink);
	}
	
	public boolean checkManageYourContentAndDevicesLink() {
		return isEnabled(manageYourContentAndDevicesLink);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}