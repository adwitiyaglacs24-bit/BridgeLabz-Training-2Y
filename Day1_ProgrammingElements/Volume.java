import java.util.*;
public class Volume {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double radius = sc.nextDouble();
            double height = sc.nextDouble();
            double volume = Math.PI * radius * radius * height;
            System.out.printf("Volume of the cylinder: %.2f", volume);
        }
    }
}
