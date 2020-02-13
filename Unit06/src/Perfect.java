
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect {
	private double num;

	public Perfect() {
		setNum(0);
	}

	public Perfect(int n) {
		setNum(n);
	}

	public void setNum(int n) {
		num = n;
	}

	public boolean isPerfect() {
		int sum = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		if (sum + 1 == num) {
			return true;
		} else
			return false;
	}

	public String toString() {
		if (isPerfect()) {
			return (int) num + " is perfect";
		} else {
			return (int) num + " is not perfect";
		}
	}

}