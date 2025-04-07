
import java.util.Scanner;

public class SimpleCalculate {
    
    //Expected input: 12 1 5,30
    //                16 2 5,10
    //Expected output: TOTAL VALUE = R$15,50
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //This input will read the lines
        double total; //Total price to be paid
        
        String product1 = input.nextLine(); //First line
        total = calculatesPrice(product1); //This function will calculate the final value for the first product
        
        String product2 = input.nextLine(); //Second line
        total += calculatesPrice(product2);

        System.out.println("TOTAL VALUE = R$" + String.format("%.2f", total));
    }
    
    private static double calculatesPrice(String productLine) {
        Scanner lineValues = new Scanner(productLine); //This input will read the separate numbers in the line
        
        int code = lineValues.nextInt(); //First number
        int quantity = lineValues.nextInt(); //Second one
        double price = lineValues.nextDouble(); //Third one
        
        return quantity * price; //The total price of the products;
    }
    
}
