/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<PIKACHU> implements Queue<PIKACHU>
{
  //instance variables
  private LLNode<PIKACHU> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front, _end = null;
    _size = 0;
  }


  public void enqueue( PIKACHU enQVal )
  {
    if ( isEmpty() ) {
      _front = _end = new LLNode<PIKACHU>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<PIKACHU>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;
    System.out.println("enqueued " + enQVal);
  }//O(?)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public PIKACHU dequeue()
  {
    PIKACHU retVal = _front.getCargo();
    _front = _front.getNext();

    if ( _front == null ) //just moved past last node
      _end = null;      //update _end to reflect emptiness

    _size--;

    return retVal;
  }//O(?)


  public PIKACHU peekFront()
  {
    return _front.getCargo();
  }//O(?)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   < YOUR SUCCINCT SUMMARY HERE >
   **/
  public void sample ()
  {
    
  }//O(?)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(?)


  // print each node, separated by spaces
  public String toString()
  {
    String retStr = "FRONT :: ";
    LLNode<PIKACHU> tmp = _front; //init tr
    while( tmp != null ) {
      retStr += tmp.getCargo() + " ";
      tmp = tmp.getNext();
    }
    retStr += " :: END";
    return retStr;
  }//end toString()

  /***
  * class LLNode
  * Implements a node, for use in lists and other container classes.
  * Stores its data as a T
  **/
 public class LLNode<T>
 {
   //instance vars
   private T _cargo;    //cargo may only be of type T
   private LLNode<T> _nextNode; //pointer to next LLNode<T>

   // constructor -- initializes instance vars
   public LLNode( T value, LLNode<T> next ) {
     _cargo = value;
     _nextNode = next;
   }


   //--------------v  ACCESSORS  v--------------
   public T getCargo() { return _cargo; }

   public LLNode<T> getNext() { return _nextNode; }
   //--------------^  ACCESSORS  ^--------------


   //--------------v  MUTATORS  v--------------
   public T setCargo( T newCargo ) {
     T foo = getCargo();
     _cargo = newCargo;
     return foo;
   }

   public LLNode<T> setNext( LLNode<T> newNext ) {
     LLNode<T> foo = getNext();
     _nextNode = newNext;
     return foo;
   }
   //--------------^  MUTATORS  ^--------------


   // override inherited toString
   public String toString() { return _cargo.toString(); }

 }//end class LLNode


  //main method for testing
  public static void main( String[] args )
  {

      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue

