// FixDebugFive2.java
// Decides if two numbers are evenly divisible
package debugging;
import java.util.Scanner;
public class FixDebugFive2
{
   public static void main(String[] args)
   {
      double num;
      double num2;
      
	  Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number ");
      num = input.nextDouble();
      
      System.out.print("Enter another number ");
      num2 = input.nextDouble();
      
      
      if ((num % num2 == 0) & (num2 % num) == 0)
      {
         System.out.println("Both of these numbers are evenly divisible into each other");
      }
      else if ((num % num2 == 0) | (num2 % num) == 0)
      {
         System.out.println("One of these numbers is evenly divisible into the other");
      }
      else
      {
         System.out.println("Neither of these numbers are evenly divisible into the other");
      }
      input.close();
   }
}
