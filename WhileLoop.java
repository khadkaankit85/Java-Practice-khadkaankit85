import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Test first and then execute.
    int product = 5;
    // while (product <= 100) {
    // product *= 2;
    // System.out.println(product);
    // }

    // execute then test
    // do {
    // System.out.println(product);

    // product *= 1.1f;
    // } while (product < 100);
    // int age = -1;
    Scanner input = new Scanner(System.in);
    // System.out.println("Enter your age: ");
    // while (age < 0)
    // age = input.nextInt();

    // using a do while loop is a good idea to get correct input from users:)
    int age;
    do {
      System.out.println("Enter your age: ");
      age = input.nextInt();
    } while (age < 1 || age > 130);

    System.out.printf("Oh you are %d years old.", age);
    System.out.println();
  }
}