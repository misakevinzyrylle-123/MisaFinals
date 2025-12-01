
/**
 * Write a description of class act6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act6
{
     public static void main(String[] args) {
            int[] numbers = {5, 8, 11, 4, 13, 2, 7};
               
            int sum = 0;
            int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {  
                sum += numbers[i];
                count++;
            }
        }
    
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of odd numbers: " + average);
        } else {
            System.out.println("No odd numbers found.");
        }
    
    }
}