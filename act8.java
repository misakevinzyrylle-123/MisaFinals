
/**
 * Write a description of class act8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act8
{
        public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
int[] arrayB = new int[arrayA.length];  

for (int i = 0; i < arrayA.length; i++) {
    arrayB[i] = arrayA[i];   
}

 
for (int i = 0; i < arrayB.length; i++) {
    System.out.print(arrayB[i] + " ");
}

        }
}