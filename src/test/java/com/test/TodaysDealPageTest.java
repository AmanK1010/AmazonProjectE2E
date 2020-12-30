package com.test;

import org.testng.annotations.BeforeMethod;

import com.baseClass.LibGlobal;

public class TodaysDealPageTest extends LibGlobal{

	@BeforeMethod
	public void launchTodaysDealsPage() {
		launchBrowser("chrome");
		getToUrl("https://www.amazon.in/");
		
	}
}
