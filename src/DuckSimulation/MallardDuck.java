package DuckSimulation;

import DuckSimulation.FlyBehaviour.FlyBehaviour;

public class MallardDuck extends Duck {

  public MallardDuck(FlyBehaviour flyBehaviour) {
    super(flyBehaviour);
  }

  @Override
  void display() {
    System.out.println("Hey there!! I'm a MallardDuck!!");
  }

}
