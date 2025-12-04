
/**
 * Write a description of class act16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class act16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int count = 0;
        int temp = Math.abs(num); // handle negative numbers

        if (temp == 0) {
            count = 1;   // 0 has 1 digit
        } else {
            while (temp > 0) {
                temp = temp / 10; // remove the last digit
                count++;          // count the digit
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
