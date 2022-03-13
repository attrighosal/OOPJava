package MusicLibrary.application;

import java.util.Scanner;

public class Driver {

  private static MusicLibrary app = new MusicLibrary();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(System.lineSeparator());
    String addAgain;
    int userId, artistId, songId;

    registerUsers(sc);

  }

  public static void registerUsers(Scanner sc) {
    System.out.println("----------- User registration -----------");
    String addAgain;
    do {
      System.out.println("Please enter user details to add a user.");
      try {
        System.out.print("First Name : ");
        String firstName = sc.next();
        System.out.print("Last Name : ");
        String lastName = sc.next();
        System.out.print("Email : ");
        String email = sc.next();
        System.out.print("Phone No. : ");
        String phone = sc.next();
        System.out.print("City : ");
        String city = sc.next();
        System.out.print("Locality : ");
        String locality = sc.next();
        System.out.print("State : ");
        String state = sc.next();
        System.out.print("Pin code : ");
        int pinCode = sc.nextInt();

        app.registerUser(firstName, lastName, city, locality, state, pinCode, email, phone);
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
      System.out.println("Would you like to add another user?(Y/n)");
      addAgain = sc.next();
    } while (addAgain.equals("Y"));
  }
}