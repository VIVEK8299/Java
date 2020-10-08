import java.util.*;
class p73
{
 public static void main(String[]R)
 {
  int n,a=0,i=1,v;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number of terms");
  n=sc.nextInt();
  System.out.println("the series is :");
  System.out.println(a);

  while(i<=n)
  {
   v=a+2;
   System.out.println(v);
   a=v;
   i++;
  }
 }
}