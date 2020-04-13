
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter {
	public static int[] getSortedDigitArray(int number) {
		int[] sorted;
		int size = 0;

		for (int i = 0; i < 1000; i++) {
			if (number / ((int) Math.pow(10, i)) == 0) {
				size = i;
				break;
			}
		}
		sorted = new int[size];
		for (int i = sorted.length - 1; i >= 0; i--) {
			sorted[sorted.length - i - 1] = (number % (int) Math.pow(10, i + 1)) / ((int) Math.pow(10, i));
		}
		for (int i = 0; i < size - 1; i++)
			for (int j = 0; j < size - i - 1; j++)
				if (sorted[j] > sorted[j + 1]) {
					int temp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = temp;
				}
		return sorted;
	}
}