import java.util.Scanner;

class StringConcatination2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // for the first String
    System.out.println("First String:");
    String firstStr = sc.nextLine();
    String reversedFirstStr = "";
    try {
      validator(firstStr);
      System.out.println("The length of first String is " + firstStr.length());
      for (int i = firstStr.length() - 1; i >= 0; i--) {
        reversedFirstStr += firstStr.charAt(i);
      }
      System.out.println("The reversed String is " + reversedFirstStr);
    } catch (NullPointerException e) {
      System.out.println("Error: Null Object Detected.");
    }

    // for the second String
    System.out.println("Second String:");
    String secondStr = sc.nextLine();
    String reversedSecondStr = "";
    try {
      validator(secondStr);
      System.out.println("The length of first String is " + secondStr.length());
      for (int i = secondStr.length() - 1; i >= 0; i--) {
        reversedSecondStr += secondStr.charAt(i);
      }
      System.out.println("The reversed String is " + reversedSecondStr);
    } catch (NullPointerException e) {
      System.out.println("Error: Null Object Detected.");
    }
    String concatinatedString = firstStr + secondStr;
    System.out.println(concatinatedString);

  }

  static void validator(String a) {
    if (a.equals("")) {
      throw new NullPointerException();
    }
  }
}
