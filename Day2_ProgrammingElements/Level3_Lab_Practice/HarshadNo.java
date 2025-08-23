import java.util.Scanner;
public class HarshadNo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {            
            System.out.print("Enter a number: ");
            int number = sc.nextInt();            
            int sum = 0; 
            int originalNumber = number;             
            while (originalNumber != 0) {
                int digit = originalNumber % 10;  
                sum += digit;                     
                originalNumber /= 10;             
            }
            if (number % sum == 0) {
                System.out.println(number + " is a Harshad Number.");
            } else {
                System.out.println(number + " is NOT a Harshad Number.");
            }
        }
    }
}
