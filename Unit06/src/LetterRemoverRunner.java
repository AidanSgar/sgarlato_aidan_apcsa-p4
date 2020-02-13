
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner {
	public static void main(String args[]) {
		LetterRemover test = new LetterRemover();

		test.setRemover("I am Sam I am   a", 'a');
		System.out.println(test);

		test.setRemover("ssssssssxssssesssssesss   s", 's');
		System.out.println(test);

	}
}