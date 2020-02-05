//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private double distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours  = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double temp = distance/(hours + minutes/60);
		if(temp < 1) {
			mph = temp;
		}
		else mph = Double.valueOf(Math.round(temp));
		
	}
	public double getMPH() {
		return mph;
	}
	
	public String toString()
	{
		return distance + " miles in " + hours + " hours and " + minutes + " minutes = " + String.format("%.3g%n", getMPH()) + "\n\n";
	}
}