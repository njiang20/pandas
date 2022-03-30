/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW84-- Stack: What Is It Good For?
2022-03-30w
time spent: 2 hr

DISCO:
* we could create a peek() in Latkes.java to help us with allMatched
* the peek() method returns the object at the top of the stack without popping it.
QCC:
* Why is there nothing in our new stack?
*/

/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes stack = new Latkes(s.length());
    String turtle = "";

    for(int i = 0; i < s.length(); i++) {
      stack.push(s.substring(i, i+1));
    }

    for(int j = 0; j < s.length(); j++) {
      turtle += stack.pop();
    }
    return turtle;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/

  public static boolean allMatched( String s )
  {
    Latkes stack = new Latkes(s.length());
    if(s.length() == 0) {
      return true;

    } else {

        stack.push(s.substring(0, 1));

        for(int i = 1; i < s.length(); i++) {

          if ( !stack.isEmpty() && stack.peek().equals("(") && s.substring(i,i+1).equals(")") ) {
              stack.pop();
          }

          else if ( !stack.isEmpty() && stack.peek().equals("[") && s.substring(i,i+1).equals("]") ) {
              stack.pop();
          }

          else if ( !stack.isEmpty() && stack.peek().equals("{") && s.substring(i,i+1).equals("}") ) {
              stack.pop();
          }

          else {
            stack.push(s.substring(i, i+1));
          }

        } //for loop

      } //else

      return stack.isEmpty();

  } //method

  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
