
/**
 * Write a description of class act12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act12
{
    public static void main(String[]args){
        int[] numbers = {5, 7, 3, 7, 2, 7, 9};
int target = 7;

int count = 0;

for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        count++;
        
        if (count == 3) {
            break;   // stop once you reach 3 occurrences
        }
    }
}

if (count >= 3) {
    System.out.println(target + " appears at least 3 times.");
} else {
    System.out.println(target + " does NOT appear 3 times.");
}
}
}