public class Reverseoriginal
{
    public static void main(String[] args)
    {
    int arr[]={1,2,3,4,5};
    System.out.println("The Original Array:");
    printArray(arr);
    
    reverseArray(arr);
    System.out.println("The Reverse Array:");
    printArray(arr);
    }
    public static void reverseArray(int ar[])
    {
     int beg=0,end=ar.length-1;
     while(beg<end)
     {
       int temp=ar[beg];
       ar[beg]=ar[end];
       ar[end]=temp;
       beg++;
       end--;
     }
    }
    public static void printArray(int ar[])
    {
       for(int num:ar)
          {
             System.out.println(num+ " ");
          }
    }
}