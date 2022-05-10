package com.testng.features;

import org.testng.annotations.Test;

public class Timeout_Concept {

	@Test(timeOut = 6000)
	public void fruits() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("orange");
		Thread.sleep(1000);
		System.out.println("pineapple");
		Thread.sleep(3000);
		System.out.println("grapes");

	}
}
