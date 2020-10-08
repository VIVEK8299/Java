import java.util.*;
class p83
{
 public static void main(String[]R)
 {
  int n,r,t,a,b=0;
  Scanner sc=new Scanner(System.in);

  System.out.println("enter the number");
  n=sc.nextInt();
  t=n;

  while(n>0)
  {
   r=n%10;
   a=r*r*r;
   n=n/10;
   b=b+a;
  }

  if(b==t)
  {
   System.out.println("no. is armstrong");
  }
  else
  {
   System.out.println("no. is not an armstrong");
  }
 }
}