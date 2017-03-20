package com.cap.exercise.cafex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CafeXTest {

	private CafeX cafeX = new CafeX();

	@Test
	public void billingTest() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee, MenuItem.CheeseSandwich };
		assertEquals("Billed amount should be 3.5", 3.5, cafeX.bill(purchasedItems), 0.0);
	}

	@Test
	public void serviceChargeForOnlyDrinksTest() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee };
		assertEquals("Service charge should be 0 for only drinks purchase", 0,
				cafeX.calculateServiceCharge(purchasedItems));
	}

	@Test
	public void serviceChargeForColdFoodTest() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee, MenuItem.CheeseSandwich };
		assertEquals("Service charge should be 10 for cold food purchase", 10,
				cafeX.calculateServiceCharge(purchasedItems));
	}

	@Test
	public void serviceChargeForHotFoodTest() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee, MenuItem.CheeseSandwich, MenuItem.SteakSandwich };
		assertEquals("Service charge should be 0 for hot food purchase", 20,
				cafeX.calculateServiceCharge(purchasedItems));
	}

	@Test
	public void totalBillForOnlyDrinksTest() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee };
		assertEquals("Total bill should be 1.50 for only drinks purchase", 1.5, cafeX.getTotalBill(purchasedItems),
				0.001);
	}

	@Test
	public void totalBillForColdFoodTest() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee, MenuItem.CheeseSandwich };
		assertEquals("Total bill should be 3.85 for drinks and cold food purchase", 3.85,
				cafeX.getTotalBill(purchasedItems), 0.001);
	}

	@Test
	public void totalBillForHotFoodTest() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee, MenuItem.CheeseSandwich, MenuItem.SteakSandwich };
		assertEquals("Total bill should be 9.60 for purchase of all items in menu", 9.6,
				cafeX.getTotalBill(purchasedItems), 0.001);
	}

}
