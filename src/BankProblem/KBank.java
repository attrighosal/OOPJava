package BankProblem;

public class KBank extends RBI {

  @Override
  int InterestCalculator(int x, int y) {
    return x*y*9/100;
  }
}
