import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserProfile {
    private String email;
    private String fullName;

    /*Constructor*/
    public UserProfile(String email, String fullName){
        this.email = email;
        this.fullName = fullName;
    }

    public boolean isEmailValid(){
        String regex  = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public String getEmailUsername(){
        if (isEmailValid()){
            return email.substring(0, email.indexOf('@'));
        }
        return "";
    }

    public String getEmailDomain(){
        if (isEmailValid()){
            return email.substring(email.indexOf('@')+1);
        }
        return "";
    }

    public String getProperName(){
        String[] words = fullName.trim().split("\\s+");
        StringBuilder properCase = new StringBuilder();

        for(String word : words){
            if (word.length() > 0){
                properCase.append((Character.toUpperCase(word.charAt(0))));
                if (word.length() > 1){
                    properCase.append(word.substring(1).toLowerCase());
                }
                properCase.append(" ");
            }
        }
        return properCase.toString().trim();
    }

    public String getSuggestedUsername(){
        String[] words = fullName.trim().split("\\s+");
        String first = words[0].toLowerCase();
        String last = words[words.length-1].toLowerCase();
        return first + "." + last;
    }


}

