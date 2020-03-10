import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{		
		ArrayList<Integer> test1 = new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
		System.out.println(ListDown.go(test1));
		ArrayList<Integer> test2 = new ArrayList<Integer>(Arrays.asList(2,1,3,4,5));
		System.out.println(ListDown.go(test2));
	}
}