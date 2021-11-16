/* Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more. */
public class firstLast6 {
	public static boolean firstLast(int[] nums) {
		if (nums[nums.length - 1] == 6 || nums[0] == 6) {
			return true;
		} else {
			return false;
		}
	}
	public static void main (String [] args) {
		System.out.println(firstLast(new int[]  {1, 2, 6}));
		System.out.println(firstLast(new int[]  {6, 1, 2, 3}));
		System.out.println(firstLast(new int[]  {13, 6, 1, 2, 3}));
	}
}
