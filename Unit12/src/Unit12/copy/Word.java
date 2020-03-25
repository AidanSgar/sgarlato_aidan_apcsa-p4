package Unit12.copy;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Word implements Comparable<Word> 
{
	private String word;
	private String[] list;
	
	public Word( String s)
	{
		word = s;
		
	}
	
	public String getString() {
		return word;
	}
	
	public int compareTo( Word rhs )
	{	
		if(word.length() > rhs.getString().length()) {
			return 1;
		}
		if(word.length() < rhs.getString().length()) {
			return -1;
		}
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i) > rhs.getString().charAt(i)) {
				return 1;
			}
			if(word.charAt(i) < rhs.getString().charAt(i)) {
				return -1;
			}
		}
		return 0;
	}

	public String toString()
	{
		return "";
	}
}