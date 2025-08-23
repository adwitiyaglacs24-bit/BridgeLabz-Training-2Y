public class LeapYear1 {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = sc.nextInt();
            if (year >= 1582) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else if (year % 100 == 0) {
                    System.out.println(year + " is NOT a Leap Year");
                } else if (year % 4 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is NOT a Leap Year");
                }
            } else {
                System.out.println("Year should be >= 1582");
            }
        }
    }
}