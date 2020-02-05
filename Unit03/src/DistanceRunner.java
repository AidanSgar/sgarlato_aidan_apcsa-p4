//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 

import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);
		Distance test = new Distance();
	
		System.out.print("Enter X1:" );
		int x1 = input.nextInt();
		System.out.print("Enter Y1:" );
		int y1 = input.nextInt();
		System.out.print("Enter X2:" );
		int x2 = input.nextInt();
		System.out.print("Enter Y2:" );
		int y2 = input.nextInt();
		
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		System.out.print( test);
		
		System.out.print("Enter X1:" );
		x1 = input.nextInt();
		System.out.print("Enter Y1:" );
		y1 = input.nextInt();
		System.out.print("Enter X2:" );
		x2 = input.nextInt();
		System.out.print("Enter Y2:" );
		y2 = input.nextInt();
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		System.out.print( test);
		
		System.out.print("Enter X1:" );
		x1 = input.nextInt();
		System.out.print("Enter Y1:" );
		y1 = input.nextInt();
		System.out.print("Enter X2:" );
		x2 = input.nextInt();
		System.out.print("Enter Y2:" );
		y2 = input.nextInt();
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		System.out.print( test);
		
		
	}
}