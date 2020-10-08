import java.util.*;
class calc
{
 private int n;

 void setval(int x)
 {n=x;}

 void series1()
 {
  int i=0,a;
  while(i<n)
  {
   a=i*i;
   System.out.print(" "+a);
   i++;
  }
 }

 void series2()
 {
  int i=0,j=1,a;
  while(i<n)
  {
   a=i*j;
   System.out.println(" "+a);
   i++;
   j++;
  }
 }
}
 class p157
 {
  public static void main(String[]R)
  {
   int n;
   calc ob;
   ob=new calc();
   System.out.println("enter the limit of series 1 && 2");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();

   ob.setval(n);
   ob.series1();

   ob.setval(n);
   ob.series2();
  }
 }