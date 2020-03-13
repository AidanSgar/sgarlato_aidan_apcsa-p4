//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public String printTriangle(String word)
	{
		String out = "";
		for (int i = 0; i <= word.length(); i++) {
				for (int k = 0; k < i; k++) {
					out += word.substring(0,i);
				}
				out += "\n";
		}
		return out;
	}
}