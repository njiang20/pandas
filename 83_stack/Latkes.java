/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW83-- Stacks on Stacks
2022-03-29t
time spent: .5 hr
*/

/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO:
    * When we overflow the stack by pushing more Strings into it than the initCapacity
     (max size of stack) then once we pop the items that exeeded the limit of the stack
     didn't get printed.
    * The methods have a runtime of O(1) because they do not need to traverse the entire array.

    QCC
    * Why was the stack in the main method initialized to a size of 10 when the _stackSize
    need to be more >=12 (we push 12 Strings to tastyStack)

 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    _stack = new String[initCapacity];
    _stackSize = 0;
  }// O(1)


  //means of insertion
  public void push( String s )
  {
    if(!isFull()){
      _stack[_stackSize] = s;
      _stackSize++;
    }
  }// O(1)


  //means of removal
  public String pop( )
  {
    if(!isEmpty()) {
      _stackSize--;
      return _stack[_stackSize];
    }
    return null;
  }// O(1)


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize == 0;
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize >= _stack.length;
  }// O(1)


  //main method for testing
  public static void main( String[] args )
  {

    Latkes tastyStack = new Latkes(12);

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");

    System.out.println();

    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
