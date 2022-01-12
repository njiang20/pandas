// Bubble sort
// For bubbleSortV, our method first passes through the ArrayList from the right, checking if the last pair is in increasing order, and swapping the two values if not. It repeats this for the second to last pair, then third to last, and so on. After this first pass, it will run through again, but since the value at index 0 is guaranteed to be in the correct position, it will cut short before the last comparison. It will repeat this over and over, each time comparing one less pair from the left. It also will not check the final last pair, as that is guaranteed to be correct.

public static void bubbleSortV( ArrayList<Comparable> data )
{
  for(int i = 0; i < data.size()-1; i++) {
    for(int j = data.size() - 1; j > i; j--){
      if((int)data.get(j) < (int)data.get(j - 1)) {
        int temp = (int)data.get(j);
        data.set(j, data.get(j - 1));
        data.set(j-1, temp);
      }
    }
  }
}

// Selection sort
// We found the smallest element and moved it to the beginning of the array. Then we found the next smallest element and repeated until data.size() - 1 passes have occured.

public static void selectionSortV( ArrayList<Comparable> data ) {
  //note: this version places greatest value at "rightmost" end

  //maxPos will point to position of SELECTION (greatest value)
  int maxPos;

  for(int pass = data.size() - 1; pass > 0; pass--) {
    System.out.println( "\nbegin pass " + (data.size() - pass) );//diag
    maxPos = pass;

    for(int i = pass - 1; i >= 0; i--) {
      if((int)data.get(i) > (int)data.get(maxPos)) {
        maxPos = i;
      }

      System.out.println( "maxPos: " + maxPos );//diag
      System.out.println( data );//diag

    }

    /* Comparable temp = data.get(pass);
    data.set(pass, data.get(maxPos));
    data.set(maxPos, temp); */

    Comparable temp = data.get(pass);
    data.set(pass, data.get(maxPos));
    data.set(maxPos, temp);

    System.out.println( "after swap: " +  data );//diag
  }
}//end selectionSort


// Insertion sort
//The partition is located to the right of the element at index 0. Thus, we set the initial value of the partition to zero, which will be incremented by one, increasing the size of the sorted region by one, as one element at a time is "walked" from the unsorted region and inserted into where it belongs in the sorted region. This is repeated until all elements are sorted, meaning n - 1 (data.size() - 1) passes have occured.

public static void insertionSortV( ArrayList<Comparable> data )
{
  for(int partition = 1; partition < data.size(); partition++) {
    //partition marks first item in unsorted region

    System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
    System.out.println( data );

    //traverse sorted region from right to left
    for(int i = partition; i > 0; i--) {

      // "walk" the current item to where it belongs
      // by swapping adjacent items
      if (data.get(i).compareTo(data.get(i - 1)) < 0) {

        System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag

        Comparable temp = data.get(i);
        data.set(i, data.get(i - 1));
        data.set(i - 1, temp);
      }
      else
        break;
    }
  }
}//end insertionSortV
