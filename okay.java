
/**
 * Write a description of class okay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class okay
{
    
    int age;// instance variable 
    static int qty; //static variable
    public static void main(String[] args){
        
        int n1=10 ;// local variable
        
        // implicit Typecasting
        
        double dt= n1;
        System.out.println(dt);
        
        //explicit typecasting
        
        double db=10.01;
        int itr=(int)db;
        
        System.out.println(itr);
        //Finding min,max,size and bytes
        
        System.out.println(Byte.MAX_VALUE);//returns max value
        System.out.println(Byte.MIN_VALUE);//returns min value
        System.out.println(Byte.SIZE);//return bits
        System.out.println(Byte.BYTES);//return bytes
        
        //escape Sequence
        System.out.println("Hello\nWorld");//new line
        System.out.println("Hamro\tNepal");//tab
        System.out.println("He said \" hi \" " );//Quotation
        
        
        //Unicode Escape
        
        System.out.println("\u2764");
        
        
        
        
    }
}