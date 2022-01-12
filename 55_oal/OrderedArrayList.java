/*
Orange Bananas: Nina Jiang, Eric He, Russell Goychayev//Miss Alpaca, Zhengxi He
APCS pd08
HW55: Never Fear, Big Oh Is Here!
2022-01-11
time spent: 0.5h

DISCO:
 * addLinear has neither a best or worst case since it has to pass n times through the array for any case O(n).
QCC:
 * Are Integers the only Objects that will run?
*/

import java.util.ArrayList;

public class OrderedArrayList {
	private ArrayList<Integer> data;

  //O(1) to assign memory + initialize
	public OrderedArrayList(){
		data = new ArrayList<Integer>();
	}

  //O(n) runs through the list to print it as a string
  public String toString() {
    return data.toString();
  }

  //WC: element is the last element, O(n)
  //BC: element is the first element, O(n)
  public void addLinear(Integer newVal) {
    for(int i = 0; i < data.size(); i++) {
      if(newVal > data.get(i)) {
        data.add(i, newVal);
        return;
      }
    }
    data.add(newVal);
  }

  //WC: element is the last element, O(n)
  //BC: element is the first element, O(1)
  public void addBinary(Integer newVal) {
    int hi = data.size() - 1;
    int mid = 0;
    int lo = 0;
    while (lo <= hi) {
      mid = (lo + hi)/2;
      int i = data.get(mid).compareTo(newVal);

      if(i == 0) {
        data.add(mid, newVal);
        return;
      } else if (i < 0) {
        lo = mid + 1;
      } else {
        hi = mid - 1;
      }
    }
    data.add(lo, newVal);
  }


  //O(n) since it needs to shift n elements to the left
  //WC: element is the last element, BC: element is the first element
  public int remove(int index) {
    return data.remove(index);
  }

  //O(1), no WC or BC
  public int get(int index) {
    return data.get(index);
  }

  //O(1) memory value, no WC or BC
  public int size() {
    return data.size();
  }

  //O(1)
  public void set(int index, int value) {
		data.set(index, value);
  }

}
