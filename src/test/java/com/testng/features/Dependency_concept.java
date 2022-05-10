package com.testng.features;

import org.testng.annotations.Test;

public class Dependency_concept {

	@Test
	public void signin() {
		System.out.println("signin");
	}
	
	@Test(dependsOnMethods = "signin")
	public void order() {
		System.out.println("order");
	}

}
