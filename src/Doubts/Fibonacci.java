package Doubts;

public class Fibonacci {

  public static int getFibonacci(int n) {
    if (n<=1) {
      return n;
    }
    int a=0, b=1, c=a+b;
    for (int i=2; i<=n; i++) { // n-1
      c = a+b;
      a=b;
      b=c;
    }
    return c;  // -> 1
  }
  // TC = 1+1+1+n-1+n-1+1 = 2*n+2 = O(n)
  // SC = 1+1+1+1 = 4 = O(1)

  public static void main(String[] args) {
    getFibonacci(6);
  }
}
