import java.util.Scanner;

/**
 * Write a description of class Rickshaw here.
 *
 * @author (Praanjal)
 * @version (22/11)
 */
public class Rickshaw
{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter time (minutes): ");
        int time = sc.nextInt();
        
        System.out.print("Is the customer local? (yes/no): ");
        String isLocalInput = sc.next();
        System.out.print("Is it night time? (yes/no): ");
        String isNightInput = sc.next();

        boolean isLocal = isLocalInput.equals("yes") ? true : false;
        boolean isNight = isNightInput.equals("yes") ? true : false;
        
        double baseFare = 30;
        double perKm = 20;
        double perMinute = 2;

        // Step 1: Normal fare
        double fare = baseFare + (distance * perKm) + (time * perMinute);

        // Step 2: Local discount (only if distance > 5 km)
        fare = (isLocal && distance > 5) ? fare * 0.90 : fare;

        // Step 3: Night-time surcharge
        fare = isNight ? fare * 1.20 : fare;

        // Final fare rounded
        int finalFare = (int)Math.round(fare);

        // Display result
        System.out.println("Final Fare: Rs. " + finalFare);
    }
}