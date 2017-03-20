package com.cap.exercise.cafex;

public class CafeX {

	public double bill(MenuItem[] purchasedItems) {

		this.isValidPurchasedItems(purchasedItems);

		long sum = 0;
		for (MenuItem item : purchasedItems) {
			sum = sum + item.getPriceInPence();
		}

		return sum / 100.0;
	}

	public int calculateServiceCharge(MenuItem[] purchasedItems) {

		this.isValidPurchasedItems(purchasedItems);
		int serviceCharge = 0;

		for (MenuItem item : purchasedItems) {

			int itemServiceCharge = 0;

			switch (item.getItemType()) {

			case Drink:
				break;

			case Food:
				switch (item.getFoodDrinkType()) {

				case COLD:
					itemServiceCharge = 10;
					break;

				case HOT:
					itemServiceCharge = 20;
					break;
				}
				break;
			}

			if (itemServiceCharge > serviceCharge) {
				serviceCharge = itemServiceCharge;
			}

		}

		return serviceCharge;
	}

	public double getTotalBill(MenuItem[] purchasedItems) {

		this.isValidPurchasedItems(purchasedItems);
		double billedAmount = this.bill(purchasedItems);
		int serviceCharge = this.calculateServiceCharge(purchasedItems);
		if (serviceCharge > 0) {
			billedAmount = billedAmount * (1 + serviceCharge / 100.0);
		}
		return MathUtil.round(billedAmount, 2);
	}

	private boolean isValidPurchasedItems(MenuItem[] purchasedItems) {

		if (purchasedItems == null || purchasedItems.length < 1) {
			throw new IllegalArgumentException("You need atleast one menu item to bill.");
		}
		return true;
	}
}
