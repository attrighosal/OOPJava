package Doubts;

/* Jump In Array
Description
Suppose you are playing a game. You are given an array of integers as the input.
The game starts at index 0 of the array.
You jump the number equal to the integer at the index of the array.
You are required to find out whether you can reach the end of the array.
Return “true” if the end of the array is reached; otherwise, return “false”.
The array contains only 0 and positive numbers.

Note: You must reach the index greater than or equal to the last index of the array.
No input and output are needed from your end.
You just need to complete the CanReach function.
The main function will take care of printing “true” or “false”.

 */

import java.util.Scanner;

public class JumpInArray {

  static boolean CanReach (int[] arr) {
    int index = 0;
    while (index < arr.length) {
      if (arr[index]==0) {
        return false;
      }
      index = index+arr[index];
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int[] arr = new int[size];
    for(int i=0; i<size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(CanReach(arr));
  }

}
