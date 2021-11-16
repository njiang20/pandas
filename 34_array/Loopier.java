/*
Team Orange Marshmellows: Nina Jiang, Diana Akhmedova, Julia Kozak // Duckies: Miss Alpaca, Ajax, Flopsy
APCS
HW34: A Pirate's Life for Me
2021-11-13
Time Spent: 2.2h

DISCO:
* Using counter ++ in a recursion function causes the method to keep running without stop.
* When finding the lengths of an array, the two parenthesis in length() isn't needed.
* To return an array in the method, the type of the array needs to have two brackets.

QCC:
* Is it possible to do the methods with two methods?
*/

public class Loopier {

  public static int[] intArray(int[] a) {
    for( int i = 0; i < a.length; i++ ) {
      a[i] = (int)(Math.random() * 100);
    }
    return a;
  }

  public static String arrayToString (int[] ary) {
    String ans = "[";
    for( int i = 0; i < ary.length; i++) {
      ans += ary[i];
      if( i != ary.length - 1 ) {
        ans += ", ";
      }
    }
    return ans + "]";
  }

  public static int linSearch(int[] a, int target) {
    for( int i = 0; i < a.length; i++ ) {
      if( a[i] == target ) {
        return i;
      }
    }
    return -1;
  }

	public static int searchR(int[] a, int target, int i) {
		if (i == a.length) {
			return -1;
		}
		else if (a[i] == target) {
			return i;
		}
		else {
			return searchR(a, target, i + 1);
		}
	}

	public static int linSearchR(int[] a, int target) {
		return searchR(a, target, 0);
	}

	public static int freq(int[] a, int target) {
    int counter = 0;
    for( int i = 0; i < a.length; i++ ) {
      if( a[i] == target ) {
        counter += 1;
      }
    }
    return counter;
  }

	public static int FreqR(int[] a, int target, int i, int counter) {
		 if (i == a.length) {
			 return counter;
		 } else {
			 if (a[i] == target) {
				 return FreqR(a, target, i + 1, counter + 1);
			 }
			 return FreqR(a, target, i + 1, counter);
		 }
	 }

  public static int freqRec(int[] a, int target) {
		return FreqR(a, target, 0, 0);
  }

	public static void main (String[] args) {
		int[] a = new int[20];
		a = intArray(a);
		int target = (int)(Math.random() * 100);
		System.out.println("Array: ");
		System.out.println(arrayToString(a));

		System.out.println("Target: ");
		System.out.println(target);

		System.out.println("Iterative Linear Search: ");
		System.out.println(linSearch(a, target));

		System.out.println("Recursive Linear Search: ");
		System.out.println(linSearchR(a, target));

		System.out.println("Frequency: ");
		System.out.println(freq(a, target));

		System.out.println("Recursive Frequency: ");
		System.out.println(freqRec(a, target));
	}
}
