import java.util.*;
class p143
{
 static void binary()
 {
  int a,n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  n=sc.nextInt();
  String s="";

  while(n>0)
  {
   a=n%2;
   s=a+s;
   n=n/2;
  }
  System.out.println("binary no.="+s);
 }
 public static void main(String[]R)
 {
  binary();
 }
}