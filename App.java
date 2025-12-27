import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.print("Product Name: ");
        String productName = keyboardInput.next();

        System.out.print("Quantity: ");
        int quantity = keyboardInput.nextInt();

        System.out.print("Unit Price: ");
        double unitPrice = keyboardInput.nextDouble();


        System.out.println(productName.toUpperCase() + " " + quantity + " $" + unitPrice);
        double totalValue = unitPrice * quantity;
        double discount = 0.15 * totalValue;
        double discountValue = (totalValue - discount);
        // System.out.println(totalValue + " " + discount + " " + discountValue);

        double valueAfterTax = calculateTax(discountValue);
        if (valueAfterTax > 500){
            System.out.println("High Value Inventory");
        }
        else {
            System.out.println("Standard Value Inventory");
        }
        
        System.out.print("Enter Shipping Grade A,B or C: ");
        String grade = keyboardInput.next();
        switch (grade) {
            case "A":
                System.out.println("Overnight Shipping");
                break;
            case "B":
                System.out.println("2-Day Shipping");
                break;
            case "C":
                System.out.println("Standard Shipping");
                break;
            default: System.out.println("Invalid Grade");
        }
        double [] sales = new double[5];
        double salesTotal = 0.0;
        int day = 0;

        for(int i = 0; i < sales.length; i++){
            day++;
            System.out.print("Enter sale for Day " + day + " :");
            sales[i] = keyboardInput.nextDouble();
            salesTotal = salesTotal + sales[i];
        }

        System.out.println("The total for the 5 days is: $" + salesTotal);

        int secretCode = 17, guess = 0;
        boolean again = false;

        System.out.println("Guess the secret code: ");
        while(!again){       
        guess = keyboardInput.nextInt();
            if(!(guess == secretCode)){
                System.out.print("Wrong!, try again: ");
            }
            else {
                System.out.println("Correct!");
                again = true;
            }
        }

        String [][] shelving = {
                {"Empty", "Occupied", "Empty"},
                {"Occupied", "Occupied", "Occupied"},
                {"Empty", "Empty", "Empty"}
        };
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(shelving[i][k] + " ");
            }
        }
        System.out.println("");
        System.out.print("Enter the base number you want to find power of; ");
        int baseNum = keyboardInput.nextInt();
        System.out.print("Enter the power: ");
        int powNum = keyboardInput.nextInt();
        System.out.println("The Result is " +  pow(baseNum,powNum));

        System.out.println("Your " + productName + " is ready for shipping " + grade);
    }




    public static double calculateTax(double a){
        double tax = 0.07 * a;
        return tax;
    }
    public static int pow(int b, int c){
        int power = 1;
        for (int j = 0; j < c; j++){
            power = power * b;
        }
        return power;
    }
}