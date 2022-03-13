package Collection;

import java.util.LinkedList;

public class LinkedListDemo {

  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(1);
    ll.add(2);
    System.out.println(ll);
    System.out.println(ll.get(1));
  }
}
