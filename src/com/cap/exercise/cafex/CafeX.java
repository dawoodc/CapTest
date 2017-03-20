package com.cap.exercise.cafex;

public class CafeX {

	public double bill(MenuItem[] purchasedItems) {

		if (purchasedItems == null || purchasedItems.length < 1) {
			throw new IllegalArgumentException("You need atleast one menu item to bill.");
		}

		long sum = 0;
		for (MenuItem item : purchasedItems) {
			sum = sum + item.getPriceInPence();
		}

		return sum / 100.0;
	}

}
