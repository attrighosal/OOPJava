package DuckSimulation;

import DuckSimulation.FlyBehaviour.FlyBehaviour;

public class BathtubDuck extends Duck{
  public BathtubDuck(FlyBehaviour flyBehaviour) {
    super(flyBehaviour);
  }

  @Override
  void display() {
    System.out.println("Hey There!! I'm a Bathtub Duck!!");
  }

}
