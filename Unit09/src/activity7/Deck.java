package activity7;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards. It provides several
 * operations including initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	
	/*
	 * 
	Array implementation
	
	private Card[] cards = new Card[52];
	private int size;
	
	public Deck(String[] ranks, String[] suits, int[] values) {
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
			Card test = new Card(ranks[j], suits[i], values[j]);
			cards[i] = test;
			}
		}
		shuffle();
	}
	
	public boolean isEmpty() {
		return cards.length == 0;
	}
	
	public void shuffle() {
		Random rand = new Random();
		int var;
		Card temp = new Card();
		for (int i = 0; i < cards.length; i++) {
			var = rand.nextInt(52);
			cards[i] = cards[var];
		}
		size();
	}
	public int size() {
		return cards.length;
	}
	public Card deal() {
		size = cards.length;
		size--;
		return cards[size];

	}

	*/
	 
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) {
		for (int i = 0; i < suits.length; i++) {
			for(int j = 0; j < ranks.length; j++){
			Card test = new Card(suits[i],ranks[j],values[j]);
			cards.add(test);
			}
		}
		shuffle();
	}

	public boolean isEmpty() {
		return cards.size() == 0;
	}

	public int size() {
		return cards.size();
	}

	public void shuffle() {
		Random rand = new Random();
		int var;
		Card temp = new Card();
		for (int i = 0; i < cards.size(); i++) {
			var = rand.nextInt(52);
			cards.set(i,cards.get(var));
		}
		size();
	}

	public Card deal() {
		size = cards.size();
		size--;
		return cards.get(size);

	}
	
	/**
	 * Generates and returns a string representation of this deck.
	 * 
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 4 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
