package BankProblem;

import java.util.Scanner;

public class Source {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int principle_amount = scanner.nextInt();
    int time = scanner.nextInt();

    if (n == 1) {
      IBank obj = new IBank();
      System.out.println(obj.InterestCalculator(principle_amount, time));
    } else if (n == 2) {
      JBank obj = new JBank();
      System.out.println(obj.InterestCalculator(principle_amount, time));
    } else if (n == 3) {
      KBank obj = new KBank();
      System.out.println(obj.InterestCalculator(principle_amount, time));
    } else {
      System.out.println("Please enter correct choice");
    }
  }
}
