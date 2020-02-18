/**
 * A program to carry on conversations with a human user. This is the initial
 * version that:
 * <ul>
 * <li>Uses indexOf to find strings</li>
 * <li>Handles responding to simple words and phrases</li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String input) {
		int max = -1;
		String response = "";
		String statement = "";
		String[] check = { "cat", "dog", "mother", "father", "sister", "brother", "Mr. Mauro", "stressed", "classes" };
		if (input.indexOf("no") >= 0) {
			response = "Why so negative?";
		}
		if (input.length() == 0) {
			response = "Say somthing I'm giving up on you.";
		}
		// finds the last keyword in a statement as the last key word is most prioritized 
		for (int i = 0; i < check.length; i++) {
			if (input.indexOf(check[i]) > max) {
				max = input.indexOf(check[i]);
				statement = check[i];
			}
		}
		if (statement.indexOf("cat") >= 0 || statement.indexOf("dog") >= 0) {
			response = "I love my cat, not so much into dogs.";
		} else if (statement.equals("mother") || statement.equals("father") || statement.equals("sister")
				|| statement.equals("brother")) {
			response = "Tell me more about your family.";
		} else if (statement.equals("Mr. Mauro")) {
			response = "Mr. Mauro is such a good well liked teacher isn't he?";
		} else if (statement.equals("stressed")) {
			response = "mood";
		} else if (statement.equals("classes")) {
			response = "I really like my classes right now actually.";
		} else if (statement.equals("music")) {
			response = "Who is your favorite artist?";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "How come?";
		} else if (whichResponse == 5) {
			response = "Oh, for sure.";
		}
		return response;
	}
}
