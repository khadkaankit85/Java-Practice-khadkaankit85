class Overloading {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 6;

    // Call the Add method from the Addition class with two integers
    int sum = new Addition().Add(num1, num2);

    System.out.println(sum);
  }
}

public class Addition {
  // Method to add two integers
  int Add(int a, int b) {
    return a + b;
  }

  // Method to add two doubles
  double Add(double a, double b) {
    return a + b;
  }

  // Method to add three integers
  int Add(int a, int b, int c) {
    return a + b + c;
  }

  // Method to add three doubles
  double Add(double a, double b, double c) {
    return a + b + c;
  }
}
