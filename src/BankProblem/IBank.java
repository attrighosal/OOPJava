package BankProblem;

public class IBank extends RBI {

  @Override
  int InterestCalculator(int x, int y) {
    return x*y*7/100;
  }
}
