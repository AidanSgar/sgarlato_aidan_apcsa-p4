//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		
		run.setDoubles(2.9, 1.34, .0001, Double.MAX_VALUE);
		System.out.println(run);

		//add more test cases
				
	}
}