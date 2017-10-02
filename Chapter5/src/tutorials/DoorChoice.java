package tutorials;

import javax.swing.JOptionPane;

public class DoorChoice {

	public static void main(String[] args) 
	{
		/*
		 * String strChoice;
		int doorChoice;
		
		strChoice = JOptionPane.showInputDialog(null, "Please pick a door\nYour options are :\n  1\n  2\n  3");
		doorChoice = Integer.parseInt(strChoice);
		
		//If satement for door choices
		
		if(doorChoice==1)
		{
			JOptionPane.showMessageDialog(null, "You win a goat");
		}
		if(doorChoice==2)
		{
			JOptionPane.showMessageDialog(null, "You win a goat");
		}
		if(doorChoice==3)
		{
			JOptionPane.showMessageDialog(null, "You win a car");
		}
		else
			JOptionPane.showMessageDialog(null, "What the fuck is wrong with you; can you read?\n"+doorChoice+" wasn't an option.");
		*/
		int GAME = 0;
		
		for (GAME = 0; GAME !=5; GAME++)
		{
		int correct = (int) (Math.random() * (3 - 1)) + 1;
		int guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick door 1, 2, or 3"));

		if (guess == correct)
		{
			JOptionPane.showMessageDialog(null, "You win.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You don't win.");
		}

		}
	}
	

}
