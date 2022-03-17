/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW77: Insert|Remove
2022-03-16
time spent: 1 hrs
*/

/***
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class DLLNode
{
  //instance vars
  private String _cargo;
  private DLLNode _nextNode; //linkage to next node
  private DLLNode _prevNode; //linkage to previous node

  // constructor
  public DLLNode( DLLNode prev, String value, DLLNode next )
  {
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return _cargo;
  }

  public DLLNode getNext()
  {
    return _nextNode;
  }

  public DLLNode getPrev()
  {
    return _prevNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    _cargo = newCargo;
    return _cargo;
  }

  public DLLNode setNext( DLLNode newNext )
  {
    _nextNode = newNext;
    return _nextNode;
  }

  public DLLNode setPrev( DLLNode newPrev )
  {
    _prevNode = newPrev;
    return _prevNode;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return _cargo;
  }


}//end class DLLNode
