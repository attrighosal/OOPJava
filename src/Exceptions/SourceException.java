package Exceptions;

public class SourceException {

  public static void main(String[] args) {
    try {
      throw new CustomException("Throwing intentionally !!");
    }
    catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }
}
