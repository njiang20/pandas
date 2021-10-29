/*
Nina Jiang and Kevin Li
APCS
2021-10-28
Time spent: 0.7h

DISCO:
-Return statesments cause a method to stop and cayse the code after the return statement to stop running
-This is because it is considered unreachable code and therefore recursive loops end with returning a base case
Q/C/C: n/a
*/

public class Rof {
	public static String fenceF(int posts) {
		String result = "|";
		for (int x = 1; x < posts; x++) {
			result += "--|";
		}
		return result;
	}

	public static String reverseF(String s) {
		String result = "";
		for (int x = s.length(); x > 0; x--) {
			result += s.substring(x - 1, x);
		}
		return result;
	}

	public static String reverseR(String s) {
		if (s.length() == 0) {
			return "";
		}
		return lastLetter(s) + reverseR(reduceLetter(s));
	}

	public static String reduceLetter(String s) {
		return s.substring(0, s.length() - 1);
	}

	public static String lastLetter(String s) {
		return s.substring(s.length() - 1, s.length());
	}

	public static void main(String [] args) {
		System.out.println(fenceF(3));
		System.out.println(reverseF("stressed"));
		System.out.println(reverseR("stressed"));
	}
}
