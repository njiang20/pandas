/*
Nina Jiang and Kevin Li
APCS
2021-10-28
Time spent: 0.53h

DISCO:
Q/C/C:
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
		int half = s.length() / 2;
		if (s.length() == 1) {
			return s;
		} else {
			return reverseR(s.substring(half)) + reverseR(s.substring(0, half));
		}
	}

	public static void main(String [] args) {
		System.out.println(fenceF(3));
		System.out.println(reverseF("stressed"));
		System.out.println(reverseR("stressed"));
	}
}
