import java.util.*;
class p77
{
 public static void main(String[]R)
 {
  int n,x=0,a=0,i=1;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();
 
  while(i<=5)
  {
   a=n%10;
   n=n/10;
   x=a+x;
   i++;
  }
  System.out.println("the sum of its digits is="+x);
 }     
}            