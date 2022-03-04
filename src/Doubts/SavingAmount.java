package Doubts;

/* The Bank Encapsulation
Description
A bank has decided to renew its policy; according to the new policy,
you can only own a savings account with minimum savings of Rs.1000.
Construct a class ‘SavingAmount’ with only one integer instance variable ‘saving’.
The class will have the following methods in it:

A setter method 'setInitialSaving' that will take an integer as a parameter and
set the value of savings equal to that of the integer .
A getter method 'getCurrentSaving' that will return the saving .
An increment method that will increase the savings by Rs.1000 .
A decrement method that will decrease the savings by Rs.100 .
A method to check the savings of a person say 'checkSaving'.
If the savings amount is greater than or equal to Rs.1000,
print “Congratulations! You have saved a good amount”.
If the amount is less than Rs.1000 and greater than or equal to 0,
print “Insufficient saving!”.
If the savings amount is less than 0, print “You are in debt”.

*/

import java.util.Scanner;

public class SavingAmount {
  //write your code here private
  int savings;

  public void setInitialSaving(int savings) {
    this.savings = savings;
  }

  public int getCurrentSaving() {
    return savings;
  }

  public void incrementSaving() {
    savings += 1000;
  }

  public void decrementSaving() {
    savings -= 100;
  }

  public void checkSaving() {
    if (savings >= 1000) {
      System.out.println("Congratulations! You have saved a good amount");
    } else if (savings >= 0) {
      System.out.println("Insufficient saving!");
    } else {
      System.out.println("You are in debt");
    }
  }
}


