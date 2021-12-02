/*
Team Orange Marshmellows: Nina Jiang, Diana Akhmedova, Julia Kozak // Duckies: Miss Alpaca, Ajax, Flopsy
APCS pd08
HW41 -- Be Rational
2021-12-01
Time Spent: 0.5 hrs
*/

public class Rational {
	private int numerator;
	private int denominator;

	public Rational() {
		numerator = 0;
		denominator = 1;
	}

	public Rational(int num, int den) {
		numerator = num;
		if (den != 0) {
			denominator = den;
		} else {
      numerator = 0;
      denominator = 1;
		}
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	public float floatValue() {
		return (float)numerator/denominator;
	}

	public void multiply(Rational n) {
		numerator = numerator * n.numerator;
		denominator = denominator * n.denominator;
	}

	public void divide(Rational n) {
		numerator = numerator * n.denominator;
		denominator = denominator * n.numerator;
	}

	public static void main(String[] args) {
		Rational a = new Rational(1, 7);
    Rational b = new Rational(2, 6);

		System.out.println(a.toString());
    System.out.println(a.floatValue());

    a.multiply(b);
    System.out.println(a.toString());

    a.divide(b);
    System.out.println(a.toString());
	}
}
