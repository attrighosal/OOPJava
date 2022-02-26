package Interface;

public class Circle implements Shape {

  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI*radius*radius;
  }

}
