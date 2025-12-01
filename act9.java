
/**
 * Write a description of class act9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class act9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (0 to stop): ");
            number = in.nextInt();
            sum += number;   
        } while (number != 0);

        System.out.println("Total sum: " + sum);
    }
}
