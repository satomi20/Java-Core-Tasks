package ConsoleHome;
/*
Белов Иван*/

import java.util.Scanner;

public class InputReader {

  private static InputReader inputReader;
  private Scanner scanner;

  private InputReader() {
    this.scanner = new Scanner(System.in);
  }

  public static InputReader getInstance() {
    if (inputReader == null) {
      inputReader = new InputReader();
    }
    return inputReader;
  }

  public int readLessThan(int max) {

    while (true) {
      System.out.println("Enter int number less than " + max);
      int i = readInt();
      if (i < max) {
        return i;
      } else {
        System.out.println("This number more than " + max + ". Try again! ");
      }
    }
  }

  public int readMoreThan(int min) {

    while (true) {
      System.out.println("Enter int number more than " + min);
      int i = readInt();
      if (i > min) {
        return i;
      } else {
        System.out.println("This number more than " + min + ". Try again! ");
      }
    }
  }

  public int readBetweenMinAndMax(int min, int max) {

    while (true) {
      int i = readInt();
      if (i >= min && i <= max) {
        return i;
      } else {
        System.out.println(
            "This number is not between " + min + " and " + max + ". Try again! ");
      }
    }
  }

  private int readInt() {
    while (true) {
      if (scanner.hasNextInt()) {
        return scanner.nextInt();
      } else {
        String inputString = scanner.next();
        if (inputString.equals("exit")) {
          System.exit(0);
        } else {
          System.out.println("Invalid input! Try again. For exit print \"exit\".");
        }
      }
    }
  }
  public String readString() {
    return scanner.next();
  }
}
