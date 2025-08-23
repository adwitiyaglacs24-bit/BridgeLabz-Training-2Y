public class LeapYear1(b) {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            if (year >= 1582 && ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is NOT a Leap Year");
            }
        }
    }
}
