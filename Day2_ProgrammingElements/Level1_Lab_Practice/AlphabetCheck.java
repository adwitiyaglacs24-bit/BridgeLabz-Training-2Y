import java.util.Scanner;
public class AlphabetCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                System.out.println("Alphabet");
            else
                System.out.println("Not an Alphabet");
        }
    }
}
