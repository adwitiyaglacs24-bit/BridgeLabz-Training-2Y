import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int power = sc.nextInt();
            long result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println("Result: " + result);
        }
    }
}
