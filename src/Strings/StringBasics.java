package Strings;

import java.util.Arrays;

public class StringBasics {

  public static int convert(char ch) {
    return ch-'a';
  }

  public static char unConvert(int index) {
    return (char)(index+97);
  }

  public static void main(String[] args) {
    String s = "helloworld";    // 1
    int[] freq = new int[26];
    for (int i=0; i<s.length(); i++) { // TC: O(n)
      char ch = s.charAt(i);
      int index = convert(ch);
      freq[index]++;
    }
    int max=0, index=-1;
    for (int i=0; i<26; i++) {
      if (freq[i]>max) {
        max = freq[i];
        index = i;
      }
    }
    System.out.println(Arrays.toString(freq));
    System.out.println("Ans : "+unConvert(index));
  }
}
