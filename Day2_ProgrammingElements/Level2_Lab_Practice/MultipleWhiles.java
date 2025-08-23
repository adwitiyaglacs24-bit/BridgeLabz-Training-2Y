import java.util.Scanner;
public class MultipleWhiles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            if (number > 0 && number < 100) {
                int counter = 100;
                while (counter >= 1) {
                    if (counter % number == 0) {
                        System.out.println(counter);
                    }
                    counter--;
                }
            }
        }
    }
}
