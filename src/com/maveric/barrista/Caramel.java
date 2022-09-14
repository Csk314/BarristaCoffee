package com.maveric.barrista;

public class Caramel extends BeverageDecorator {

	int caramelCost;

	Caramel(Beverage beverage, int caramelCost) {

		this.beverage = beverage;
		this.caramelCost = caramelCost;
		// System.out.println(" this.beverage + this.caramelCost " + this.beverage +
		// this.caramelCost);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " topped with Caramel"; //
	}

	@Override
	public int getCost() {
		return beverage.getCost() + caramelCost; // beverage.getCost() +
	}
}
