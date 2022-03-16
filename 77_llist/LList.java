/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW77: Insert|Remove
2022-03-16
time spent: 1 hrs

DISCO:
* remove() works even when we return tmp.getCargo() instead of ret.getCargo()

QCC:
* Why does add (at index / insert) return nothing while adding to the beginning of a linked list returns a boolean?

ADD ALGO:
* Copies the first index-1 values in LList, when it gets to the index at which you want to add...

REMOVE ALGO:
* Copies the first index - 1 values in LList. Then create a new LLNode ret and copy the next nodes after the car of
  the initial node, tmp. tmp will set its next node to the next node of the new node (ret). The size decreases by 1
  and we return the car of ret.
*/

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  //insert at specified index
  public void add( int index, String newVal )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    LLNode tmp = _head;
    for( int i=0; i < index-1; i++ ) {
      tmp = tmp.getNext();
    }
    tmp.setNext(new LLNode (newVal, tmp.getNext()));
    _size++;
  }

  //remove node from list, return its data
  public String remove( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    LLNode tmp = _head;
    for (int i = 0; i < index - 1; i++) {
      tmp = tmp.getNext();
    }
    LLNode ret = tmp.getNext();
    tmp.setNext(ret.getNext());
    _size--;
    return ret.getCargo();
  }

  public boolean add( String newVal )
  {
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );
    System.out.println();

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    System.out.println();

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    System.out.println();

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    System.out.println();

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );
    System.out.println();

    System.out.println( "2nd item is: " + james.get(1) );
    System.out.println();

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );
    System.out.println();

    james.add(1, "need");
    System.out.println("With a word added james is: " + james);
    System.out.println( "size: " + james.size() );
    System.out.println();

    james.remove(3);
    System.out.println("With the 4th item removed james is: " + james); //I need a beat
    System.out.println( "size: " + james.size() );
    System.out.println();

    LList aaaa = new LList();
    aaaa.add("testing");
    System.out.println(aaaa);
    System.out.println();

    aaaa.remove(1);

  }

}//end class LList
