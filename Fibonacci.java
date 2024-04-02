/*class Fibonacci {
    // Function to print N Fibonacci Number
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
      
        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 10;

        // Function Call
        Fibonacci(N);
    }
}*/
import java.io.*;
import java.util.*;
class Fibonacci
{
   public static int nthFibonacci(int input)
   {
     if(input==1)
     {
       return 0;
     }
     else if(input==2)
     {
       return 1;
     }
     else if(input==3)
     {
       return 1;
     }
     else
     {
       return nthFibonacci(input-1) + nthFibonacci(input-2);
     }
    }
    public static void main(String[] args)
    {
       int num,result;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       num =sc.nextInt();
       result= nthFibonacci(num);
       System.out.println("Result:"+result);
    }
}