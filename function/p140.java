import java.util.*;
class p140
{
 static void factorial(int n)
 {
  int i,f=1;
  for(i=1;i<=n;i++)
  {
   f=f*i;
  }
  System.out.println("factorial="+f);
 }
 public static void main(String[]R)
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the no.");
  n=sc.nextInt();
  factorial(n);
 }
}