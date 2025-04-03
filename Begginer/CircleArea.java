
import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        System.out.println("Circle Area = " + (3.14159 * (R*R))); //Formula: A = PI * R²
    }
    
}
