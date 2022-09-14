package com.maveric.barrista;

public class Cream extends BeverageDecorator {
	int creamCost;

	Cream(Beverage beverage, int creamCost) {
		this.beverage = beverage;
		this.creamCost = creamCost;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " topped with Cream";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + creamCost;
	}
}
