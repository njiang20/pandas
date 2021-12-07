/**
Team Orange Marshmellows: Julia Kozak, Nina Jiang, Diana Akhmedova // Duckies: Flopsy, Miss Alpaca, Ajax
APCS pd08
HW43 -- Array of Steel
2021-12-06
Time Spent: 0.5 hrs

DISCO:
- You can redefine the value of an array variable and set it to a new size.
- Array elements can be copied to a resized array via a for loop.
- Use a temporary array to store old values of an array to be copied over into a new/resized array.

QCC:
- Is there a more efficient way of creating a dynamically modifiable array?
- Is there a way to adapt an array to be able to store different types of objects and primitives?
**/

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = _data.length;
    for(int i = 0; i < _size; i++) {
      _data[i] = 0;
    }
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String output = "[";
    for(int a : _data) {
      output += a + ", ";
    }
    output = output.substring(0, output.length() - 2) + "]";
    return output;
  }

  //double capacity of SuperArray
  private void expand()
  {
    int[] copy = new int[_size];
    for(int i = 0; i < _size; i++) {
      copy[i] = _data[i];
    }
    _data = new int[_size * 2];
    for(int i = 0; i < _size; i++) {
      _data[i] = copy[i];
    }
    _size *= 2;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    if(index >= 0 && index < _data.length) {
      return _data[index];
    }
    else {
      System.out.println("Invalid index");
      return -1;
    }
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    if(index >= 0 && index < _data.length) {
      int copy = _data[index];
      _data[index] = newVal;
      return copy;
    }
    else {
      System.out.println("Invalid index");
      return -1;
    }
  }


  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
  }//end main()


}//end class
