//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test = new Word();
		
		test.setString("Hello");
		System.out.println(test);
		
		test.setString("TCEA");
		System.out.println(test);
		
		test.setString("drawocoward");
		System.out.println(test);
	}
}