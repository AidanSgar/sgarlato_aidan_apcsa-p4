//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner {
	public static void main( String args[] )
   {
		WordsCompare test = new WordsCompare();
		
		test.setWords("abc", "cba");
		test.compare();
		System.out.println(test);
		
		test.setWords("a", "A");
		test.compare();
		System.out.println(test);
		
		test.setWords("alphabet", "Zebra");
		test.compare();
		System.out.println(test);
				
   }
}