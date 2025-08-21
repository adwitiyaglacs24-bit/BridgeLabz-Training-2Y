import java.util.Scanner;
public class Largestcheck {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            int number3 = input.nextInt();
            System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3 ? "Yes" : "No"));
            System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3 ? "Yes" : "No"));
            System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2 ? "Yes" : "No"));
        }
    }
}
