package excercises;

import java.util.Scanner;

public class pizzaHut {
	static Scanner input = new Scanner(System.in);
	
	static String choiceY;
	static String choiceTop;
	static String size;
	static String pizza;
	static String hotdogChoice;
	static double mediumCost = 9.99;
	static double largeCost = 12.99;
	static double smallCost = 6.99;
	static int sizeOp;
	static int sizePizza;
	static int ynOp;
	static int topOp;
	static int dog = 0;
	static double price = 0;

	public static void main(String[] args) 
	{
		YorN();
	}
	public static void YorN()
	{
		System.out.println("Would you like to order a pizza?");
		choiceY = input.nextLine();
		if (choiceY.equalsIgnoreCase("Yes"))
		{
			yesPizza();
		}
		if (choiceY.equalsIgnoreCase("No"))
		{
			noPizza();
		}
		else
		{
			System.out.println("Please make sure you have spelled your input correctly.");
			YorN();
		}
	}
	public static void yesPizza()
	{
		System.out.println("What size would you like? Small, medium, or large?");
		size = input.nextLine();
		
		if (size.equalsIgnoreCase("Small"));
		{
			sizeOp = 1;
			toppings();
		}
		if (size.equalsIgnoreCase("Medium"));
		{
			sizeOp = 2;
			toppings();
		}
		if (size.equalsIgnoreCase("Large"))
		{
			sizeOp = 3;
			toppings();
		}
		else
		{
			System.out.println("Please make sure you have spelled your input correctly.");
			yesPizza();
		}
	}
	public static void toppings()
	{
		System.out.println("What toppings would you like? Peperoni, sausage, DELGADOS, or cheese?");
		choiceTop = input.nextLine();
		if (choiceTop.equalsIgnoreCase("Peperoni"))
		{
			topOp = 1;
			ending();
		}
		if (choiceTop.equalsIgnoreCase("Sausage"))
		{
			topOp = 2;
			ending();
		}
		if (choiceTop.equalsIgnoreCase("DELGADOS"))
		{
			topOp = 3;
			ending();
		}
		if (choiceTop.equalsIgnoreCase("Cheese"))
		{
			topOp = 4;
			ending();
		}
		else
		{
			System.out.println("Please make sure you have spelled your input correctly.");
			toppings();
		}
	}
	public static void noPizza()
	{
		System.out.println("Would like a hotdog?");
		hotdogChoice = input.nextLine();
		if (hotdogChoice.equalsIgnoreCase("Yes"))
		{
			dog = 1;
			ending();
		}
		if (hotdogChoice.equalsIgnoreCase("No"))
		{
			System.out.println("Get out.");
		}
		else
		{
			System.out.println("Please make sure you have spelled your input correctly.");
			noPizza();
		}
	}
	public static void ending()
	{
		price = (sizeOp + 1.99);
		if (dog==1)
		{
			System.out.println("The hotdog will me $1.99; you may find toppings on the counter.");
		}
		else
		{
			System.out.println("The " + size + " pizza with " + choiceTop + " will be " + price);
		}
		System.out.println("Thank you for you service.");
	}
}

