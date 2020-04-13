//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter test = new NumberShifter(100);
		System.out.println(test);
		test.set(12);
		System.out.println(test);
		test.set(5);
		System.out.println(test);
	}
}



