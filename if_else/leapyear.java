
import java.util.*;

public class leapyear {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the year ");
            int year = sc.nextInt();
            boolean x = (year % 4) == 0;
            boolean y = (year % 100) != 0;
            boolean z = (year % 10) == 0;
            if (x && (y || z)) {
                System.out.println("year is leap year");
            } else {
                System.out.println("year is not leap year");
            }
        }
    }
}
