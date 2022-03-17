package Doubts;

import java.util.*;

public class UniqueValues {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int key;
    String value;
    for (int i = 1; i <= num; i++) {
      key = sc.nextInt();
      value = sc.next();
      map.put(key, value);
    }
    printValues(map);
  }

  public static void printValues(Map<Integer, String> map) {
    Set<String> set = new HashSet<>();
    for (String value: map.values()) {
      set.add(value);
    }
    for (String s: set) {
      System.out.print(s+" ");
    }
    Iterator iterator = set.iterator();
    for (; iterator.hasNext();) {
      String s = (String)iterator.next();
      System.out.println(s);
    }
  }
}
