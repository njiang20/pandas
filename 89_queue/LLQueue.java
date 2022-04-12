/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW89-- Queue Two Ways
2022-04-11t
time spent: .8 hrs

DISCO:
* It's much easier to code after drawing the encapsulation diagrams + looking at the api
* We do not need a _front, _end, or _size for LLQ or ALQ
* LinkedList has both peekFirst() and getFirst(); however peekFirst is more convenient
  because peekFirst() returns null when the list is empty, while getFirst() throws a NoSuchElementException

QCC:
*

*/

import java.util.LinkedList;

public class LLQueue<T> implements Queue<T> {
  private LinkedList<T> list;

  public LLQueue() {
    list = new LinkedList<T>();
  }

  public T dequeue() {
    if(!isEmpty()) {
      return list.removeFirst();
    }
    return null;
  }

  public void enqueue( T x ){
    list.addLast(x); //right?
  } //O(1)

  public boolean isEmpty(){
    return list.size() == 0;
  }

  public T peekFront(){
    return list.peekFirst();
  }

}
