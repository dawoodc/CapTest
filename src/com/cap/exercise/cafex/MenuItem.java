package com.cap.exercise.cafex;

public enum MenuItem {

	Cola(DrinkFoodType.COLD, 50),
	Coffee(DrinkFoodType.HOT, 100),
	CheeseSandwich(DrinkFoodType.COLD, 200),
	SteakSandwich(DrinkFoodType.HOT, 450);

	DrinkFoodType type;
	int priceInPence;

	public DrinkFoodType getType() {
		return type;
	}

	public int getPriceInPence() {
		return priceInPence;
	}

	MenuItem(DrinkFoodType type, int price) {
		this.type = type;
		this.priceInPence = price;
	}
}
