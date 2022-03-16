/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW76 -- We Got a Little Ol' Convoy
2022-03-15t
time spent: 1.5 hrs
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
    _head = null;
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    if (_size == 0) {
      _head = new LLNode( newVal, null );
      _size++;
      return true;
    }
    else {
      LLNode temp = _head;
      while (temp.getNext() != null){
        temp = temp.getNext();
      }
      temp.setNext( new LLNode( newVal, null ) );
      _size++;
    }
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    LLNode temp = _head;
    for (int i = 0; i < index; i++){
      temp = temp.getNext();
    }
    return temp.getCargo();
  }


  public String set( int index, String newVal )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    LLNode temp = _head;
    for (int i = 0; i < index; i++){
      temp = temp.getNext();
    }
    return temp.setCargo(newVal);
  }


  //return number of nodes in list
  public int size()
  {
    return _size;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    String output = "(";
    if (_size == 0){
      return "(null)";
    }
    for (LLNode temp = _head; temp != null; temp = temp.getNext()) {
      output += temp.getCargo();
      if (temp.getNext() != null) {
        output += " ";
      } else {
        output += " " + temp.getNext();
      }
    }
    return output + ")";
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
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList
