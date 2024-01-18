class ExceptionHandling {
  public static void main(String[] args) {
    try {
      System.out.println(1 / 0);
    } catch (Exception e) {
      System.out.println("Error: Cannot Divide a number by zero.");
    }

    for (int i = 0; i <= 5;) {
      System.out.println(i++);
    }
  }
}