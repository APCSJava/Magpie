/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
*@austhor Rebecca Brunsberg 2014
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
                //demonstrates what happens if substring not found
		int notFoundPsn = sample.indexOf("slow");
                System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);

                //indexOf(String str, int fromIndex)
                int fromIndex = sample.indexOf("brown", 12);
                System.out.println("sample.indexOf brown = "+ fromIndex);
	}

}
