import java.io.*;
import java.util.*;

class Common {
    public static void main(String[] args) {
        int[] arr1 = { 1,4,8,16 };
        int[] arr2 = { 2,4,6,8};
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.print("Common Elements: ");
        FindCommonElemet(arr1, arr2);
    }
    private static void FindCommonElemet(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==(arr2[j])) {
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (int i : set) {
            System.out.print(i + " ");
        }
    }

    
}
