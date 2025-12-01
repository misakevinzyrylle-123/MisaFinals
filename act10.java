
/**
 * Write a description of class act10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act10
{
       public static void main(String[] args) {
        int[] numbers = {5, 7, 9, 12, 4, 8};
int index = -1;  

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] % 2 == 0) {   
        index = i;              
        break;                
    }
}

if (index != -1) {
    System.out.println("The first even number is at index: " + index);
} else {
    System.out.println("No even numbers found.");
}

        }
}