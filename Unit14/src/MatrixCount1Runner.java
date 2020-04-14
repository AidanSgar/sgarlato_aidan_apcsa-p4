import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		Scanner input = new Scanner(System.in);
		MatrixCount1 test =  new MatrixCount1();
		System.out.println(test);
		int value;
		int count;
		while(true) {
			System.out.println("Input Value: ");
			value = input.nextInt();
			count = test.count(value);
			System.out.println(value + " occures "+count+" times in the matrix.");
		}
	}
}



