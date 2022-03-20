package Collection;

import java.util.ArrayList;

public class MultiDimArrList {

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    for (int i=0; i<10; i++) {
      arr.add(new ArrayList<>());
      for (int j=0; j<10; j++) {
        arr.get(i).add(j);
      }
    }
    System.out.println(arr.get(2).get(1));
  }
}
