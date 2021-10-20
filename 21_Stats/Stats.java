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
		int geoMean = Math.pow((a * b), 1/2);
		return geoMean;
	}

	public static double geoMean(double a, double b) {
		double geoMean = Math.pow((a*b), 1/2);
		return geoMean;
	}

	public static int max(int a, int b, int c) {

	}

	public static double max(double a, double b, double c) {

	}

	public static int geoMean(int a, int b, int c) {

	}

	public static double geoMean(double a, double b, double c) {

	}


	//main method for testing functionality
	public static void main( String[] args ) {

	}

}//end class
