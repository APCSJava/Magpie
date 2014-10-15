/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *       Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

public class Magpie2{
  /**
   * Get a default greeting  
   * @return a greeting
   */
  public String getGreeting() {
    return "Hello, let's talk.";
  }
  
  /**
   * Gives a response to a user statement
   * 
   * @param statement
   *            the user statement
   * @return a response based on the rules given
   */
  public String getResponse(String statement){
    String response = "";
    if (statement.indexOf("no") >= 0){
      response = "Why so negative?";
    }
    else if (statement.indexOf("mother") >= 0
               || statement.indexOf("father") >= 0
               || statement.indexOf("sister") >= 0
               || statement.indexOf("brother") >= 0){
      response = "Tell me more about your family.";
    }
    else if (statement.indexOf("cat") >=0
               || statement.indexOf("dog") >=0){
      response = "Tell me more about your pets.";
    }
    else if (statement.indexOf("Mr Collins") >=0
               || statement.indexOf("Mr Bracht") >=0
               || statement.indexOf("Mr Pogiolli") >=0
               || statement.indexOf("Ms DeSimone") >=0
               || statement.indexOf("Mr Dunmore") >=0
               || statement.indexOf("Mr Gladis") >=0
               || statement.indexOf("Mr Hauck") >=0
               || statement.indexOf("Mr Ringham") >=0){
      response = "Sounds like a good teacher.";
    }
    else if(statement.trim() == ""){
      response = "Say something, please.";
    }
    else if (statement.indexOf("Rain") >= 0
               || statement.indexOf("Sun") >= 0
               || statement.indexOf("Warm") >= 0
               || statement.indexOf("Cloud") >= 0
               || statement.indexOf("Winter") >= 0
               || statement.indexOf("Summer") >= 0
               || statement.indexOf("Autumn") >= 0
               || statement.indexOf("Spring") >= 0 ){
      response = "Can you tell me more about what it's like out?";
    }
    else if (statement.indexOf("TV") >= 0
               || statement.indexOf("tv") >= 0
               || statement.indexOf("Movie") >= 0) {
      response = "What do you like to watch?";
    }
    else if (statement.indexOf("programming") >= 0
               || statement.indexOf("code") >= 0){
      response = "Are you a programmer?";
    }
    else{
      response = getRandomResponse();
    }
    return response;
  }
  
  
  /**
   * Pick a default response to use if nothing else fits.
   * @return a non-committal string
   */
  private String getRandomResponse(){
    final int NUMBER_OF_RESPONSES = 5;
    double r = Math.random();
    int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
    String response = "";
    
    if (whichResponse == 0){
      response = "Interesting, tell me more.";
    }
    else if (whichResponse == 1){
      response = "Hmmm.";
    }
    else if (whichResponse == 2){
      response = "Do you really think so?";
    }
    else if (whichResponse == 3){
      response = "You don't say.";
    }
    else if (whichResponse == 4){
      response = "Do you really think so?  Can you elaborate?";
    }
    else if (whichResponse == 5){
      response = "Wow! Please continue";
    }
    
    return response;
  }
}
