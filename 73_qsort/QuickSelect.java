/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW73 -- All About the About Face
2022-03-9
time spent: 1.0 hr
*/

import java.util.Arrays;

public class QuickSelect
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

  public static int quickSelect(int[] arr, int y) {
    int lo = 0;
    int hi = arr.length - 1;

    for (int i = lo; i < hi; i++){
      int output = partition(arr, lo, hi, y-1);
      if(output == y - 1) {
        return arr[output];
      } else if (output < y - 1) {
        lo = output;
      } else if (output > y - 1) {
        hi = output;
      }
    }
    return arr[y-1];
  }

  //main method for testing
  public static void main( String[] args )
  {
    int[] bob = {7, 1, 5 ,3, 12};
    printArr(bob);
    quickSelect(bob, 2);
    printArr(bob);
    System.out.println(quickSelect(bob, 2));

    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,3,2,1};
    int[] arr5 = {1,2,3,4,5};

    printArr(arr1);
    quickSelect(arr1, 2);
    printArr(arr1);
    System.out.println(quickSelect(arr1, 2));

    printArr(arr3);
    quickSelect(arr3, 2);
    printArr(arr3);
    System.out.println(quickSelect(arr3, 2));

    printArr(arr4);
    quickSelect(arr4, 2);
    printArr(arr4);
    System.out.println(quickSelect(arr4, 2));

    printArr(arr5);
    quickSelect(arr5, 2);
    printArr(arr5);
    System.out.println(quickSelect(arr5, 2));

  }//end main

}//end class quickSelect
