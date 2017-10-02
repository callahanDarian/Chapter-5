package excercises;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AscendingAndDescending {

	public static void main(String[] args) 
	{
		JTextField num1 = new JTextField();
		num1.getText();
		JTextField num2 = new JTextField();
		num2.getText();
		JTextField num3 = new JTextField();
		num3.getText();
		Object[] message = {
				"First Number :", num1,
				"Second Number :", num2,
				"Third Number :", num3
		};
		
		JOptionPane.showConfirmDialog(null, message, "Input Int",JOptionPane.OK_CANCEL_OPTION);
		
		double numFirst = Double.parseDouble(num1.getText());
		double numSecond = Double.parseDouble(num2.getText());
		double numThird = Double.parseDouble(num3.getText());
		double holder;
		
		if (numFirst < numSecond)
		{
			holder = numFirst;
			numFirst = numSecond;
			numSecond = holder;
			
		}
		if (numSecond < numThird)
		{
			holder = numSecond;
			numSecond = numThird;
			numThird = holder;
		}
		if (numFirst < numSecond)
		{
			holder = numFirst;
			numFirst = numSecond;
			numSecond = holder;
			
		}
		if (numSecond < numThird)
		{
			holder = numSecond;
			numSecond = numThird;
			numThird = holder;
		}
		
		JOptionPane.showMessageDialog(null, numFirst + "\n" + numSecond + "\n" + numThird);
	}

}
