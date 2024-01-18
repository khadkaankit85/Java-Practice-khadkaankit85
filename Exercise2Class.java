
//Write a Java program to declare variables for storing all the personal information as required in the first program and then print all the details:
//In one line using concatenation
//In different lines
public class Exercise2Class {
  public static void main(String[] args) {
    String name = "Name: Angkit Khadka";
    String studentId = "ID: 23058064";
    String courseName = "Course: Diploma in Computer Programming";
    String city = "City: Dhading";
    String permanentAdress = "Country: Nepal";
    String currentCountry = "Current Residence: Canada";
    // in single line
    System.out.println(
        name + "\n" + studentId + "\n" + courseName + "\n" + city + "\n" + permanentAdress + "\n" + currentCountry);

    System.out.println();
    // in many lines
    System.out.println(name);
    System.out.println(studentId);
    System.out.println(courseName);
    System.out.println(city);
    System.out.println(permanentAdress);
    System.out.println(currentCountry);
  }
}
