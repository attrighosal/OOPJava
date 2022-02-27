package DuckSimulation;

import DuckSimulation.FlyBehaviour.FlyBehaviour;

public abstract class Duck {

  FlyBehaviour flyBehaviour;

  public Duck(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  public void quack() {
    System.out.println("Quack!!");
  }

  public void swim() {
    System.out.println("Swimming!!");
  }

  public void fly() {
    flyBehaviour.fly();
  }

  abstract void display();
}
