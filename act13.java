
/**
 * Write a description of class act13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class act13
{
    public static void main(String[]args){
        int[] grades = {85, 72, 91, 67, 75, 88, 54};

int passed = 0;
int failed = 0;

for (int i = 0; i < grades.length; i++) {
    if (grades[i] >= 75) {
        passed++;
    } else {
        failed++;
    }
}

System.out.println("Students Passed: " + passed);
System.out.println("Students Failed: " + failed);
}
}