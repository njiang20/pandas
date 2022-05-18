/*
Fried Chicken :: Nina Jiang, Lea Kwok, Lindsay Phung
APCS pd7
HW102 -- Heap On Heapin' On
2022-05-18w
time spent: 1.5 hrs

DISCO:
* It's good to have an ArrayList and tree drawn out next to each other so visualization is easier.

QCC:
* Why is the remove method giving a boolean cannot be converted into int error?
* What is -Xdiags:verbose and what is it's difference to -Xlint:unchecked?
*/

/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */

import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
    _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
    return _heap.toString();
  }//O(1)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
    return _heap.size() == 0;
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
    return _heap.get(0);
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
      * add the new val to the end of the ArrayList
      * compare the new node to its parent, if val < parent, swap them
      * continue until val >= parent
   */
  public void add( Integer addVal )
  {
    _heap.add(addVal); //to the very end

    int val = _heap.size() - 1;
    int parent = (val - 1) / 2;

    //keep comparing to parent node and swap if val < parent
    while(_heap.get(parent) > _heap.get(val)) {
      swap(val, parent);
      val = parent;
      parent = (val - 1) / 2;
    }

  }//O(n)


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
      * swap the root (min val) and last leaf (last element in ArrayList)
      * remove the root (which is now at the end of the ArrayList)
      * if there are children of the new root, compare to the left (by default) to see if new root > child
      * if new root > child, swap them
      * continue swapping until new root <= child
   */
  public Integer removeMin()
  {
    int pos = 0;
    int val = _heap.remove(0);
    int otherVal = _heap.remove(_heap.size() - 1);
    _heap.add(0, otherVal);

    while(_heap.get(minChildPos(pos) <= _heap.get(pos))) {
      int turtle = minChildPos(pos);
      swap(pos, minChildPos(pos));
      pos = turtle; //IDK
    }
  }//O(?)


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    if (_heap.size() < (2 * pos  + 1)) {
      return -1;
    } else if (minOf(_heap.get(2 * pos + 1), _heap.get(2 * pos + 2)) == _heap.get(2 * pos + 1)) {
      return 2 * pos + 1;
    } else {
      return 2 * pos + 2;
    }
  }//O(?)


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //main method for testing
  public static void main( String[] args )
  {
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap
