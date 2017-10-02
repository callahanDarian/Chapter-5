package excercises;

import javax.swing.JOptionPane;

public class EvenOdd {

	static int num;
	
	public static void main(String[] args) 
	{
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number."));
		go();

	}
	public static void go()
	{
		if (num % 2 == 0)
		{
			System.out.println(num +" is even.");
		}
		else
		{
			System.out.println(num +" is odd.");
		}
		while (num != 100)
		{
			num++;
			go();
		}
	}

}
