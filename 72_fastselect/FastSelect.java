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
  public static int[] mysterion( int arr[], int a, int b, int c)
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
    return arr;
  }//end mysterion

  // public static int fastSelect(int[] arr, int a, int b, int c, int y) {
  //
  // }




  //main method for testing
  public static void main( String[] args )
  {
    //init test arrays of magic numbers
    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6};
    int[] arr5 = {3,0,16,599,1024};
    // run mysterion on each array,
    // holding a & b fixed, varying c...
    for( int testC = 0; testC < 5; testC++ ) {
    System.out.println("arr1: ");
    printArr(arr1);
    mysterion(arr1,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c="
    + testC +"...");
    printArr(arr1);
    System.out.println("-----------------------");
    System.out.println("arr3:");
    printArr(arr3);
    mysterion(arr3,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c="
    + testC +"...");
    printArr(arr3);
    System.out.println("-----------------------");
    System.out.println("arr4:");
    printArr(arr4);
    mysterion(arr4,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c="
    + testC +"...");
    printArr(arr4);
    System.out.println("-----------------------");
    System.out.println("arr5:");
    printArr(arr5);
    mysterion(arr5,0,4,testC);
    System.out.println("after mysterion w/ a=0,b=4,c="
    + testC +"...");
    printArr(arr5);
    System.out.println("-----------------------");
    }
    int[] arr6 = buildArray(10,50);
    for( int testC2 = 0; testC2 < 10; testC2++ ) {
      System.out.println("arr6: ");
      printArr(arr6);
      mysterion(arr6,0,9,testC2);
      System.out.println("after mysterion w/ a=0,b=4,c="
      + testC2 +"...");
      printArr(arr6);
    }

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main

}//end class Mysterion
