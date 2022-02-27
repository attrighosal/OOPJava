package DuckSimulation;

import DuckSimulation.FlyBehaviour.FlyBehaviour;

public class RobotDuck extends Duck{

  public RobotDuck(FlyBehaviour flyBehaviour) {
    super(flyBehaviour);
  }

  @Override
  void display() {
    System.out.println("Hey There!! I'm a Robot Duck!!");
  }

}
