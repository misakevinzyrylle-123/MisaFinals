
/**
 * Write a description of class act2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act2
{
    public static void main(String[] args) {

        int[] numbers = {3, 7, 2, 7, 9, 7, 1, 4, 7, 8};
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 7) {
                count++;
            }
        }

        System.out.println("Number 7 appears " + count + " times.");
    }
}