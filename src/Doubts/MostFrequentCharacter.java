package Doubts;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

  public static void main(String[] args) {
    String s = "Hello World!!Welcome to Java!!";
    Map<Character, Integer> freq = new HashMap<>();
    for (int i=0; i<s.length(); i++) {
      char c = s.charAt(i);
      int initial = freq.getOrDefault(c, 0);
      freq.put(c, initial+1);
    }
    int max=0;
    char maxChar='a';
    for (Map.Entry<Character, Integer> entry: freq.entrySet()) {
      if (entry.getValue()>max) {
        max = entry.getValue();
        maxChar = entry.getKey();
      }
    }
    System.out.println("MaxChar : "+maxChar);
  }
}
