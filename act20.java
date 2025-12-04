
/**
 * Write a description of class act20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act20
{
    public static void main(String[] args) {
   int[] numbers = {10, 22, 35, 40, 18, 50, 7};

System.out.println("Even numbers greater than 20:");

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] > 20 && numbers[i] % 2 == 0) {
        System.out.println(numbers[i]);
    }
}
}
}