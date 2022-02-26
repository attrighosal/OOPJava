package Polymorphism;

public class Source {

  public static void main(String[] args) {
    Multiplication mlp = new Multiplication();
    int a = mlp.multiply(2,3);
    Multiplication tlp = new TernaryMultiplier();
    int b = tlp.multiply(2,3);
    System.out.println(a+" "+b);
  }
}
