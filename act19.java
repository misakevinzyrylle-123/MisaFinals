
/**
 * Write a description of class act19 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act19
{
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "David"};
        int[] grades = {85, 72, 91, 60};

        // Display each student's grade
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " scored " + grades[i]);
        }
    }
}