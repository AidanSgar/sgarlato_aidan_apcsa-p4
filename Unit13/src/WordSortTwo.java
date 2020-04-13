//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		 for (int i = 0; i < wordRay.length-1; i++) 
	            for (int j = 0; j < wordRay.length-i-1; j++) 
	                if (compare(wordRay[j], wordRay[j+1])) {
	                    String temp = wordRay[j]; 
	                    wordRay[j] = wordRay[j+1]; 
	                    wordRay[j+1] = temp; 
	                } 
	}
	
	public boolean compare(String a, String b) {
		for (int i = 0; i < wordRay.length-1; i++) {
			if(a.charAt(i) >= b.charAt(i)) {
				return true;
			}
			else if(a.charAt(i) < b.charAt(i)) {
				return false;
			}
		}
		return false;
	}
	
	public String toString()
	{
		String output = "";
		for (int i = 0; i < wordRay.length; i++) {
			output += wordRay[i] + "\n";
		}
		return output + "\n\n";
	}
}