import java.util.*;
class calc
{
 private int a,b,c;

 void setval(int x,int y)
 {
  a=x;
  b=y;
 }
 void add()
 {
  c=a+b;
 }
 void sub()
 {
 c=a-b;
 }
 void print()
 {
  System.out.println(c);
 }
}
class test
{
 public static void main(String[]R)
 {
  calc ob=new calc();
  
  ob.setval(15,20);
  ob.add();
  ob.print();
  ob.sub();
  ob.print();
 }
}