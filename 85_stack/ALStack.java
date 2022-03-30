public class ALStack implements Stack<PANCAKE>
{
  private ArrayList<String> _stack;
  private int _stackSize;


  //constructor
  public ALStack( int initCapacity )
  {
    _stack = new ArrayList<String>(initCapacity);
    _stackSize = 0;
  }


  //means of insertion
  public void push( String s )
  {
    //if necessary, create more storage space
    if ( isFull() ) {
      ArrayList<String> temp = new ArrayList<String>( _stack.length * 2 );
      for( int i = 0; i < _stack.length; i++ ) {
        temp[i] = _stack[i];
      }
      _stack = temp; //old _stack freed by JGC
    }
    //add new element at end of array
    //Q: Why is this more efficient than inserting at front?
    _stack[_stackSize] = s;
    _stackSize++;
  }


  //means of removal
  public String pop()
  {
    String retStr = "";
    if ( isEmpty() )  return null;
    retStr = _stack[ _stackSize---1 ];
    return retStr;
  }


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize == 0;
  }

  //chk for fullness
  public boolean isFull()
  {
    return _stackSize >= _stack.length;
  }

  public String peekTop()
  {
    return _stack[_stackSize];
  }



  //main method for testing
  public static void main( String[] args )
  {

  }
}
