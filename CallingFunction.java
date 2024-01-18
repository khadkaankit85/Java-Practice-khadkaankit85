import java.util.Scanner;

public class CallingFunction {
  public static void main(String[] args) {
    System.out.println("To get the sum of two numbers, Please Enter Your Numbers: ");
    System.out.println("Your First Number: ");
    Scanner sc = new Scanner(System.in);
    double a = sc.nextFloat();
    System.out.println("Second Number: ");
    double b = sc.nextFloat();
    System.out.print("The sum of Your Numbers is: ");
    double sum = sumOfNumbers(a, b);
    System.out.println(sum);
  }

  public static double sumOfNumbers(double x, double y) {
    return (x + y);
  }
}
