
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*;

public class MatrixCount1 {
	private static int[][] m = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 }, { 6, 7, 1, 2, 5 }, { 6, 7, 8, 9, 0 },{ 5, 4, 3, 2, 1 } };

	public static int count(int val) {
		int cnt = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(m[i][j] == val) {
					cnt ++;
				}
			}
		}
		return cnt;
	}
	public String toString() {
		String out = "";
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				out += m[i][j] + " ";
			}
			out += "\n";
		}
		return out;
	}
}
