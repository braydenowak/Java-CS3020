import java.util.Arrays;
import java.util.Scanner;
public class PerformanceComparison {
    public static void main(String[] args){
        /* Makes an Array with 100,000 elements of random integers from 0 to 99,999*/
        int[] array = new int[100000];
        for(int i = 0; i < array.length; i ++){
            array[i] = (int)(Math.random()*100000);
        }

        /*Copys array to create seperate ones to use for sort methods*/
        int[] selectionSortArray = new int[100000];
        copyArray(array, selectionSortArray);


        /*First 10 elements before sorting */
        System.out.print("First 10 elements before selection sort: [");
        for(int i = 0; i < 10; i++){
            System.out.print(selectionSortArray[i]);
            if (i < 9) System.out.print(", ");
        }
        System.out.print("]\n");

        /*Measure Selection sort time*/
        long startTime = System.nanoTime();
        selectionSort(selectionSortArray);
        long endTime = System.nanoTime();
        long selectionSortTime = endTime - startTime;

        /*First 10 elements before sorting */
        System.out.print("First 10 elements after selection sort: [");
        for(int i = 0; i < 10; i++){
            System.out.print(selectionSortArray[i]);
            if (i < 9) System.out.print(", ");
        }
        System.out.print("]\n");

        /*Display Selection sort time*/
        System.out.println("Selection sort time: " + selectionSortTime + " ns\n");

        /*Arrays.sort()*/
        System.out.print("First 10 elements before Arrays.sort(): [");
        for(int i = 0; i < 10; i++){
            System.out.print(array[i]);
            if (i < 9) System.out.print(", ");
        }
        System.out.print("]\n");
        /*Measures Arrays.sort time*/
        startTime = System.nanoTime();
        Arrays.sort(array);
        endTime = System.nanoTime();
        long sortTime = endTime - startTime;

        System.out.print("First 10 elements after Arrays.sort(): [");
        for(int i = 0; i < 10; i++){
            System.out.print(array[i]);
            if (i < 9) System.out.print(", ");
        }
        System.out.print("]\n");
        /*Display Arrays.sort time*/
        System.out.println("Arrays.sort() time: " + sortTime + " ns\n");

        /*Display sort time diff*/
        System.out.println("Difference in sort time: " +(selectionSortTime-sortTime) + " ns\n");


        /* Prompts user for value*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search for: ");
        int input = Integer.parseInt(scanner.next());

        /*Linear search*/
        startTime = System.nanoTime();
        System.out.println("Linear search index: " + linearSearch(array, input));
        endTime = System.nanoTime();
        long linearSearchTime = endTime - startTime;
        System.out.println("Time for linear search: " + linearSearchTime + " ns");

        /*Binary Search*/
        startTime = System.nanoTime();
        System.out.println("Binary search index: " + Arrays.binarySearch(array, input));
        endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;
        System.out.println("Time for binary search: " + binarySearchTime + " ns");

        System.out.println("Difference in search time: " + (linearSearchTime-binarySearchTime) + " ns");



    }
    /* Manually Copy one arrays elements to another*/
    public static void copyArray(int[] source, int[] destination){
        for(int i = 0; i < source.length; i++){
            destination[i] = source[i];
        }
    }
    /*Finds target integer and returns index number or -1 if not found*/
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /*Uses selection sort to sort array*/
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minI = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minI]) {
                    minI = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minI];
            arr[minI] = temp;
        }
    }

}
