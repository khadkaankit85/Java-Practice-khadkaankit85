
// This program is in an infinite loop so make sure to close it manually after you are done:))
import java.util.Scanner;

public class ConditionalStatements {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean t = true;
    while (true) {
      System.out.println("Enter your number to check weather it's even or odd.");
      int a = input.nextInt();

      if (a < 0) {
        System.out.println("Your number is negative. ");
      } else if (a == 0) {
        System.out.println("Your number is zero.");

      } else if (a == 1) {
        System.out.println("Your number is one .");
      } else if (a % 2 == 0) {
        System.out.println("Your number is an even number = " + a);
      } else {
        System.out.println("Your Number is an odd number = " + a);

      }

    }
  }
}
