/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW91-- Deque the Halls
2022-04-14r
time spent: 1.0 hrs
*/
import java.util.Iterator;

public interface Deque<T> {

  //push methods
  public void addFirst(T x);
  public void addLast(T x);
  //public boolean offerFirst(T x);
  //public boolean offerLast(T x);

  //remove methods
  public T removeFirst();
  public T removeLast();
  //public T pollFirst();
  //public T pollLast();
  // public boolean removeFirstOccurrence(T x);
  // public boolean removeLastOccurrence(T x);

  //peek methods
  public T peekFirst();
  public T peekLast();
  //public T getFirst();
  //public T getLast();

  //stack?
  //public T pop();
  //public void push(T x);

  //miscellaneous
  public int size();
  public boolean isEmpty();
  public boolean contains(T x);
  public Iterator<T> iterator();
  public Iterator<T> descendingIterator();

}
