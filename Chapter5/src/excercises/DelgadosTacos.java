package excercises;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class DelgadosTacos {
	
	static DecimalFormat df = new DecimalFormat("0.00");
	
	static int intAmountTacos, intSizeTacos, intAmountBurritos, intSizeBurritos, intAmountEnchilada, intSizeEnchilada, intAmountTorta, intSizeTorta, 
	intAmountQuesadilla, intSizeQuesadilla, intAmountTostada, intSizeTostada, intAmountTamale, intSizeTamale, intAmountFajita, intSizeFajita,
	intSalad, intBeverage, intSizeBeverage;
	
	static double price = 0;
	static double priceTax;
	
	static String strOrder, option, strSizeTaco, strSizeBurrito;
	
	/*
	 * Start this shit! v
	 */
	
	public static void main(String[] args) 
	{
		tacoTruck();
	}
	
	public static void tacoTruck()
	
	{
		option = JOptionPane.showInputDialog(null,"Would you like to order from the DELGADOS TACOS? Yes or no?\nRemember to input your orders exactly, or we will not serve you.");
		
		if (option.equalsIgnoreCase("Yes"))
		{
			Menu();
		}
		else if (option.equalsIgnoreCase("No"))
		{
			System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Please make sure you have spelled your input correctly.");
			tacoTruck();
		}
		/*
		String[] options = new String [2];
		options[0] = new String ("FUCK YEAH!");
		options[1] = new String ("No thank you; I'm boring.");
		int n = JOptionPane.showOptionDialog(null, "Would you like to make a purchase with Delgados Tacos?","TACOS BRO",
				JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if (n == JOptionPane.YES_OPTION)
		{
			Menu();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Leave.");
		}
		*/
	}
	
	/*
	 *  The Menu v
	 */
	
	public static void Menu()
	{		
		//Tacos!
		intAmountTacos = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tacos would you like to purchase?\nSingle taco costs $3.00.\nTacos cost $1.00, then $2.00 each if ordering multiple."));
		
		strSizeTaco = JOptionPane.showInputDialog(null, "How large would you like your tacos?\nSingle, double, triple, or quadra?");
		if (strSizeTaco.equalsIgnoreCase("Single"))
		{
			intSizeTacos = 1;
		}
		else if (strSizeTaco.equalsIgnoreCase("Double"))
		{
			intSizeTacos = 2;
		}
		else if (strSizeTaco.equalsIgnoreCase("Triple"))
		{
			intSizeTacos = 3;
		}
		else if (strSizeTaco.equalsIgnoreCase("Quadra"))
		{
			intSizeTacos = 4;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"That wasn't an option");
			System.exit(0);
		}
			
		
		//Burritos!
		intAmountBurritos = Integer.parseInt(JOptionPane.showInputDialog(null, "How many burritos would you like?\nSingle burrito costs $4.00\nBurritos cost $1.00, then $3.00 each if ordering multiple. "));
		if (intAmountBurritos == 0)
		{ 
			intSizeBurritos = 0;
		}
		else 
		{
		strSizeBurrito = JOptionPane.showInputDialog(null, "What size would you like your burritos?\nSingle, double, triple, or quadra?");
		if (strSizeBurrito.equalsIgnoreCase("Single"))
		{
			intSizeBurritos = 1;
		}
		else if (strSizeBurrito.equalsIgnoreCase("Double"))
		{
			intSizeBurritos = 2;
		}
		else if (strSizeBurrito.equalsIgnoreCase("Triple"))
		{
			intSizeBurritos = 3;
		}
		else if (strSizeBurrito.equalsIgnoreCase("Quadra"))
		{
			intSizeBurritos = 4;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"That wasn't an option");
			System.exit(0);
		}
		}
		
		//Enchiladas!
		intAmountEnchilada = Integer.parseInt(JOptionPane.showInputDialog(null, "How many enchiladas would you like?\nSingle enchilada costs $2.50\nEnchiladas cost $1.00, then $1.50 each if ordering multiple."));
		if (intAmountEnchilada == 0)
		{ 
			intSizeEnchilada = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your enchiladas?\nSingle, double, triple, or quadra?");
		if (strOrder.equalsIgnoreCase("Single"))
		{
			intSizeEnchilada = 1;
		}
		else if (strOrder.equalsIgnoreCase("Double"))
		{
			intSizeEnchilada = 2;
		}
		else if (strOrder.equalsIgnoreCase("Triple"))
		{
			intSizeEnchilada = 3;
		}
		else if (strOrder.equalsIgnoreCase("Quadra"))
		{
			intSizeEnchilada = 4;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"That wasn't an option");
			System.exit(0);
		}

		}
		
		//Tortas!
		intAmountTorta = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tortas would you like?\nA single torta costs $2.25\nTortas cost $0.50, then $1.75 each if ordering multiple."));
		if (intAmountTorta == 0)
		{ 
			intSizeTorta = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your tortas?\nSingle, double, triple, or quadra?");
		if (strOrder.equalsIgnoreCase("Single"))
		{
			intSizeTorta = 1;
		}
		else if (strOrder.equalsIgnoreCase("Double"))
		{
			intSizeTorta = 2;
		}
		else if (strOrder.equalsIgnoreCase("Triple"))
		{
			intSizeTorta = 3;
		}
		else if (strOrder.equalsIgnoreCase("Quadra"))
		{
			intSizeTorta = 4;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"That wasn't an option");
			System.exit(0);
		}
		}

		//Quesadillas!
		intAmountQuesadilla = Integer.parseInt(JOptionPane.showInputDialog(null, "How many quesadillas would you like?\nA single quesadilla costs $2.25\\Quesadillas cost $50, then $1.75 each if ordering multiple."));

		if (intAmountQuesadilla == 0)
		{ 
			intSizeQuesadilla = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your quesadillas?\nSingle, double, triple, or quadra?");

		if (strOrder.equalsIgnoreCase("Single"))
		{
			intSizeQuesadilla = 1;
		}
		else if (strOrder.equalsIgnoreCase("Double"))
		{
			intSizeQuesadilla = 2;
		}
		else if (strOrder.equalsIgnoreCase("Triple"))
		{
			intSizeQuesadilla = 3;
		}
		else if (strOrder.equalsIgnoreCase("Quadra"))
		{
			intSizeQuesadilla = 4;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"That wasn't an option");
			System.exit(0);
		}
		}
		
		//Tostada!
		intAmountTostada = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tostadas would you like?\nA single tostada costs $2.25\nTostadas cost $0.50, then $1.75 each if ordering multiple."));

		if (intAmountTostada == 0)
		{ 
			intSizeTostada = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your tostadas?\nSingle, double triple, or quadra?");
		if (strOrder.equalsIgnoreCase("Single"))
		{
			intSizeTostada = 1;
		}
		else if (strOrder.equalsIgnoreCase("Double"))
		{
			intSizeTostada = 2;
		}
		else if (strOrder.equalsIgnoreCase("Triple"))
		{
			intSizeTostada = 3;
		}
		else if (strOrder.equalsIgnoreCase("Quadra"))
		{
			intSizeTostada = 4;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"That wasn't an option");
			System.exit(0);
		}
		}
		
		//Tamale!
		intAmountTamale = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tamales would you like?\nA single tamale costs $1.25\nTamales cost $0.25, then $1.00 each if ordering multiple."));

		if (intAmountTamale == 0)
		{ 
			intSizeTamale = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your tamales?\nSingle, double, triple, or quadra");
		
		if (strOrder.equalsIgnoreCase("Single"))
		{
			intSizeTamale = 1;
		}
		else if (strOrder.equalsIgnoreCase("Double"))
		{
			intSizeTamale = 2;
		}
		else if (strOrder.equalsIgnoreCase("Triple"))
		{
			intSizeTamale = 3;
		}
		else if (strOrder.equalsIgnoreCase("Quadra"))
		{
			intSizeTamale = 4;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"That wasn't an option");
			System.exit(0);
		}
		}
		
		//Fajitas!
		intAmountFajita = Integer.parseInt(JOptionPane.showInputDialog(null, "How many fajitas would you like?\nA single fajita costs $3.00\nFajitas cost $2.00, then $1.00 each if ordering multiple."));

		if (intAmountFajita == 0)
		{ 
			intSizeFajita = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your fajitas?\nSingle, double, triple, or quadra");
		
		if (strOrder.equalsIgnoreCase("Single"))
		{
			intSizeFajita = 1;
		}
		else if (strOrder.equalsIgnoreCase("Double"))
		{
			intSizeFajita = 2;
		}
		else if (strOrder.equalsIgnoreCase("Triple"))
		{
			intSizeFajita = 3;
		}
		else if (strOrder.equalsIgnoreCase("Quadra"))
		{
			intSizeFajita = 4;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"That wasn't an option");
			System.exit(0);
		}
		}
		
		//s a l a d s . . .
		strOrder = JOptionPane.showInputDialog(null, "Would you like a salad for $1.00?\nYes or no?");
		if (strOrder.equalsIgnoreCase("Yes"))
		{
			intSalad = 1;
		}
		else if (strOrder.equalsIgnoreCase("No"))
		{
			intSalad = 0;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"That wasn't an option");
			System.exit(0);
		}

		//Beverage
		
		strOrder = JOptionPane.showInputDialog(null, "Which beverage would you like?\nBeverages cost $0.50"
				+ "\n None"
				+ "\n Hee-Haw                     Moxie"
				+ "\n Hubba Bubba             Izze"
				+ "\n Sam's Cola                 Josta");
		if (strOrder.equalsIgnoreCase("None"))
		{
			intBeverage = 0;
			intSizeBeverage = 0;
		}
		else 
		{
		intBeverage = 1;  
		
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your beverage?\nSingle, double, triple, or quadra?");
		}
		if (strOrder.equalsIgnoreCase("Single"))
		{
			intSizeBeverage = 1;
		}
		else if (strOrder.equalsIgnoreCase("Double"))
		{
			intSizeBeverage = 2;
		}
		else if (strOrder.equalsIgnoreCase("Triple"))
		{
			intSizeBeverage = 3;
		}
		else if (strOrder.equalsIgnoreCase("Quadra"))
		{
			intSizeBeverage = 4;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"That wasn't an option");
			System.exit(0);
		}
		salesTax();
	}
		
	
	/*
	 * The Price v
	 */
	
	public static void salesTax()
	{
		//Price!
		price = price + (((intAmountTacos * 2 )+ 1) * intSizeTacos ) + (((intAmountBurritos * 3) + 1) * intSizeBurritos) + 
				(((intAmountEnchilada * 1.5) + 1) * intSizeEnchilada) + (((intAmountTorta * 1.75) + 0.5) * intSizeTorta) +
				(((intAmountQuesadilla * 1.75) + 0.5) * intSizeQuesadilla) + (((intAmountTostada * 1.75) + 0.5) * intSizeTostada) +
				(((intAmountTamale * 1) + 0.25) * intSizeTamale) + (((intAmountFajita * 2) + 1) * intSizeFajita) + 
				intSalad + ((intBeverage / 2) * (intSizeBeverage / 2));
		priceTax = price * 1.075;
		
		int n = JOptionPane.showConfirmDialog(null, "You have ordered : \n"
		+ intAmountTacos + " tacos at size " + intSizeTacos + "\n"
		+ intAmountBurritos + " burritos at size " + intSizeBurritos + "\n"
		+ intAmountEnchilada + " enchiladas at size " + intSizeEnchilada + "\n"
		+ intAmountTorta + " tortas at size " + intSizeTorta + "\n"
		+ intAmountQuesadilla + " quesadillas at size " + intSizeQuesadilla + "\n"
		+ intAmountTostada + " tostadas at size " + intSizeTostada + "\n"
		+ intAmountTamale + " tamales at size " + intSizeTamale + "\n"
		+ intAmountFajita + " fajitas at size " + intSizeFajita + "\n"
		+ intSalad + " salad\n"
		+ intBeverage + " beverage at size " + intSizeBeverage
		+ "\nYour total is :\n"
		+ "  \nWithout Tax : $" + df.format(price)
		+ "  \n   With Tax : $" + df.format(priceTax)
		+ "\n\n"
		+ "Is this correct?");
		
		if (n == JOptionPane.NO_OPTION)
		{
			Menu();
			price = 0;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Thank you for your money, I guess.");
			System.exit(0);
		}
	}

}
