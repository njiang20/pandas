/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW80-- Generically Speaking
2022-03-25f
time spent: 1 hr
*/
/***
 * class LList v3
 * Implements a linked list of DLLNodes, each containing Turtle data
 **/

public class LList<Turtle> implements List<Turtle> //your List.java must be in same dir
{

  //instance vars
  private DLLNode<Turtle> _head, _tail; //pointers to first and last nodes
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = _tail = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  //add a node to end of list
  public boolean add( Turtle newVal )
  {
    addLast( newVal );
    return true; //per Java API spec
  }


  //insert a node containing newVal at position index
  public void add( int index, Turtle newVal )
  {
    if ( index < 0 || index > size() )
      throw new IndexOutOfBoundsException();

    else if ( index == size() )
      addLast( newVal );

    DLLNode<Turtle> newNode = new DLLNode<Turtle>( newVal, null, null );

    //if index==0, insert node before head node
    if ( index == 0 )
      addFirst( newVal );
    else {
      DLLNode<Turtle> tmp1 = _head; //create alias to head

      //walk tmp1 to node before desired node
      for( int i=0; i < index-1; i++ )
        tmp1 = tmp1.getNext();

      //init a pointer to node at insertion index
      DLLNode<Turtle> tmp2 = tmp1.getNext();

      //insert new node
      newNode.setNext( tmp2 );
      newNode.setPrev( tmp1 );
      tmp1.setNext( newNode );
      tmp2.setPrev( newNode );

      //increment size attribute
      _size++;
    }
  }//end add-at-index


  //remove node at pos index, return its cargo
  public Turtle remove( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    if ( index == 0 )
      return removeFirst();
    else if ( index == size()-1 )
      return removeLast();
    else {
      DLLNode<Turtle> tmp1 = _head; //create alias to head

      //walk to node before desired node
      for( int i=0; i < index-1; i++ ) {
        tmp1 = tmp1.getNext();
        System.out.println( "tmp1: " + tmp1.getCargo() );
      }
      //check target node's cargo hold
      Turtle retVal = tmp1.getNext().getCargo();

      //remove target node
      tmp1.setNext( tmp1.getNext().getNext() );
      System.out.println( "tmp1.getNext: " + tmp1.getNext().getCargo() );
      tmp1.getNext().setPrev( tmp1 );

      _size--;

      return retVal;
    }
  }


  public Turtle get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    Turtle retVal;
    DLLNode<Turtle> tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public Turtle set( int index, Turtle newVal )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    DLLNode<Turtle> tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    Turtle oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  //--------------v  Helper methods  v--------------

  public void addFirst( Turtle newFirstVal )
  {
    //insert new node before first node (prev=null, next=_head)
    _head = new DLLNode<Turtle>( newFirstVal, null, _head );

    if ( _size == 0 )
      _tail = _head;
    else
      _head.getNext().setPrev( _head );
    _size++;
  }


  public void addLast( Turtle newLastVal )
  {
    //insert new node after last node (prev=_last, next=null)
    _tail = new DLLNode<Turtle>( newLastVal, _tail, null );

    if ( _size == 0 )
      _head = _tail;
    else
      _tail.getPrev().setNext( _tail );
    _size++;
  }


  public Turtle getFirst() { return _head.getCargo(); }

  public Turtle getLast() { return _tail.getCargo(); }


  public Turtle removeFirst()
  {
    Turtle retVal = getFirst();
    if ( size() == 1 ) {
      _head = _tail = null;
    }
    else {
      _head = _head.getNext();
      _head.setPrev( null );
    }
    _size--;
    return retVal;
  }

  public Turtle removeLast()
  {
    Turtle retVal = getLast();
    if ( size() == 1 ) {
      _head = _tail = null;
    }
    else {
      _tail = _tail.getPrev();
      _tail.setNext( null );
    }
    _size--;
    return retVal;
  }
  //--------------^  Helper methods  ^--------------


  // override inherited toTurtle
  public String toString()
  {
    String retStr = "HEAD->";
    DLLNode<Turtle> tmp = _head; //init tr
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
    LList<String> james = new LList<String>();

    System.out.println("initially: " );
    System.out.println( james + "\tsize: " + james.size() );

    james.add("beat");
    System.out.println( james + "\tsize: " + james.size() );

    james.add("a");
    System.out.println( james + "\tsize: " + james.size() );

    james.add("need");
    System.out.println( james + "\tsize: " + james.size() );

    james.add("I");
    System.out.println( james + "\tsize: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
    System.out.println( james + "\tsize: " + james.size() );

    james.add(0,"whut");
    System.out.println( "...after add(0,whut): " );
    System.out.println( james + "\tsize: " + james.size() );

    james.add(4,"phat");
    System.out.println( "...after add(4,phat): " );
    System.out.println( james + "\tsize: " + james.size() );

    System.out.println( "...after remove last: "
                        + james.remove( james._size-1) );
    System.out.println( james + "\tsize: " + james.size() );

    System.out.println( "...after remove(0): " + james.remove(0) );
    System.out.println( james + "\tsize: " + james.size() );

    System.out.println( "...after remove(0): " + james.remove(0) );
    System.out.println( james + "\tsize: " + james.size() );

    System.out.println( "...after remove(0): " + james.remove(0) );
    System.out.println( james + "\tsize: " + james.size() );
  }//end main()

}//end class LList
