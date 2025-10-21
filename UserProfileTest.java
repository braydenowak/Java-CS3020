import java.util.Scanner;
public class UserProfileTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        UserProfile userProfile =  new UserProfile(email, name);

        System.out.print("\nEmail valid? ");
        if(userProfile.isEmailValid()){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        System.out.println("\nUsername: " + userProfile.getEmailUsername());
        System.out.println("Domain: " + userProfile.getEmailDomain());
        System.out.println("Full Name (proper case): " + userProfile.getProperName());
        System.out.println("Suggested UserName: " + userProfile.getSuggestedUsername());

    }
}
