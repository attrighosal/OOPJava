package Doubts;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapAccounts {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    TreeMap<Integer, String> map = new TreeMap<>();
    map.put(1243, "ram");
    map.put(2323, "shyam");
    map.put(3123, "mohan");
    map.put(4857, "upgrad");
    map.put(5584, "sam");
    map.put(6765, "jam");

    Integer account_id = scanner.nextInt();
    String name = scanner.next();

    System.out.println(Insert (map, account_id, name));
  }

  public static TreeMap <Integer, String> Insert(TreeMap<Integer, String> map, int acc_id, String name){
    if(!map.containsKey(acc_id)) {
      map.put(acc_id, name);
    }
    return  map;
  }
}
