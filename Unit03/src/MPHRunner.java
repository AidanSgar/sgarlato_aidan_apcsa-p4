//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		MilesPerHour test = new MilesPerHour();
		int dist,hrs,mins;
		
		for (int i = 0; i < 3; i++) {
		System.out.print("Enter the distance :: ");
		dist = keyboard.nextInt();
		System.out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();
		System.out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		test.setNums(dist, hrs, mins);
		test.calcMPH();
		System.out.println(test);
		}
	}
}