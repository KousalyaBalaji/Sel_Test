package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test
	public void women() {
		System.out.println("women");

	}
	
	@Ignore
	@Test
	public void men() {
		System.out.println("men");

	}

	@Test
	public void accessories() {
		System.out.println("accessories");
	}

	@Test(enabled = false)
	public void Bags() {
		System.out.println("Bags");

	}

	@Test
	public void footwear() {
		System.out.println("footwear");

	}
}
