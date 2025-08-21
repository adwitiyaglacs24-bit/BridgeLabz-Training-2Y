import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);
            if ("aeiouAEIOU".indexOf(ch) != -1)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
    }
}
