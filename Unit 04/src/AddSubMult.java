//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	//public AddSubMult() {
		
	//}
	public float check( double a, double  b )
	{
		if(a == b) {
			return (float)(a*b);
		}
		else return (float)Math.abs(a-b);
	}
	
}