package Doubts;

import java.util.*;

public class ConvertToArrayList {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] arr = new int[size];

    for (int i=0; i <size; i++ )
      arr[i] = scanner.nextInt();


    ArrayList<Integer> list = intoArrayList(arr);

    System.out.println(list);
  }

  public static ArrayList<Integer> intoArrayList(int[] arr){

    // Convert to an array list
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i=0; i<arr.length; i++) {
      arrayList.add(arr[i]);
    }


    // Sort the arrayList
    // arrayList.sort(Comparator.comparingInt(a -> a));
    Collections.sort(arrayList);

    return arrayList;
  }
}
