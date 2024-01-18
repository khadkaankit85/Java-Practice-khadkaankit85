import java.util.Scanner;

public class SwitchStatement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {

      System.out.println("Enter the day today");
      int day = input.nextInt();
      switch (day) {
        case 1:
          System.out.println("Today is Sunday huh");
          break;

        case (2):
          System.out.println("Today is Monday huh");

        case 3:
          System.out.println("Today is Tuesday huh");
          break;
        case 4:
          System.out.println("Today is Wednesday huh");
          break;

        case 5:
          System.out.println("Today is Thursday huh");
          break;

        case 6:
          System.out.println("Today is Friday huh");
          break;

        case 7:
          System.out.println("Today is Saturday huh");
          break;

      }
      System.out.println();
    }

  }
}