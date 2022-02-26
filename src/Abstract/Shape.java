package Abstract;

public abstract class Shape {

  String color;
  abstract double area();
  void display() {
    System.out.println("Hi I'm a shape");
  }

  public Shape(String color) {
    this.color = color;
  }
}
