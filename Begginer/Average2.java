
import java.util.Scanner;

public class Average2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double weightA = 2.0;
        double weightB = 3.0;
        double weightC = 5.0;
        
        double media = ((A * weightA) + (B * weightB) + (C * weightC)) / (weightA + weightB + weightC);
        System.out.println("Average = " + media);
    }
    
}
