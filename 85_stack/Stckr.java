/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW85-- Leon Leonwood Stack
2022-03-31r
time spent: 1 hrs
*/

/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    // Stack<String> cakes = new ALStack<String>();
    Stack<String> cakes = new LLStack<String>();
    System.out.println("Is cakes empty?: " + cakes.isEmpty()); //true
    cakes.push("a");
    cakes.push("b");
    cakes.push("c");

    System.out.println("Peeking Top: " + cakes.peekTop()); //c

    System.out.println("Popping Top...: " + cakes.pop()); //c
    System.out.println(cakes.pop()); //b
    System.out.println(cakes.peekTop()); //a

    System.out.println("Is cakes empty?: " + cakes.isEmpty()); //false

    System.out.println(cakes.pop()); //a

    System.out.println(cakes.isEmpty()); //true

  }//end main

}//end class
