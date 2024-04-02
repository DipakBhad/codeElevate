public class CountEvenOdd
{
  public static void main(String[] args)
  {
     int arr[]={2,3,4,5,6,7,8};
    int evenCount=0,oddCount=0;

    for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
     System.out.println("The total number of even number array contains: "+evenCount);
     System.out.println("The total number of odd number array contains: "+oddCount);
    
  }

}
/*import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);
        
        scanner.close();
    }
}
*/