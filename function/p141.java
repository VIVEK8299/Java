import java.util.*;
class p141
{
 static int fibonacci(int n)
 {
  int a=0,b=1,i,c;
  System.out.println(a);
  System.out.println(b);
  for(i=0;i<n-2;i++)
  {
   c=a+b;
   System.out.println(c);
   a=b;
   b=c;
  }
  return(0);
 }
 public static void main(String[]R)
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the limit");
  n=sc.nextInt();
  fibonacci(n);
 }
}