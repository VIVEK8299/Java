import java.util.*;
class p13
{
 public static void main(String[]R)
 {
  int a,b,h;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the value of a");
  a=sc.nextInt();

  System.out.println("enter the value of b");
  b=sc.nextInt();

  System.out.println("enter the value of c");
  h=sc.nextInt();
 
  h=a;
  a=b;
  b=h;

  System.out.println("value of a="+a);
  System.out.println("value of b="+b);
 }
}