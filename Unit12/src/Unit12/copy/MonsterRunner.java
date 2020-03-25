package Unit12.copy;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		Skeleton test1 = new Skeleton();
		Skeleton test2 = new Skeleton();
		
		System.out.println("Enter monster's name :");
		test1.setName(keyboard.nextLine());
		System.out.println("Enter monster's size :");
		test1.setSize(keyboard.nextInt());
		System.out.println("Enter monster's name :");
		test2.setName(keyboard.nextLine());
		System.out.println("Enter monster's size :");
		test2.setSize(keyboard.nextInt());
		
		System.out.println("The size is");
		System.out.print(test1.getHowBig());
		System.out.println("The name is");
		System.out.print(test1.getName());
		
		System.out.println(test1.isBigger(test2));
		System.out.println(test1.isSmaller(test2));
		System.out.println(test1.namesTheSame(test2));
	}
}