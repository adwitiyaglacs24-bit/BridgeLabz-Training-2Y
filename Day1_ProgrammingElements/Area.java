import java.util.*;
public class Area {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double radius = sc.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.printf("Area of circle: %.2f" , area);
        }
    }
}
