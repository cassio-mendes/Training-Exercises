
import java.util.Scanner;

public class Average1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double weightA = 3.5;
        double weightB = 7.5;
        
        double media = ((A * weightA) + (B * weightB)) / (weightA + weightB);
        System.out.println("Average = " + media);
    }
    
}
