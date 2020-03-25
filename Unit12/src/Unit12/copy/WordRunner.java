package Unit12.copy;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] list;
		boolean swap;
		String temp;
		
		Scanner file = new Scanner(new File("words.dat"));
		int size = file.nextInt();
		list =  new String[size];
		for (int i = 0; i < size; i++) {
			list[i] = file.nextLine();
		}
		
		for (int i = 0; i < list.length; i++) {
			swap = false;
			for (int j = 0; j < list.length; j++) {
				Word test1 = new Word(list[j]);
				Word test2 = new Word(list[j+1]);
				if(test1.compareTo(test2) > 0) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					swap = false;
				}
				
			}
			if(!swap) break;
		}
		System.out.println(Arrays.toString(list));
	}
}