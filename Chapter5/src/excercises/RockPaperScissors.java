package excercises;

import javax.swing.JOptionPane;

public class RockPaperScissors {
	

	public static void main(String[] args) 
	{
		int GAME = 0;
		
		for (GAME = 0; GAME !=5; GAME++)
		{
		int correct = (int) (Math.random() * (3 - 1)) + 1;
		int guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick rock (1), paper (2), or scissors (3)."));

		if (guess == 1 & correct == 3)
		{
			JOptionPane.showMessageDialog(null, "You win.");
		}
		if (guess > correct)
		{
			JOptionPane.showMessageDialog(null, "You win.");
		}
		else if (guess < correct)
		{
			JOptionPane.showMessageDialog(null, "You lose.");
		}
		else if (guess == 3 & correct == 1)
		{
			JOptionPane.showMessageDialog(null, "You lose.");
		}
		else if (guess == correct)
		{
			JOptionPane.showMessageDialog(null, "You tied.");
		}

		}
	}

}
