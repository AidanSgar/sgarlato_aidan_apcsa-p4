//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		//setString("");
	}

	public StringOddOrEven(String s)
	{
		setString("");
	}

	public void setString(String s)
	{
		word = s;
	}

 	public String isEven()
 	{
		if(word.length()%2 == 1) {
			return "odd";
		}
		else return "even";
	}

 	public String toString()
 	{
 		return word + " is " + isEven() + "\n";
	}
}