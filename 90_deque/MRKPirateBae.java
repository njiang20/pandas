/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW91-- Deque the Halls
2022-04-14r
time spent: 1.0 hrs
*/

import java.util.LinkedList;
import java.util.Iterator;

public class MRKPirateBae {
  public static void main(String[] args) {
    LinkedList<String> jackSparrow = new LinkedList<String>();

    System.out.println("Is jackSparrow empty?... " + jackSparrow.isEmpty()); //true

    jackSparrow.addFirst("swashbuckler");
    // System.out.println(jackSparrow);
    jackSparrow.addFirst("captain");
    // System.out.println(jackSparrow);
    jackSparrow.addLast("sparrow");

    System.out.println("jackSparrow has " + jackSparrow.size() + " elements"); //3
    System.out.println(jackSparrow);
    System.out.println();

    System.out.println("Reversing the string...");
    Iterator<String> sparrowJack = jackSparrow.descendingIterator();
    while (sparrowJack.hasNext()){
      System.out.print(sparrowJack.next() + " ");
    }
    System.out.println();
    System.out.println();

    System.out.println("Does jackSparrow contain 'sparrow'?: " + jackSparrow.contains("sparrow"));//true
    System.out.println("Does jackSparrow contain 'pirate'?: " + jackSparrow.contains("pirate"));//false
    System.out.println();

    jackSparrow.removeFirst();
    // System.out.println(jackSparrow);
    jackSparrow.removeLast();
    // System.out.println(jackSparrow);

    System.out.println("Is jackSparrow empty after removing 2 elements?: + " + jackSparrow.isEmpty()); //false
    jackSparrow.removeLast();
    System.out.println("Is jackSparrow empty after removing one more element?: " + jackSparrow.isEmpty()); //true

  }
}
