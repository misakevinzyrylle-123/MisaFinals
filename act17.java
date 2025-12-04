
/**
 * Write a description of class act17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act17
{
   public static void main(String[] args) {
    int[] arr = {12, 45, 7, 89, 32, 89};

int highest = Integer.MIN_VALUE;
int secondHighest = Integer.MIN_VALUE;

for (int num : arr) {

    if (num > highest) {
        // shift the old highest to second highest
        secondHighest = highest;
        highest = num;
    } 
    else if (num > secondHighest && num != highest) {
        // update second highest only if it's smaller than highest
        secondHighest = num;
    }
}

System.out.println("Highest: " + highest);
System.out.println("Second Highest: " + secondHighest);
}
}