import java.util.*;
class rect
{int l,b,area;
 rect(int x,int y)
 {
  l=x;
  b=y;
 }
 void disp()
 {
  area=l*b;
  System.out.println("Area of rectangle="+area);
 }
}
class p3
{
 public static void main(String[]R)
 {
  rect ob=new rect(15,20);
  ob.disp();
 }
}