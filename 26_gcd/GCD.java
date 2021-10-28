public class GCD {
	public static int gcd (int a, int b) {
		int oldA = 1;
		int oldB = 1;
		while (a != b) {
			oldA = a;
			oldB = b;
			a = Math.min(a, b);
			b = Math.abs(b - a);
		}
		return a;
	}

	public static void main (String [] args) {
		System.out.println(gcd(3, 9));
	}
}
