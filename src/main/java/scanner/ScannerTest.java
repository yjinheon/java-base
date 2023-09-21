import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args) {
    System.out.print("Please enter an integer: ");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    if (input == 0) {
      System.out.println("You entered 0.");
    } else {
      System.out.println("The number you entered is not 0.");
      System.out.println("You entered " + input);
    }
  }
}
