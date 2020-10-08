import java.util.*;
class p52
{
 public static void main(String[]R)
 {
  int a,b;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the value of a");
  a=sc.nextInt();

  System.out.println("enter the value of b");
  b=sc.nextInt();

  switch((a>b)?1:0)
  {
   case 1:
   System.out.println("a is greater="+a);
   break;

   case 0:
   System.out.println("b is greater="+b);
   break;

  }
 }
}