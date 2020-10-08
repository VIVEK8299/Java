import java.util.*;
class p34
{
 public static void main(String[]R)
 {
  float a,b;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the value of a");
  a=sc.nextFloat();

  System.out.println("enter the value of b");
  b=sc.nextFloat();

  if(a>b)
  {
   System.out.println("the larger number is a="+a);
  }
  else
  {
   System.out.println("the larger number is b="+b);
  }
 }
}