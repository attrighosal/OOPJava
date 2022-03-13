package Doubts;

import java.util.Scanner;

public class StringQuestion {

  // hihowisTheHeLLoWoRLd
  // step 1 : hihowisthehelloworld
  // step 2 : h -> H

  public static void main(String[] args) {
    //Take the input string, do the operation and print the string.
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    // Step 1
    s = s.toLowerCase();

    // Step 2
    String firstLetter = s.substring(0, 1); // 1,3 -> ih
    firstLetter = firstLetter.toUpperCase();

    // Step 3
    String remainingLetters = s.substring(1, s.length());

    // Step 4
    s = firstLetter + remainingLetters;


    System.out.println(s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase());
  }

}
