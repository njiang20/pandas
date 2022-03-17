/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW78: Double Up
2022-03-17r
time spent: 1 hrs
*/

/*
DISCO:
* remove() will not work if it does not check for 0.

QCC:
* Were we supposed to make any significant changes in our methods? We only changed
  the varaible type and one line (line 32)
* When would we use doubly linked lists instead of linked lists?

ADD ALGO:
* Copies the first index-1 values in LList, when it gets to the index at which you want to add it creates a new LLNode
  amd sets it to the value of newVal. Then increments size by 1.

REMOVE ALGO:
* Copies the first index - 1 values in LList. Then create a new LLNode ret and copy the next nodes after the car of
  the initial node, tmp. tmp will set its next node to the next node of the new node (ret). The size decreases by 1
  and we return the car of ret.
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
