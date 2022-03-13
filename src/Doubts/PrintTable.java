package Doubts;

import java.util.Scanner;

public class PrintTable extends MathClass {

  @Override
  public void output(Integer n) {
    for (int i=1; i<=10; i++) {
      System.out.print(n*i + " ");
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    PrintTable obj = new PrintTable();
    obj.output(n);

  }
}
