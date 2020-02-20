//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double[] num = new double[4];
	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		num[0] = a;
		num[1] = b;
		num[2] = c;
		num[3] = d;
	}

	public double getBiggest()
	{
		double max = Double.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			if(num[i] > max) max = num[i];
		}
		return max;
	}

	public String toString()
	{
		
		return "The max value is: " + getBiggest() + "\n";
	}
}