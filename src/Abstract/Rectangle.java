package Abstract;

public class Rectangle extends Shape{

  int length;
  int width;

  public Rectangle(String color, int length, int width) {
    super(color);
    this.length = length;
    this.width = width;
  }


  @Override
  double area() {
    return length*width;
  }
}
