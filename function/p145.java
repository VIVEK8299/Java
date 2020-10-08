import java.util.*;
class p145
{
 static void sap(int n)
 {
  int a=1,b=0,t,j=0,r,rev=0;
  t=n;

  while(t>0)
  {
   r=t%10;
   rev=rev*10+r;
   t=t/10;
  }

  while(n>0)
  {
   n=n/10;
   j++;
  }

  while(rev>0)
  {
   r=rev%10;
   if(j%2==0)
    a=a*r;
   else
    b=b+r;

    rev=rev/10;
    j++ ;
  }

  System.out.println("sum of even position="+b);
  System.out.println("product of odd position="+a);
 }
 public static void main(String[]R)
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  n=sc.nextInt();
  sap(n);
 }
}