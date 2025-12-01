
/**
 * Write a description of class act4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act4
 {
    public static void main(String[] args) {

        int[] numbers = {12, 5, 7, 22, 9, 3, 18};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
