package conditionalLogic;

import java.util.Scanner;

public class age {

	public static void main(String[] args) 
	{
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age. >>");
		age = input.nextInt();
		if(age>=23&age<=30)
		{
			System.out.println("User is old but not extra.");
		}
		if (age<18)
		{
			System.out.println("User is older than 18.");
		}
		if(age>=31&age<=50)
		{
			System.out.println("User is old.");
		}
		if(age>50&age<=60)
		{
			System.out.println("Use is old plus extra.");
		}
		if(age>=66&age<=100)
		{
			System.out.println("User is a living fossil.");
		}
		main(null);
	}

}
