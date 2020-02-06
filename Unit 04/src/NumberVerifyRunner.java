//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner(System.in);
		int test;
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter a whole number : :");
			test = input.nextInt();
			System.out.println(test + " is odd :: " + NumberVerify.isOdd(test));
			System.out.println(test + " is even :: " + NumberVerify.isEven(test) + "\n");
			
		}
		
		//add in more test cases
	}
}