import java.util.Scanner;
public class NumberSignCheck {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number = input.nextInt();
            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
    }
}
