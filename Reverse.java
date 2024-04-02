class Reverse
{
public static void main(String[] args)
{
int no=123,rev=0,remainder;
while(no!=0)
{
remainder=no%10;
rev=rev*10+remainder;
no=no/10;
}
System.out.println("Reverse no is "+rev);
}
}