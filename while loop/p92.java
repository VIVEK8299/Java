import java.util.*;
class p92
{
 public static void main(String[]R)
 {
  int n,a,m;
  String s="";
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();

  System.out.println("enter the base");
  m=sc.nextInt();

  while(n>0)
  {
   a=n%m;
   s=a+s;
   n=n/m;
  }
  System.out.println("the binary number is ="+s);
 }
}