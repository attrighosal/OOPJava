package Abstract;

public class Circle extends Shape {

  int radius;

  public Circle(String color, int radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  double area() {
    return Math.PI * radius * radius;
  }
}
