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
 * @author Roxy Sammons and Rebecka Brunsberg
 * @version 11 October 2014
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
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0
				|| statement.indexOf("hamster") >= 0){
			
			response = "Tell me more about your pets.";
	
		} else if (statement.indexOf("hate") >= 0) {

			response = "Hate is a very strong word.";		
		
		} else if (statement.indexOf("sad") >= 0
				|| statement.indexOf("disappointed") >= 0
				|| statement.indexOf("devastated") >= 0) {

			response = "Always look on the bright side of life!";
		
		} else if (statement.indexOf("exercise") >= 0
				|| statement.indexOf("run") >= 0) {

			response = "Exercise causes endorphins to be released, which makes you happy. So you should exercise if you're feeling down!";

		} else if (statement.trim().length() == 0) {
		
		response = "Say something, please.";

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
		final int NUMBER_OF_RESPONSES = 6;;
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
                else if (whichResponse == 4)
                {
                        response = "Impressive! Tell me more.";
	        }
                else if (whichResponse == 5)
                {
                response = "How unusual!";
                }

		return response;
	}
}
