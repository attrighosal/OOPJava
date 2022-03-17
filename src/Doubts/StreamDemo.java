package Doubts;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,10,4,5,6);
    List<Integer> squares = list.stream().map((i)->i*i).filter(i -> i%2==0).collect(Collectors.toList());
    System.out.println(squares);

    Map<Integer, String> map = new HashMap<>();
    map.put(10, "Messi");
    map.put(7, "Ronaldo");
    map.put(11, "Neymar");
    for (Map.Entry<Integer, String> entry: map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
