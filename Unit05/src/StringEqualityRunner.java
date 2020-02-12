//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality();
		
		test.setWords("aidan", "aidan");
		System.out.println(test);
		test.setWords("different", "same");
		System.out.println(test);
		test.setWords("ads", "dsa");
		System.out.println(test);
		
		
	}
}