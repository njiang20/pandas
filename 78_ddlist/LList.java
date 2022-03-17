/***
 * class LList
 * Implements a linked list of DLLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private DLLNode _head;
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
    DLLNode tmp = _head;
    for( int i=0; i < index-1; i++ ) {
      tmp = tmp.getNext();
    }
    tmp.setNext(new DLLNode (tmp.getPrev(), newVal, tmp.getNext()));
    _size++;
  }

  //remove node from list, return its data
  public String remove( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    String retVal;
    DLLNode tmp = _head;
    if ( index == 0 ) {
      retVal = _head.getCargo();
      _head = _head.getNext();
    }
    else {
      for( int i=0; i < index-1; i++ )
        tmp = tmp.getNext();
      retVal = tmp.getNext().getCargo();
      tmp.setNext( tmp.getNext().getNext() );
    }
    _size--;
    return retVal;
  }

  public boolean add( String newVal )
  {
    DLLNode tmp = new DLLNode( null, newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    DLLNode tmp = _head; //create alias to head

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

    DLLNode tmp = _head; //create alias to head

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
    DLLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL" + "<-TAIL";
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

    // LList aaaa = new LList();
    // aaaa.add("testing");
    // System.out.println(aaaa);
    // System.out.println();
    //
    // aaaa.remove(1);

  }

}//end class LList
