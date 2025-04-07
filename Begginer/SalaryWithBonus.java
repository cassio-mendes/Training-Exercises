
import java.util.Scanner;

public class SalaryWithBonus {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
        double salary = input.nextDouble();
        double sells = input.nextDouble();
        double total = salary + (sells * 0.15); //The bonus is 15% over the sells
        
        //.format("%.2f", total) reduces the number decimal places to only 2
        System.out.println(name + "'s total in the month = R$" + String.format("%.2f", total));
    }
    
}
