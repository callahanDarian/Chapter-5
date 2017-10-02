package excercises;

import javax.swing.JOptionPane;

public class Pay {

	static int response;
	static int insuranceOption;
	static int retirementOption;
	static int hours;
	static int payRate;
	
	public static void main(String[] args) 
	{
		String[] skillLevel = new String[] {"1", "2", "3"};
		
		response = JOptionPane.showOptionDialog(null, "What is your skill level", "Skill Level", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, skillLevel, skillLevel[0]);
		insurance(response);
	}
	public static void insurance(int a)
	{
		String[] insurance = new String[] {"Medical", "Dental", "Long-term disability"};
		if (a == 0)
		{
			payRate = 17;
			hours();
		}
		if (a == 1)
		{
			payRate = 20;
			insuranceOption = JOptionPane.showOptionDialog(null, "Which insurance would you like?", "Insurance", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, insurance, insurance[0]);
			hours();
		}
		if (a == 2)
		{
			payRate = 22;
			insuranceOption = JOptionPane.showOptionDialog(null, "Which insurance would you like?", "Insurance", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, insurance, insurance[0]);
			retirement();
		}
	}
	public static void retirement()
	{
		String[] YorN = new String[] {"Yes", "No"};
		retirementOption = JOptionPane.showOptionDialog(null, "Would you like to participate in the retirement plan?", "Retirement", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, YorN, YorN[0]);
		hours();
	}
	public static void hours()
	{
		hours = Integer.parseInt(JOptionPane.showInputDialog(null,"How many hours are you working?"));
		end();
	}
	public static void end()
	{
		int regularPay = payRate * hours;
		double overPayHours;
		double overPay = 0;
		double totalPay;
		double insuranceCost = 0;
		double netPay;
		if (hours > 40)
		{
			overPayHours = (hours - 40);
			overPay = overPayHours * (payRate * 1.5);
		}
		totalPay = regularPay + overPay;
		if (insuranceOption == 1)
		{
			insuranceCost = 32.50;
		}
		if (insuranceOption == 2)
		{
			insuranceCost = 20;
		}
		if (insuranceOption == 3)
		{
			insuranceCost = 10;
		}
		netPay = totalPay - insuranceCost;
		JOptionPane.showMessageDialog(null, "Hours : " + hours +
				"\nPay rate : $" + payRate + ".00" +
				"\nRegular pay for hours : $" + regularPay + ".00" +
				"\nOvertime pay : $" + overPay + "0" +
				"\nTotal Pay : $" + totalPay + "0" +
				"\nTotal itemized deductions : $" + insuranceCost + "0" +
				"\nNey Pay : $" + netPay + "0");
	}

}
