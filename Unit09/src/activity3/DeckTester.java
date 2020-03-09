package activity3;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck test = new Deck(new String[] { "a", "b" }, new String[] { "a", "b" }, new int[] { 1, 2 });
		System.out.println(test.deal());
		System.out.println(test.isEmpty());
	}
}
