//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	int[] a;
	public NumberShifter() {
		this(10);
	}
	public NumberShifter(int size) {
		set(size);
	}
	public void set(int size) {
		a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)Math.round(10*Math.random());
		}
	}
	public int[] shift() {
		int iter = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == 7) {
				int temp = a[i];
				a[i] = a[iter];
				a[iter] = temp;
				iter ++;
			}
		}
		return a;
	}
	public String toString() {
		return Arrays.toString(shift());
	}
}