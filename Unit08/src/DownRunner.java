//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		RayDown test = new RayDown();
		System.out.println(test.go(new int[] {1,2,3,4,5} ));
		System.out.println(test.go(new int[] {5,4,3,2,1} ));
		System.out.println(test.go(new int[] {2,2,2,2,1} ));
	}
}