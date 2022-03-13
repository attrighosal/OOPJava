package Doubts;

public class Add extends Math {

  public static void main(String[] args) {
    Add a = new Add();
    System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
    System.out.print(a.Adding(1,2) + " " + a.Adding(3,4) + " " + a.Adding(5,6,7) + "\n");
  }
}
