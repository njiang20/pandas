import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {
  private ArrayList<Integer> queue;

  public ArrayPriorityQueue() {
    queue = new ArrayList<Integer>();
  }

  /**
  * void add( int x )
  * Adds an item to this priority queue.
  * We first scheck for an empty queue: if so, add. We then check to the queue
  * for a bigger number. If so, add at the index + 1. If not, add to the zeroth
  * index.
  * O(n)
  */
  public void add(int x) {
    for (int i = 0; i < queue.size(); i++) {
      if (queue.get(i) < x) {
        queue.add(i, x);
        return;
      }
    }
    queue.add(x);
  }

  /**
  * boolean isEmpty()
  * Returns true if this stack is empty, otherwise returns false.
  * O(1)
  */
  public boolean isEmpty() {
    return queue.size() == 0;
  }

  /**
  * int peekMin()
  * Returns the smallest item stored in this priority queue without removing it.
  * O(1)
  */
  public int peekMin() {
    return queue.get(queue.size() - 1);
  }

  /**
  * int removeMin()
  * Removes and returns the smallest item stored in this priority queue.
  * O(1)
  */
  public int removeMin() {
    return queue.remove(queue.size() - 1);
  }

  public String toString(){
    return queue.toString();
  }

  public static void main(String[] args) {
    ArrayPriorityQueue tarik = new ArrayPriorityQueue();
    System.out.println("empty: " + tarik.isEmpty());
    tarik.add(34);
    tarik.add(267);
    tarik.add(13);
    System.out.println(tarik);
    System.out.println("empty: " + tarik.isEmpty());
    System.out.println("minimum: " + tarik.peekMin());
    System.out.println("removing minimum... " + tarik.removeMin());
    System.out.println(tarik);
  }
}
