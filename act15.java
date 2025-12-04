
/**
 * Write a description of class act15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
        import java.util.Scanner;
public class act15{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = in.nextInt();
        }

        // Display numbers greater than 50
        System.out.println("Numbers greater than 50:");
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 50) {
                System.out.println(numbers[i]);
            }
        }
    }
}