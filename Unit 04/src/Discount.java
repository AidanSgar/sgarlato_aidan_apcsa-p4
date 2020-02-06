//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	double amt= 0;
	
	public Discount() {
		amt=0;
	}
	public void setAmount(double a) {
		amt = a;
	}
	public double calcDiscount()
	{
		if(amt > 2000) return amt*.8;
		else return amt;
	}
	public String toString() {
		return "Bill after discount :: " + String.format("%.3f", calcDiscount());
	}
}