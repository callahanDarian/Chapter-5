package tutorials;

import java.util.Scanner;

public class StudentSwitchProgram {

	public static void main(String[] args) 
	{
		int user;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your student ID >>");
		user = input.nextInt();
		
		switch(user)
		{
		case 31158:
			System.out.println("Hello Keegan");
			break;
		case 132043:
			System.out.println("Hello Alyssa");
			break;
		case 201524:
			System.out.println("Hello Dylan");
			break;
		case 131512:
			System.out.println("Hello Austin");
			break;
		case 79978:
			System.out.println("Hello Braden");
			break;
		case 138455:
			System.out.println("Hello Chance");
			break;
		case 313011:
			System.out.println("Hello Aaron");
			break;
		case 131186:
			System.out.println("Hello Darian");
			break;
		case 99729:
			System.out.println("Hello Computer");
			break;
		}
		input.close();
	}

}
