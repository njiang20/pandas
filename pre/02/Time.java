public class Time {
	public static void main(String[] args) {
		int hour = 15;
		int minute = 21;
		int second = 26;
		int totseconds = ((((60 * hour) + minute) * 60) + second);
		System.out.println("Number of seconds since midnight: " + totseconds);
		System.out.println("Number of seconds remaining: " + (86400 - totseconds));
		System.out.println("Percentage of day passed: " + (totseconds * 100.0 / 86400.0));
		hour = 15;
		minute = 32;
		second = 45;
		int newtotseconds = ((((60 * hour) + minute) * 60) + second);
		System.out.println("Time that has passed: " + (newtotseconds - totseconds));
	}
}
