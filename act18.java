
/**
 * Write a description of class act18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act18
{
       public static void main(String[] args) {
   int[] arr = {5, 2, 9, 5, 7};
boolean hasDuplicate = false;

for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            hasDuplicate = true;
            break; // stop inner loop if duplicate found
        }
    }
    if (hasDuplicate) {
        break; // stop outer loop too
    }
}

if (hasDuplicate) {
    System.out.println("Array contains duplicates.");
} else {
    System.out.println("Array does NOT contain duplicates.");
}

    }
}