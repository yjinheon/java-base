interface FizzBuzz {
    void printFizzBuzz(int n); // printFizzBuzz 메소드를 선언한다.
}

class FizzBuzzImpl implements FizzBuzz {
    // printFizzBuzz 메소드를 구현한다.
    public void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

public class FizzBuzzMain {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzzImpl();
        fizzBuzz.printFizzBuzz(100);
    }
}
