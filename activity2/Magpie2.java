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
		return "Hello, let's talk. Also, as per the study guide, this program prioritizes its responses by the keywords: 'no''brother''mother'father''sister'dog''cat'Mr. Collins''party''ocean'and 'death', so whatever keyword comes first, the corresponding response will appear";
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
		
		if(statement.trim().length()<1)
		{
			response = "Please say something";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if(statement.indexOf("brother") >= 0)
                {
                        response = "I wish I had a brother.";
                }

		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if(statement.indexOf("dog") >= 0
			|| statement.indexOf("cat") >=0)
		{
			response = "I have many cats. Meow.";
		}
		
		else if(statement.indexOf("Mr. Collins") >= 0)
                {
                        response = "Sounds like a pretty chill guy.";
                }
		else if(statement.indexOf("party") >= 0)
                {
                        response = "Sounds nice.";
                }
		else if(statement.indexOf("ocean") >= 0)
                {
                        response = "I always loved the sea breeze.";
                }
		else if(statement.indexOf("death") >= 0)
                {
                        response = "Let's change the subject.";
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
		 else if (whichResponse == 4)
                {
                        response = "That's nice.";
                }
		 else if (whichResponse == 5)
                {
                        response = "Go on.";
                }
		else if (whichResponse == 6)
                {
                        response = "Sounds good.";
                }

		return response;
	}
}
