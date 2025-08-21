import java.util.Scanner;
public class DivisibleCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 5 == 0 && num % 11 == 0)
                System.out.println("Divisible by both 5 and 11");
            else
                System.out.println("Not divisible by both 5 and 11");
        }
    }
}
