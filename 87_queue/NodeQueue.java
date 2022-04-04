/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW87-- The English Do Not Wait In Line for Soup
2022-04-04m
time spent: 1.5 hrs
*/

/*
DISCO:
* alot of the code for NodeQueue was similar to LList- like enqueue was the same as add, etc.

QCC:
* Our code compiled, but we got a null pointer exception when trying to test the main methods-
  we think there's a problem with the enqueue method, but we're not sure how to fix it?
*/

public class NodeQueue<QUASAR> implements Queue<QUASAR>
{
  private int _size;
  private LLNode<QUASAR> _front;

  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  public NodeQueue() {
    _size = 0;
    _front = null;
  }

  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue() {
    if (!isEmpty()) {
      QUASAR returns = _front.getCargo();
      _front = _front.getNext();
      return returns;
    } else {
      return null;
    }
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue(QUASAR x){
    LLNode<QUASAR> tmp = _front;
    for( int i=0; i < _size-1; i++ ) {
      tmp = tmp.getNext();
    }
    tmp.setNext(new LLNode<QUASAR> (x, tmp.getNext()));
    _size++;
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
    return _size == 0;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront(){
    return _front.getCargo();
  }

  public static void main(String[] args) {
    NodeQueue<String> turtle = new NodeQueue<String>();
    turtle.enqueue("a");
    turtle.enqueue("b");
    turtle.enqueue("c");
    turtle.enqueue("d");
    turtle.enqueue("e");
    System.out.println(turtle);
    turtle.dequeue();
    System.out.println(turtle);

  }
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue
