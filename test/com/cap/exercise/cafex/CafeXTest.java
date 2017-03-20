package com.cap.exercise.cafex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CafeXTest {

	private MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee, MenuItem.CheeseSandwich };

	@Test
	public void BillingTest() {
		CafeX cafeX = new CafeX();
		assertEquals(3.5, cafeX.bill(purchasedItems), 0.0);
	}
}
