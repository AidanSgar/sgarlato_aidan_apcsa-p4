//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public int go(int[] ray){
		int mem1 = -1;
		boolean mem2 = true;
		for (int i = 0; i < ray.length; i++) {
			if(ray[i]%2 == 1 && mem2) {
				mem1 = i;
				mem2 = false;
			}
			else if( ray[i]%2 == 0 && mem1 != -1) {
				return i-mem1;
			}
		}
		return mem1;
	}
}