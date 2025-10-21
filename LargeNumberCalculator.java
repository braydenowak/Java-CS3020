import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class LargeNumberCalculator {

    public static BigInteger calculateBigInteger(BigInteger num1, BigInteger num2, String operation) {
        switch (operation) {
            case "add":
                return num1.add(num2);
            case "subtract":
                return num1.subtract(num2);
            case "multiply":
                return num1.multiply(num2);
            default:
                throw new IllegalArgumentException("Invalid operation for BigInteger");
        }
    }

    public static BigDecimal calculateBigDecimal(BigDecimal num1, BigDecimal num2, String operation) {
        switch (operation) {
            case "add":
                return num1.add(num2);
            case "subtract":
                return num1.subtract(num2);
            case "multiply":
                return num1.multiply(num2);
            default:
                throw new IllegalArgumentException("Invalid operation for BigDecimal");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Large Number Arithmetic Calculator");

        while (true) {
            // Menu
            System.out.println("Menu:");
            System.out.println("1. Add two BigInteger numbers");
            System.out.println("2. Subtract two BigInteger numbers");
            System.out.println("3. Multiply two BigInteger numbers");
            System.out.println("4. Add two BigDecimal numbers");
            System.out.println("5. Subtract two BigDecimal numbers");
            System.out.println("6. Multiply two BigDecimal numbers");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 7) {
                System.out.println("Thank you for using the calculator. Goodbye");
                break;
            }

            // Ask for numbers as strings
            String input1, input2;
            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter first BigInteger: ");
                input1 = scanner.nextLine();
                System.out.print("Enter second BigInteger: ");
                input2 = scanner.nextLine();
            } else if (choice >= 4 && choice <= 6) {
                System.out.print("Enter first BigDecimal: ");
                input1 = scanner.nextLine();
                System.out.print("Enter second BigDecimal: ");
                input2 = scanner.nextLine();
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            try {
                switch (choice) {
                    case 1: {
                        BigInteger num1 = new BigInteger(input1);
                        BigInteger num2 = new BigInteger(input2);
                        BigInteger result = calculateBigInteger(num1, num2, "add");
                        System.out.println("Result of addition:");
                        System.out.println(num1 + " + " + num2 + " =");
                        System.out.println(result);
                        System.out.println("--------------------------------------------");
                        break;
                    }
                    case 2: {
                        BigInteger num1 = new BigInteger(input1);
                        BigInteger num2 = new BigInteger(input2);
                        BigInteger result = calculateBigInteger(num1, num2, "subtract");
                        System.out.println("Result of subtraction:");
                        System.out.println(num1 + " - " + num2 + " =");
                        System.out.println(result);
                        System.out.println("--------------------------------------------");
                        break;
                    }
                    case 3: {
                        BigInteger num1 = new BigInteger(input1);
                        BigInteger num2 = new BigInteger(input2);
                        BigInteger result = calculateBigInteger(num1, num2, "multiply");
                        System.out.println("Result of multiplication:");
                        System.out.println(num1 + " * " + num2 + " =");
                        System.out.println(result);
                        System.out.println("--------------------------------------------");
                        break;
                    }
                    case 4: {
                        BigDecimal num1 = new BigDecimal(input1);
                        BigDecimal num2 = new BigDecimal(input2);
                        BigDecimal result = calculateBigDecimal(num1, num2, "add");
                        System.out.println("Result of addition:");
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        System.out.println("--------------------------------------------");
                        break;
                    }
                    case 5: {
                        BigDecimal num1 = new BigDecimal(input1);
                        BigDecimal num2 = new BigDecimal(input2);
                        BigDecimal result = calculateBigDecimal(num1, num2, "subtract");
                        System.out.println("Result of subtraction:");
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        System.out.println("--------------------------------------------");
                        break;
                    }
                    case 6: {
                        BigDecimal num1 = new BigDecimal(input1);
                        BigDecimal num2 = new BigDecimal(input2);
                        BigDecimal result = calculateBigDecimal(num1, num2, "multiply");
                        System.out.println("Result of multiplication:");
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        System.out.println("--------------------------------------------");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter valid numeric strings.");
                System.out.println("--------------------------------------------");
            }
        }

        scanner.close();
    }
}