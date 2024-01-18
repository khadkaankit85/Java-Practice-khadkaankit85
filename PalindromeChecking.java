import java.util.Scanner;

import javax.sound.sampled.ReverbType;

class PalindromeChecking {
  // in python we use global keyword to globalise a variablem here we use static
  // method in java:)
  static int wasPalindrome = 0;
  static int wasNotPalindrome = 0;

  public static void main(String[] args) {
    // making the scanner object
    Scanner sc = new Scanner(System.in);
    String enteredString;
    // just going to create "for loop" to get user input five times, :)
    for (int i = 0; i < 5; i++) {
      System.out.println(" Enter the word number " + (i + 1));
      enteredString = sc.nextLine().toLowerCase();
      // let's make it case insensitive
      palindromeChecker(enteredString);// going to create a method
    }
    System.out.println("The String was Palindrome " + wasPalindrome + " times.");
    System.out.println("The String was not Palindrome " + wasNotPalindrome + " times.");
  }

  // a static method to check if the string is palindrome.
  static void palindromeChecker(String input) {
    String reversedString = "";

    for (int i = input.length() - 1; i >= 0; i--) {
      // in python I could reverse string without using something like charAt. I could
      // directly reverse a string with string slicing "string[::-1]". I miss that
      reversedString += input.charAt(i);// concatination
    }
    if (reversedString.equals(input)) {// couldn't use "==" directly:(
      System.out.println("The String is Palindrome: " + input);
      wasPalindrome++;
    } else {
      System.out.println("The String is not Palindrome: " + input);
      wasNotPalindrome++;
    }
  }
}
