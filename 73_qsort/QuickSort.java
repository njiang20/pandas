/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW73 -- All About the About Face
2022-03-9
time spent: 1.0 hr
*/

/***
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 *  uses a for loop to run quickSelect n times, finding the i lowest value everytime
 *  and sets it to the arr[i] value in the array
 * 2a. Worst pivot choice and associated run time:
 *  When the pivot is an extreme, like the highest or lowest value in the array the runtime is O(n^2)
 * 2b. Best pivot choice and associated run time:
 *  When the pivot is in the center, the runtime is O(nlogn)
 * 3. Approach to handling duplicate values in array:
 *  In addition to the original for loop in quickSelect, we added three more if statements that
 *  decrease the length of the subarray being partitioned every run.
 **/

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------




  /**
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  public static void qsort( int[] d )
  {
    int[] sorted = new int[d.length];
    for(int i = 1; i < d.length; i++) {
      sorted[i] = QuickSelect.quickSelect(d, i);
    }
    d = sorted;
  }

  //you may need a helper method...


  //main method for testing
  public static void main( String[] args )
  {

    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);

    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);

    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;

    System.out.println("\narrN init'd to: " );
    printArr(arrN);

    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);

    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);



    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);

    qsort( arr2 );
    System.out.println("arr2 after qsort: " );
    printArr(arr2);


    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );

    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);

    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);

    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);

    System.out.println("\n--------- " );

    int [] best = {3,1,2,4,5,6};
    System.out.println("\nbest init'd to: " );
    printArr(best);

    qsort( best );
    System.out.println("best after qsort: " );
    printArr(best);

    int [] worst = {6,5,4,3,2,1};
    System.out.println("\nworst init'd to: " );
    printArr(worst);

    qsort( worst );
    System.out.println("worst after qsort: " );
    printArr(worst);

  }//end main

}//end class QuickSort
