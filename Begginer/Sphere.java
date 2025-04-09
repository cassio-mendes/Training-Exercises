
import java.util.Scanner;


public class Sphere {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int radius = input.nextInt(); //The sphere's radius
        double volume = (4/3.0) * 3.14159 * Math.pow(radius, 3); //Using 3.14159 as PI
        
        System.out.println("Volume = " + String.format("%.3f", volume));
    }
    
}
