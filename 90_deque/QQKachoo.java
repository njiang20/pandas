/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW90-- Swabbing the Deque
2022-04-12w
time spent: 1 hrs
*/

import java.util.LinkedList;

public class QQKachoo<T> implements Deque<T> {

  private LinkedList<T> _list;

  public QQKachoo() {
    _list = new LinkedList<T>();
  }

  public void addFirst(T x) {
    _list.addFirst(x);
  }

  public void addLast(T x){
    _list.addLast(x);
  }

  public T removeFirst(){
    return _list.removeFirst();
  }

  public T removeLast(){
    return _list.removeLast();
  }

  public T peekFirst() {
    return _list.peekFirst();
  }

  public T peekLast() {
    return _list.peekLast();
  }

  public int size(){
    return _list.size();
  }

  public boolean isEmpty() {
    return _list.isEmpty();
  }
}
