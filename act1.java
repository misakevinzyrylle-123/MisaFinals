
/**
 * Write a description of class act1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number between 1 and 100: ");
            number = in.nextInt();
        } while (number < 1 || number > 100);

        System.out.println("You entered: " + number);
    }
}
