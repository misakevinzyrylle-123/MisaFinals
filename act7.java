
/**
 * Write a description of class act7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act7
{
        public static void main(String[] args) {
        int[] numbers = {-5, 8, -11, 4, -13, 2, -7};

for (int i = 0; i < numbers.length; i++) {
    numbers[i] = Math.abs(numbers[i]);  
}

 
for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
}
}