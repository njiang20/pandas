/*
Team Orange Marshmellows: Julia Kozak, Nina Jiang, Diana Akhmedova // Duckies: Flopsy, Miss Alpaca, Ajax
APCS pd08
HW49 -- Rational Standards Compliance
2021-12-23
Time Spent: 0.5 hrs
*/

/*
DISCO:
- If an object uses the constructor of a certain class type, it can be typecasted as that class type.
- Even if java is told to throw the error, the object must still be typecasted as a Rational since java may still not know that it's a Rational type.
- Rational implementing Comparable means that Rational is a type of Comparable.
- Object instanceof Class is used to test whether the object is an instance of the specified type. It is a boolean.
QCC:
- If asking to run .equals() with a non-Rational object throws an error, is there a way to have the proceeding calls in the main method still run?
- Why can't we just use compareTo instead of equals?
*/

public class Rational implements Comparable {
	private int numerator;
	private int denominator;

	public Rational() {
		numerator = 0;
		denominator = 1;
	}

	public Rational(int num, int den) {
		this();
		if (den != 0) {
			denominator = den;
			numerator = num;
		}
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	public double floatValue() {
		return (double)numerator/denominator;
	}

	public void multiply(Rational q) {
		numerator = numerator * q.numerator;
		denominator = denominator * q.denominator;
	}

	public void divide(Rational q) {
		if (q.numerator != 0) {
			numerator = numerator * q.denominator;
			denominator = denominator * q.numerator;
		}
	}

	public void add(Rational q) {
		int d = denominator;
		denominator = denominator * q.denominator;
		numerator = numerator * q.denominator + q.numerator * d;
	}

	public void subtract(Rational q) {
		int d = denominator;
		denominator = denominator * q.denominator;
		numerator = numerator * q.denominator - q.numerator * d;
	}

	public int gcd() {
		for (int i=numerator; i>0; i--) {
			if (numerator % i == 0 && denominator % i ==0) {
				return i;
			}
		}
		return 1;
	}

	public void reduce() {
		int gcd = this.gcd();
		numerator = numerator / gcd;
		denominator = denominator / gcd;
	}

	public int compareTo(Object q) {
		if (q instanceof Rational) {
		Rational qRat = (Rational)q;
		Rational reduceThis = new Rational(this.numerator, this.denominator);
		Rational reduceQ = new Rational(qRat.numerator, qRat.denominator);
		reduceThis.reduce();
		reduceQ.reduce();
		if (reduceThis.numerator == reduceQ.numerator && reduceThis.denominator == reduceQ.denominator) {
			return 0;
		} else if (this.floatValue() > qRat.floatValue()) {
			return 1;
		} else {
			return -1;
		}
		} else {
			throw new ClassCastException ("\ncompareTo() input is not a Rational");
		}
	}

	public boolean equals(Object other) {
		if (this.compareTo(other) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
