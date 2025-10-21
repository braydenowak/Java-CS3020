import java.util.Scanner;
import java.util.Arrays;
public class ThreeDigitLottery {
    public static void main(String[] args){
        String lotteryNum = "";
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3 ; i ++) {
            lotteryNum += String.valueOf((int) (Math.random() * 10));
        }

        //Asks for 3 dig num
        System.out.print("Enter a three-digit number: ");
        String userNum = scanner.next();

        //Numbers
        System.out.println("Lottery number: " + lotteryNum);
        System.out.println("Your number: " + userNum);

        //Exact Match
        if(userNum.equals(lotteryNum)){
            System.out.println("Congratulations! You win $10,000!");
            return;
        }


        //Sorts the numbers
        char[] userCharArray = userNum.toCharArray();
        char[] lotteryCharArray = lotteryNum.toCharArray();
        Arrays.sort(userCharArray);
        Arrays.sort(lotteryCharArray);
        String sortedUser = new String(userCharArray);
        String sortedLottery = new String(lotteryCharArray);

        //Digits match
        if(sortedUser.equals(sortedLottery)){
            System.out.println("Congratulations! You win $5,000!");
            return;
        }

        //one digit
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3 ; j++){
                if(userNum.charAt(i) == lotteryNum.charAt(j)){
                    System.out.println("Congratulations! You win $1,000!");
                    return;
                }
            }
        }

        //No matches
        System.out.println("Sorry but there were no matches detected");
    }
}
