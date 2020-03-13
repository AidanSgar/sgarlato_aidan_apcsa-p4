
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy {
	private String name;
	private int count;

	public Toy() {
		this("");
	}

	public Toy(String nom) {
		setName(nom);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int num) {
		count = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String nom) {
		name = nom;
	}

	public String toString() {
		return "We have " + count + " " + name;
	}
}