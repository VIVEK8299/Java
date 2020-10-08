import java.util.*;
class p14
{
 public static void main(String[]R)
 {
  int a,b;
  Scanner sc=new Scanner(System.in);
  
  System.out.println("enter value of a");
  a=sc.nextInt();

  System.out.println("enter value of b");
  b=sc.nextInt();

  a=a+b;
  b=a-b;
  a=a-b;

  System.out.println("value of a="+a);
  System.out.println("value of b="+b);
 }
}