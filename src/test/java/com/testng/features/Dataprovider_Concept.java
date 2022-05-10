package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {

	@Test(dataProvider = "inputdata")
	public void credentials(String username, String password) {

		System.out.println("Username is : " + username);
		System.out.println("Password is: " + password);
	}

	@DataProvider
	public Object[][] inputdata() {
		return new Object[][] {

				{ "Ajay", "123" }, { "Akash", "123" }, { "Akshara", "123" },

		};

	}

}
