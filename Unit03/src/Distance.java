//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xA,yA,xB,yB;
	private double distance;

	public Distance()
	{
		setCoordinates(0,0,0,0);
		distance = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);
		calcDistance();
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		
		xA = x1;
		
		yA = y1;
		
		xB = x2;
		
		yB = y2;
	}

	public void calcDistance()
	{
		distance = Math.sqrt((xA-xB)*(xA-xB)+(yA-yB)*(yA-yB));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	

	public String toString()
	{
		return "distance:\t" + getDistance() + "\n\n\n";
	}
}