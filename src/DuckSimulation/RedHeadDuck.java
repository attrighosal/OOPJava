package DuckSimulation;

import DuckSimulation.FlyBehaviour.FlyBehaviour;

public class RedHeadDuck extends Duck{

  public RedHeadDuck(FlyBehaviour flyBehaviour) {
    super(flyBehaviour);
  }

  @Override
  void display() {
    System.out.println("Hey There!! I'm a RedHead Duck!!");
  }
}
