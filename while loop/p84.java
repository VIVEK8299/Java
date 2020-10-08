import java.util.*;
class p84
{
 public static void main(String[]R)
 {
  int n,t,c,a,j=0,b=1,x=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();
  t=n;
  c=n;

  while(t>0)
  {
   
   t=t/10;
   j++;
  }
  while(n>0)
  {
    t=j;
   a=n%10;
   while(t>0)
   {
    b=a*b;
    t--;
   }
   n=n/10;
   x=x+b;
   b=1;
  }
  if(x==c)
  System.out.println("armstrong");
  else
  System.out.println("not armstrong");
 }
}