import java.util.*;
class p17
{
 public static void main(String[]R)
 {
  int n,i=1,a=0,b=1,c;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the no. of terms");
  n=sc.nextInt();
  System.out.println("the series is :");
  System.out.println(a);
  System.out.println(b);

  do
  {
   c=a+b;
   System.out.println(c);
   a=b;
   b=c;
   i++;
  }
  while(i<=n-2);
 }
}