import java.util.*;
class p25
{
 public static void main(String[]R)
 {
  float x,a,b;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the value of a");
  a=sc.nextFloat();

  System.out.println("enter the value of b");
  b=sc.nextFloat();

  x=(a>b)?a:b;
  
  System.out.println("the greater value is="+x);
 }
}