/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW91-- Deque the Halls
2022-04-14r
time spent: 1.0 hrs
*/

import java.util.LinkedList;
import java.util.Iterator;

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

  //extra methods?
  public boolean contains(T x){
    return _list.contains(x);
  }

  public Iterator<T> iterator(){
    return _list.iterator();
  }

  public Iterator<T> descendingIterator(){
    return _list.descendingIterator();
  }

}
