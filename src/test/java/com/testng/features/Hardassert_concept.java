package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert_concept {

	@Test
	public void demo() {
		
		String act = "Kousalya";
		String exp = "Kousalya";
		
		Assert.assertEquals(act, exp);
		System.out.println("Validation");

	}
	
	
	
}
