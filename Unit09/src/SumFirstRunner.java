import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{	
		ArrayList<Integer> test1 = new ArrayList<Integer>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
		ArrayList<Integer> test2 = new ArrayList<Integer>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7));
		System.out.println(ListSumFirst.go(test1));
		System.out.println(ListSumFirst.go(test2));
	}
}