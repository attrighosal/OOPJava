package Interface;

public class Rectangle implements Shape,Drawable {

  int length;
  int breadth;

  public Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  public double area() {
    return length*breadth;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a rectangle");
  }
}
