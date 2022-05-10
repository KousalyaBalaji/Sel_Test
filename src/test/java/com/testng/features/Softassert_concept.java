package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Softassert_concept {

	@Test
	public void demo() {

		String act = "Kousalyakk";
		String exp = "Kousalyak";

		Assert.assertEquals(act, exp);
		System.out.println("Verification");

	}
}
