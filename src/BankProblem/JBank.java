package BankProblem;

public class JBank extends RBI {

  @Override
  int InterestCalculator(int x, int y) {
    return x*y*8/100;
  }
}
