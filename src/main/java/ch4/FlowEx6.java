import java.util.*;

// Korean
class FlowEx6 {
    public static void main(String[] args)  {
        System.out.print("Please enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
            case 12: case 1: case 2:
                System.out.println("Winter");
                break;

    } // end of main
    }
}