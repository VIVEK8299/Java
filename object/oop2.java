import java.util.*;
class calc
{
 private int a,c;

 void setval(int x)
 {
  a=x;
 }
 void table1()
 {
  for(int i=1;i<=10;i++)
  {
   c=i*a;
   System.out.print(c);
  }
 }
 void table2()
 {
  for(int i=1;i<=10;i++)
  {
   c=i*a;
   System.out.print(c);
  }
 }
}
class main
{
 public static void main(String[]R)
 {
  calc ob=new calc();

  ob.setval(3);
  ob.table1();
   System.out.println();
  ob.setval(5);
  ob.table2();
 }
}