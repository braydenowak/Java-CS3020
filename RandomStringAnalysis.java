public class RandomStringAnalysis {
    public static void main(String[] args){
        int length = (int)(5 + (Math.random()* 10));
        String userString = "";
        int vowels = 0;
        userString += (char)(65+(Math.random()*25));
        for(int i = 1; i < length; i++){
            userString += (char) (97 + (Math.random() * 25));
        }
        System.out.println("Generated string: " + userString);
        userString = userString.toUpperCase();
        for(int i = 0; i < length; i++){
            if(userString.charAt(i) == 65 || userString.charAt(i) == 69 || userString.charAt(i) == 73 || userString.charAt(i) == 79 || userString.charAt(i) == 85){
                vowels += 1;
            }
        }
        System.out.println("Number of vowels: " + vowels);

    }
}
