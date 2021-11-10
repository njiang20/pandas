/**
Peppa Pig-eons | Faiza Huda, Truthful Tom, Nina Jiang, Tasnim C
DISCO:
 - Rules for when y is vowel and when not
 - scanner methods such as hasNext() and nextLine()
QCC:
 - How do you make scanner recognize new lines differently than new words?
 - Was there a far easier and more effiecient code than this?
HOW WE UTILIZED SCANNER DEMO (v5)
 - It takes in inputs which then gets run thru engToPig
 - This version only considers one worded inputs which is why println is used (next version is being in the works to deal with this)
WHAT CAUSES THE RUNTIME ERROR IN THE SCANNER DEMO
 - We have to make sure there is a next input for scanner
 - fix this by utilizing hasNext()
NEW IN v5:
 - Added in BE that will seperate 'y' into vowel and consonant cases
 - Combined some code in engToPig to make it less redundant and more tidy
NTS: If I am alive after this, come back and review code, and add comments for future self to understand
     format it better as well
**/
   
import java.util.Scanner;

public class Pig {
	private static final String VOWELS = "AEIOUYaeiouy";
	private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String PUNCS = ".,:;!?";


	public static boolean hasA( String w, String letter ) {
		return w.indexOf(letter) != -1;
	}//end hasA()


	public static boolean isAVowel( String letter ) {
		return VOWELS.indexOf( letter ) != -1;
	}


	public static int countVowels( String w ) {
		return allVowels(w).length();
	}


	public static boolean hasAVowel( String w ) {
		return countVowels(w) > 0;
	}


	public static String allVowels( String w ) {
		String ans = ""; //init return String
		for( int i = 0; i < w.length(); i++ ) {
			if ( isAVowel( w.substring(i,i+1) ) )
				ans += w.substring( i, i+1 ); //grow the return String
		}
		return ans;
	}


	public static String firstVowel( String w ) {
		String ans = "";
		if ( hasAVowel(w) ) //Q: Why this necess?
			ans = allVowels(w).substring(0,1);
		return ans;
	}


	public static boolean beginsWithVowel( String w ) {
		return isAVowel( w.substring(0,1) );
	}


	public static boolean isPunc( String symbol ) {
		return PUNCS.indexOf( symbol ) != -1;
	}


	public static boolean hasPunc( String w ) {
		boolean ans = false;
   		for( int i = 0; i < w.length(); i++ ) {
       			if ( isPunc(w.substring(i,i+1)) ) {
       				ans = true;
			}
		}
		return ans;
	}


	public static boolean beginsWithUpper( String w ) {
		return isUpperCase(w.substring(0,1) );
	}


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
			System.out.println(engToPig(sc.next()));
		}
	}//end main()

}//end class Pig
