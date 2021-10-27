public class Repeat {
	public static String fenceW(int numPosts) {
		int x = 1;
		String result = "|";
		while (x < numPosts) {
			result += "--|";
			x++;
		}
		return result;        
	}

	public static String fenceR(int numPosts) {
		if (numPosts == 1) {
			return "|";
		} else {
			return fenceR(numPosts - 1) + "--|";
		}
	}

	public static void main(String[] args) {
		System.out.println(fenceW(3));
		System.out.println(fenceR(3));
	}
}
