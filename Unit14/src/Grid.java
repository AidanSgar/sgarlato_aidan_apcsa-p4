import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid {
	private String[] vals;
	private String[][] grid;
	private int rows;
	private int cols;
	
	public Grid(int r, int c, String[] v) {
		set(r,c,v);
	}
	public void set(int r, int c, String[] v) {
		vals = v;
		rows = r;
		cols = c;
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				grid[i][j] = vals[(int) Math.floor((vals.length * Math.random()))];
			}
		}
	}
	public String findMax() {
		int max = Integer.MIN_VALUE;
		String out = "";
		for (int i = 0; i < vals.length; i++) {
			if(countVals(vals[i]) > max) {
				max = countVals(vals[i]);
				out =  vals[i];
			}
		}
		return out;
	}

	// returns a count of how many times val occurs in the matrix
	private int countVals(String val) {
		int cnt = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(grid[i][j].equals(val)) {
					cnt ++;
				}
			}
		}
		return cnt;
	}

	// display the grid
	public String toString() {
		String output = "";
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				output += grid[i][j] + " ";
			}
			output += "\n";
		}
		return output;
	}
}