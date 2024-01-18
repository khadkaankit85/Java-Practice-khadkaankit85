import java.util.Scanner;

public class StringConcatination {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the first string:");
    String firstString = input.nextLine();

    try {
      validateString(firstString);

      int lengthOfFirstString = firstString.length();
      System.out.println("Length of the first string: " + lengthOfFirstString);

      System.out.println("Enter the second string:");
      String secondString = input.nextLine();

      validateString(secondString);

      String concatenatedStrings = firstString.concat(secondString);
      System.out.println("Concatenated strings: " + concatenatedStrings);

      String reversedFirstString = new StringBuilder(firstString).reverse().toString();
      System.out.println("Reversed first string: " + reversedFirstString);

      String reversedSecondString = new StringBuilder(secondString).reverse().toString();
      System.out.println("Reversed second string: " + reversedSecondString);

    } catch (NullPointerException e) {
      System.out.println("Error: String should not be null.");
    }
  }

  private static void validateString(String input) {
    if (input.length() == 0) {
      throw new NullPointerException();
    }
  }
}
