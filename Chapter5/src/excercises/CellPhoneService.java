package excercises;

import javax.swing.JOptionPane;

public class CellPhoneService {

	static String[] confirms = new String[] {"Confirm", "Go Back"};
	
	static int response;
	
	public static void main(String[] args) 
	{
		plans();
	}
	public static void plans()
	{
		String[] options = new String[] {"Plan A", "Plan B", "Plan C", "Plan D", "Plan E", "Plan F"};
		
		response = JOptionPane.showOptionDialog(null, "Which plan would you like?\nSelect one to view.", "Cell Phone Plans", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if (response == 0)
		{
			planA();
		}
		if (response == 1)
		{
			planB();
		}
		if (response == 2)
		{
			planC();
		}
		if (response == 3)
		{
			planD();
		}
		if (response == 4)
		{
			planE();
		}
		if (response == 5)
		{
			planF();
		}
	}
	public static void planA()
	{
		response = JOptionPane.showOptionDialog(null, "Fewer than 500 minutes of talk\nNo text\nNo data\n$49.00 Monthly","Plan A",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, confirms, confirms[0]);
		thank(response);
	}
	public static void planB()
	{
		response = JOptionPane.showOptionDialog(null, "Fewer than 500 minutes of talk\nUnlimited text\nNo data\n$55.00 Monthly","Plan B",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, confirms, confirms[0]);
		thank(response);
	}
	public static void planC()
	{
		response = JOptionPane.showOptionDialog(null, "Unlimited talk\n100 texts\nNo data\n$61.00 Monthly","Plan C",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, confirms, confirms[0]);
		thank(response);
	}
	public static void planD()
	{
		response = JOptionPane.showOptionDialog(null, "Unlimited talk\nUnlimited or more texts\nNo data\n$70.00 Monthly","Plan D",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, confirms, confirms[0]);
		thank(response);
	}
	public static void planE()
	{
		response = JOptionPane.showOptionDialog(null, "Unlimited talk\nUnlimited texts\n2 GB data\n$79.00 Monthly","Plan E",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, confirms, confirms[0]);
		thank(response);
	}
	public static void planF()
	{
		response = JOptionPane.showOptionDialog(null, "Unlimited talk\nUnlimited texts\nUnlimited GB data\n$87.00 Monthly", "Plan F",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, confirms, confirms[0]);
		thank(response);
	}
	public static void thank(int a)
	{
		if (a == 0)
		{
			JOptionPane.showMessageDialog(null, "Thank", "Thank", JOptionPane.DEFAULT_OPTION);
		}
		if (a == 1)
		{
			plans();
		}
	}

}
