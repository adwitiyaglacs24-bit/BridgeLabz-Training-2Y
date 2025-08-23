import java.util.Scanner;
public class OddEvenNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            if (number <= 0) {
                System.out.println("Enter a natural number > 0");
            } else {
                for (int i = 1; i <= number; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " is Even");
                    } else {
                        System.out.println(i + " is Odd");
                    }
                }
            }
        }
    }
}
