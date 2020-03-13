
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore {
	private ArrayList<Toy> toyList;

	public ToyStore() {
		toyList = new ArrayList<Toy>();
	}

	public void loadToys(String toys) {
		if( toyList.size() != 0) {
		if(toys.equals(getThatToy(toys).getName())) {
			int x = getThatToy(toys).getCount();
			getThatToy(toys).setCount(x+1);
		}
		else {
			toyList.add(new Toy(toys));
		}
	}
		else {
			toyList.add(new Toy(toys));
		}
	}

	public Toy getThatToy(String nm) {
		Toy temp = new Toy();
		for (int i = 0; i < toyList.size(); i++) {
			if (toyList.get(i).getName().equals(nm))
				temp = toyList.get(i);
		}
		return temp;
	}

	public String getMostFrequentToy() {
		sortToysByCount();
		return toyList.get(toyList.size()-1).getName();
	}

	public void sortToysByCount() {
		Toy temp = new Toy();
		for (int i = 0; i < toyList.size() - 1; i++) {
			for (int j = 0; j < toyList.size() - i - 1; j++) {
				if (toyList.get(j).getCount() > toyList.get(j + 1).getCount()) {
					temp = toyList.get(j);
					toyList.set(j, toyList.get(j + 1));
					toyList.set(j + 1, temp);
				}
			}
		}
	}

	public String toString() {
		String out = "";
		for (int i = 0; i < toyList.size()-1; i++) {
			out += toyList.get(i).getName() + "(" + toyList.get(i).getCount() + "), ";
		}
		out += toyList.get(toyList.size()-1).getName() + "(" + toyList.get(toyList.size()-1).getCount() + ")";
		return out;
	}
}