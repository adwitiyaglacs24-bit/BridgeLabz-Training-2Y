import java.util.Scanner;
public class PowerFor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int power = sc.nextInt();
            long result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println("Result: " + result);
        }
    }
}
