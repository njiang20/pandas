/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW81-- Thank You, Next
2022-03-25f
time spent: 1 hr
*/

/***
 * class ItrWork
 *  SKELETON
 * Facilitates familiarization with iterators
 **/

/***
    DISCO:
    * Iterator it = L.iterator() must be established. L.next(), L.hasNext, L.remove() will not work.
    * Overall the foreach loop has more concise code than the iterator.
    * In removeEvens(), a new iterator, Iterator ti = L.iterator(), has to be established. The Iterator named "it" can not be reused.

    QCC:
    * In oddsB(), why does (Integer)it.next() have to be set to a variable, Integer q, for modulo to work?

    SUMMARY THE FIRST:
    * Iterator can print a List, Set, or Map with each element on a new line
    * Iterator has the ability to remove all instances of "hello" within a List of String. For any other collections, Iterator can remove the next element by using the hasNext(), which checks the existence of the next element, next(), which returns the next element, and remove(), which calls next() to remove the next element returned.

    SUMMARY THE SECOND:
    * It iterates through a List/Set/Map
    * You can use iterator by setting the Iterator it = <variable>.iterator(); variable is the name of the List/Set/Map
    * It can see if there are more elements, return an element, and remove the element
**/




import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    for (Integer ints : L){
      if(ints.equals(key)){
        return true;
      }
    }
    return false;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    Iterator it = L.iterator();
    while(it.hasNext()){
      if(it.next().equals(key)){
        return true;
      }
    }
    return false;
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    List<Integer> oddTurtles= new ArrayList<Integer>();
    for (Integer q : L) {
      if(q % 2 == 1) {
        oddTurtles.add(q);
      }
    }
    return oddTurtles;
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    List<Integer> oddTurtles= new ArrayList<Integer>();
    Iterator it = L.iterator();
    while(it.hasNext()) {
      for(int i = 0; i < L.size(); i++) {
        Integer q = (Integer)it.next();
        if(q % 2 == 1) {
          oddTurtles.add(q);
        }
      }
    }
    return oddTurtles;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    Iterator ti = L.iterator();
    while(ti.hasNext()) {
      if((Integer)ti.next() % 2 == 0) {
        ti.remove();
      }
    }
  }


  public static void main( String [] args )
  {

    //var type: List   obj type: ?
    List<Integer> L = new ArrayList<Integer>();

    for( int i = 0; i < 10; i++ )
      L.add(i);


    // TASK: write code to print the contents of L...


    // a) using a FOREACH loop
    for (Integer i : L){
      System.out.print(i + " ");
    }
    System.out.println();



    // b) explicitly using an iterator
    Iterator it = L.iterator();
    while(it.hasNext()){
      System.out.print(it.next() + " ");
    }
    System.out.println();

    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );

    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );

    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.print(n + " ");

    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.print(n + " ");

    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.print(n + " ");

  }//end main

}//end class ItrWork
