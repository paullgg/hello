import java.util.Scanner;

/**
 * Write a description of class GRADE here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GRADE
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numeric grade:");
        int grade= sc.nextInt();
        
        
        String result = (grade >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
        
    }
}
