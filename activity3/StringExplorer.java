/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
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
		
		//  Try other methods here:
		int notFoundPsn = sample.indexOf("slow"); 
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);

                int lookSpecific = sample.indexOf("quick", 12);
                System.out.println("sample.indexOf(\"quick\") = " + lookSpecific);

                int lookSpecific2 = sample.indexOf("quick", 0);
                System.out.println("sample.indexOf(\"quick\") = " + lookSpecific2);

                Magpie3 m = new Magpie3();
		int sister = m.findKeyword("She's my sister", "sister", 0);
                int brother = m.findKeyword("Brother Tom is helpful", "brother", 0);
		int cat = m.findKeyword("I can't catch wild cats.", "cat", 0);
		int plow = m.findKeyword("I know nothing about snow plows.", "no", 0);
System.out.println(sister);
System.out.println(brother);
System.out.println(cat);
System.out.println(plow);
	}

}
