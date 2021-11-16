/* Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}. */
public class rotateLeft3 {
  public static int[] rotateLeft(int[] nums) {
    int a = nums[0];
    for(int i = 0; i < 2; i++){
      nums[i] = nums[i + 1];
    }
    nums[2] = a;
    return nums;
  }

  public static String arrToString( int[] ary ) {
    String ans = "[";
    for( int i = 0; i < ary.length; i++ ) {
      ans += ary[i];
      if( i != ary.length - 1 ) {
        ans += ", ";
      }
    }
    return ans + "]";
  }

  public static void main(String[] args) {
    System.out.println(arrToString(rotateLeft(new int[] {1, 2, 3})));
    System.out.println(arrToString(rotateLeft(new int[] {5, 11, 9})));
    System.out.println(arrToString(rotateLeft(new int[] {7, 0, 0})));
  }

}
