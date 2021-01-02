package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseClass.LibGlobal;
import com.pom.CustomerServicePage;
import com.pom.HomePage;

public class CustomerServicePageTest extends LibGlobal {

	HomePage home;
	CustomerServicePage customer;

	@BeforeMethod
	public void launchCustomerServicePageInAmazon() {
		launchBrowser("chrome");
		getToUrl("https://www.amazon.in/");
		home = new HomePage();
		home.getCustomerService();
		customer = new CustomerServicePage();

	}

	@Test
	public void verifyAllTabLinks() {
		Assert.assertTrue(customer.checkYourOrdersTab(), "Your orders link is not enabled");
		Assert.assertTrue(customer.checkReturnsAndRefundsTab(), "Returns And Refunds link is not enabled");
		Assert.assertTrue(customer.checkManageAddressTab(), "Manage address link is not enabled");
		Assert.assertTrue(customer.checkManagePrimeTab(), "Manage prime link is not enabled");
		Assert.assertTrue(customer.checkPaymentSettingsTab(), "Payment Settings link is not enabled");
		Assert.assertTrue(customer.checkAccountSettingsTab(), "Account Settings link is not enabled");
		Assert.assertTrue(customer.checkCovid19AndAmazonTab(), "Covid19 And Amazon link is not enabled");
		Assert.assertTrue(customer.checkDigitalServicesAndDeviceSupportTab(),
				"Digital Services And Device Support link is not enabled");

	}

	@Test
	public void verifyMoreSolutions() {
		Assert.assertTrue(customer.checkMoreSolutionsTxtBox(), "More Solutions TxtBox  is not enabled");
		Assert.assertTrue(customer.checkGoMoreSolutionsBtn(), "More Solutions go button  is not enabled");

	}

	@Test
	public void verifyRecommendedOptionsAllOptions() {
		Assert.assertTrue(customer.checkRecommendedTopics(), "More Solutions TxtBox  is not enabled");
		customer.mouseOverRecommendedTopics();
		Assert.assertTrue(customer.checkWhereIsMyOrderInRecommendedTopics(), "Where Is My Order link is not enabled");
		Assert.assertTrue(customer.checkPayingForYourOrderInRecommendedTopics(),
				"Paying For Your Order link is not enabled");
		Assert.assertTrue(customer.checkDeliveryChargesInRecommendedTopics(), "Delivery Charges link is not enabled");
		Assert.assertTrue(customer.checkReturnsAndRefundsInRecommendedTopics(),
				"Returns And Refunds link is not enabled");
		Assert.assertTrue(customer.checkManageYourAccountInfoInRecommendedTopics(),
				"Manage Your Account Info link is not enabled");
		Assert.assertTrue(customer.checkPayOnDeliveryInRecommendedTopics(), "Pay On Delivery link is not enabled");
		Assert.assertTrue(customer.checkRevisePaymentInRecommendedTopics(), "Revise Payment link is not enabled");

	}

	@Test
	public void verifyShippingAndDeliveryAllOptions() {
		Assert.assertTrue(customer.checkShippingAndDelivery(), "Shipping And Delivery link is not enabled");
		customer.mouseOverShippingAndDelivery();
		Assert.assertTrue(customer.checkAmazonPrimeInShippingAndDelivery(),
				"Amazon Prime In ShippingAndDelivery link is not enabled");
		Assert.assertTrue(customer.checkShippingSpeedsAndDeliveryChargesInShippingAndDelivery(),
				"Shipping Speeds And Delivery Charges In ShippingAndDelivery link is not enabled");
		Assert.assertTrue(customer.checkTrackYourPackageInShippingAndDelivery(),
				"Track Your Package In ShippingAndDelivery link is not enabled");
		Assert.assertTrue(customer.checkContactCourierInShippingAndDelivery(),
				"Contact Courier In ShippingAndDelivery link is not enabled");
		Assert.assertTrue(customer.checkOrderingRestrictionsInShippingAndDelivery(),
				"Ordering Restrictions In ShippingAndDelivery link is not enabled");
		Assert.assertTrue(customer.checkMoreInShippingAndDelivery(), "More In ShippingAndDelivery link is not enabled");

	}

	@Test
	public void verifyAmazonPrimeAllOptions() {
		Assert.assertTrue(customer.checkAmazonPrime(), "Amazon prime link is not enabled");
		customer.mouseOverAmazonPrime();
		Assert.assertTrue(customer.checkAboutAmazonPrimeInAmazonPrime(),
				"About Amazon Prime In AP link is not enabled");
		Assert.assertTrue(customer.checkSignUpForAmazonPrimeInAP(),
				"Sign Up For Amazon Prime In AP link is not enabled");
		Assert.assertTrue(customer.checkAboutAmazonPrimeMembershipFeeInAP(),
				"About Amazon Prime Membership Fee In AP link is not enabled");
		Assert.assertTrue(customer.checkAboutPrimeEligibleItemsInAP(),
				"About Prime Eligible Items In AP link is not enabled");
		Assert.assertTrue(customer.checkAmazonPrimeDeliveryBenefitsInAP(),
				"Amazon Prime Delivery Benefits In AP link is not enabled");
		Assert.assertTrue(customer.checkMoreInPrime(), "More In prime link is not enabled");

	}

	@Test
	public void verifyPaymentsAndPricingAllOptions() {
		Assert.assertTrue(customer.checkPaymentsAndPricing(), "Payments And Pricing link is not enabled");
		customer.mouseOverPaymentsAndPricing();
		Assert.assertTrue(customer.checkPayOnDeliveryInPaymentsAndPricing(),
				"Pay On Delivery In Payments And Pricing link is not enabled");
		Assert.assertTrue(customer.checkEmiInPaymentsAndPricing(), "Emi In payments And Pricing link is not enabled");
		Assert.assertTrue(customer.checkCreditDebitCardInPaymentsAndPricing(),
				"Credit Debit Card In Payments And Pricing link is not enabled");
		Assert.assertTrue(customer.checkNetBankingInPaymentsAndPricing(),
				"NetBanking In Payments And Pricing link is not enabled");
		Assert.assertTrue(customer.checkUnknownChangesInPaymentsAndPricing(),
				"Unknown Changes In Payments And Pricing link is not enabled");
		Assert.assertTrue(customer.checkAboutLightingDealsInPaymentsAndPricing(),
				"About Lighting Deals In Payments And Pricing link is not enabled");
		Assert.assertTrue(customer.checkUpiInPaymentsAndPricing(), "Upi In Payments And Pricing link is not enabled");
		Assert.assertTrue(customer.checkRevisePaymentInPaymentsAndPricing(),
				"Revise Payment In Payments And Pricing link is not enabled");
		Assert.assertTrue(customer.checkMoreInPaymentsPricingAndPromotions(),
				"More In Payments Pricing And Promotions link is not enabled");
	}

	@Test
	public void verifyAmazonPayAllOptions() {
		Assert.assertTrue(customer.checkAmazonPay(), "Amazon pay link is not enabled");
		customer.mouseOverAmazonPay();
		Assert.assertTrue(customer.checkUsingAmazonPayBalanceInAmazonPay(),
				"Using Amazon Pay Balance In Amazon Pay link is not enabled");
		Assert.assertTrue(customer.checkViewAmazonPayTransactionsInAmazonPay(),
				"View Amazon Pay Transactions In Amazon Pay link is not enabled");
		Assert.assertTrue(customer.checkCompleteFullKYCInAmazonPay(),
				"Complete Full KYC In Amazon Pay link is not enabled");
		Assert.assertTrue(customer.checkLegalInAmazonPay(), "Legal In Amazon Pay link is not enabled");
		Assert.assertTrue(customer.checkMoreInAmazonPay(), "More In Amazon Pay link is not enabled");
	}

	@Test
	public void verifyReturnsRefundsAllOptions() {
		Assert.assertTrue(customer.checkReturnsRefunds(), "Returns Refunds link is not enabled");
		customer.mouseOverReturnsRefunds();
		Assert.assertTrue(customer.checkAboutOurReturnPoliciesInReturnsRefunds(),
				"About Our Return Policies In Returns Refunds link is not enabled");
		Assert.assertTrue(customer.checkHowToReturnAnItemInReturnsRefunds(),
				"How To Return An Item In Returns Refunds link is not enabled");
		Assert.assertTrue(customer.checkCheckStatusOfReturnInReturnsRefunds(),
				"Check Status Of Return In Returns Refunds link is not enabled");
		Assert.assertTrue(customer.checkRefundTimelinesInReturnsRefunds(),
				"Refund Timelines In Returns Refunds link is not enabled");
		Assert.assertTrue(customer.checkMoreInReturnsAndRefunds(), "More In Returns And Refunds link is not enabled");
	}

	@Test
	public void verifyOrderingAllOptions() {
		Assert.assertTrue(customer.checkOrdering(), "Ordering link is not enabled");
		customer.mouseOverOrdering();
		Assert.assertTrue(customer.checkCancelItemsOrOrdersInOrdering(),
				"Cancel Items Or Orders In Ordering link is not enabled");
		Assert.assertTrue(customer.checkAboutItemsFulfilledByAmazonInOrdering(),
				"About Items Fulfilled By Amazon In Ordering link is not enabled");
		Assert.assertTrue(customer.checkAboutSellerFulfilledItemsInOrdering(),
				"About Seller Fulfilled Items In Ordering link is not enabled");
		Assert.assertTrue(customer.checkAboutGiftOrdersInOrdering(),
				"About Gift Orders In Ordering link is not enabled");
		Assert.assertTrue(customer.checkSearchAndBrowseForItemsInOrdering(),
				"Search And Browse For Items In Ordering link is not enabled");
		Assert.assertTrue(customer.checkInstallationsInOrdering(), "Installations In Ordering link is not enabled");
		Assert.assertTrue(customer.checkMoreInOrdering(), "More In Ordering link is not enabled");
	}

	@Test
	public void verifyManagingYourAccountAllOptions() {
		Assert.assertTrue(customer.checkManagingYourAccount(), "Managing Your Account link is not enabled");
		customer.mouseOverManagingYourAccount();
		Assert.assertTrue(customer.checkManageYourPaymentMethodsInManagingYourAccount(),
				"Manage Your Payment Methods In Managing Your Account link is not enabled");
		Assert.assertTrue(customer.checkChangeYourAccountSettingInManagingYourAccount(),
				"Change Your Account Setting In Managing Your Account link is not enabled");
		Assert.assertTrue(customer.checkAboutMessageCenterInManagingYourAccount(),
				"About Message Center In Managing Your Account link is not enabled");
		Assert.assertTrue(customer.checkConnectYourSocialAccountsToAmazonInManagingYourAccount(),
				"Connect Your Social Accounts To Amazon In Managing Your Account link is not enabled");
		Assert.assertTrue(customer.checkAboutMobilePhoneNumberAccountsInManagingYourAccount(),
				"About Mobile Phone Number Accounts In Managing Your Account link is not enabled");
		Assert.assertTrue(customer.checkMoreInManagingYourAccount(),
				"More In Managing Your Account link is not enabled");
	}

	@Test
	public void verifyDevicesAndDigitalServicesAllOptions() {
		Assert.assertTrue(customer.checkDevicesAndDigitalServices(),
				"Devices And Digital Services link is not enabled");
		customer.mouseOverDevicesAndDigitalServices();
		Assert.assertTrue(customer.checkGetKindleBookOrderRefundInDevicesAndDigitalServices(),
				"Get Kindle Book Order Refund In Devices And Digital Services link is not enabled");
		Assert.assertTrue(customer.checkCancelKindleUnlimitedSubscriptionInDevicesAndDigitalServices(),
				"Cancel Kindle Unlimited Subscription In Devices And Digital Services link is not enabled");
		Assert.assertTrue(customer.checkDownloadTheAlexaAppInDevicesAndDigitalServices(),
				"Download The Alexa App In Devices And Digital Services link is not enabled");
		Assert.assertTrue(customer.checkSetUpYourFireTVInDevicesAndDigitalServices(),
				"SetUp Your Fire TV In Devices And Digital Services link is not enabled");
		Assert.assertTrue(customer.checkGetHelpPairingYourFireTVRemoteInDevicesAndDigitalServices(),
				"Get Help Pairing Your Fire TV Remote In Devices And Digital Services link is not enabled");
		Assert.assertTrue(customer.checkSetParentalControlsOnFireTVInDevicesAndDigitalServices(),
				"Set Parental Controls On Fire TV In Devices And Digital Services link is not enabled");
		Assert.assertTrue(customer.checkFireTVIsntTurningOnInDevicesAndDigitalServices(),
				"Fire TV Isnt Turning On In Devices And Digital Services link is not enabled");
		Assert.assertTrue(customer.checkCantScreenMirrorOnFireTVDevicesInDevicesAndDigitalServices(),
				"Cant Screen Mirror On Fire TV Devices In Devices And Digital Services link is not enabled");
		Assert.assertTrue(customer.checkAllDevicesAndDigitalServicesHelpInDevicesAndDigitalServices(),
				"All Devices And Digital Services Help In Devices And Digital Services link is not enabled");
		Assert.assertTrue(customer.checkManageYourContentAndDevicesInDevicesAndDigitalServices(),
				"Manage Your Content And Devices In Devices And Digital Services link is not enabled");
		Assert.assertTrue(customer.checkAskTheDigitalAndDeviceCommunityInDevicesAndDigitalServices(),
				"Ask The Digital And Device Community In Devices And Digital Services link is not enabled");

	}

	@Test
	public void verifyAmazonBusinessAllOptions() {
		Assert.assertTrue(customer.checkAmazonBusiness(), "Amazon Business link is not enabled");
		customer.mouseOverAmazonBusiness();
		Assert.assertTrue(customer.checkGetStartedWithYourBusinessAccountInAmazonBusiness(),
				"Get Started With Your Business Account In Amazon Business link is not enabled");
		Assert.assertTrue(customer.checkAboutAmazonBusinessInAmazonBusiness(),
				"About Amazon Business In Amazon Business link is not enabled");
		Assert.assertTrue(customer.checkRegisteringYourBusinessAccountInAmazonBusiness(),
				"Registering Your Business Account In Amazon Business link is not enabled");
		Assert.assertTrue(customer.checkAboutGSTInvoiceInAmazonBusiness(),
				"About GST Invoice In Amazon Business link is not enabled");
		Assert.assertTrue(customer.checkHowToIdentifyProductWithGSTInvoiceInAmazonBusiness(),
				"How To Identify Product With GST Invoice In Amazon Business link is not enabled");
		Assert.assertTrue(customer.checkHowToDownloadGSTInvoiceInAmazonBusiness(), "How To Download GST Invoice In Amazon Business link is not enabled");
		Assert.assertTrue(customer.checkFrequentlyAskedQuestionsInAmazonBusiness(), "How To Download GST Invoice In Amazon Business link is not enabled");
		Assert.assertTrue(customer.checkMoreAboutAmazonBusiness(), "More About Amazon Business link is not enabled");
	}
	
	@Test
	public void verifyOtherTopicsAndHelpSitesAllOptions() {
		Assert.assertTrue(customer.checkOtherTopicsAndHelpSites(), "Other Topics And Help Sites link is not enabled");
		customer.mouseOverOtherTopicsAndHelpSites();
		Assert.assertTrue(customer.checkSellerFulfilledOrdersInOtherTopicsAndHelpSites(),
				"Seller Fulfilled Orders In Other Topics And Help Sites link is not enabled");
		Assert.assertTrue(customer.checkContactingAmazonInOtherTopicsAndHelpSites(),
				"Contacting Amazon In Other Topics And Help Sites link is not enabled");
		Assert.assertTrue(customer.checkAmazonCoPilotInOtherTopicsAndHelpSites(),
				"Amazon Co Pilot In Other Topics And Help Sites link is not enabled");
		Assert.assertTrue(customer.checkSiteFeaturesInOtherTopicsAndHelpSites(),
				"Site Features In Other Topics And Help Sites link is not enabled");
		Assert.assertTrue(customer.checkSecurityAndPrivacyInOtherTopicsAndHelpSites(),
				"Security And Privacy In Other Topics And Help Sites link is not enabled");
		Assert.assertTrue(customer.checkGiftsAndListsInOtherTopicsAndHelpSites(), "Gifts And Lists In Other Topics And Help Sites link is not enabled");
		Assert.assertTrue(customer.checkHelpForAmazonSellersInOtherTopicsAndHelpSites(), "Help For Amazon Sellers In Other Topics And Help Sites link is not enabled");
		Assert.assertTrue(customer.checkFAQsAboutOrdersAndCOVID19VirusInOtherTopicsAndHelpSites(), "FAQs About Orders And COVID19 Virus In Other Topics And Help Sites link is not enabled");
	}
	
	@Test
	public void verifyCustomerServiceAllOptions() {
		Assert.assertTrue(customer.checkCustomerService(), "Customer Service link is not enabled");
		customer.mouseOverCustomerService();
		Assert.assertTrue(customer.checkAskDigitalAndDeviceCommunityInCustomerService(),
				"Ask Digital And Device Community In Customer Service link is not enabled");
		Assert.assertTrue(customer.checkTrackYourPackageInCustomerService(),
				"Track Your Package In Customer Service link is not enabled");
		Assert.assertTrue(customer.checkAboutOurReturnsPoliciesInCustomerService(),
				"About Our Returns Policies In Customer Service link is not enabled");
		Assert.assertTrue(customer.checkOrderGiftCardsInCustomerService(),
				"Order Gift Cards In Customer Service link is not enabled");
		Assert.assertTrue(customer.checkContactUsBtnInCustomerService(), "Contact Us Btn In Customer Service link is not enabled");
	}

	@AfterMethod
	private void tearDown() {
		quit();
	}

}
