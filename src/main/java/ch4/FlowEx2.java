package ch4;
import java.util.Scanner;
public class FlowEx2 {
    public static void main(String[] args) {
        int input;
        System.out.print("Please enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);
        if (input == 0) {
            System.out.println("You entered 0.");
        } else {
            System.out.println("The number you entered is not 0.");
            System.out.println("You entered " + input);
        }
    }
}
