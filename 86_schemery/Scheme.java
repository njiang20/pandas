/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW86-- What a Racket
2022-04-01f
time spent: 1 hrs
*/

/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Push everything until the first closed parenthesis into stack 1
 *   2. Push the top item of stack 1 into stack 2 until you reach an operation and remove the items from stack 1
 *   3. Evaluate stack 2 and push it to stack 1.
 *   4. Repeat this process until there is one number in stack 1 and return it
 *
 * STACK OF CHOICE: ALStack by Team Random Word :_)
 * In the end it didn't matter b/c they all have the same methods/functionality.
 **/

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
    String[] ret = expr.split("//s+");

    Stack<String> turtle = new ALStack();
    Stack<String> ops = new ALStack();
    Stack<String> thisThing = new ALStack();

    for (String e : ret) {
      if (e.equals("-") || e.equals("+") || e.equals("*")) {
        ops.push(e);
      } else if (e.equals("(") || isNumber(e)) {
        turtle.push(e);
      } else if (e.equals (")")) {
        if(ops.peekTop().equals("+")) {
          while(!turtle.peekTop().equals("(")) {
            thisThing.push(turtle.pop());
          }
          turtle.pop();
          ops.pop();
          turtle.push(unload(1, thisThing));
        } else if (ops.peekTop().equals("-")) {
          while(!turtle.peekTop().equals("(")) {
            thisThing.push(turtle.pop());
          }
          turtle.pop();
          ops.pop();
          turtle.push(unload(2, thisThing));
        } else if(ops.peekTop().equals("*")) {
          while(!turtle.peekTop().equals("(")) {
            thisThing.push(turtle.pop());
          }
          turtle.pop();
          ops.pop();
          turtle.push(unload(3, thisThing));
        }
      } //end else
    } //end for loop
    return thisThing.peekTop() + ""; //???
  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
    int panda = Integer.parseInt(numbers.peekTop());
    numbers.pop();
    while(numbers.peekTop() != "(") {
      if(op == 1) {
        panda += Integer.parseInt(numbers.pop());
      } else if (op == 2) {
        panda -= Integer.parseInt(numbers.pop());
      } else if (op == 3) {
        panda *= Integer.parseInt(numbers.pop());
      }
    } //end while
    return panda + "";
  }//end unload()


  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
    try {
      Integer.parseInt(s);
      return true;
    }
      catch( NumberFormatException e ) {
      return false;
    }
  }



  //main method for testing
  public static void main( String[] args )
  {

      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
