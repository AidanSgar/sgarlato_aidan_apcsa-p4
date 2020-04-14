
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Recursion234Runner {
	public static void main(String args[]) {
		RecursionFunOne test1 = new RecursionFunOne();
		System.out.println(test1.countEvenDigits(4532));
		RecursionFunOne test2 = new RecursionFunOne();
		System.out.println(test2.countEvenDigits(523));
		RecursionFunThree test3 =  new RecursionFunThree();
		System.out.println(test3.luckyThrees(333));
		RecursionFunThree test4 =  new RecursionFunThree();
		System.out.println(test4.luckyThrees(25435472));
	}
}