package Unit12.copy;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private String name;
	private int size;
	
	public Skeleton(){
		this("",0);
	}
	public Skeleton(String s,int n) {
		setName(s);
		setSize(n);
	}
	public void setName(String s) {
		name = s;
	}
	public void setSize(int n) {
		size = n;
	}
	public int getHowBig(){
		return size;
	}
	public String getName() {
		return name;
	}
	public boolean isBigger(Monster in) {
		return in.getHowBig() > size;
	}
	public boolean isSmaller(Monster in) {
		return in.getHowBig() < size;
	}
	public boolean namesTheSame(Monster in) {
		return in.getName().equals(name);
	}
	
	public String toString() {
		return null;
	}
	
}