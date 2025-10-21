import java.util.Scanner;
import java.lang.String;

public class StringManipulation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Alphanumeric string");
        String alphanumeric = input.nextLine();
        String numbers = "";
        // Finds and adds integers into one integer
        for(int i = 0; i < alphanumeric.length(); ++i){
            if(alphanumeric.charAt(i) > 47 && alphanumeric.charAt(i) < 58){
                numbers += alphanumeric.charAt(i);
            }
        }
        //Prints out Unicode

        if(numbers == ""){
            System.out.println("No Integers detected!");
        }else{
            System.out.println("Digits extracted as numbers: "+ numbers);
            System.out.println("Corresponding Unicode: "+(char)(Integer.parseInt(numbers)));
        }


        //Converts Prints out Uppercase and Lower case
        System.out.println("Uppercase: "+alphanumeric.toUpperCase());
        System.out.println("Lowercase: "+alphanumeric.toLowerCase());
    }
}
