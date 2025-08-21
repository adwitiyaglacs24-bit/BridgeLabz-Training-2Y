import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);
            if (ch >= 'A' && ch <= 'Z')
                System.out.println("Uppercase");
            else if (ch >= 'a' && ch <= 'z')
                System.out.println("Lowercase");
            else
                System.out.println("Not an Alphabet");
        }
    }
}
