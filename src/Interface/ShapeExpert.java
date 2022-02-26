package Interface;

public class ShapeExpert {

  public static double findArea(Shape x) {
    return x.area();
  }

  public static void drawShape(Drawable x) {
    x.draw();
  }

  public static void main(String[] args) {
    Circle circle = new Circle(3);
    Rectangle rectangle = new Rectangle(2,4);
    double area = findArea(rectangle);
    System.out.println(area);
    drawShape(rectangle);
  }
}
