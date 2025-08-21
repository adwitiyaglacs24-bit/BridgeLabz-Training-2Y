import java.util.Scanner;
public class FactorialForLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + num + " = " + fact);
            }
        }
    }
}
