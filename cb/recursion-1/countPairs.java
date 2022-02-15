public class countPairs {
  public static int countPairs(String str) {
  	if(str.length() < 3) {
  		return 0;
    }
  	if(str.charAt(0) == str.charAt(2)) {
  		return 1 + countPairs(str.substring(1));
    }
  	return countPairs(str.substring(1));
  }

  public static void main(String[] args) {
    System.out.println(countPairs("axa"));
  }
}
