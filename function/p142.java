import java.util.*;
class p142
{
 static void sum(int a)
 {
  int r,b=0;
  
  while(a>0)
  {
   r=a%10;
   b=r+b;
   a=a/10;
  }
  System.out.println("sum="+b);
 }
 public static void main(String[]R)
 {
  int a;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  a=sc.nextInt();
  sum(a);
 }
}