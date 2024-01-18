
import java.util.Scanner;

public class NestedCondtional {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your mark: ");
    int marks = input.nextInt();
    if (marks < 0) {
      if (marks < -10) {
        System.out.println("Less than minus ten?? Crazy");
      } else if (marks < -20) {
        System.out.println("Less than minus 20? You are weak");
      }
    }

    else if (marks > 0 && marks < 50) {
      if (marks < 10) {
        if (marks < 5 && marks >= 0) {
          System.out.println("That is the lowest possible mark.");
        } else {
          System.out.println("less than 10 but greater than five? Wonderful.");
        }

      } else if (marks >= 10 && marks < 50) {
        System.out.println("Misssion Failed Successfully. (You failed the exam)");
      }
    } else if (marks > 49 && marks < 80) {
      System.out.println("You passed the exam. ");
    } else if (marks <= 100) {
      System.out.println("That was wonderful man/women");

    }

    else {
      System.out.println("Out of the range of my conditional statements.");
    }

  }

}