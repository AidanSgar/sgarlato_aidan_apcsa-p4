//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		for (int i = 0; i < TotalRow.getRowTotals(new int[][] {{1,2,3},{2,1,3}}).size(); i++) {	
			System.out.println("Sum of row " + (i+1) + " is " + TotalRow.getRowTotals(new int[][] {{1,2,3},{2,1,3}}).get(i));
		}
		TotalRow.getRowTotals(new int[][] {{1,2,3},{2,1,3}});
	}
}



