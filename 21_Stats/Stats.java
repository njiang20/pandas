/*
Triumphant Triangles--Nina Jiang, Jason Zhou, John Gupta-she//Duckies: Miss Alpaca, Tiggy, Po
APCS
HW21: STAtisTically Speaking...
2021-10-20
DISCO:
-Math.pow uses double so I need to convert double to int for int geoMean() using (int) Math.round()
-int Math.round() leads to a compilation error: '.class' expected. Putting () around int fixes it
Q/C/C:
-Since geoMean() uses double, how can I put a double into int geoMean() without an error?
*/

public class Stats {
	public static int mean(int a, int b) {
		int mean = ((a + b)/2);
		return mean;
	}

	public static double mean(double a, double b) {
		double mean = ((a+b)/2);
		return mean;
	}

	public static int max(int a, int b) {
		if (a == b) {
			return a;
		} else if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static double max(double a, double b) {
		if (a == b) {
			return a;
		} else if (a > b) {
			return a;
		} else {
			return b;
                }
	}

	public static int geoMean(int a, int b) {
		int geoMean = (int) Math.round(Math.pow((a * b), 1/2));
		return geoMean;
	}

	public static double geoMean(double a, double b) {
		double geoMean = Math.pow((a*b), 1/2);
		return geoMean;
	}

	public static int max(int a, int b, int c) {
		if (a >= b && b >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}

	public static double max(double a, double b, double c) {
		if (a >= b && b >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}

	public static int geoMean(int a, int b, int c) {
		int geoMean = (int) Math.round(Math.pow((a * b * c), 1/2));
		return geoMean;
	}

	public static double geoMean(double a, double b, double c) {
		double geoMean = Math.pow((a * b * c), 1/2);
		return geoMean;
	}

	//main method for testing functionality
	public static void main(String[] args) {
		System.out.println(Stats.mean(1, 2));
		System.out.println(Stats.mean(1.0, 2.0));

		System.out.println(Stats.max(1, 10));
		System.out.println(Stats.max(1, 4.5));

		System.out.println(Stats.geoMean(9, 16));
		System.out.println(Stats.geoMean(9.0, 16.0));

		System.out.println(Stats.max(1, 2, 3));
		System.out.println(Stats.max(-1, 0, 3));
		System.out.println(Stats.max(1, 1, 1));

		System.out.println(Stats.max(1.0, 2.0, 3.0));
		System.out.println(Stats.max(2.2, 2.2, 2.2));
		System.out.println(Stats.max(0.0, -4.2, 1.2));

		System.out.println(Stats.geoMean(4, 9, 16));
		System.out.println(Stats.geoMean(4.0, 9.0, 16.0));
	}
} //end class
