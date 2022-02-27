package DuckSimulation.FlyBehaviour;

public class CanNotFly implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("Sorry can't Fly!!");
  }
}
