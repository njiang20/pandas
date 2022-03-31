/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW85-- Leon Leonwood Stack
2022-03-31r
time spent: 1 hrs
*/
import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE> {

  private LinkedList<PANCAKE> _stack;

  public LLStack() {
    _stack = new LinkedList<PANCAKE>();
  }

  public boolean isEmpty() {
    return _stack.size() == 0;
  }

  public PANCAKE peekTop() {
    return _stack.getLast();
  }

  public PANCAKE pop() {
    return _stack.removeLast();
  }

  public void push( PANCAKE s ) {
    _stack.addLast(s);
  }

}
