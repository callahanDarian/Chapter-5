// FixDebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
package debugging;
import java.util.Scanner;
public class FixDebugFive3
{
	static int item;
	static String output;
	static final int LOW = 111;
    static final int HIGH = 999;
    static final int CUTOFF = 500;
    
    static Scanner input = new Scanner(System.in);
    
   public static void main (String args[])
   {      
      calculateOutPut();
   }
   public static void calculateOutPut()
   {
           
      System.out.println("Please enter item number");
      item = input.nextInt();
      
      if (item < LOW) 
      {
    	  output = "Item number too low";
      }
      else if(item > HIGH)
      {
    	  output = "Item number too high";
      }
      else  if(item < CUTOFF)
      {
          output = "Valid - in Automotive Department";
      }
      else
      {
          output = "Valid - Item in Housewares Department";
      }
       System.out.println(output);
       input.close();
   }
}


