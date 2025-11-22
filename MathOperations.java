
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main (String[] args){
        //Arithmetic Operations
        int a= 2;
        int b= 5;
        System.out.println("/nArithmetic operations");
        System.out.println("The Sum of a and b is" + (a+b));
        System.out.println("The difference of a and b is" + (a-b));
        System.out.println("The product of a and b is" + (a*b));
        System.out.println("The quotient of a nad b is" + (a/b));
        
        //Unary Operations 
        int x= 12;
        System.out.println("/nUnary Operations");
        System.out.println("x =" +x);
        System.out.println("Post Decrement =" + x--);
        System.out.println("Post-Increment = " +(x++));
        System.out.println("Incerement =" + (++x));
        
        //Assignment Operations
        int y= 21;
        System.out.println("/nAssignment Operation");
        System.out.println("y =" +y);
        y += 3;//y=y+3
        System.out.println("y += " +y);
        y -= 4;//y=y-4
        System.out.println("y -="  +y);
        y *= 5;//y=y*6
        System.out.println("y *=" +y);
        
        
        // 4. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));


        // 5. Logical Operators
        boolean p = true;
        boolean q = false;
        System.out.println("\nLogical Operators:");
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));


        // 6. Ternary Operator
        int num = 15;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("\nTernary Operator:");
        System.out.println("num is " + result);
        
        
        
    
    }
    
}