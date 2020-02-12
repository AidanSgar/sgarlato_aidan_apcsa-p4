//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner(System.in);
		StringOddOrEven test = new StringOddOrEven();
		
		test.setString("dog");
		System.out.println(test);
		
		test.setString("Psychotomimetic");
		System.out.println(test);
		
		test.setString("ya");
		System.out.println(test);
		//System.out.println(t);
	}
}