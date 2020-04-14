
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow {
	public static List<Integer> getRowTotals(int[][] m) {
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				sum += m[i][j];
			}
			list.add(sum);
			sum = 0;
			
		}
		return list;
	}
}
