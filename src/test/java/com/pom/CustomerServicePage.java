package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.LibGlobal;

public class CustomerServicePage extends LibGlobal {

	public CustomerServicePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='a-box self-service-rich-card'])[1]")
	private WebElement yourOrdersTab;

	@FindBy(xpath = "(//div[@class='a-box self-service-rich-card'])[2]")
	private WebElement returnsAndRefundsTab;

	@FindBy(xpath = "(//div[@class='a-box self-service-rich-card'])[3]")
	private WebElement manageAddressTab;

	@FindBy(xpath = "(//div[@class='a-box self-service-rich-card'])[4]")
	private WebElement managePrimeTab;

	@FindBy(xpath = "(//div[@class='a-box self-service-rich-card'])[5]")
	private WebElement paymentSettingsTab;

	@FindBy(xpath = "(//div[@class='a-box self-service-rich-card'])[6]")
	private WebElement accountSettingsTab;

	@FindBy(xpath = "(//div[@class='a-box self-service-rich-card'])[7]")
	private WebElement covid19AndAmazonTab;

	@FindBy(xpath = "(//div[@class='a-box self-service-rich-card'])[8]")
	private WebElement digitalServicesAndDeviceSupportTab;

	public boolean checkYourOrdersTab() {
		return isEnabled(yourOrdersTab);
	}

	public boolean checkReturnsAndRefundsTab() {
		return isEnabled(returnsAndRefundsTab);
	}

	public boolean checkManageAddressTab() {
		return isEnabled(manageAddressTab);
	}

	public boolean checkManagePrimeTab() {
		return isEnabled(managePrimeTab);
	}

	public boolean checkPaymentSettingsTab() {
		return isEnabled(paymentSettingsTab);
	}

	public boolean checkAccountSettingsTab() {
		return isEnabled(accountSettingsTab);
	}

	public boolean checkCovid19AndAmazonTab() {
		return isEnabled(covid19AndAmazonTab);
	}

	public boolean checkDigitalServicesAndDeviceSupportTab() {
		return isEnabled(digitalServicesAndDeviceSupportTab);
	}

	@FindBy(xpath = "//input[@class='a-input-text a-span12']")
	private WebElement moreSolutionsTxtBox;

	@FindBy(xpath = "//input[@class='a-button-input']")
	private WebElement goMoreSolutionsBtn;

	public boolean checkMoreSolutionsTxtBox() {
		return isEnabled(moreSolutionsTxtBox);
	}

	public boolean checkGoMoreSolutionsBtn() {
		return isEnabled(goMoreSolutionsBtn);
	}

	@FindBy(xpath = "//a[@class='active']")
	private WebElement recommendedTopics;

	@FindBy(xpath = "(//a[@class='same_window cs-override-recommended'])[1]")
	private WebElement whereIsMyOrderInRecommendedTopics;

	@FindBy(xpath = "(//a[@class='same_window cs-override-recommended'])[2]")
	private WebElement payingForYourOrderInRecommendedTopics;

	@FindBy(xpath = "(//a[@class='same_window cs-override-recommended'])[3]")
	private WebElement deliveryChargesInRecommendedTopics;

	@FindBy(xpath = "(//a[@class='same_window cs-override-recommended'])[4]")
	private WebElement returnsAndRefundsInRecommendedTopics;

	@FindBy(xpath = "(//a[@class='same_window cs-override-recommended'])[5]")
	private WebElement manageYourAccountInfoInRecommendedTopics;

	@FindBy(xpath = "(//a[@class='same_window cs-override-recommended'])[6]")
	private WebElement payOnDeliveryInRecommendedTopics;

	@FindBy(xpath = "(//a[@class='same_window cs-override-recommended'])[7]")
	private WebElement revisePaymentInRecommendedTopics;

	public boolean checkRecommendedTopics() {
		return isEnabled(recommendedTopics);
	}

	public void mouseOverRecommendedTopics() {
		moveToElement(recommendedTopics);
	}

	public boolean checkWhereIsMyOrderInRecommendedTopics() {
		return isEnabled(whereIsMyOrderInRecommendedTopics);
	}

	public boolean checkPayingForYourOrderInRecommendedTopics() {
		return isEnabled(payingForYourOrderInRecommendedTopics);
	}

	public boolean checkDeliveryChargesInRecommendedTopics() {
		return isEnabled(deliveryChargesInRecommendedTopics);
	}

	public boolean checkReturnsAndRefundsInRecommendedTopics() {
		return isEnabled(returnsAndRefundsInRecommendedTopics);
	}

	public boolean checkManageYourAccountInfoInRecommendedTopics() {
		return isEnabled(manageYourAccountInfoInRecommendedTopics);
	}

	public boolean checkPayOnDeliveryInRecommendedTopics() {
		return isEnabled(payOnDeliveryInRecommendedTopics);
	}

	public boolean checkRevisePaymentInRecommendedTopics() {
		return isEnabled(revisePaymentInRecommendedTopics);
	}

	@FindBy(xpath = "(//a[@tabindex='-1'])[2]")
	private WebElement shippingAndDelivery;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201910250'])[1]")
	private WebElement amazonPrimeInShippingAndDelivery;

	@FindBy(xpath = "(//a[text()='Shipping Speeds and Delivery Charges'])[1]")
	private WebElement shippingSpeedsAndDeliveryChargesInShippingAndDelivery;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201910530'])[1]")
	private WebElement trackYourPackageInShippingAndDelivery;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201910090'])[1]")
	private WebElement contactCourierInShippingAndDelivery;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201910400'])[1]")
	private WebElement orderingRestrictionsInShippingAndDelivery;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201910060'])[1]")
	private WebElement moreInShippingAndDelivery;

	public boolean checkShippingAndDelivery() {
		return isEnabled(shippingAndDelivery);
	}

	public void mouseOverShippingAndDelivery() {
		moveToElement(shippingAndDelivery);
	}

	public boolean checkAmazonPrimeInShippingAndDelivery() {
		return isEnabled(amazonPrimeInShippingAndDelivery);
	}

	public boolean checkShippingSpeedsAndDeliveryChargesInShippingAndDelivery() {
		return isEnabled(shippingSpeedsAndDeliveryChargesInShippingAndDelivery);
	}

	public boolean checkTrackYourPackageInShippingAndDelivery() {
		return isEnabled(trackYourPackageInShippingAndDelivery);
	}

	public boolean checkContactCourierInShippingAndDelivery() {
		return isEnabled(contactCourierInShippingAndDelivery);
	}

	public boolean checkOrderingRestrictionsInShippingAndDelivery() {
		return isEnabled(orderingRestrictionsInShippingAndDelivery);
	}

	public boolean checkMoreInShippingAndDelivery() {
		return isEnabled(moreInShippingAndDelivery);
	}

	@FindBy(xpath = "//a[@rel='#help-gateway-category-2']")
	private WebElement amazonPrime;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201910360'])[1]")
	private WebElement aboutAmazonPrimeInAmazonPrime;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201910190'])[1]")
	private WebElement signUpForAmazonPrimeInAP;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201910200'])[1]")
	private WebElement aboutAmazonPrimeMembershipFeeInAP;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=202085280'])[1]")
	private WebElement aboutPrimeEligibleItemsInAP;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201910440'])[1]")
	private WebElement amazonPrimeDeliveryBenefitsInAP;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201910250'])[2]")
	private WebElement moreInPrime;

	public boolean checkAmazonPrime() {
		return isEnabled(amazonPrime);
	}

	public void mouseOverAmazonPrime() {
		moveToElement(amazonPrime);
	}

	public boolean checkAboutAmazonPrimeInAmazonPrime() {
		return isEnabled(aboutAmazonPrimeInAmazonPrime);
	}

	public boolean checkSignUpForAmazonPrimeInAP() {
		return isEnabled(signUpForAmazonPrimeInAP);
	}

	public boolean checkAboutAmazonPrimeMembershipFeeInAP() {
		return isEnabled(aboutAmazonPrimeMembershipFeeInAP);
	}

	public boolean checkAboutPrimeEligibleItemsInAP() {
		return isEnabled(aboutPrimeEligibleItemsInAP);
	}

	public boolean checkAmazonPrimeDeliveryBenefitsInAP() {
		return isEnabled(amazonPrimeDeliveryBenefitsInAP);
	}

	public boolean checkMoreInPrime() {
		return isEnabled(moreInPrime);
	}

	@FindBy(xpath = "//a[@rel='#help-gateway-category-3']")
	private WebElement paymentsAndPricing;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=202054820'])[1]")
	private WebElement payOnDeliveryInPaymentsAndPricing;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=202054460'])[1]")
	private WebElement emiInPaymentsAndPricing;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201895360'])[1]")
	private WebElement creditDebitCardInPaymentsAndPricing;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=202054800'])[1]")
	private WebElement netBankingInPaymentsAndPricing;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=GSNBBJP63SM65UDB'])[1]")
	private WebElement unknownChangesInPaymentsAndPricing;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201895510'])[1]")
	private WebElement aboutLightingDealsInPaymentsAndPricing;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=202212990'])[1]")
	private WebElement upiInPaymentsAndPricing;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html/ref=hp_gt_pt_rvpt_ppp?nodeId=202054720'])[1]")
	private WebElement revisePaymentInPaymentsAndPricing;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201894450'])[1]")
	private WebElement moreInPaymentsPricingAndPromotions;

	public boolean checkPaymentsAndPricing() {
		return isEnabled(paymentsAndPricing);
	}

	public void mouseOverPaymentsAndPricing() {
		moveToElement(paymentsAndPricing);
	}

	public boolean checkPayOnDeliveryInPaymentsAndPricing() {
		return isEnabled(payOnDeliveryInPaymentsAndPricing);
	}

	public boolean checkEmiInPaymentsAndPricing() {
		return isEnabled(emiInPaymentsAndPricing);
	}

	public boolean checkCreditDebitCardInPaymentsAndPricing() {
		return isEnabled(creditDebitCardInPaymentsAndPricing);
	}

	public boolean checkNetBankingInPaymentsAndPricing() {
		return isEnabled(netBankingInPaymentsAndPricing);
	}

	public boolean checkUnknownChangesInPaymentsAndPricing() {
		return isEnabled(unknownChangesInPaymentsAndPricing);
	}

	public boolean checkAboutLightingDealsInPaymentsAndPricing() {
		return isEnabled(aboutLightingDealsInPaymentsAndPricing);
	}

	public boolean checkUpiInPaymentsAndPricing() {
		return isEnabled(upiInPaymentsAndPricing);
	}

	public boolean checkRevisePaymentInPaymentsAndPricing() {
		return isEnabled(revisePaymentInPaymentsAndPricing);
	}

	public boolean checkMoreInPaymentsPricingAndPromotions() {
		return isEnabled(moreInPaymentsPricingAndPromotions);
	}

	@FindBy(xpath = "//a[@rel='#help-gateway-category-4']")
	private WebElement amazonPay;

	@FindBy(xpath = "(//a[@href='https://www.amazon.in/l/11962108031?ref=cs_apay_t_uapb_dk'])[1]")
	private WebElement usingAmazonPayBalanceInAmazonPay;

	@FindBy(xpath = "(//a[@href='https://www.amazon.in/gp/payment/statement?ref=cs_apay_t_vs_dk'])[1]")
	private WebElement viewAmazonPayTransactionsInAmazonPay;

	@FindBy(xpath = "(//a[@href='https://www.amazon.in/l/16204586031?ref=cs_apay_t_mkyc_dk'])[1]")
	private WebElement completeFullKYCInAmazonPay;

	@FindBy(xpath = "(//a[@href='https://www.amazon.in/gp/help/customer/display.html?nodeId=202123460?ref=cs_apay_t_legal_dk'])[1]")
	private WebElement legalInAmazonPay;

	@FindBy(xpath = "(//a[@href=\"https://www.amazon.in/gp/help/customer/display.html/?ie=UTF8&nodeId=202123450?ref=cs_apay_t_lp_dk\"])[1]")
	private WebElement moreInAmazonPay;

	public boolean checkAmazonPay() {
		return isEnabled(amazonPay);
	}

	public void mouseOverAmazonPay() {
		moveToElement(amazonPay);
	}

	public boolean checkUsingAmazonPayBalanceInAmazonPay() {
		return isEnabled(usingAmazonPayBalanceInAmazonPay);
	}

	public boolean checkViewAmazonPayTransactionsInAmazonPay() {
		return isEnabled(viewAmazonPayTransactionsInAmazonPay);
	}

	public boolean checkCompleteFullKYCInAmazonPay() {
		return isEnabled(completeFullKYCInAmazonPay);
	}

	public boolean checkLegalInAmazonPay() {
		return isEnabled(legalInAmazonPay);
	}

	public boolean checkMoreInAmazonPay() {
		return isEnabled(moreInAmazonPay);
	}

	@FindBy(xpath = "//a[@rel='#help-gateway-category-5']")
	private WebElement returnsRefunds;

	@FindBy(xpath = "(//a[@href='https://www.amazon.in/gp/help/customer/display.html?nodeId=202111910?ref=cs_ret_dk_rp'])[1]")
	private WebElement aboutOurReturnPoliciesInReturnsRefunds;

	@FindBy(xpath = "(//a[@href='https://www.amazon.in/gp/help/customer/display.html?nodeId=202115040?ref=cs_ret_dk_htr'])[1]")
	private WebElement howToReturnAnItemInReturnsRefunds;

	@FindBy(xpath = "(//a[@href='https://www.amazon.in/gp/help/customer/display.html?nodeId=202115040?ref=cs_ret_dk_rtk'])[1]")
	private WebElement checkStatusOfReturnInReturnsRefunds;

	@FindBy(xpath = "(//a[@href='https://www.amazon.in/gp/help/customer/display.html/?nodeId=202111770?ref=cs_ret_dk_rft'])[1]")
	private WebElement refundTimelinesInReturnsRefunds;

	@FindBy(xpath = "(//a[@href='https://www.amazon.in/gp/help/customer/display.html?nodeId=201819090?ref=cs_ret_dk_lp'])[1]")
	private WebElement moreInReturnsAndRefunds;

	public boolean checkReturnsRefunds() {
		return isEnabled(returnsRefunds);
	}

	public void mouseOverReturnsRefunds() {
		moveToElement(returnsRefunds);
	}

	public boolean checkAboutOurReturnPoliciesInReturnsRefunds() {
		return isEnabled(aboutOurReturnPoliciesInReturnsRefunds);
	}

	public boolean checkHowToReturnAnItemInReturnsRefunds() {
		return isEnabled(howToReturnAnItemInReturnsRefunds);
	}

	public boolean checkCheckStatusOfReturnInReturnsRefunds() {
		return isEnabled(checkStatusOfReturnInReturnsRefunds);
	}

	public boolean checkRefundTimelinesInReturnsRefunds() {
		return isEnabled(refundTimelinesInReturnsRefunds);
	}

	public boolean checkMoreInReturnsAndRefunds() {
		return isEnabled(moreInReturnsAndRefunds);
	}

	@FindBy(xpath = "//a[@rel='#help-gateway-category-6']")
	private WebElement ordering;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=202001140'])[1]")
	private WebElement cancelItemsOrOrdersInOrdering;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=202001380'])[1]")
	private WebElement aboutItemsFulfilledByAmazonInOrdering;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=202001340'])[1]")
	private WebElement aboutSellerFulfilledItemsInOrdering;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201937140'])[1]")
	private WebElement aboutGiftOrdersInOrdering;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201889520'])[1]")
	private WebElement searchAndBrowseForItemsInOrdering;

	@FindBy(xpath = "(//a[@href='https://www.amazon.in/gp/help/customer/display.html/ref=hp_gt_od_ist?ie=UTF8&nodeId=GSM5XBBDEXX69Z9S'])[1]")
	private WebElement installationsInOrdering;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201887920'])[1]")
	private WebElement moreInOrdering;

	public boolean checkOrdering() {
		return isEnabled(ordering);
	}

	public void mouseOverOrdering() {
		moveToElement(ordering);
	}

	public boolean checkCancelItemsOrOrdersInOrdering() {
		return isEnabled(cancelItemsOrOrdersInOrdering);
	}

	public boolean checkAboutItemsFulfilledByAmazonInOrdering() {
		return isEnabled(aboutItemsFulfilledByAmazonInOrdering);
	}

	public boolean checkAboutSellerFulfilledItemsInOrdering() {
		return isEnabled(aboutSellerFulfilledItemsInOrdering);
	}

	public boolean checkAboutGiftOrdersInOrdering() {
		return isEnabled(aboutGiftOrdersInOrdering);
	}

	public boolean checkSearchAndBrowseForItemsInOrdering() {
		return isEnabled(searchAndBrowseForItemsInOrdering);
	}

	public boolean checkInstallationsInOrdering() {
		return isEnabled(installationsInOrdering);
	}

	public boolean checkMoreInOrdering() {
		return isEnabled(moreInOrdering);
	}

	@FindBy(xpath = "//a[@rel='#help-gateway-category-7']")
	private WebElement managingYourAccount;

	@FindBy(xpath = "(//a[@href='/gp/css/account/cards/view.html/ref=hp_ss_comp_mpo'])[1]")
	private WebElement manageYourPaymentMethodsInManagingYourAccount;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201945280'])[1]")
	private WebElement changeYourAccountSettingInManagingYourAccount;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201945390'])[1]")
	private WebElement aboutMessageCenterInManagingYourAccount;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=202056480'])[1]")
	private WebElement connectYourSocialAccountsToAmazonInManagingYourAccount;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201945370'])[1]")
	private WebElement aboutMobilePhoneNumberAccountsInManagingYourAccount;

	@FindBy(xpath = "(//a[@href='/gp/help/customer/display.html?nodeId=201945240'])[1]")
	private WebElement moreInManagingYourAccount;

	public boolean checkManagingYourAccount() {
		return isEnabled(managingYourAccount);
	}

	public void mouseOverManagingYourAccount() {
		moveToElement(managingYourAccount);
	}

	public boolean checkManageYourPaymentMethodsInManagingYourAccount() {
		return isEnabled(manageYourPaymentMethodsInManagingYourAccount);
	}

	public boolean checkChangeYourAccountSettingInManagingYourAccount() {
		return isEnabled(changeYourAccountSettingInManagingYourAccount);
	}

	public boolean checkAboutMessageCenterInManagingYourAccount() {
		return isEnabled(aboutMessageCenterInManagingYourAccount);
	}

	public boolean checkConnectYourSocialAccountsToAmazonInManagingYourAccount() {
		return isEnabled(connectYourSocialAccountsToAmazonInManagingYourAccount);
	}

	public boolean checkAboutMobilePhoneNumberAccountsInManagingYourAccount() {
		return isEnabled(aboutMobilePhoneNumberAccountsInManagingYourAccount);
	}

	public boolean checkMoreInManagingYourAccount() {
		return isEnabled(moreInManagingYourAccount);
	}
	
	@FindBy(xpath="//a[@rel='#help-gateway-category-8']")
	private WebElement devicesAndDigitalServices;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html/ref=hp_gt_d2_spot1?nodeId=201252620'])[1]")
	private WebElement getKindleBookOrderRefundInDevicesAndDigitalServices;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html/ref=hp_gt_d2_spot2?nodeId=GLSQ4722655M4ZEJ'])[1]")
	private WebElement cancelKindleUnlimitedSubscriptionInDevicesAndDigitalServices;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html/ref=hp_gt_d2_spot3?nodeId=GMR4JYXHYDSTNQRK'])[1]")
	private WebElement downloadTheAlexaAppInDevicesAndDigitalServices;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html/ref=hp_gt_d2_spot4?nodeId=G7HTKNXBW4GPXSH6'])[1]")
	private WebElement setUpYourFireTVInDevicesAndDigitalServices;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html/ref=hp_gt_d2_spot5?nodeId=GEARX33JWH4K6WHJ'])[1]")
	private WebElement getHelpPairingYourFireTVRemoteInDevicesAndDigitalServices;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html/ref=hp_gt_d2_spot6?nodeId=GJF9SGT5262FJLQE'])[1]")
	private WebElement setParentalControlsOnFireTVInDevicesAndDigitalServices;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html/ref=hp_gt_d2_spot7?nodeId=GYFBX6H2ZQLQ2XRJ'])[1]")
	private WebElement fireTVIsntTurningOnInDevicesAndDigitalServices;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html/ref=hp_gt_d2_spot8?nodeId=GA7K5AML6222YDEW'])[1]")
	private WebElement cantScreenMirrorOnFireTVDevicesInDevicesAndDigitalServices;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html/ref=hp_gt_d2_fusion?nodeId=200127470'])[1]")
	private WebElement allDevicesAndDigitalServicesHelpInDevicesAndDigitalServices;
	
	@FindBy(xpath="(//a[@href='https://www.amazon.com/gp/redirect.html/ref=hp_gt_ss_fo_mycd?location=/hz/mycd/myx'])[1]")
	private WebElement manageYourContentAndDevicesInDevicesAndDigitalServices;	
	
	
	@FindBy(xpath="//a[@rel='#help-gateway-category-8']")
	private WebElement askTheDigitalAndDeviceCommunityInDevicesAndDigitalServices;
	
	public boolean checkDevicesAndDigitalServices() {
		return isEnabled(devicesAndDigitalServices);
	}

	public void mouseOverDevicesAndDigitalServices() {
		moveToElement(devicesAndDigitalServices);
	}
	
	public boolean checkGetKindleBookOrderRefundInDevicesAndDigitalServices() {
		return isEnabled(getKindleBookOrderRefundInDevicesAndDigitalServices);
	}
	
	public boolean checkCancelKindleUnlimitedSubscriptionInDevicesAndDigitalServices() {
		return isEnabled(cancelKindleUnlimitedSubscriptionInDevicesAndDigitalServices);
	}
	
	public boolean checkDownloadTheAlexaAppInDevicesAndDigitalServices() {
		return isEnabled(downloadTheAlexaAppInDevicesAndDigitalServices);
	}
	
	public boolean checkSetUpYourFireTVInDevicesAndDigitalServices() {
		return isEnabled(setUpYourFireTVInDevicesAndDigitalServices);
	}
	
	public boolean checkGetHelpPairingYourFireTVRemoteInDevicesAndDigitalServices() {
		return isEnabled(getHelpPairingYourFireTVRemoteInDevicesAndDigitalServices);
	}
	
	public boolean checkSetParentalControlsOnFireTVInDevicesAndDigitalServices() {
		return isEnabled(setParentalControlsOnFireTVInDevicesAndDigitalServices);
	}
	
	public boolean checkFireTVIsntTurningOnInDevicesAndDigitalServices() {
		return isEnabled(fireTVIsntTurningOnInDevicesAndDigitalServices);
	}
	
	public boolean checkCantScreenMirrorOnFireTVDevicesInDevicesAndDigitalServices() {
		return isEnabled(cantScreenMirrorOnFireTVDevicesInDevicesAndDigitalServices);
	}
	
	public boolean checkAllDevicesAndDigitalServicesHelpInDevicesAndDigitalServices() {
		return isEnabled(allDevicesAndDigitalServicesHelpInDevicesAndDigitalServices);
	}
	
	public boolean checkManageYourContentAndDevicesInDevicesAndDigitalServices() {
		return isEnabled(manageYourContentAndDevicesInDevicesAndDigitalServices);
	}
	
	public boolean checkAskTheDigitalAndDeviceCommunityInDevicesAndDigitalServices() {
		return isEnabled(askTheDigitalAndDeviceCommunityInDevicesAndDigitalServices);
	}
	
	
	@FindBy(xpath="//a[@rel='#help-gateway-category-9']")
	private WebElement amazonBusiness;
	
	@FindBy(xpath="(//a[@href='https://www.amazon.in/gp/help/customer/display.html?language=en_IN&nodeId=201633340'])[1]")
	private WebElement getStartedWithYourBusinessAccountInAmazonBusiness;
	
	@FindBy(xpath="(//a[@href='https://www.amazon.in/gp/help/customer/display.html?nodeId=202117480'])[1]")
	private WebElement aboutAmazonBusinessInAmazonBusiness;
	
	@FindBy(xpath="(//a[@href='https://www.amazon.in/gp/help/customer/display.html?nodeId=202117500'])[1]")
	private WebElement registeringYourBusinessAccountInAmazonBusiness;
	
	@FindBy(xpath="(//a[@href='https://www.amazon.in/gp/help/customer/display.html/?ie=UTF8&nodeId=202117560'])[1]")
	private WebElement aboutGSTInvoiceInAmazonBusiness;
	
	@FindBy(xpath="(//a[@href='https://www.amazon.in/gp/help/customer/display.html?nodeId=202117580'])[1]")
	private WebElement howToIdentifyProductWithGSTInvoiceInAmazonBusiness;
	
	@FindBy(xpath="(//a[@href='https://www.amazon.in/gp/help/customer/display.html?nodeId=201894740'])[1]")
	private WebElement howToDownloadGSTInvoiceInAmazonBusiness;
	
	@FindBy(xpath="(//a[@href='https://www.amazon.in/gp/help/customer/display.html?nodeId=202117460'])[1]")
	private WebElement frequentlyAskedQuestionsInAmazonBusiness;
	
	@FindBy(xpath="(//a[@href='https://www.amazon.in/gp/help/customer/display.html?nodeId=202117440'])[1]")
	private WebElement moreAboutAmazonBusiness;
	
	public boolean checkAmazonBusiness() {
		return isEnabled(amazonBusiness);
	}

	public void mouseOverAmazonBusiness() {
		moveToElement(amazonBusiness);
	}
	
	public boolean checkGetStartedWithYourBusinessAccountInAmazonBusiness() {
		return isEnabled(getStartedWithYourBusinessAccountInAmazonBusiness);
	}
	
	public boolean checkAboutAmazonBusinessInAmazonBusiness() {
		return isEnabled(aboutAmazonBusinessInAmazonBusiness);
	}
	
	public boolean checkRegisteringYourBusinessAccountInAmazonBusiness() {
		return isEnabled(registeringYourBusinessAccountInAmazonBusiness);
	}
	
	public boolean checkAboutGSTInvoiceInAmazonBusiness() {
		return isEnabled(aboutGSTInvoiceInAmazonBusiness);
	}
	
	public boolean checkHowToIdentifyProductWithGSTInvoiceInAmazonBusiness() {
		return isEnabled(howToIdentifyProductWithGSTInvoiceInAmazonBusiness);
	}
	
	public boolean checkHowToDownloadGSTInvoiceInAmazonBusiness() {
		return isEnabled(howToDownloadGSTInvoiceInAmazonBusiness);
	}
	
	public boolean checkFrequentlyAskedQuestionsInAmazonBusiness() {
		return isEnabled(frequentlyAskedQuestionsInAmazonBusiness);
	}
	
	public boolean checkMoreAboutAmazonBusiness() {
		return isEnabled(moreAboutAmazonBusiness);
	}
	
	@FindBy(xpath="//a[@rel='#help-gateway-category-10']")
	private WebElement otherTopicsAndHelpSites;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html?nodeId=202001340'])[2]")
	private WebElement sellerFulfilledOrdersInOtherTopicsAndHelpSites;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html?nodeId=202115230'])[1]")
	private WebElement contactingAmazonInOtherTopicsAndHelpSites;
	
	@FindBy(xpath="(//a[@href='/gp/copilot/share/ref=hp_gt_comp_copilot'])[1]")
	private WebElement amazonCoPilotInOtherTopicsAndHelpSites;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html?nodeId=201911300'])[1]")
	private WebElement siteFeaturesInOtherTopicsAndHelpSites;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html?nodeId=201908990'])[1]")
	private WebElement securityAndPrivacyInOtherTopicsAndHelpSites;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html?nodeId=201936650'])[1]")
	private WebElement giftsAndListsInOtherTopicsAndHelpSites;
	
	@FindBy(xpath="(//a[@href='https://sellercentral.amazon.in/gp/help/external/home'])[1]")
	private WebElement helpForAmazonSellersInOtherTopicsAndHelpSites;
	
	@FindBy(xpath="(//a[@href='https://www.amazon.in/gp/help/customer/display.html/ref=cs_dk_covid?ie=UTF8&nodeId=GDFU3JS5AL6SYHRD'])[1]")
	private WebElement fAQsAboutOrdersAndCOVID19VirusInOtherTopicsAndHelpSites;
	
	public boolean checkOtherTopicsAndHelpSites() {
		return isEnabled(otherTopicsAndHelpSites);
	}

	public void mouseOverOtherTopicsAndHelpSites() {
		moveToElement(otherTopicsAndHelpSites);
	}
	
	public boolean checkSellerFulfilledOrdersInOtherTopicsAndHelpSites() {
		return isEnabled(sellerFulfilledOrdersInOtherTopicsAndHelpSites);
	}

	public boolean checkContactingAmazonInOtherTopicsAndHelpSites() {
		return isEnabled(contactingAmazonInOtherTopicsAndHelpSites);
	}

	public boolean checkAmazonCoPilotInOtherTopicsAndHelpSites() {
		return isEnabled(amazonCoPilotInOtherTopicsAndHelpSites);
	}

	public boolean checkSiteFeaturesInOtherTopicsAndHelpSites() {
		return isEnabled(siteFeaturesInOtherTopicsAndHelpSites);
	}

	public boolean checkSecurityAndPrivacyInOtherTopicsAndHelpSites() {
		return isEnabled(securityAndPrivacyInOtherTopicsAndHelpSites);
	}

	public boolean checkGiftsAndListsInOtherTopicsAndHelpSites() {
		return isEnabled(giftsAndListsInOtherTopicsAndHelpSites);
	}

	public boolean checkHelpForAmazonSellersInOtherTopicsAndHelpSites() {
		return isEnabled(helpForAmazonSellersInOtherTopicsAndHelpSites);
	}

	public boolean checkFAQsAboutOrdersAndCOVID19VirusInOtherTopicsAndHelpSites() {
		return isEnabled(fAQsAboutOrdersAndCOVID19VirusInOtherTopicsAndHelpSites);
	}

	@FindBy(xpath="//a[@rel='#help-gateway-category-11']")
	private WebElement customerService;
	
	@FindBy(xpath="(//a[@href='https://in.amazonforum.com'])[1]")
	private WebElement askDigitalAndDeviceCommunityInCustomerService;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html?nodeId=201910530'])[1]")
	private WebElement trackYourPackageInCustomerService;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html?nodeId=202115040'])[1]")
	private WebElement aboutOurReturnsPoliciesInCustomerService;
	
	@FindBy(xpath="(//a[@href='/gp/help/customer/display.html?nodeId=201936950'])[1]")
	private WebElement orderGiftCardsInCustomerService;
	
	@FindBy(xpath="(//button[@class='a-button-text'])[1]")
	private WebElement contactUsBtnInCustomerService;
	
	public boolean checkCustomerService() {
		return isEnabled(customerService);
	}

	public void mouseOverCustomerService() {
		moveToElement(customerService);
	}

	public boolean checkAskDigitalAndDeviceCommunityInCustomerService() {
		return isEnabled(askDigitalAndDeviceCommunityInCustomerService);
	}
	
	public boolean checkTrackYourPackageInCustomerService() {
		return isEnabled(trackYourPackageInCustomerService);
	}
	
	public boolean checkAboutOurReturnsPoliciesInCustomerService() {
		return isEnabled(aboutOurReturnsPoliciesInCustomerService);
	}
	
	public boolean checkOrderGiftCardsInCustomerService() {
		return isEnabled(orderGiftCardsInCustomerService);
	}
	
	public boolean checkContactUsBtnInCustomerService() {
		return isEnabled(contactUsBtnInCustomerService);
	}
	
	
	
	
	
	

}
