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
statement = statement.trim();
 String response = "";
if(statement.length() <= 0){
final int RESPONSES  = 3;
                double ra = Math.random();
                int which = (int)(ra * RESPONSES);
                

                if (which == 0)
                {
                        response = "Say something, please.";
                }
                else if (which == 1)
                {
                        response = "Is something wrong?";
                }
                else if (which == 2)
                {
                        response = "Lets talk";
                }
               


return response;
}
	else{

	
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}

  else if (statement.indexOf("cat") >= 0
                                || statement.indexOf("dog") >= 0
                                || statement.indexOf("bird") >= 0
                                || statement.indexOf("fish") >= 0)
                {
                        response = "Tell me more about your pets.";
                }

  else if (statement.indexOf("Sick") >= 0)
                {
                        response = "Go see a doctor";
                }

  else if (statement.indexOf("Mother") >= 0
                                || statement.indexOf("Father") >= 0
                                || statement.indexOf("Bother") >= 0
                                || statement.indexOf("Sister") >= 0)
                {
                        response = "Tell me more about your Family.";
                }
  else if (statement.indexOf("Trevor") >= 0)
                {
                        response = "Oh god, *Rolls eyes*";
                }
		else if (statement.indexOf("Mr.") >= 0 || statement.indexOf("Ms.") >= 0 || statement.indexOf("Mrs.") >= 0)
{		
if(statement.indexOf("Mr.") >= 0){
response = "He sounds like a good teacher.";

}

else{
response = "She sounds like a good teacher.";
}

}		else
		{
			response = getRandomResponse();
		}
		return response;
	}
}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "What is your name.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
