package com.maveric.barrista;

import java.util.Scanner;

public class BeverageDemo {

	public static void main(String[] args) {

		System.out.println("Welcome to Barrista Coffee");
		Beverage b = null;
		TakeOrder(b);

	}

	private static void printOrderDetails(Beverage c) {

		System.out.println("\nCost: INR ₹ " + c.getCost() + ", Description: " + c.getDescription());
	}

	private static void TakeOrder(Beverage b) {
		System.out.println("Select \n[1] Coffee    INR ₹ 50 \n[2] Tea       INR ₹ 20 \n[3] Cancel & Exit");
		System.out.println("Enter your choice: ");

		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				b = new Coffee(50);
				Takeaddons(b);
				flag = false;
				break;
			case 2:
				b = new Tea(20);
				Takeaddons(b);
				flag = false;

				break;
			case 3:
				flag = false;
				System.out.println("\nOrder Cancelled");
			default:
				System.out.println("Please Select Options only from below");
				System.out.println("Select \n[1] Coffee    INR ₹ 50 \n[2] Tea       INR ₹ 20 \n[3] Cancel & Exit");
				System.out.println("Enter your choice: ");
			}
		}
	}

	private static void Takeaddons(Beverage b) {
		boolean flag = true;
		while (flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select addons from below:");
			System.out.println("\n[1] Caramel (INR ₹20)" + "\n[2] for Chocolate (INR ₹30)" + "\n[3] for Cream (INR ₹40)"
					+ "\n[4] for Honey(INR ₹10)" + "\n[5] Place Order" + "\n[6] Cancel & Exit");

			int addons = sc.nextInt();
			switch (addons) {
			case 1:
				b = new Caramel(b, 20);
				break;
			case 2:
				b = new Chocolate(b, 30);
				break;
			case 3:
				b = new Cream(b, 40);
				break;
			case 4:
				b = new Honey(b, 10);
				break;
			case 5:
				printOrderDetails(b);
				flag = false;
				break;

			case 6:
				flag = false;
				System.out.println("\nOrder Cancelled");

			}
		}
	}

}
