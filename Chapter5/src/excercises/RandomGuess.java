package excercises;

import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) 
	{
		int correct = (int) (Math.random() * (10 - 1)) + 1;
		int guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick a number between 1 and 10"));

		if (guess > correct)
		{
			JOptionPane.showMessageDialog(null, "The generated number was " + correct + ", your guess was too high.");
		}
		if (guess < correct)
		{
			JOptionPane.showMessageDialog(null, "The generated number was " + correct + ", your guess was too low.");
		}
		if (guess == correct)
		{
			JOptionPane.showMessageDialog(null, "The generated number was " + correct + ", you were correct.");
		}
	}

}
