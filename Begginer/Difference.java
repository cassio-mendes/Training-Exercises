
import java.util.Scanner;

public class Difference {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        
        System.out.println("Difference = " + (A * B - C * D));
    }
    
}
