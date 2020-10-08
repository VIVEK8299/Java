import java.util.*;
class calc
{
 private int n;

 void setval(int x)
 {n=x;}

 void prime()
 {int i;
  for(i=2;i<n;i++)
  {
   if(n%i==0)
   break;
  }
 if(n==i)
  System.out.println("no. is prime");
 else
  System.out.println("no is not prime");
 }
 
 void armstrong()
 {
  int r,j=0,t,m,b=1,a=0,f;
  m=n;
  t=m;
  while(t>0)
  {
   t=t/10;
   j++;
  }
  f=j;

  while(m>0)
  {
   r=m%10;
   while(f>0)
   {
    b=b*r;
    f--;
   }
   m=m/10;
   a=a+b;
   f=j;
   b=1;
  }
  if(a==n)
   System.out.println("armstrong no.");
  else
   System.out.println("not armstrong");
  }
 }
class p153
{
 public static void main(String[]R)
 {
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  n=sc.nextInt();
  calc ob=new calc();

  ob.setval(n);
  ob.prime();
  ob.armstrong();
 }
}
