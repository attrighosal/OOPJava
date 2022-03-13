package Doubts;

/*
Description
Suppose you are performing X/Y operations, where X and Y are integers.
You are required to enclose the operations in a try-catch block
to ensure that you catch the divide by 0 and the Input mismatch exception.
You must implement a try-catch-catch block where, in case of an Input mismatch exception,
the output is “Wrong Input” and where, in case of divide by 0, the output is “Divide by 0 error”.
In case there is no error, try block should print the integer value of “X/Y”.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int X, Y;
    try {
      X = scanner.nextInt();
      Y = scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Wrong Input");
    }
    Arithmetic obj = new Arithmetic();
    try {
//      System.out.println(obj.Divide(X,Y));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
