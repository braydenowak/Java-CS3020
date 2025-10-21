public class MyInteger {
    int value;

    MyInteger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }

    /*instance methods*/
    public boolean isEven(){
        return value%2 == 0;
    }
    public boolean isOdd(){
        return value%2 == 1;
    }
    public boolean isPrime(){
       if (value <= 1){
           return false;
       }
       for(int i = 2; i < value; i++){
           if(value % i == 0){
               return false;
           }
        }
       return true;
    }
    /*Static methods*/
    public static boolean isEven(int value){
        return value%2 == 0;
    }
    public static boolean isOdd(int value){
        return value%2 == 1;
    }
    public static boolean isPrime(int value){
        if (value <= 1){
            return false;
        }
        for(int i = 2; i < value; i++){
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }
    /*Class object static methods*/
    public static boolean isEven(MyInteger integer){
        return integer.getValue()%2 == 0;
    }
    public static boolean isOdd(MyInteger integer){
        return integer.getValue()%2 == 1;
    }
    public static boolean isPrime(MyInteger integer){
        if (integer.getValue() <= 1){
            return false;
        }
        for(int i = 2; i < integer.getValue(); i++){
            if(integer.getValue() % i == 0){
                return false;
            }
        }
        return true;
    }

    /*equals methods*/
    public boolean equals(int value){
        return this.value == value;
    }
    public boolean equals(MyInteger integer){
        return this.value == integer.getValue();
    }
    /*parse int with char array*/
    public static int parseInt(char[] ch){
        int result = 0;
        for(int i: ch){
            int digit = i - '0';
            result = result*10+digit;
        }
        return result;
    }
    /*parse int with string*/
    public static int parseInt(String str){
        int result = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int digit = c -'0';
            result = result*10+digit;
        }
        return result;
    }

}
