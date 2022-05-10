package com.testng.features;

import org.testng.annotations.Test;

public class Expected_Exception {

	
	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {

		int a = 5;

		System.out.println(a/0);

	}
}
