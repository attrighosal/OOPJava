package Lambda;

public class Fortuner implements Car {

  @Override
  public void display() {
    System.out.println("Hey there!! I'm a Fortuner!!");
  }

  public void increaseSpeed(int speed) {
    System.out.println("Increasing speed by "+speed+" km/h");
  }

  public static void speedUp(int speed) {
    System.out.println("Speeding Up by "+speed+" km/h");
  }
}
