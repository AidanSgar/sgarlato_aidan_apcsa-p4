//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int mem1 = 1;
		int mem2 = 0;
		for (int i = 0; i < ray.size(); i++) {
			if(ray.get(i)%2 == 1) {
				mem1 = i;
				for (int j = i+1; j < ray.size(); j++) {
					if(ray.get(j)%2 == 0) {
						mem2 = j;
					}
				}
			}
			break;
		}
		return mem2-mem1;
	}
}