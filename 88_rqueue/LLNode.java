/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW77: Insert|Remove
2022-03-16
time spent: 1 hrs
*/

/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode<PIKACHU>
{
  //instance vars
  private PIKACHU _value;
  private LLNode _nextNode; //linkage to next node

  // constructor
  public LLNode( PIKACHU value, LLNode next )
  {
    _value = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public PIKACHU getCargo()
  {
    return _value;
  }

  public LLNode getNext()
  {
    return _nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public PIKACHU setCargo( PIKACHU newCargo )
  {
    _value = newCargo;
    return _value;
  }

  public LLNode setNext( LLNode newNext )
  {
    _nextNode = newNext;
    return _nextNode;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    String idk = "(";
    idk += _value + " " + _nextNode;
    return idk + ")";
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new LLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );

    System.out.println( first );

    /*A naive list traversal, has side effects.... ?? */
       while( first != null ) {
         System.out.println( first );
         first = first.getNext();
       }
    /**/

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    //it deletes that node and prints the cdr (rest of list)
    //...so better: ?
    //
    //
    //

  }//end main

}//end class LLNode
