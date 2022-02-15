public class countAbc {
  public static int countAbc(String str) {
      if(str.length() <= 2) {
          return 0;
      }
      if(str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
          return 1 + countAbc(str.substring(2));
      }
      return countAbc(str.substring(1));
  }

  public static void main(String[] args) {
    System.out.println(countAbc("abc"));
  }
}
