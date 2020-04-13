
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*;

public class WordSearch {
	private char[][] m;
	private int n;

	public WordSearch(int size, String str) {
		n = size;
		m = new char[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				m[i][j] = str.charAt(i * size + j);
			}
		}
	}

	public boolean isFound(String word) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (m[i][j] == word.charAt(0) && proximal(i, j, word)) {
					return true;
				}

			}
		}
		// assert false : "wrong";
		return false;
	}

	public boolean proximal(int i, int j, String word) {
		// assert false : "wrong";
		int iter = 0;

		int[][] nums = { { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };
		boolean[] neglect = {true , true, true, true, true, true, true, true };

		for (int k = 1; k < word.length(); k++) {
			for (int l = 0; l < n; l++) {
				if (i + k * nums[l][0] < n && i + k * nums[l][0] >= 0 && j + k * nums[l][1] < n && j + k * nums[l][1] >= 0) {
					if (neglect[l]) {
						if (!(m[i + k * nums[l][0]][j + k * nums[l][1]] == word.charAt(k))) {
							neglect[l] = false;
							//assert false;
						}
					}
				}
				else {
					neglect[l] = false;
				}
			}
			if (test(neglect)) {
				break;
			}
		}

		for (int k = 0; k < neglect.length; k++) {
			if (neglect[k]) {
				return true;
			}
		}
		return false;
	}

	public boolean test(boolean[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == true) {
				return false;
			}
		}
		return true;
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
