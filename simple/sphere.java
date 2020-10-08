import java.util.*;
class p18
{
 public static void main(String[]R)
 {
  float pie=3.142857314f,x=1.333333f,r,a,v;
  Scanner sc=new Scanner(System.in);
 
  System.out.println("enter the value of r");
  r=sc.nextFloat();

  a=4.0f*pie*r*r;
  v=pie*r*r*r*(4.0f/3.0f);

  System.out.println("value of a is="+a);
  System.out.println("value of v is="+v);
 }
}