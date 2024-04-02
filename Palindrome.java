import java.util.*;
class Palindrome
{

     public static int isPalindrome(int num) 
     {
        int rem, rev=0;
        while(num!=0)
        {
          rem=num%10;
          rev=rev*10+rem;
          num=num/10;
        }
        return rev;
     }

    public static void main(String[] args)
    {
       int n ,result;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number which you want to check ,if it is palindrome or not:");
       n=sc.nextInt();
       result=isPalindrome(n);
       if(result==n)
       {
        System.out.println("The given number is palindrome number");
       }
       else
       {
        System.out.println("The given number is not palindrome number");
       }
    }
}