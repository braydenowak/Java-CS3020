import java.lang.reflect.Array;
import java.util.*;
public class Union {
    //Method returns union of two arrays, no dupes
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> result = new ArrayList<>();

        //Adds all elements from list1
        for (int num : list1){
            if(!result.contains(num)){
                result.add(num);
            }
        }

        // Add elements from list2 if not already present
        for (int num : list2) {
            if(!result.contains(num)){
                result.add(num);
            }
        }

        // Sort the final list
        Collections.sort(result);
        return result;
    }

    //Main test program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //First list
        System.out.print("Enter the number of integers in list 1: ");
        int size1 = scanner.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Enter " + size1 + " integers for list 1, separated by spaces: ");
        for (int i = 0; i < size1; i++) {
            list1.add(scanner.nextInt());
        }

        //Second List
        System.out.print("Enter the number of integers in list 2: ");
        int size2 = scanner.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter " + size2 + " integers for list 2, separated by spaces: ");
        for (int i = 0; i < size2; i++) {
            list2.add(scanner.nextInt());
        }

        //Unionize and display
        ArrayList<Integer> result = union(list1, list2);
        System.out.println("Union: " + result);

        scanner.close();
    }
}