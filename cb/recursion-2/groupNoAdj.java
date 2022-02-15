public class groupNoAdj {
  public static boolean groupNoAdj(int start, int[] nums, int target) {
    if (start >= nums.length) {
      return (target == 0);
    }
    if (groupNoAdj(start + 2, nums, target - nums[start])) {
      return true;
    }
    if (groupNoAdj(start + 1, nums, target)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(groupNoAdj(0, [2, 5, 10, 4], 12));
  }
}
