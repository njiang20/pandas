/**
Added punctuation and added some comments to try and make sense of stuff
**/
   
import java.util.Scanner;

public class Pig {
	private static final String VOWELS = "AEIOUYaeiouy";
	private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String PUNCS = ".,:;!?";

/*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p") -> false
=====================================*/

	public static boolean hasA( String w, String letter ) {
		return w.indexOf(letter) != -1;
	}//end hasA()

/*=====================================
equiv code, wo using indexOf()...
       boolean ans = false;
       for( int i = 0; i < w.length(); i++ ) {
       if ( w.substring(i,i+1).equals(letter) ) {
       ans = true;
       //Q: is there a more efficient way?
       }
       }
       return ans;
=====================================*/



/*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
=====================================*/

	public static boolean isAVowel( String letter ) {
		return VOWELS.indexOf( letter ) != -1;
	}

/*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
=====================================*/

	public static int countVowels( String w ) {
		return allVowels(w).length();
	}

/*=====================================
long version using for
       int numVowels = 0; //init vowels counter var
       //must touch each letter in word, so use FOR
       for( int i = 0; i < w.length(); i++ ) {
       if ( isAVowel( w.substring(i,i+1) ) )
       numVowels++;
       }
       return numVowels;
=====================================*/



/*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz") -> false
=====================================*/

	public static boolean hasAVowel( String w ) {
		return countVowels(w) > 0;
	}

/*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
=====================================*/

	public static String allVowels( String w ) {
		String ans = ""; //init return String
		for( int i = 0; i < w.length(); i++ ) {
			if ( isAVowel( w.substring(i,i+1) ) )
				ans += w.substring( i, i+1 ); //grow the return String
		}
		return ans;
	}

/*=====================================
    String firstVowel(String) -- returns first vowel in a String
    pre:  w != null
    post: firstVowel("") --> ""
    firstVowel("zzz") --> ""
    firstVowel("meatball") --> "e"
=====================================*/

	public static String firstVowel( String w ) {
		String ans = "";
		if ( hasAVowel(w) ) //Q: Why this necess?
			ans = allVowels(w).substring(0,1);
		return ans;
	}

/*=====================================
    boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
    pre:  w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
    beginsWithVowel("strong") --> false
=====================================*/

	public static boolean beginsWithVowel( String w ) {
		return isAVowel( w.substring(0,1) );
	}

/*=====================================
      boolean isPunc(String) -- tells whether a character is punctuation
      pre:  symbol.length() == 1
      post: isPunc(".") -> true
            isPunc("b") -> false
=====================================*/

	public static boolean isPunc( String symbol ) {
		return PUNCS.indexOf( symbol ) != -1;
	}

/*=====================================
      boolean hasPunc(String) -- tells whether a String contains punctuation
      pre:  w != null
      post: hasPunc(“cat.”) -> true
            hasPunc(“cat”) -> false
=====================================*/

	public static boolean hasPunc( String w ) {
		boolean ans = false;
   		for( int i = 0; i < w.length(); i++ ) {
       			if ( isPunc(w.substring(i,i+1)) ) {
       				ans = true;
			}
		}
		return ans;
	}

/*=====================================
      boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
      pre:  w != null and w.length() > 0
      post: beginsWithUpper("Apple") -> true
            beginsWithUpper("apple") -> false
=====================================*/

	public static boolean beginsWithUpper( String w ) {
		return isUpperCase(w.substring(0,1) );
	}

/*=====================================
      boolean isUpperCase(String) -- tells whether a letter is uppercase
      pre:  letter.length() == 1
      post: isUpperCase("a") -> false
            isUpperCase("A") -> true
=====================================*/

	public static boolean isUpperCase( String letter ) {
		return CAPS.indexOf( letter ) != -1;
	}

	public static boolean hasUpper(String w) {
       		for (int i = 0; i < w.length(); i++) {
			if (beginsWithUpper(w.substring(i, i+1))) {
				return true;
        		}
        	}
        	return false;
	}

/*=====================================
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
=====================================*/

	public static String engToPig( String w ) {
		String ans = "";
		String punc = "";

		// strat: punc only matters if its the last letter so if it is then remove it and then add it back at the end
		if (isPunc(w.substring(w.length()-1))){
			punc = w.substring(w.length()-1);
			w = w.substring(0, w.length()-1);
		}

		//isolate the case of y being the first letter because that is when it is a consonent, all the other times you can consider it to be vowel
		// nested if may be redundant but is used to separate cap cases into words beginning with vowel and those that aren't
		// we are considering it not starting with vowels because that means it must start with consonent

		if ( w.substring(0, 1).equals("y") || !(beginsWithVowel(w)) ){
			int vPos = w.indexOf(firstVowel(w));
			ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
			if (beginsWithUpper(w) && w.length() != 1) {
				String upper = w.substring(1, 2).toUpperCase();
				ans = upper + ans.substring(1).toLowerCase();
			}
		} else {
			ans = w + "way";
			if (beginsWithUpper(w) && w.length() != 1) {
				String upper = w.substring(0, 1).toUpperCase();
				ans = upper + ans.substring(1);
			}
		}
		return ans + punc;
	}

  	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.print(engToPig(sc.next()) + " "); //trying to take in phrase and outputting onto one line
			if (sc.next().equals("\n")) {  //doesn't work how make java recognize new line????
				System.out.println();
			} 
		}
	}//end main()

}//end class Pig
