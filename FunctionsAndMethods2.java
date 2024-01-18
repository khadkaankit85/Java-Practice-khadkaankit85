import java.util.Scanner;

public class FunctionsAndMethods2 {
  public static void main(String[] args) {
    double a;
    double b;
    double c;
    String enteredString;
    String[] separatedNum;
    do {
      System.out.println("Enter three numbers Separated by spaces to find the largest number.: ");
      Scanner input = new Scanner(System.in);
      enteredString = input.nextLine();
      separatedNum = enteredString.split(" ");
    } while (separatedNum.length != 3);

    try {
      a = Double.parseDouble(separatedNum[0]);
      b = Double.parseDouble(separatedNum[1]);
      c = Double.parseDouble(separatedNum[2]);

      double maximumNumber = findMaximumNumber(a, b, c);
      System.out.print("The largest number is: ");
      System.out.println(maximumNumber);
    } catch (NumberFormatException e) {
      System.out.println("Error: Some Error Occured.");

    }

  }

  public static double findMaximumNumber(double x, double y, double z) {

    if (x >= y && x >= z) {
      return x;
    } else if (y >= x && y >= z) {
      return y;
    }

    else {
      return z;
    }
  }

}
