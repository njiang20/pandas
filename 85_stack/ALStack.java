/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW85-- Leon Leonwood Stack
2022-03-31r
time spent: 1 hrs
*/

import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE> {

  private ArrayList<PANCAKE> _stack;

  public ALStack() {
    _stack = new ArrayList<PANCAKE>();
  }

  public boolean isEmpty() {
    return _stack.size() == 0;
  }

  public PANCAKE peekTop() {
    return _stack.get(_stack.size() - 1);
  }

  public PANCAKE pop() {
    return _stack.remove(_stack.size()-1);
  }

  public void push( PANCAKE s ) {
    _stack.add(s);
  }

}
