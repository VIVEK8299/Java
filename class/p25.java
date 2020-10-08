import java.util.*;
class p25
{
 public static void main(String[]R)
 {
  int a,b;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter value of a");
  a=sc.nextInt();

  System.out.println("enter value of b");
  b=sc.nextInt();

  switch((a>b)?0:1)
  {
   case 0:
   System.out.println("a is greater="+a);
   break;

   case 1:
   System.out.println("b is greater="+b);
  }
 }
}