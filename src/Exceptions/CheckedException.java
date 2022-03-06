package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

  public static void main(String[] args) throws FileNotFoundException {
    FileReader fileReader = new FileReader("abc");
  }
}
