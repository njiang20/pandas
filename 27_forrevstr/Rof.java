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

	public static void main(String [] args) {
		System.out.println(fenceF(3));
		System.out.println(reverseF("stressed"));
	}
}
