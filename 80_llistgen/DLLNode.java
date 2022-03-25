/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW80-- Generically Speaking
2022-03-25f
time spent: 1 hr
*/
/***
 * class DLLNode v1
 * Implements a node, for use in lists and other container classes.
 * Stores a Turtle as cargo.
 **/

public class DLLNode<Turtle>
{
  private Turtle _cargo;    //cargo may only be of type Turtle
  private DLLNode _nextNode, _prevNode; //pointers to next, prev DLLNodes


  // constructor -- initializes instance vars
  public DLLNode( Turtle value, DLLNode prev, DLLNode next )
  {
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }


  //--------------v  ACCESSORS  v--------------
  public Turtle getCargo() { return _cargo; }

  public DLLNode<Turtle> getNext() { return _nextNode; }

  public DLLNode<Turtle> getPrev() { return _prevNode; }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public Turtle setCargo( Turtle newCargo )
  {
    Turtle foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode<Turtle> setNext( DLLNode<Turtle> newNext )
  {
    DLLNode<Turtle> foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public DLLNode<Turtle> setPrev( DLLNode<Turtle> newPrev )
  {
    DLLNode<Turtle> foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toTurtle
  public String toString() { return _cargo.toString(); }


  //main method for testing
  public static void main( String[] args )
  {
    //Below is an exercise in creating a linked list...

 /*********************
    //Create a node
    DLLNode first = new DLLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new DLLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new DLLNode( "cow", null ) );

    DLLNode temp = first;
    while( temp != null ) {
      System.out.println( temp );
      temp = temp.getNext();
    }
   ***********************/
  }//end main

}//end class DLLNode
