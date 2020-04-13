
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*;

public class WordSearchRunner {
	public static void main(String[] args) {
		WordSearch test = new WordSearch(8, "APPLEXYPXLHJKEEDEGGLLXXCGFPDGOGNMYNTAHUUPUQDGBTSBTHIGHMSILKXLTHIS");
		String[] words = "AXE APEX CAT HEX EGG HAT COMPUTER GUM THIS TUG THIGH".split(" ");
		
		System.out.println(test);
		
		for (int i = 0; i < words.length; i++) {
			if (test.isFound(words[i])) {
				System.out.println(words[i] + " was found in the matrix.");
			} 
			else {
				//assert false : "wrong";
				System.out.println(words[i] + " was not found in the matrix.");
			}
		}

	}
}
