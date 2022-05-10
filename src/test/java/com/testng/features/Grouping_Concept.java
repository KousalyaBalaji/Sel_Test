package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups = "fruits")
	public void orange() {
		System.out.println("orange");

	}

	@Test(groups = "fruits")
	public void pineapple() {
		System.out.println("pineapple");

	}

	@Test(groups = "fruits")
	public void grapes() {
		System.out.println("grapes");
	}

	@Test(groups = "vegetables")
	public void tomato() {
		System.out.println("tomato");

	}

	@Test(groups = "vegetables")
	public void onion() {
		System.out.println("onion");

	}

	@Test(groups = "nuts")
	public void walnuts() {
		System.out.println("walnuts");

	}

	@Test(groups = "nuts")
	public void cashew() {
		System.out.println("cashew");

	}
}
