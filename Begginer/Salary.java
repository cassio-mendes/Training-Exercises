
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        int hours = input.nextInt();
        double amountPerHour = input.nextDouble();
                
        System.out.println("Employee " + number + "'s salary = " + (hours * amountPerHour));
    }
    
}
