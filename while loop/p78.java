import java.util.*;
class p78
{
 public static void main(String[]R)
 {
  int n,x,a=1;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();

  while(n>0)
  {
   x=n%10;
   a=a*x;
   n=n/10;
  }
  System.out.println("the product of digits of that number is ="+a);
 }
}