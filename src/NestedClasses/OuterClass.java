package NestedClasses;

public class OuterClass {

  public OuterClass() {
    System.out.println("Inside the outer class");
  }

  static class NestedClass {

    public NestedClass() {
      System.out.println("Inside the static nested class");
    }
  }

  class NonStaticNestedClass {

    public NonStaticNestedClass() {
      System.out.println("Inside the non static nested class");
    }
  }
}
