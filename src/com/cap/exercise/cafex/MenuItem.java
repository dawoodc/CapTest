package com.cap.exercise.cafex;

public enum MenuItem {

	Cola(ItemType.Drink, DrinkFoodType.COLD, 50),
	Coffee(ItemType.Drink, DrinkFoodType.HOT, 100),
	CheeseSandwich(ItemType.Food, DrinkFoodType.COLD, 200),
	SteakSandwich(ItemType.Food, DrinkFoodType.HOT, 450);

	ItemType itemType;
	DrinkFoodType typeOfFoodDrink;
	int priceInPence;

	public ItemType getItemType() {
		return itemType;
	}

	public DrinkFoodType getFoodDrinkType() {
		return typeOfFoodDrink;
	}

	public int getPriceInPence() {
		return priceInPence;
	}

	MenuItem(ItemType itemType, DrinkFoodType type, int price) {
		this.itemType = itemType;
		this.typeOfFoodDrink = type;
		this.priceInPence = price;
	}
}
