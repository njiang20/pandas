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
    Stack<String> cakes = new ALStack<PANCAKE>();
    //Stack<String> cakes = new LLStack<PANCAKE>();
    System.out.println("Is cakes empty?: " + cakes.isEmpty());
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
