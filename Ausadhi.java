
/**
 * Write a description of class Ausadhi here.
 *
 * @author (Praanjal)
 */
public class Ausadhi

{
    public static void main( String[] args){
        
        //Medicine 1
        String medName1 = "Paracetamol";
        double price1 =6.0; 
        int quantity1 = 130;
        
        //Medicine 2
        String medName2 = "De-Cold";
        double price2 = 3.0;
        int quantity2 = 180;
        
        //Medicine 3
        String medName3 = "aspirin";
        double price3 = 4.0;
        int quantity3 = 300;
        
        
        //Inventory Report
        System.out.println("=====PHARMACY INVENTORY REPORT====");
        System.out.println("Medicine Name  Price(NPR) Quantity");
        System.out.println("--------------------------------------");
        
        
        System.out.println(medName1 + "     " + price1 + "   "  +quantity1);
        System.out.println(medName2 + "     " + price2 + "   "  +quantity2);
        System.out.println(medName3 + "     " + price3 + "   "  +quantity3);
        
        System.out.println("--------------------------------------");
        System.out.println("Report Generated Succesfully.");
    }        
}