import java.util.*;
class calc
{
 private int a,b;
 void setval(int x,int y)
 {a=x;b=y;}
  int add()
  {
   return(a+b);
  }
  int sub()
  {
   return(a-b);
  }
 }
 class main
 {
  public static void main(String[]R)
  {
   calc ob=new calc();
   ob.setval(15,20);
   System.out.println(ob.add());
   int x=ob.sub();
   System.out.println(x);
  }
 }
