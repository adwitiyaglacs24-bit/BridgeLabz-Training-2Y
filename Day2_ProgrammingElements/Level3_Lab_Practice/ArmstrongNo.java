import java.util.Scanner;
public class ArmstrongNo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int sum = 0; 
            int originalNumber = number; 
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += digit * digit * digit;
                originalNumber /= 10;
            }
            if (sum == number) {
                System.out.println(number + " is an Armstrong Number.");
            } else {
                System.out.println(number + " is NOT an Armstrong Number.");
            }
        }
    }
}
