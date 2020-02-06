//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Discount test = new Discount();
		double amt;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter the original bill amount :: ");
			 amt = keyboard.nextDouble();
			 test.setAmount(amt);
			 test.calcDiscount();
			 System.out.println(test);
		}
	}
}