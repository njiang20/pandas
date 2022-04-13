/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW90-- Swabbing the Deque
2022-04-12w
time spent: 1.0 hrs
*/

public interface Deque<T> {

  public void addFirst(T x);
  public void addLast(T x);

  public T removeFirst();
  public T removeLast();

  public T peekFirst();
  public T peekLast();

  public int size();

  public boolean isEmpty();

}
