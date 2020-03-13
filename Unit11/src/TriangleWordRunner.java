//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);
		TriangleWord test = new TriangleWord();
		String word;
		while(true) {
			System.out.println("Enter new word: ");
			 word = input.next();
			System.out.println(test.printTriangle(word)+"\n");
		}
	}
}