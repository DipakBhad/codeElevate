import java.util.*;
public class Unique
{
  public static void main(String[] args)
  {
   int arr[]={1,2,3,4,5,1,6,7,2,8,3};
   System.out.println("Original Array:");
   printArray(arr);
  
   System.out.println("Unique Numbers:");
   printUnique(arr);

  }
   public static void printUnique(int ar[])
   {
     Set<Integer>uniqueSet=new HashSet<>();//This declares a variable named 'uniqueSet' of type 'Set',
                                            // which is a collection interface in Java that cannot contain duplicate elements. 
                                            //The '<Integer>' specifies that this 'Set' will contain elements of type 'Integer'.
     for(int num:ar)
       {
         uniqueSet.add(num);
       }
     for(int uniqueNum :uniqueSet)
       {
         System.out.println(uniqueNum+"");
       }
   }
   public static void printArray(int ar[])
   {
     for(int num :ar)
       {
         System.out.println(num+" "); 
       }
   }
}