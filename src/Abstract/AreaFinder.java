package Abstract;

public class AreaFinder {

  public static double findArea(Shape x) {
    // logic of calculating the area
    return x.area();
  }

  public static void main(String[] args) {
    Circle circle = new Circle("blue", 4);
    Rectangle rectangle = new Rectangle("green", 2, 4);
    double area = findArea(circle);
    System.out.println("Area of the circle : "+area);
  }
}
