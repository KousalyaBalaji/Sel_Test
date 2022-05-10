package com.testng.features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization_Concept {

	@Test
	@Parameters({ "Username", "password" })
	public void credentials(String Username, String password) {

		System.out.println("Username is " + Username);
		System.out.println("Password  is " + password);

	}

}
