
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne {

	int index = 1;

	public int countEvenDigits(int num) {
		if (num / 10 == 0) {
			if (num % 2 == 0) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if ((num % 10) % 2 == 0) {
				return 1 + countEvenDigits(num / 10);
			} else {
				return countEvenDigits(num / 10);
			}
		}
	}
}