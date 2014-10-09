/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (statement.indexOf("cheese") >= 0) {
			response  = "What kind of cheese do you like?";
		}

		else if ((statement.indexOf("baseball") >= 0) || (statement.indexOf("soccer") >= 0)) {
			response  = "Tell me more about your favorite sports.";
		}

		else if ((statement.indexOf("dog") >= 0) || (statement.indexOf("cat") >= 0)) {
			response  = "Tell me more about your pets.";
		}

		else if (statement.indexOf("mr.") >= 0 || statement.indexOf("mrs.") >= 0) {
			if (statement.indexOf("good") >= 0 || statement.indexOf("great") >= 0 || statement.indexOf("awesome") >= 0) {
			response = "Cool! They seem like a good person.";
		 }

			else if (statement.indexOf("bad") >= 0 || statement.indexOf("terrible") >= 0) {
			response = "I'm sorry. They seem like an awful person.";
		 }

			else response = "Tell me more about your teachers.";
		}

		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		else if (statement.length() == 0) {
			response = "Don't be rude. Silence doesn't do any good.";
		}

		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		else if (whichResponse == 4) {
			response = "Why do you think that?";
		}

		else if (whichResponse == 5) {
			response = "How so?";
		}

		else if (whichResponse == 6) {
			response = "Sometimes, I'm not sure if you're telling the truth.";
		}

		return response;
	}
}
