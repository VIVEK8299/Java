import java.util.*;
class p79
{
 public static void main(String[]R)
 {
  int n,rev=0,x,j=1,a=0,b=1,r;
  Scanner sc=new Scanner(System.in);
 
  System.out.println("enter the number");
  n=sc.nextInt();

  while(n>0)
  {
   r=n%10;
   rev=rev*10+r;
   n=n/10;
  }
  while(rev>0)
  {
   x=rev%10;
   if(j%2==0)
   {
    a=a+x;
   }
   else
   {
    b=b*x;
   }
   rev=rev/10;
   j++;
  }
  System.out.println("the sum of even digits of the number is"+a);
  System.out.println("the product of odd digits of the number is"+b);
 }
}