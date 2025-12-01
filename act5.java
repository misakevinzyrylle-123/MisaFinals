
/**
 * Write a description of class act5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act5
{
     public static void main(String[] args) {
            int[] numbers = {5, 3, 9, 7, 2, 8, 1};

            int target = 7;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found the value at index " + i);
                break;   
            }
        }
    }
}