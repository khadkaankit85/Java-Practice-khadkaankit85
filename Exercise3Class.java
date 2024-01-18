import java.util.Scanner;

public class Exercise3Class {
  public static void main(String[] args) {
    System.out.println("Hey Bob! ");
    Scanner input = new Scanner(System.in);
    int i = 1;
    double totalMarks = 500;
    double sum = 0;
    float marks;
    while (i < 6) {
      System.out.printf("Enter the marks of your %d th subject", i);
      System.out.println();
      marks = input.nextFloat();

      while (marks > 100) {
        System.out.println("inValid mark. ");
        marks = input.nextFloat();
      }
      sum += marks;
      i++;
    }
    double averageMark = sum / 5;
    double percentage = (sum / totalMarks) * 100;
    System.out.println("Bob Your average mark is " + averageMark + " Total mark is " + sum
        + " and overall percentage is " + percentage);

  }
}
