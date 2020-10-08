import java.util.*;
class A
{
 A=pie*r*r;
 B=l*b;
 System.out.println("Area of circle:");
 System.out.println("Area of Rect. :");
}
class B extends A
{
 public static void main(String[]R)
 {
  int B,l,b,r;
  float A , pie=3.14;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter Radius of circle:");
  r=sc.nextInt();
  System.out.println("Enter lenght of rect. :");
  l=sc.nextInt();
  System.out.println("Enter breadth of rect. :");
  b=sc.nextInt();
 }
}