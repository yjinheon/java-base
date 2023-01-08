package ch4;
import java.util.*;

// nested if statements
// else if
//
public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';
        System.out.print("Please enter your score: ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.printf("Your grade is %c%c%n", grade, opt);
    }
}
