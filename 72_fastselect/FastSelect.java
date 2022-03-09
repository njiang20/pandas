/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW72 -- So So Fast
2022-03-8
time spent: 1.0 hr
*/

/*
ALGO:

BEST CASE SCENARIO/WORST CASE SCENARIO:
  There is no best or worse case- The run time will be O(n^2) because the run time of the partition is O(n) e for loop is also O(n).
DISCO:
  When we run the code, sometimes the array ends up fully sorted by partition. Other times it will not be.

QCC:
  Is there a more efficient way to write FastSelect?
  What happens if there are duplicates of one variable?
*/

import java.util.Arrays;

public class FastSelect
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
   * int mysterion(int[],int,int,int)
   * DESCRIP
   *
   * @param arr
   * @param a
   * @param b
   * @param c
   * @return int
   *
   */
  public static int partition( int arr[], int a, int b, int c)
  {
    int v = arr[c];
    swap(c, b, arr);
    int s = a;
    for(int i=a; i<=b-1; i++){
      if(arr[i]<v){
        swap(s, i, arr);
        s++;
      }
    }
    swap(b, s, arr);
    return s;
  }//end partition

  public static int fastSelect(int[] arr, int y) {
    for (int i = 0; i < arr.length; i++){
      partition(arr, 0, arr.length-1, y-1);
    }
    return arr[y-1];
  }

  //main method for testing
  public static void main( String[] args )
  {
    int[] bob = {7, 1, 5 ,3, 12};
    printArr(bob);
    fastSelect(bob, 2);
    printArr(bob);
    System.out.println(fastSelect(bob, 2));

    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6};
    int[] arr5 = {3,0,16,599,1024};

    printArr(arr1);
    fastSelect(arr1, 2);
    printArr(arr1);
    System.out.println(fastSelect(arr1, 2));

    printArr(arr3);
    fastSelect(arr3, 2);
    printArr(arr3);
    System.out.println(fastSelect(arr3, 2));

    printArr(arr4);
    fastSelect(arr4, 2);
    printArr(arr4);
    System.out.println(fastSelect(arr4, 2));

    printArr(arr5);
    fastSelect(arr5, 2);
    printArr(arr5);
    System.out.println(fastSelect(arr5, 2));

  }//end main

}//end class FastSelect
