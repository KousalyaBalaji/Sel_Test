package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	public void propertySetting() {
		System.out.println("property");

	}

	@BeforeTest
	public void browserLaunch() {
		System.out.println("browser launch");

	}

	@BeforeClass
	public void urlLaunch() {
		System.out.println("url launch");

	}

	@BeforeMethod
	public void signin() {
		System.out.println("signin");

	}

	@Test(priority = 0, invocationCount = 4)
	public void women() {
		System.out.println("women");

	}

	@Test(priority = -1)
	public void men() {
		System.out.println("men");

	}

	@Test(priority = 1)
	public void kids() {
		System.out.println("kids");

	}

	@AfterMethod
	public void signout() {
		System.out.println("signout");
	}

	@AfterClass
	public void homepage() {
		System.out.println("homepage");

	}

	@AfterTest
	private void deleteCookies() {
		System.out.println("Delete cache");

	}

	@AfterSuite
	public void closeBrowser() {
		System.out.println("CloseBrowser");

	}

}
