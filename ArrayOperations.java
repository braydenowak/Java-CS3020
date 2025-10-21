import java.util.*;

public class ArrayOperations {
    public static void main(String[] args){
        Random random = new Random();
        int[][] array = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100) + 1;
            }
        }
        System.out.println("Original Array: ");
        display2DArray(array);
        System.out.println("\nSum of all elemnets: " + sum(array));
        System.out.println("Minimum element: " + min(array));
        System.out.println("Maximum element: " + max(array));
        System.out.println("Shuffled Array:");
        shuffle(array);
        display2DArray(array);
    }
    public static void display2DArray(int[][] array){
        for(int[] rows : array){
            System.out.println(Arrays.toString(rows));
        }
    }
    public static int sum(int[][] array){
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }
    public static int min(int[][] array){
        int min = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt < min) min = anInt;
            }
        }
        return min;
    }
    public static int max(int[][] array){
        int max = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > max) max = anInt;
            }
        }
        return max;
    }
    public static void shuffle(int[][] array){
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = array[i].length - 1; j > 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);
                int temp = array[i][j];
                array[i][j] = array[m][n];
                array[m][n] = temp;
            }
        }
    }
}
