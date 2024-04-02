/*import java.io.*;
import java.util.*;
import java.util.Scanner;

public class  FindMissingNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (in ascending order with one number missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int missingNumber = findMissingNumber(arr);
        
        System.out.println("The missing number in the array is: " + missingNumber);
        
        scanner.close();
    }
    
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = (n * (n + 1)) / 2; // Sum of first n natural numbers
        
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        return totalSum - actualSum;
    }
}
*/
import java.util.Arrays;

public class FindMissingNo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array with one missing number

        int missingNumber = findMissingNumber(arr);
        
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Expected number of elements including the missing number
        int total = n * (n + 1) / 2; // Sum of first n natural numbers

        int sum = Arrays.stream(arr).sum(); // Sum of elements in the array

        return total - sum;
    }
}
