package Exceptions;

public class CustomException extends RuntimeException {

  public CustomException() {
    super("Hey this is a custom exception !!");
  }

  public CustomException(String message) {
    super(message);
  }
}
