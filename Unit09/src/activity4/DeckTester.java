package activity4;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck test = new Deck(new String[] { "spades", "clubs", "hearts", "diamonds" }, new String[] { "ace", "two", "three","four","five","six","seven","eight","nine","ten","joker","queen","king"}, new int[] { 1,2,3,4,5,6,7,8,9,10,11,12,13 });
		System.out.println(test.deal());
		System.out.println(test.isEmpty());
		System.out.println(test);
	}
}
