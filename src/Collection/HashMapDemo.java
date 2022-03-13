package Collection;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {

  public static void main(String[] args) {
    HashMap<Integer,String> map = new HashMap<>();
    HashSet<Integer> set = new HashSet<>(); // Default Value
    set.add(1); // map.put(1, DEFAULT_VALUE)
    map.put(10, "Messi");
    map.put(7, "Ronaldo");
    map.put(11, "Neymar");
    System.out.println(map.get(11));
    map.put(11, "Cavani");
    System.out.println(map.get(11));
  }
}
