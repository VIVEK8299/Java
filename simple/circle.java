import java.util.*;
class p17
{
 public static void main(String[]R)
 {
  float pie=3.142857314f,a,p,r;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the value of r");
  r=sc.nextFloat();
 
  a=pie*r*r;
  p=2*pie*r;

  System.out.println("value of a is="+a);
  System.out.println("value of b is="+p);
 }
}