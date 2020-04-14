
//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunThree {
	public static int luckyThrees(int num) {
		if (num / 10 == 0) {
			if (num == 3) {
				return 1;
			} else {
				return 0;
			}
		} else {
			if ((num % 10) == 3) {
				return 1 + luckyThrees(num / 10);
			} else {
				return luckyThrees(num / 10);
			}
		}
	}
}