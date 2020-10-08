import java.util.*;
class calc
{
 private int n;
 
 void setval(int x)
 {n=x;}

 void count()
 {
  int j=0;
  while(n>0) 
  {
   n=n/10;
   j++;
  }
  System.out.println("count="+j);
 }
 void binary()
 {
  int r;
  String s="";
  while(n>0)
  {
   r=n%2;
   s=r+s;
   n=n/2;
  }
  System.out.println("binary convesion="+s);
 }
}
class p156
{
 public static void main(String[]R)
 {
  int n;

  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  n=sc.nextInt();
  calc ob=new calc();

  ob.setval(n);
  ob.count();

  ob.setval(n);
  ob.binary();

 }
}