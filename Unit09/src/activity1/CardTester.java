package activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card test1 = new Card("ace","black",1);
		Card test2 = new Card("ace","black",1);
		System.out.println(test1);
		System.out.println(test1.matches(test2));
	}
}
