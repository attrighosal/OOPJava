package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SampleExceptions {

  public static void throwExceptionAgain() {
    throw new CustomException("Throwing from inside the method");
  }

  public static void throwException() {
    throwExceptionAgain();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int dividend = sc.nextInt();
      int divisor = sc.nextInt();
      int quotient = dividend/divisor;
      System.out.println("Quotient : "+quotient);
      throwException();
    }
    catch (ArithmeticException exception) {
      System.out.println(exception.getMessage());
    }
    catch (InputMismatchException exception) {
      System.out.println(exception.getMessage());
    }
    finally {
      // db connection close
      System.out.println("Program executed successfully !!");
    }
  }
}
