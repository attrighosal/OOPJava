package DuckSimulation;

import DuckSimulation.FlyBehaviour.CanFly;
import DuckSimulation.FlyBehaviour.CanNotFly;
import DuckSimulation.FlyBehaviour.FlyBehaviour;

import java.util.Scanner;

public class Simulator {

  private static Duck createDuck(String duckType) {
    FlyBehaviour canFly = new CanFly();
    FlyBehaviour canNotFly = new CanNotFly();
    switch (duckType) {
      case "Mallard":
        return new MallardDuck(canFly);
      case "RedHead":
        return new RedHeadDuck(canFly);
      case "Bathtub":
        return new BathtubDuck(canNotFly);
      case "Robot":
        return new RobotDuck(canNotFly);
      default:
        System.out.println("Invalid DuckType");
        return null;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String duckType=sc.next();
    while (!duckType.equals("exit")) {
      Duck duck = createDuck(duckType);
      duck.display();
      duck.quack();
      duck.swim();
      duck.fly();
      duckType = sc.next();
    }
  }
}
