package Doubts;

import java.util.Scanner;

public class Source {
  public static void main(String[] args) {
    SavingAmount obj = new SavingAmount();
    Scanner in = new Scanner(System.in);
    obj.setInitialSaving(in.nextInt());
    obj.decrementSaving();
    obj.incrementSaving();
    obj.checkSaving();
    System.out.println("Your current savings are Rs" + " " + obj.getCurrentSaving());
  }
}
