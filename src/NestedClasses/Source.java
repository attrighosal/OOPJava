package NestedClasses;

public class Source {

  public static void main(String[] args) {
//    OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
    OuterClass outerClass = new OuterClass();
    OuterClass.NonStaticNestedClass nonStaticNestedClass = outerClass.new NonStaticNestedClass();
  }
}
