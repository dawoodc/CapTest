package com.cap.exercise.cafex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CafeXTest {

	private CafeX cafeX = new CafeX();

	@Test
	public void BillingTest() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee, MenuItem.CheeseSandwich };
		assertEquals(3.5, cafeX.bill(purchasedItems), 0.0);
	}

	@Test
	public void ServiceChargeTestForOnlyDrinks() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee };
		assertEquals(0, cafeX.calculateServiceCharge(purchasedItems));
	}

	@Test
	public void ServiceChargeTestForColdFood() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee, MenuItem.CheeseSandwich };
		assertEquals(10, cafeX.calculateServiceCharge(purchasedItems));
	}

	@Test
	public void ServiceChargeTestForHotFood() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee, MenuItem.CheeseSandwich, MenuItem.SteakSandwich };
		assertEquals(20, cafeX.calculateServiceCharge(purchasedItems));
	}

	@Test
	public void totalBillTestForOnlyDrinks() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee };
		assertEquals(1.5, cafeX.getTotalBill(purchasedItems), 0.001);
	}

	@Test
	public void totalBillTestForColdFood() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee, MenuItem.CheeseSandwich };
		assertEquals(3.85, cafeX.getTotalBill(purchasedItems), 0.001);
	}

	@Test
	public void totalBillTestForHotFood() {
		MenuItem[] purchasedItems = { MenuItem.Cola, MenuItem.Coffee, MenuItem.CheeseSandwich, MenuItem.SteakSandwich };
		assertEquals(9.6, cafeX.getTotalBill(purchasedItems), 0.001);
	}

}
