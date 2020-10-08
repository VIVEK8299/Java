import java.util.*;
class p16
{
 public static void main(String[]R)
 {
  float a,b,c,p;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter value of a");
  a=sc.nextFloat();

  System.out.println("enter value of b");
  b=sc.nextFloat();

  System.out.println("enter the value of c");
  c=sc.nextFloat();

  p=(a+b+c)/300*100;

  System.out.println("value of p="+p);
 }
}