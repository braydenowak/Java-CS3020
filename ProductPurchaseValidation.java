import java.util.Scanner;
public class ProductPurchaseValidation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the following");
        double price = 0.0;
        int quantity = 0;
        boolean onSale = false;
        //Gathering Price
        while(true){
            System.out.println("Product Price: ");
            String input = scanner.next();
            if(!input.contains(".")) {
                System.out.println("Price must be a floating point!");
                continue;
            }
            price = Double.parseDouble(input);
            if (price > 0){
                break;
            }else{
                System.out.println("Price must be positive!");
            }

        }

        //Gathering Quantity
        while(true){
            System.out.println("Quantity: ");
            String input = scanner.next();
            if(input.contains(".")){
                System.out.println("Quantity must be an integer!");
                continue;
            }
            quantity = Integer.parseInt(input);
            if(quantity > 0){
                break;
            }else{
                System.out.println("Quantity must be positive!");
            }
        }
        scanner.nextLine();

        //Gathering Sale Status
        while(true){
            System.out.println("Is this item on sale? (true/false): ");
            String in = scanner.nextLine();
            if(in.equalsIgnoreCase("true")||in.equalsIgnoreCase("false")){
                onSale = Boolean.parseBoolean(in);
                break;
            }else {
                System.out.println("Invalid input, must enter either \"true\" or \"false\"");
            }

        }

        scanner.close();

        double totalCost = price * quantity;
        System.out.println("Products Details:");
        System.out.printf("Price:%10.2f\n", price);
        System.out.printf("Quantity:%5d\n", quantity);

        System.out.printf("Total cost before discount: $%.2f\n",totalCost);
        if(onSale){

            System.out.println("Status: Available\n");
            System.out.printf("Total cost before discount:  $%.2f\n",totalCost);
            totalCost *= .90;
            System.out.println("Discount applied: 10%");
            System.out.printf("Total cost after discount: $%.2f\n",totalCost);
        }else{
            System.out.println("Status: Sold Out\n");
            System.out.printf("Total cost: $%.2f\n",totalCost);
        }




    }
}
