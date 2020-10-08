import java.util.*;
class calc
{
 private int n;
 
 void setval(int x)
 {n=x;}

 int factorial()
 {
  int i=1,a=1;
  while(i<=n)
  {
   a=a*i;
   i++;
  }
  return(a);
 }
 int sum()
 {
  int a=0,r;
  while(n>0)
  {
   r=n%10;
   a=a+r;
   n=n/10;
  }
  return(a);
 }
}
 class p159
 {
  public static void main(String[]R)
  {
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number");
   n=sc.nextInt();

   calc ob=new calc();
   ob.setval(n);
   System.out.println("the factorial is ="+ob.factorial());
   System.out.println("the sum of its digit is ="+ob.sum());
  }
 }