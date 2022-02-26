package Abstract;

public class Square extends Shape{

  int length;

  public Square(String color) {
    super(color);
  }

  @Override
  double area() {
    return 0;
  }
}
