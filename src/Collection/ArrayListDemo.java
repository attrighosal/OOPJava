package Collection;

import java.util.ArrayList;

public class ArrayListDemo {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(6);
    arr.add(4);
    arr.remove(1);
    System.out.println(arr);
    System.out.println(arr.size());
    System.out.println(arr.get(0));
  }
}
