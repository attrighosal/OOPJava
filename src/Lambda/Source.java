package Lambda;

public class Source {

  public static void main(String[] args) {

    // 1. Creating a concrete class
    Car fortuner = new Fortuner();
    fortuner.display();

    // 2. Creating anonymous classes
    Car scorpio = new Car() {
      @Override
      public void display() {
        System.out.println("Hey there!! I'm a Scorpio!!");
      }
    };
    scorpio.display();

    // 3. Lambda
    Car innova = () -> {
      System.out.println("Hey there!! I'm an Innova!!");
    };
    innova.display();

    // Parameterized functional interface
    Bike bike = (x) -> {
      System.out.println("Accelerate by "+x);
    };
    bike.accelerate(50);

    // Reusing Instance methods
    Fortuner fortuner2 = new Fortuner();
    Bike pulsar = fortuner2::increaseSpeed;
    pulsar.accelerate(50);

    // Reuse Class methods
    Bike ktm = Fortuner::speedUp;
    ktm.accelerate(50);
  }
}
