class Main {
  public static void main(String[] args) {

    // int[] numbers = { 5, 7, 8, 9, 10 };
    // // System.out.println(numbers[0]);
    // for (int i = 0; i < numbers.length; i++) {
    // System.out.println(numbers[i]);

    String[] college = { "Sault college", "Niagara college", "triOS College", "Mohawk college" };
    System.out.println("List of some colleges in Canada: ");
    for (int i = 0; i < college.length; i++) {
      System.out.println((i + 1) + ". " + college[i]);
    }

  }
}
